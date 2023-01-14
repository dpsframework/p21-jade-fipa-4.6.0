package org.omg.CORBA;


/**
* org/omg/CORBA/PolicyError.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/CORBAX.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/


/**
   * Thrown to indicate problems with parameter values passed to the
   * <code>ORB.create_policy</code> operation.  
   */
public final class PolicyError extends org.omg.CORBA.UserException
{
  public short reason = (short)0;

  public PolicyError ()
  {
    super(PolicyErrorHelper.id());
  } // ctor

  public PolicyError (short _reason)
  {
    super(PolicyErrorHelper.id());
    reason = _reason;
  } // ctor


  public PolicyError (String $reason, short _reason)
  {
    super(PolicyErrorHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class PolicyError