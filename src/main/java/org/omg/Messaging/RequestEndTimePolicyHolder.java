package org.omg.Messaging;

/**
* org/omg/Messaging/RequestEndTimePolicyHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/Messaging.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public final class RequestEndTimePolicyHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.Messaging.RequestEndTimePolicy value = null;

  public RequestEndTimePolicyHolder ()
  {
  }

  public RequestEndTimePolicyHolder (org.omg.Messaging.RequestEndTimePolicy initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.Messaging.RequestEndTimePolicyHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.Messaging.RequestEndTimePolicyHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.Messaging.RequestEndTimePolicyHelper.type ();
  }

}