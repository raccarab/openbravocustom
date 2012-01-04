/**
 * Creditcard.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Order;

public class Creditcard  implements java.io.Serializable {
    private java.lang.String creditcard_id;

    private java.lang.String vendor_id;

    private java.lang.String creditcard_name;

    private java.lang.String creditcard_code;

    public Creditcard() {
    }

    public Creditcard(
           java.lang.String creditcard_id,
           java.lang.String vendor_id,
           java.lang.String creditcard_name,
           java.lang.String creditcard_code) {
           this.creditcard_id = creditcard_id;
           this.vendor_id = vendor_id;
           this.creditcard_name = creditcard_name;
           this.creditcard_code = creditcard_code;
    }


    /**
     * Gets the creditcard_id value for this Creditcard.
     * 
     * @return creditcard_id
     */
    public java.lang.String getCreditcard_id() {
        return creditcard_id;
    }


    /**
     * Sets the creditcard_id value for this Creditcard.
     * 
     * @param creditcard_id
     */
    public void setCreditcard_id(java.lang.String creditcard_id) {
        this.creditcard_id = creditcard_id;
    }


    /**
     * Gets the vendor_id value for this Creditcard.
     * 
     * @return vendor_id
     */
    public java.lang.String getVendor_id() {
        return vendor_id;
    }


    /**
     * Sets the vendor_id value for this Creditcard.
     * 
     * @param vendor_id
     */
    public void setVendor_id(java.lang.String vendor_id) {
        this.vendor_id = vendor_id;
    }


    /**
     * Gets the creditcard_name value for this Creditcard.
     * 
     * @return creditcard_name
     */
    public java.lang.String getCreditcard_name() {
        return creditcard_name;
    }


    /**
     * Sets the creditcard_name value for this Creditcard.
     * 
     * @param creditcard_name
     */
    public void setCreditcard_name(java.lang.String creditcard_name) {
        this.creditcard_name = creditcard_name;
    }


    /**
     * Gets the creditcard_code value for this Creditcard.
     * 
     * @return creditcard_code
     */
    public java.lang.String getCreditcard_code() {
        return creditcard_code;
    }


    /**
     * Sets the creditcard_code value for this Creditcard.
     * 
     * @param creditcard_code
     */
    public void setCreditcard_code(java.lang.String creditcard_code) {
        this.creditcard_code = creditcard_code;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Creditcard)) return false;
        Creditcard other = (Creditcard) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.creditcard_id==null && other.getCreditcard_id()==null) || 
             (this.creditcard_id!=null &&
              this.creditcard_id.equals(other.getCreditcard_id()))) &&
            ((this.vendor_id==null && other.getVendor_id()==null) || 
             (this.vendor_id!=null &&
              this.vendor_id.equals(other.getVendor_id()))) &&
            ((this.creditcard_name==null && other.getCreditcard_name()==null) || 
             (this.creditcard_name!=null &&
              this.creditcard_name.equals(other.getCreditcard_name()))) &&
            ((this.creditcard_code==null && other.getCreditcard_code()==null) || 
             (this.creditcard_code!=null &&
              this.creditcard_code.equals(other.getCreditcard_code())));
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
        if (getCreditcard_id() != null) {
            _hashCode += getCreditcard_id().hashCode();
        }
        if (getVendor_id() != null) {
            _hashCode += getVendor_id().hashCode();
        }
        if (getCreditcard_name() != null) {
            _hashCode += getCreditcard_name().hashCode();
        }
        if (getCreditcard_code() != null) {
            _hashCode += getCreditcard_code().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Creditcard.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "Creditcard"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditcard_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditcard_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendor_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendor_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditcard_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditcard_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditcard_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditcard_code"));
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
