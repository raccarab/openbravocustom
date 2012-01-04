/**
 * VM_Product_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Product;

public class VM_Product_ServiceLocator extends org.apache.axis.client.Service implements net.virtuemart.www.VM_Product.VM_Product_Service {

    public VM_Product_ServiceLocator() {
    }


    public VM_Product_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public VM_Product_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for VM_ProductSOAP
    private java.lang.String VM_ProductSOAP_address = "http://___HOST___/___BASE___/administrator/components/com_vm_soa/services/___SERVICE___";

    public java.lang.String getVM_ProductSOAPAddress() {
        return VM_ProductSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String VM_ProductSOAPWSDDServiceName = "VM_ProductSOAP";

    public java.lang.String getVM_ProductSOAPWSDDServiceName() {
        return VM_ProductSOAPWSDDServiceName;
    }

    public void setVM_ProductSOAPWSDDServiceName(java.lang.String name) {
        VM_ProductSOAPWSDDServiceName = name;
    }

    public net.virtuemart.www.VM_Product.VM_Product_PortType getVM_ProductSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(VM_ProductSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getVM_ProductSOAP(endpoint);
    }

    public net.virtuemart.www.VM_Product.VM_Product_PortType getVM_ProductSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            net.virtuemart.www.VM_Product.VM_ProductSOAPStub _stub = new net.virtuemart.www.VM_Product.VM_ProductSOAPStub(portAddress, this);
            _stub.setPortName(getVM_ProductSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setVM_ProductSOAPEndpointAddress(java.lang.String address) {
        VM_ProductSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (net.virtuemart.www.VM_Product.VM_Product_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                net.virtuemart.www.VM_Product.VM_ProductSOAPStub _stub = new net.virtuemart.www.VM_Product.VM_ProductSOAPStub(new java.net.URL(VM_ProductSOAP_address), this);
                _stub.setPortName(getVM_ProductSOAPWSDDServiceName());
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
        if ("VM_ProductSOAP".equals(inputPortName)) {
            return getVM_ProductSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "VM_Product");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "VM_ProductSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("VM_ProductSOAP".equals(portName)) {
            setVM_ProductSOAPEndpointAddress(address);
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
