/**
 * OrderStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Order;

public class OrderStatus  implements java.io.Serializable {
    private java.lang.String order_status_id;

    private java.lang.String order_status_code;

    private java.lang.String order_status_name;

    private java.lang.String order_status_description;

    private java.lang.String list_order;

    private java.lang.String vendor_id;

    public OrderStatus() {
    }

    public OrderStatus(
           java.lang.String order_status_id,
           java.lang.String order_status_code,
           java.lang.String order_status_name,
           java.lang.String order_status_description,
           java.lang.String list_order,
           java.lang.String vendor_id) {
           this.order_status_id = order_status_id;
           this.order_status_code = order_status_code;
           this.order_status_name = order_status_name;
           this.order_status_description = order_status_description;
           this.list_order = list_order;
           this.vendor_id = vendor_id;
    }


    /**
     * Gets the order_status_id value for this OrderStatus.
     * 
     * @return order_status_id
     */
    public java.lang.String getOrder_status_id() {
        return order_status_id;
    }


    /**
     * Sets the order_status_id value for this OrderStatus.
     * 
     * @param order_status_id
     */
    public void setOrder_status_id(java.lang.String order_status_id) {
        this.order_status_id = order_status_id;
    }


    /**
     * Gets the order_status_code value for this OrderStatus.
     * 
     * @return order_status_code
     */
    public java.lang.String getOrder_status_code() {
        return order_status_code;
    }


    /**
     * Sets the order_status_code value for this OrderStatus.
     * 
     * @param order_status_code
     */
    public void setOrder_status_code(java.lang.String order_status_code) {
        this.order_status_code = order_status_code;
    }


    /**
     * Gets the order_status_name value for this OrderStatus.
     * 
     * @return order_status_name
     */
    public java.lang.String getOrder_status_name() {
        return order_status_name;
    }


    /**
     * Sets the order_status_name value for this OrderStatus.
     * 
     * @param order_status_name
     */
    public void setOrder_status_name(java.lang.String order_status_name) {
        this.order_status_name = order_status_name;
    }


    /**
     * Gets the order_status_description value for this OrderStatus.
     * 
     * @return order_status_description
     */
    public java.lang.String getOrder_status_description() {
        return order_status_description;
    }


    /**
     * Sets the order_status_description value for this OrderStatus.
     * 
     * @param order_status_description
     */
    public void setOrder_status_description(java.lang.String order_status_description) {
        this.order_status_description = order_status_description;
    }


    /**
     * Gets the list_order value for this OrderStatus.
     * 
     * @return list_order
     */
    public java.lang.String getList_order() {
        return list_order;
    }


    /**
     * Sets the list_order value for this OrderStatus.
     * 
     * @param list_order
     */
    public void setList_order(java.lang.String list_order) {
        this.list_order = list_order;
    }


    /**
     * Gets the vendor_id value for this OrderStatus.
     * 
     * @return vendor_id
     */
    public java.lang.String getVendor_id() {
        return vendor_id;
    }


    /**
     * Sets the vendor_id value for this OrderStatus.
     * 
     * @param vendor_id
     */
    public void setVendor_id(java.lang.String vendor_id) {
        this.vendor_id = vendor_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderStatus)) return false;
        OrderStatus other = (OrderStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.order_status_id==null && other.getOrder_status_id()==null) || 
             (this.order_status_id!=null &&
              this.order_status_id.equals(other.getOrder_status_id()))) &&
            ((this.order_status_code==null && other.getOrder_status_code()==null) || 
             (this.order_status_code!=null &&
              this.order_status_code.equals(other.getOrder_status_code()))) &&
            ((this.order_status_name==null && other.getOrder_status_name()==null) || 
             (this.order_status_name!=null &&
              this.order_status_name.equals(other.getOrder_status_name()))) &&
            ((this.order_status_description==null && other.getOrder_status_description()==null) || 
             (this.order_status_description!=null &&
              this.order_status_description.equals(other.getOrder_status_description()))) &&
            ((this.list_order==null && other.getList_order()==null) || 
             (this.list_order!=null &&
              this.list_order.equals(other.getList_order()))) &&
            ((this.vendor_id==null && other.getVendor_id()==null) || 
             (this.vendor_id!=null &&
              this.vendor_id.equals(other.getVendor_id())));
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
        if (getOrder_status_id() != null) {
            _hashCode += getOrder_status_id().hashCode();
        }
        if (getOrder_status_code() != null) {
            _hashCode += getOrder_status_code().hashCode();
        }
        if (getOrder_status_name() != null) {
            _hashCode += getOrder_status_name().hashCode();
        }
        if (getOrder_status_description() != null) {
            _hashCode += getOrder_status_description().hashCode();
        }
        if (getList_order() != null) {
            _hashCode += getList_order().hashCode();
        }
        if (getVendor_id() != null) {
            _hashCode += getVendor_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "OrderStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_status_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_status_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_status_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_status_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_status_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_status_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_status_description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_status_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("list_order");
        elemField.setXmlName(new javax.xml.namespace.QName("", "list_order"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendor_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendor_id"));
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
