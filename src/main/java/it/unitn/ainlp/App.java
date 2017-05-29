package it.unitn.ainlp;

import it.unitn.types.ReverseToken;

import org.apache.uima.analysis_engine.AnalysisEngine;
import org.apache.uima.fit.factory.AnalysisEngineFactory;
import org.apache.uima.fit.factory.JCasFactory;
import org.apache.uima.fit.pipeline.SimplePipeline;
import org.apache.uima.fit.util.JCasUtil;
import org.apache.uima.jcas.JCas;

import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;
import de.tudarmstadt.ukp.dkpro.core.stanfordnlp.StanfordSegmenter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	JCas cas  = JCasFactory.createJCas();
    	
    	cas.setDocumentText("The apple is on the table.");
    	cas.setDocumentLanguage("en");
    	
    	AnalysisEngine segmenter = 
    			AnalysisEngineFactory.createEngine(StanfordSegmenter.class);
    	
    	AnalysisEngine revTokenizer =
    			AnalysisEngineFactory.createEngine(ReverseTokenizer.class);
    	
    	SimplePipeline.runPipeline(cas, segmenter, revTokenizer);
    	
    	for (Token token : JCasUtil.select(cas, Token.class)) { 
    		System.out.println(token.getCoveredText());
    	}
    	System.out.println();
    	
    	for (ReverseToken revToken : JCasUtil.select(cas, ReverseToken.class)) { 
    		System.out.println(revToken.getCoveredText());
    	}
    }
}
