package org.omg.DynamicAny;

/**
* org/omg/DynamicAny/DynStructHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/DynamicAny.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/


/**
    * DynStruct objects support the manipulation of IDL struct and exception values.
    * Members of the exceptions are handled in the same way as members of a struct.
    */
public final class DynStructHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.DynamicAny.DynStruct value = null;

  public DynStructHolder ()
  {
  }

  public DynStructHolder (org.omg.DynamicAny.DynStruct initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.DynamicAny.DynStructHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.DynamicAny.DynStructHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.DynamicAny.DynStructHelper.type ();
  }

}