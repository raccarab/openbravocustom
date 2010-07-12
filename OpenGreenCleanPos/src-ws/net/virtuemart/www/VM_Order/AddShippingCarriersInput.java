/**
 * AddShippingCarriersInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Order;

public class AddShippingCarriersInput  implements java.io.Serializable {
    private net.virtuemart.www.VM_Tools.LoginInfo loginInfo;

    private net.virtuemart.www.VM_Order.ShippingCarrier[] shipping_carriers;

    public AddShippingCarriersInput() {
    }

    public AddShippingCarriersInput(
           net.virtuemart.www.VM_Tools.LoginInfo loginInfo,
           net.virtuemart.www.VM_Order.ShippingCarrier[] shipping_carriers) {
           this.loginInfo = loginInfo;
           this.shipping_carriers = shipping_carriers;
    }


    /**
     * Gets the loginInfo value for this AddShippingCarriersInput.
     * 
     * @return loginInfo
     */
    public net.virtuemart.www.VM_Tools.LoginInfo getLoginInfo() {
        return loginInfo;
    }


    /**
     * Sets the loginInfo value for this AddShippingCarriersInput.
     * 
     * @param loginInfo
     */
    public void setLoginInfo(net.virtuemart.www.VM_Tools.LoginInfo loginInfo) {
        this.loginInfo = loginInfo;
    }


    /**
     * Gets the shipping_carriers value for this AddShippingCarriersInput.
     * 
     * @return shipping_carriers
     */
    public net.virtuemart.www.VM_Order.ShippingCarrier[] getShipping_carriers() {
        return shipping_carriers;
    }


    /**
     * Sets the shipping_carriers value for this AddShippingCarriersInput.
     * 
     * @param shipping_carriers
     */
    public void setShipping_carriers(net.virtuemart.www.VM_Order.ShippingCarrier[] shipping_carriers) {
        this.shipping_carriers = shipping_carriers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddShippingCarriersInput)) return false;
        AddShippingCarriersInput other = (AddShippingCarriersInput) obj;
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
            ((this.shipping_carriers==null && other.getShipping_carriers()==null) || 
             (this.shipping_carriers!=null &&
              java.util.Arrays.equals(this.shipping_carriers, other.getShipping_carriers())));
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
        if (getShipping_carriers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipping_carriers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipping_carriers(), i);
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
        new org.apache.axis.description.TypeDesc(AddShippingCarriersInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "AddShippingCarriersInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loginInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "loginInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipping_carriers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipping_carriers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "ShippingCarrier"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "shipping_carrier"));
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
