In this tutorial you will learn how to write an annotator using UIMA and uimaFit.

# The ReverseTokenizer

The ReverseTokenizer is a simple annotator that reads the tokens already contained in a CAS, reverses the text in the tokens and puts the result back into the CAS, by adding new annotations of a user defined type.

For this reason, the annotator requires that Token annotations are present in the CAS, i.e. a Tokenizer has been applied to the text.

## Setting up the project

Open Eclipse and create a new Maven project.

Open the pom.xml file with the POM editor and add the following dependencies:

* DKPro: search for "dkpro core asl"
* uimaFit: search for "uimafit core"
* the Stanford CoreNLP annotators: search for "dkpro stanford"

## A Runner class for the tokenizer

Let's write together a Java program that runs a tokenizer on some text. We will need to:

* create a JCas with the JCasFactory and fill it with some text
* create the tokenizer analysis engine with the AnalysisEngineFactory
* run the segmenter on the text
* iterate over the tokens and print them

## The ReverseToken annotator

Now we will write the ReverseToken annotator by defining a new type and implementing the annotator.

### The ReverseToken type

Let's create the ReverseToken type using the UIMA tools in Eclipse.

Create a folder named "typesystem" in your Java project.

Right click on the project name and click New > Other > UIMA > Typesystem...

Use "typesystem" as parent folder and type "ReverseToken.xml" as type name.

The TypeSystem editor will pop up. Click on "Add Type" and use it.unitn.types.ReverseToken as the type name.

Click on the new type and on the "Add" button. Create a ReversedToken feature and set String as its range.

Now click on the JCasGen button.

### Enabling automatic type detection for uimaFit

uimaFit searches for the user defined types in some predefined spots.

Create the following files:  

    src/main/resources/META-INF/org.apache.uima.fit/types.txt  
    src/test/resources/META-INF/org.apache.uima.fit/types.txt

Add the following line to both files:  

    classpath*:typesystem/ReverseToken.xml

Lastly, copy the typesystem/ReverseToken.xml file into the following folders:

    src/main/resources/typesystem/  
    src/test/resources/typesystem/


This is required if you use uimaFit with Maven, in order to correctly build the project artifacts.

### Writing the annotator

Let's write together the ReverseTokenizer class.


    @TypeCapability(
        outputs = {"it.unitn.types.ReverseToken"} 
    ) 
    public class ReverseTokenizer extends org.apache.uima.fit.component.JCasAnnotator_ImplBase { 
        ... 
    } 

We have to iterate over the Token annotation to retrieve the text of each token, create a new ReverseToken for each token and fill the fields of these new annotations. 

We can use StringBuilder to reverse the text of a token.
	
### Running the annotator

Let's create the ReverseTokenizer analysis engine in our Runner class so we can run it and retrieve its output from the CAS.

## Final notes

The full code of the exercise will be published in this page after the lab.

If there is time we can see:
* how to add more annotators to the pipeline
* additional methods of the JCasUtil class
* additional features of the type system

### Links

* [https://uima.apache.org/d/uimafit-current/tools.uimafit.book.html#d5e110](uimaFit guide and reference) 
* [https://dkpro.github.io/](DKPro project)
 
