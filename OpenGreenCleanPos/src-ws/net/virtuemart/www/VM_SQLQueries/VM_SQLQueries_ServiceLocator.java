/**
 * VM_SQLQueries_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_SQLQueries;

public class VM_SQLQueries_ServiceLocator extends org.apache.axis.client.Service implements net.virtuemart.www.VM_SQLQueries.VM_SQLQueries_Service {

    public VM_SQLQueries_ServiceLocator() {
    }


    public VM_SQLQueries_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public VM_SQLQueries_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for VM_SQLQueriesSOAP
    private java.lang.String VM_SQLQueriesSOAP_address = "http://___HOST___/___BASE___/administrator/components/com_vm_soa/services/___SERVICE___";

    public java.lang.String getVM_SQLQueriesSOAPAddress() {
        return VM_SQLQueriesSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String VM_SQLQueriesSOAPWSDDServiceName = "VM_SQLQueriesSOAP";

    public java.lang.String getVM_SQLQueriesSOAPWSDDServiceName() {
        return VM_SQLQueriesSOAPWSDDServiceName;
    }

    public void setVM_SQLQueriesSOAPWSDDServiceName(java.lang.String name) {
        VM_SQLQueriesSOAPWSDDServiceName = name;
    }

    public net.virtuemart.www.VM_SQLQueries.VM_SQLQueries_PortType getVM_SQLQueriesSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(VM_SQLQueriesSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getVM_SQLQueriesSOAP(endpoint);
    }

    public net.virtuemart.www.VM_SQLQueries.VM_SQLQueries_PortType getVM_SQLQueriesSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            net.virtuemart.www.VM_SQLQueries.VM_SQLQueriesSOAPStub _stub = new net.virtuemart.www.VM_SQLQueries.VM_SQLQueriesSOAPStub(portAddress, this);
            _stub.setPortName(getVM_SQLQueriesSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setVM_SQLQueriesSOAPEndpointAddress(java.lang.String address) {
        VM_SQLQueriesSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (net.virtuemart.www.VM_SQLQueries.VM_SQLQueries_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                net.virtuemart.www.VM_SQLQueries.VM_SQLQueriesSOAPStub _stub = new net.virtuemart.www.VM_SQLQueries.VM_SQLQueriesSOAPStub(new java.net.URL(VM_SQLQueriesSOAP_address), this);
                _stub.setPortName(getVM_SQLQueriesSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("VM_SQLQueriesSOAP".equals(inputPortName)) {
            return getVM_SQLQueriesSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.virtuemart.net/VM_SQLQueries/", "VM_SQLQueries");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_SQLQueries/", "VM_SQLQueriesSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("VM_SQLQueriesSOAP".equals(portName)) {
            setVM_SQLQueriesSOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
