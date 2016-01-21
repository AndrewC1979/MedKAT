
/* First created by JCasGen Wed Jun 11 12:10:51 EDT 2008 */
package org.ohnlp.medkat.taes.sectionFinder;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** 
 * Updated by JCasGen Mon Mar 23 14:01:47 EDT 2009
 * @generated */
public class PatientAnnotation_Type extends TextSectionAnnotation_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (PatientAnnotation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = PatientAnnotation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new PatientAnnotation(addr, PatientAnnotation_Type.this);
  			   PatientAnnotation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new PatientAnnotation(addr, PatientAnnotation_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = PatientAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.ohnlp.medkat.taes.sectionFinder.PatientAnnotation");



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public PatientAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    