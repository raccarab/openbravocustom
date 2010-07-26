/**
 * VM_SQLQueries_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_SQLQueries;

public interface VM_SQLQueries_PortType extends java.rmi.Remote {
    public net.virtuemart.www.VM_SQLQueries.SQLResult[] executeSQLQuery(net.virtuemart.www.VM_SQLQueries.SQLRequest parameters) throws java.rmi.RemoteException;
    public net.virtuemart.www.VM_SQLQueries.SQLResult[] executeSQLSelectQuery(net.virtuemart.www.VM_SQLQueries.SQLSelectRequest parameters) throws java.rmi.RemoteException;
    public net.virtuemart.www.VM_SQLQueries.SQLResult[] executeSQLInsertQuery(net.virtuemart.www.VM_SQLQueries.SQLInsertRequest parameters) throws java.rmi.RemoteException;
    public net.virtuemart.www.VM_SQLQueries.SQLResult[] executeSQLUpdateQuery(net.virtuemart.www.VM_SQLQueries.SQLUpdateRequest parameters) throws java.rmi.RemoteException;
}
