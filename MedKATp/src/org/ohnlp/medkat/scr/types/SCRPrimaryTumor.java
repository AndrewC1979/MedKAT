

/* First created by JCasGen Wed Jun 11 12:10:52 EDT 2008 */
package org.ohnlp.medkat.scr.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** primary tumor object
 * Updated by JCasGen Mon Mar 23 14:01:47 EDT 2009
 * XML source: C:/ohnlp/MedKATp/descriptors/analysis_engine/aggregate/MedKATp.xml
 * @generated */
public class SCRPrimaryTumor extends SCRMultipleReadingModel {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(SCRPrimaryTumor.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected SCRPrimaryTumor() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public SCRPrimaryTumor(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public SCRPrimaryTumor(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public SCRPrimaryTumor(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
     
}

    