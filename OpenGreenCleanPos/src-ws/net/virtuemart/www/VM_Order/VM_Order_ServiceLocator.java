/**
 * VM_Order_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Order;

public class VM_Order_ServiceLocator extends org.apache.axis.client.Service implements net.virtuemart.www.VM_Order.VM_Order_Service {

    public VM_Order_ServiceLocator() {
    }


    public VM_Order_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public VM_Order_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for VM_OrderSOAP
    private java.lang.String VM_OrderSOAP_address = "http://beyours.be/greenpos/administrator/components/com_vm_soa/services/VM_OrdersService.php";

    public java.lang.String getVM_OrderSOAPAddress() {
        return VM_OrderSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String VM_OrderSOAPWSDDServiceName = "VM_OrderSOAP";

    public java.lang.String getVM_OrderSOAPWSDDServiceName() {
        return VM_OrderSOAPWSDDServiceName;
    }

    public void setVM_OrderSOAPWSDDServiceName(java.lang.String name) {
        VM_OrderSOAPWSDDServiceName = name;
    }

    public net.virtuemart.www.VM_Order.VM_Order_PortType getVM_OrderSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(VM_OrderSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getVM_OrderSOAP(endpoint);
    }

    public net.virtuemart.www.VM_Order.VM_Order_PortType getVM_OrderSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            net.virtuemart.www.VM_Order.VM_OrderSOAPStub _stub = new net.virtuemart.www.VM_Order.VM_OrderSOAPStub(portAddress, this);
            _stub.setPortName(getVM_OrderSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setVM_OrderSOAPEndpointAddress(java.lang.String address) {
        VM_OrderSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (net.virtuemart.www.VM_Order.VM_Order_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                net.virtuemart.www.VM_Order.VM_OrderSOAPStub _stub = new net.virtuemart.www.VM_Order.VM_OrderSOAPStub(new java.net.URL(VM_OrderSOAP_address), this);
                _stub.setPortName(getVM_OrderSOAPWSDDServiceName());
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
        if ("VM_OrderSOAP".equals(inputPortName)) {
            return getVM_OrderSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "VM_Order");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "VM_OrderSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("VM_OrderSOAP".equals(portName)) {
            setVM_OrderSOAPEndpointAddress(address);
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
