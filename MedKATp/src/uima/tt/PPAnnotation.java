

/* First created by JCasGen Wed Mar 11 12:17:23 EDT 2009 */
package uima.tt;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Prepositional Phrase
 * Updated by JCasGen Mon Mar 23 14:01:46 EDT 2009
 * XML source: C:/ohnlp/MedKATp/descriptors/analysis_engine/aggregate/MedKATp.xml
 * @generated */
public class PPAnnotation extends PhraseAnnotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(PPAnnotation.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected PPAnnotation() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public PPAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public PPAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public PPAnnotation(JCas jcas, int begin, int end) {
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

    