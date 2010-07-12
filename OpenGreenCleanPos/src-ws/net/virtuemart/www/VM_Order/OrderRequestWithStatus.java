/**
 * OrderRequestWithStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Order;

public class OrderRequestWithStatus  implements java.io.Serializable {
    private net.virtuemart.www.VM_Tools.LoginInfo loginInfo;

    private java.lang.String limite_start;

    private java.lang.String limite_end;

    private java.lang.String status;

    public OrderRequestWithStatus() {
    }

    public OrderRequestWithStatus(
           net.virtuemart.www.VM_Tools.LoginInfo loginInfo,
           java.lang.String limite_start,
           java.lang.String limite_end,
           java.lang.String status) {
           this.loginInfo = loginInfo;
           this.limite_start = limite_start;
           this.limite_end = limite_end;
           this.status = status;
    }


    /**
     * Gets the loginInfo value for this OrderRequestWithStatus.
     * 
     * @return loginInfo
     */
    public net.virtuemart.www.VM_Tools.LoginInfo getLoginInfo() {
        return loginInfo;
    }


    /**
     * Sets the loginInfo value for this OrderRequestWithStatus.
     * 
     * @param loginInfo
     */
    public void setLoginInfo(net.virtuemart.www.VM_Tools.LoginInfo loginInfo) {
        this.loginInfo = loginInfo;
    }


    /**
     * Gets the limite_start value for this OrderRequestWithStatus.
     * 
     * @return limite_start
     */
    public java.lang.String getLimite_start() {
        return limite_start;
    }


    /**
     * Sets the limite_start value for this OrderRequestWithStatus.
     * 
     * @param limite_start
     */
    public void setLimite_start(java.lang.String limite_start) {
        this.limite_start = limite_start;
    }


    /**
     * Gets the limite_end value for this OrderRequestWithStatus.
     * 
     * @return limite_end
     */
    public java.lang.String getLimite_end() {
        return limite_end;
    }


    /**
     * Sets the limite_end value for this OrderRequestWithStatus.
     * 
     * @param limite_end
     */
    public void setLimite_end(java.lang.String limite_end) {
        this.limite_end = limite_end;
    }


    /**
     * Gets the status value for this OrderRequestWithStatus.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this OrderRequestWithStatus.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderRequestWithStatus)) return false;
        OrderRequestWithStatus other = (OrderRequestWithStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.loginInfo==null && other.getLoginInfo()==null) || 
             (this.loginInfo!=null &&
              this.loginInfo.equals(other.getLoginInfo()))) &&
            ((this.limite_start==null && other.getLimite_start()==null) || 
             (this.limite_start!=null &&
              this.limite_start.equals(other.getLimite_start()))) &&
            ((this.limite_end==null && other.getLimite_end()==null) || 
             (this.limite_end!=null &&
              this.limite_end.equals(other.getLimite_end()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getLoginInfo() != null) {
            _hashCode += getLoginInfo().hashCode();
        }
        if (getLimite_start() != null) {
            _hashCode += getLimite_start().hashCode();
        }
        if (getLimite_end() != null) {
            _hashCode += getLimite_end().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderRequestWithStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "OrderRequestWithStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loginInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "loginInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limite_start");
        elemField.setXmlName(new javax.xml.namespace.QName("", "limite_start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limite_end");
        elemField.setXmlName(new javax.xml.namespace.QName("", "limite_end"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
