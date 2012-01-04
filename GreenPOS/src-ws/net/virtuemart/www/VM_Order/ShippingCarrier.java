/**
 * ShippingCarrier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Order;

public class ShippingCarrier  implements java.io.Serializable {
    private java.lang.String shipping_carrier_id;

    private java.lang.String shipping_carrier_name;

    private java.lang.String shipping_carrier_list_order;

    public ShippingCarrier() {
    }

    public ShippingCarrier(
           java.lang.String shipping_carrier_id,
           java.lang.String shipping_carrier_name,
           java.lang.String shipping_carrier_list_order) {
           this.shipping_carrier_id = shipping_carrier_id;
           this.shipping_carrier_name = shipping_carrier_name;
           this.shipping_carrier_list_order = shipping_carrier_list_order;
    }


    /**
     * Gets the shipping_carrier_id value for this ShippingCarrier.
     * 
     * @return shipping_carrier_id
     */
    public java.lang.String getShipping_carrier_id() {
        return shipping_carrier_id;
    }


    /**
     * Sets the shipping_carrier_id value for this ShippingCarrier.
     * 
     * @param shipping_carrier_id
     */
    public void setShipping_carrier_id(java.lang.String shipping_carrier_id) {
        this.shipping_carrier_id = shipping_carrier_id;
    }


    /**
     * Gets the shipping_carrier_name value for this ShippingCarrier.
     * 
     * @return shipping_carrier_name
     */
    public java.lang.String getShipping_carrier_name() {
        return shipping_carrier_name;
    }


    /**
     * Sets the shipping_carrier_name value for this ShippingCarrier.
     * 
     * @param shipping_carrier_name
     */
    public void setShipping_carrier_name(java.lang.String shipping_carrier_name) {
        this.shipping_carrier_name = shipping_carrier_name;
    }


    /**
     * Gets the shipping_carrier_list_order value for this ShippingCarrier.
     * 
     * @return shipping_carrier_list_order
     */
    public java.lang.String getShipping_carrier_list_order() {
        return shipping_carrier_list_order;
    }


    /**
     * Sets the shipping_carrier_list_order value for this ShippingCarrier.
     * 
     * @param shipping_carrier_list_order
     */
    public void setShipping_carrier_list_order(java.lang.String shipping_carrier_list_order) {
        this.shipping_carrier_list_order = shipping_carrier_list_order;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShippingCarrier)) return false;
        ShippingCarrier other = (ShippingCarrier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shipping_carrier_id==null && other.getShipping_carrier_id()==null) || 
             (this.shipping_carrier_id!=null &&
              this.shipping_carrier_id.equals(other.getShipping_carrier_id()))) &&
            ((this.shipping_carrier_name==null && other.getShipping_carrier_name()==null) || 
             (this.shipping_carrier_name!=null &&
              this.shipping_carrier_name.equals(other.getShipping_carrier_name()))) &&
            ((this.shipping_carrier_list_order==null && other.getShipping_carrier_list_order()==null) || 
             (this.shipping_carrier_list_order!=null &&
              this.shipping_carrier_list_order.equals(other.getShipping_carrier_list_order())));
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
        if (getShipping_carrier_id() != null) {
            _hashCode += getShipping_carrier_id().hashCode();
        }
        if (getShipping_carrier_name() != null) {
            _hashCode += getShipping_carrier_name().hashCode();
        }
        if (getShipping_carrier_list_order() != null) {
            _hashCode += getShipping_carrier_list_order().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShippingCarrier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "ShippingCarrier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipping_carrier_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipping_carrier_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipping_carrier_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipping_carrier_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipping_carrier_list_order");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipping_carrier_list_order"));
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
