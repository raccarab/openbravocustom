/**
 * Country.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Users;

public class Country  implements java.io.Serializable {
    private java.lang.String country_id;

    private java.lang.String zone_id;

    private java.lang.String country_name;

    private java.lang.String country_3_code;

    private java.lang.String country_2_code;

    public Country() {
    }

    public Country(
           java.lang.String country_id,
           java.lang.String zone_id,
           java.lang.String country_name,
           java.lang.String country_3_code,
           java.lang.String country_2_code) {
           this.country_id = country_id;
           this.zone_id = zone_id;
           this.country_name = country_name;
           this.country_3_code = country_3_code;
           this.country_2_code = country_2_code;
    }


    /**
     * Gets the country_id value for this Country.
     * 
     * @return country_id
     */
    public java.lang.String getCountry_id() {
        return country_id;
    }


    /**
     * Sets the country_id value for this Country.
     * 
     * @param country_id
     */
    public void setCountry_id(java.lang.String country_id) {
        this.country_id = country_id;
    }


    /**
     * Gets the zone_id value for this Country.
     * 
     * @return zone_id
     */
    public java.lang.String getZone_id() {
        return zone_id;
    }


    /**
     * Sets the zone_id value for this Country.
     * 
     * @param zone_id
     */
    public void setZone_id(java.lang.String zone_id) {
        this.zone_id = zone_id;
    }


    /**
     * Gets the country_name value for this Country.
     * 
     * @return country_name
     */
    public java.lang.String getCountry_name() {
        return country_name;
    }


    /**
     * Sets the country_name value for this Country.
     * 
     * @param country_name
     */
    public void setCountry_name(java.lang.String country_name) {
        this.country_name = country_name;
    }


    /**
     * Gets the country_3_code value for this Country.
     * 
     * @return country_3_code
     */
    public java.lang.String getCountry_3_code() {
        return country_3_code;
    }


    /**
     * Sets the country_3_code value for this Country.
     * 
     * @param country_3_code
     */
    public void setCountry_3_code(java.lang.String country_3_code) {
        this.country_3_code = country_3_code;
    }


    /**
     * Gets the country_2_code value for this Country.
     * 
     * @return country_2_code
     */
    public java.lang.String getCountry_2_code() {
        return country_2_code;
    }


    /**
     * Sets the country_2_code value for this Country.
     * 
     * @param country_2_code
     */
    public void setCountry_2_code(java.lang.String country_2_code) {
        this.country_2_code = country_2_code;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Country)) return false;
        Country other = (Country) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.country_id==null && other.getCountry_id()==null) || 
             (this.country_id!=null &&
              this.country_id.equals(other.getCountry_id()))) &&
            ((this.zone_id==null && other.getZone_id()==null) || 
             (this.zone_id!=null &&
              this.zone_id.equals(other.getZone_id()))) &&
            ((this.country_name==null && other.getCountry_name()==null) || 
             (this.country_name!=null &&
              this.country_name.equals(other.getCountry_name()))) &&
            ((this.country_3_code==null && other.getCountry_3_code()==null) || 
             (this.country_3_code!=null &&
              this.country_3_code.equals(other.getCountry_3_code()))) &&
            ((this.country_2_code==null && other.getCountry_2_code()==null) || 
             (this.country_2_code!=null &&
              this.country_2_code.equals(other.getCountry_2_code())));
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
        if (getCountry_id() != null) {
            _hashCode += getCountry_id().hashCode();
        }
        if (getZone_id() != null) {
            _hashCode += getZone_id().hashCode();
        }
        if (getCountry_name() != null) {
            _hashCode += getCountry_name().hashCode();
        }
        if (getCountry_3_code() != null) {
            _hashCode += getCountry_3_code().hashCode();
        }
        if (getCountry_2_code() != null) {
            _hashCode += getCountry_2_code().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Country.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Users/", "Country"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zone_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zone_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_3_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country_3_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_2_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country_2_code"));
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
