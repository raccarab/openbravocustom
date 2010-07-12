/**
 * Currency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Product;

public class Currency  implements java.io.Serializable {
    private java.lang.String currency_id;

    private java.lang.String currency_name;

    private java.lang.String currency_code;

    public Currency() {
    }

    public Currency(
           java.lang.String currency_id,
           java.lang.String currency_name,
           java.lang.String currency_code) {
           this.currency_id = currency_id;
           this.currency_name = currency_name;
           this.currency_code = currency_code;
    }


    /**
     * Gets the currency_id value for this Currency.
     * 
     * @return currency_id
     */
    public java.lang.String getCurrency_id() {
        return currency_id;
    }


    /**
     * Sets the currency_id value for this Currency.
     * 
     * @param currency_id
     */
    public void setCurrency_id(java.lang.String currency_id) {
        this.currency_id = currency_id;
    }


    /**
     * Gets the currency_name value for this Currency.
     * 
     * @return currency_name
     */
    public java.lang.String getCurrency_name() {
        return currency_name;
    }


    /**
     * Sets the currency_name value for this Currency.
     * 
     * @param currency_name
     */
    public void setCurrency_name(java.lang.String currency_name) {
        this.currency_name = currency_name;
    }


    /**
     * Gets the currency_code value for this Currency.
     * 
     * @return currency_code
     */
    public java.lang.String getCurrency_code() {
        return currency_code;
    }


    /**
     * Sets the currency_code value for this Currency.
     * 
     * @param currency_code
     */
    public void setCurrency_code(java.lang.String currency_code) {
        this.currency_code = currency_code;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Currency)) return false;
        Currency other = (Currency) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currency_id==null && other.getCurrency_id()==null) || 
             (this.currency_id!=null &&
              this.currency_id.equals(other.getCurrency_id()))) &&
            ((this.currency_name==null && other.getCurrency_name()==null) || 
             (this.currency_name!=null &&
              this.currency_name.equals(other.getCurrency_name()))) &&
            ((this.currency_code==null && other.getCurrency_code()==null) || 
             (this.currency_code!=null &&
              this.currency_code.equals(other.getCurrency_code())));
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
        if (getCurrency_id() != null) {
            _hashCode += getCurrency_id().hashCode();
        }
        if (getCurrency_name() != null) {
            _hashCode += getCurrency_name().hashCode();
        }
        if (getCurrency_code() != null) {
            _hashCode += getCurrency_code().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Currency.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "Currency"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency_code"));
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
