package org.omg.CosTransactions;


/**
* org/omg/CosTransactions/Unavailable.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/CosTransactions.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public final class Unavailable extends org.omg.CORBA.UserException
{

  public Unavailable ()
  {
    super(UnavailableHelper.id());
  } // ctor


  public Unavailable (String $reason)
  {
    super(UnavailableHelper.id() + "  " + $reason);
  } // ctor

} // class Unavailable