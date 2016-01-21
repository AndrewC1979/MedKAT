
/* First created by JCasGen Wed Aug 27 00:14:06 EDT 2008 */
package org.ohnlp.medkat.scr.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** tumor block
 * Updated by JCasGen Wed Mar 11 15:34:13 EDT 2009
 * @generated */
public class SCRTumorBlock_Type extends SCRSpannedAnnotation_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (SCRTumorBlock_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = SCRTumorBlock_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new SCRTumorBlock(addr, SCRTumorBlock_Type.this);
  			   SCRTumorBlock_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new SCRTumorBlock(addr, SCRTumorBlock_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = SCRTumorBlock.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.ohnlp.medkat.scr.types.SCRTumorBlock");



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public SCRTumorBlock_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    