package org.omg.CORBA;


/**
* org/omg/CORBA/InterfaceDefOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/ir.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public interface InterfaceDefOperations  extends org.omg.CORBA.ContainerOperations, org.omg.CORBA.ContainedOperations, org.omg.CORBA.IDLTypeOperations
{

  // read/write interface
  org.omg.CORBA.InterfaceDef[] base_interfaces ();

  // read/write interface
  void base_interfaces (org.omg.CORBA.InterfaceDef[] newBase_interfaces);
  boolean is_abstract ();
  void is_abstract (boolean newIs_abstract);

  // read interface
  boolean is_a (String interface_id);
  org.omg.CORBA.InterfaceDefPackage.FullInterfaceDescription describe_interface ();

  // write interface
  org.omg.CORBA.AttributeDef create_attribute (String id, String name, String version, org.omg.CORBA.IDLType type, org.omg.CORBA.AttributeMode mode);
  org.omg.CORBA.OperationDef create_operation (String id, String name, String version, org.omg.CORBA.IDLType result, org.omg.CORBA.OperationMode mode, org.omg.CORBA.ParameterDescription[] params, org.omg.CORBA.ExceptionDef[] exceptions, String[] contexts);
} // interface InterfaceDefOperations