

/* First created by JCasGen Wed Jun 11 12:10:52 EDT 2008 */
package org.ohnlp.medkat.taes.diagnosisTypeDetector;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Mon Mar 23 14:01:46 EDT 2009
 * XML source: C:/ohnlp/MedKATp/descriptors/analysis_engine/aggregate/MedKATp.xml
 * @generated */
public class MetastaticDiagnosis extends DiagnosisBase {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(MetastaticDiagnosis.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected MetastaticDiagnosis() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public MetastaticDiagnosis(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public MetastaticDiagnosis(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public MetastaticDiagnosis(JCas jcas, int begin, int end) {
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

    