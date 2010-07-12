/**
 * UpdateOrderStatusInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Order;

public class UpdateOrderStatusInput  implements java.io.Serializable {
    private net.virtuemart.www.VM_Tools.LoginInfo loginInfo;

    private net.virtuemart.www.VM_Order.UpdateOrderStatusParam[] updateOrderStatusParams;

    public UpdateOrderStatusInput() {
    }

    public UpdateOrderStatusInput(
           net.virtuemart.www.VM_Tools.LoginInfo loginInfo,
           net.virtuemart.www.VM_Order.UpdateOrderStatusParam[] updateOrderStatusParams) {
           this.loginInfo = loginInfo;
           this.updateOrderStatusParams = updateOrderStatusParams;
    }


    /**
     * Gets the loginInfo value for this UpdateOrderStatusInput.
     * 
     * @return loginInfo
     */
    public net.virtuemart.www.VM_Tools.LoginInfo getLoginInfo() {
        return loginInfo;
    }


    /**
     * Sets the loginInfo value for this UpdateOrderStatusInput.
     * 
     * @param loginInfo
     */
    public void setLoginInfo(net.virtuemart.www.VM_Tools.LoginInfo loginInfo) {
        this.loginInfo = loginInfo;
    }


    /**
     * Gets the updateOrderStatusParams value for this UpdateOrderStatusInput.
     * 
     * @return updateOrderStatusParams
     */
    public net.virtuemart.www.VM_Order.UpdateOrderStatusParam[] getUpdateOrderStatusParams() {
        return updateOrderStatusParams;
    }


    /**
     * Sets the updateOrderStatusParams value for this UpdateOrderStatusInput.
     * 
     * @param updateOrderStatusParams
     */
    public void setUpdateOrderStatusParams(net.virtuemart.www.VM_Order.UpdateOrderStatusParam[] updateOrderStatusParams) {
        this.updateOrderStatusParams = updateOrderStatusParams;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateOrderStatusInput)) return false;
        UpdateOrderStatusInput other = (UpdateOrderStatusInput) obj;
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
            ((this.updateOrderStatusParams==null && other.getUpdateOrderStatusParams()==null) || 
             (this.updateOrderStatusParams!=null &&
              java.util.Arrays.equals(this.updateOrderStatusParams, other.getUpdateOrderStatusParams())));
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
        if (getUpdateOrderStatusParams() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUpdateOrderStatusParams());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUpdateOrderStatusParams(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateOrderStatusInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "UpdateOrderStatusInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loginInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "loginInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateOrderStatusParams");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UpdateOrderStatusParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "UpdateOrderStatusParam"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "UpdateOrderStatusParam"));
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
