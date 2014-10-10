

/* First created by JCasGen Wed Sep 11 13:44:28 EDT 2013 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Wed Sep 11 13:44:28 EDT 2013
 * XML source: /home/diwang/ur-workspace/deiis-f13-homework/src/main/resources/desc/deiis_types.xml
 *  */
public class Token extends Annotation {
  /** 
   *  
   */
  public final static int typeIndexID = JCasRegistry.register(Token.class);
  /** 
   *  
   */
  public final static int type = typeIndexID;
  /**   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   *  */
  protected Token() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   *  */
  public Token(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /**  */
  public Token(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /**  */  
  public Token(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
   modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
}

    