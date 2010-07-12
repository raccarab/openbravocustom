/**
 * VM_Categories_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Categories;

public class VM_Categories_ServiceLocator extends org.apache.axis.client.Service implements net.virtuemart.www.VM_Categories.VM_Categories_Service {

    public VM_Categories_ServiceLocator() {
    }


    public VM_Categories_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public VM_Categories_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for VM_CategoriesSOAP
    private java.lang.String VM_CategoriesSOAP_address = "http://beyours.be/greenpos/administrator/components/com_vm_soa/services/VM_CategoriesService.php";

    public java.lang.String getVM_CategoriesSOAPAddress() {
        return VM_CategoriesSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String VM_CategoriesSOAPWSDDServiceName = "VM_CategoriesSOAP";

    public java.lang.String getVM_CategoriesSOAPWSDDServiceName() {
        return VM_CategoriesSOAPWSDDServiceName;
    }

    public void setVM_CategoriesSOAPWSDDServiceName(java.lang.String name) {
        VM_CategoriesSOAPWSDDServiceName = name;
    }

    public net.virtuemart.www.VM_Categories.VM_Categories_PortType getVM_CategoriesSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(VM_CategoriesSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getVM_CategoriesSOAP(endpoint);
    }

    public net.virtuemart.www.VM_Categories.VM_Categories_PortType getVM_CategoriesSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            net.virtuemart.www.VM_Categories.VM_CategoriesSOAPStub _stub = new net.virtuemart.www.VM_Categories.VM_CategoriesSOAPStub(portAddress, this);
            _stub.setPortName(getVM_CategoriesSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setVM_CategoriesSOAPEndpointAddress(java.lang.String address) {
        VM_CategoriesSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (net.virtuemart.www.VM_Categories.VM_Categories_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                net.virtuemart.www.VM_Categories.VM_CategoriesSOAPStub _stub = new net.virtuemart.www.VM_Categories.VM_CategoriesSOAPStub(new java.net.URL(VM_CategoriesSOAP_address), this);
                _stub.setPortName(getVM_CategoriesSOAPWSDDServiceName());
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
        if ("VM_CategoriesSOAP".equals(inputPortName)) {
            return getVM_CategoriesSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Categories/", "VM_Categories");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Categories/", "VM_CategoriesSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("VM_CategoriesSOAP".equals(portName)) {
            setVM_CategoriesSOAPEndpointAddress(address);
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
