package org.omg.CosTransactions;

/**
* org/omg/CosTransactions/TransactionalObjectHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/CosTransactions.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/


// TransactionalObject has been deprecated. See 10.3.10.
public final class TransactionalObjectHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CosTransactions.TransactionalObject value = null;

  public TransactionalObjectHolder ()
  {
  }

  public TransactionalObjectHolder (org.omg.CosTransactions.TransactionalObject initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CosTransactions.TransactionalObjectHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CosTransactions.TransactionalObjectHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CosTransactions.TransactionalObjectHelper.type ();
  }

}