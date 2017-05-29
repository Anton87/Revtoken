

/* First created by JCasGen Thu Apr 28 17:46:01 CEST 2016 */
package it.unitn.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Thu Apr 28 17:46:01 CEST 2016
 * XML source: /home/antonio/workspace_java/revtoken/typesystem/ReverseToken.xml
 * @generated */
public class ReverseToken extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ReverseToken.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected ReverseToken() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public ReverseToken(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ReverseToken(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public ReverseToken(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: ReverseToken

  /** getter for ReverseToken - gets 
   * @generated
   * @return value of the feature 
   */
  public String getReverseToken() {
    if (ReverseToken_Type.featOkTst && ((ReverseToken_Type)jcasType).casFeat_ReverseToken == null)
      jcasType.jcas.throwFeatMissing("ReverseToken", "it.unitn.types.ReverseToken");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ReverseToken_Type)jcasType).casFeatCode_ReverseToken);}
    
  /** setter for ReverseToken - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setReverseToken(String v) {
    if (ReverseToken_Type.featOkTst && ((ReverseToken_Type)jcasType).casFeat_ReverseToken == null)
      jcasType.jcas.throwFeatMissing("ReverseToken", "it.unitn.types.ReverseToken");
    jcasType.ll_cas.ll_setStringValue(addr, ((ReverseToken_Type)jcasType).casFeatCode_ReverseToken, v);}    
  }

    