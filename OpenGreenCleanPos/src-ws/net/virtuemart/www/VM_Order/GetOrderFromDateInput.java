/**
 * GetOrderFromDateInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Order;

public class GetOrderFromDateInput  implements java.io.Serializable {
    private net.virtuemart.www.VM_Tools.LoginInfo loginInfo;

    private java.lang.String order_status;

    private java.lang.String date_start;

    private java.lang.String date_end;

    public GetOrderFromDateInput() {
    }

    public GetOrderFromDateInput(
           net.virtuemart.www.VM_Tools.LoginInfo loginInfo,
           java.lang.String order_status,
           java.lang.String date_start,
           java.lang.String date_end) {
           this.loginInfo = loginInfo;
           this.order_status = order_status;
           this.date_start = date_start;
           this.date_end = date_end;
    }


    /**
     * Gets the loginInfo value for this GetOrderFromDateInput.
     * 
     * @return loginInfo
     */
    public net.virtuemart.www.VM_Tools.LoginInfo getLoginInfo() {
        return loginInfo;
    }


    /**
     * Sets the loginInfo value for this GetOrderFromDateInput.
     * 
     * @param loginInfo
     */
    public void setLoginInfo(net.virtuemart.www.VM_Tools.LoginInfo loginInfo) {
        this.loginInfo = loginInfo;
    }


    /**
     * Gets the order_status value for this GetOrderFromDateInput.
     * 
     * @return order_status
     */
    public java.lang.String getOrder_status() {
        return order_status;
    }


    /**
     * Sets the order_status value for this GetOrderFromDateInput.
     * 
     * @param order_status
     */
    public void setOrder_status(java.lang.String order_status) {
        this.order_status = order_status;
    }


    /**
     * Gets the date_start value for this GetOrderFromDateInput.
     * 
     * @return date_start
     */
    public java.lang.String getDate_start() {
        return date_start;
    }


    /**
     * Sets the date_start value for this GetOrderFromDateInput.
     * 
     * @param date_start
     */
    public void setDate_start(java.lang.String date_start) {
        this.date_start = date_start;
    }


    /**
     * Gets the date_end value for this GetOrderFromDateInput.
     * 
     * @return date_end
     */
    public java.lang.String getDate_end() {
        return date_end;
    }


    /**
     * Sets the date_end value for this GetOrderFromDateInput.
     * 
     * @param date_end
     */
    public void setDate_end(java.lang.String date_end) {
        this.date_end = date_end;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetOrderFromDateInput)) return false;
        GetOrderFromDateInput other = (GetOrderFromDateInput) obj;
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
            ((this.order_status==null && other.getOrder_status()==null) || 
             (this.order_status!=null &&
              this.order_status.equals(other.getOrder_status()))) &&
            ((this.date_start==null && other.getDate_start()==null) || 
             (this.date_start!=null &&
              this.date_start.equals(other.getDate_start()))) &&
            ((this.date_end==null && other.getDate_end()==null) || 
             (this.date_end!=null &&
              this.date_end.equals(other.getDate_end())));
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
        if (getOrder_status() != null) {
            _hashCode += getOrder_status().hashCode();
        }
        if (getDate_start() != null) {
            _hashCode += getDate_start().hashCode();
        }
        if (getDate_end() != null) {
            _hashCode += getDate_end().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetOrderFromDateInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "GetOrderFromDateInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loginInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "loginInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_start");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_end");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_end"));
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
