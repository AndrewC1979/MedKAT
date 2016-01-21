
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
public class MRNSectionAnnotation_Type extends NumericSectionAnnotation_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (MRNSectionAnnotation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = MRNSectionAnnotation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new MRNSectionAnnotation(addr, MRNSectionAnnotation_Type.this);
  			   MRNSectionAnnotation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new MRNSectionAnnotation(addr, MRNSectionAnnotation_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = MRNSectionAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.ohnlp.medkat.taes.sectionFinder.MRNSectionAnnotation");



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public MRNSectionAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    