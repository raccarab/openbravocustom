/**
 * Manufacturer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Users;

public class Manufacturer  implements java.io.Serializable {
    private java.lang.String manufacturer_id;

    private java.lang.String mf_name;

    private java.lang.String mf_email;

    private java.lang.String mf_desc;

    private java.lang.String mf_category_id;

    private java.lang.String mf_url;

    public Manufacturer() {
    }

    public Manufacturer(
           java.lang.String manufacturer_id,
           java.lang.String mf_name,
           java.lang.String mf_email,
           java.lang.String mf_desc,
           java.lang.String mf_category_id,
           java.lang.String mf_url) {
           this.manufacturer_id = manufacturer_id;
           this.mf_name = mf_name;
           this.mf_email = mf_email;
           this.mf_desc = mf_desc;
           this.mf_category_id = mf_category_id;
           this.mf_url = mf_url;
    }


    /**
     * Gets the manufacturer_id value for this Manufacturer.
     * 
     * @return manufacturer_id
     */
    public java.lang.String getManufacturer_id() {
        return manufacturer_id;
    }


    /**
     * Sets the manufacturer_id value for this Manufacturer.
     * 
     * @param manufacturer_id
     */
    public void setManufacturer_id(java.lang.String manufacturer_id) {
        this.manufacturer_id = manufacturer_id;
    }


    /**
     * Gets the mf_name value for this Manufacturer.
     * 
     * @return mf_name
     */
    public java.lang.String getMf_name() {
        return mf_name;
    }


    /**
     * Sets the mf_name value for this Manufacturer.
     * 
     * @param mf_name
     */
    public void setMf_name(java.lang.String mf_name) {
        this.mf_name = mf_name;
    }


    /**
     * Gets the mf_email value for this Manufacturer.
     * 
     * @return mf_email
     */
    public java.lang.String getMf_email() {
        return mf_email;
    }


    /**
     * Sets the mf_email value for this Manufacturer.
     * 
     * @param mf_email
     */
    public void setMf_email(java.lang.String mf_email) {
        this.mf_email = mf_email;
    }


    /**
     * Gets the mf_desc value for this Manufacturer.
     * 
     * @return mf_desc
     */
    public java.lang.String getMf_desc() {
        return mf_desc;
    }


    /**
     * Sets the mf_desc value for this Manufacturer.
     * 
     * @param mf_desc
     */
    public void setMf_desc(java.lang.String mf_desc) {
        this.mf_desc = mf_desc;
    }


    /**
     * Gets the mf_category_id value for this Manufacturer.
     * 
     * @return mf_category_id
     */
    public java.lang.String getMf_category_id() {
        return mf_category_id;
    }


    /**
     * Sets the mf_category_id value for this Manufacturer.
     * 
     * @param mf_category_id
     */
    public void setMf_category_id(java.lang.String mf_category_id) {
        this.mf_category_id = mf_category_id;
    }


    /**
     * Gets the mf_url value for this Manufacturer.
     * 
     * @return mf_url
     */
    public java.lang.String getMf_url() {
        return mf_url;
    }


    /**
     * Sets the mf_url value for this Manufacturer.
     * 
     * @param mf_url
     */
    public void setMf_url(java.lang.String mf_url) {
        this.mf_url = mf_url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Manufacturer)) return false;
        Manufacturer other = (Manufacturer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.manufacturer_id==null && other.getManufacturer_id()==null) || 
             (this.manufacturer_id!=null &&
              this.manufacturer_id.equals(other.getManufacturer_id()))) &&
            ((this.mf_name==null && other.getMf_name()==null) || 
             (this.mf_name!=null &&
              this.mf_name.equals(other.getMf_name()))) &&
            ((this.mf_email==null && other.getMf_email()==null) || 
             (this.mf_email!=null &&
              this.mf_email.equals(other.getMf_email()))) &&
            ((this.mf_desc==null && other.getMf_desc()==null) || 
             (this.mf_desc!=null &&
              this.mf_desc.equals(other.getMf_desc()))) &&
            ((this.mf_category_id==null && other.getMf_category_id()==null) || 
             (this.mf_category_id!=null &&
              this.mf_category_id.equals(other.getMf_category_id()))) &&
            ((this.mf_url==null && other.getMf_url()==null) || 
             (this.mf_url!=null &&
              this.mf_url.equals(other.getMf_url())));
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
        if (getManufacturer_id() != null) {
            _hashCode += getManufacturer_id().hashCode();
        }
        if (getMf_name() != null) {
            _hashCode += getMf_name().hashCode();
        }
        if (getMf_email() != null) {
            _hashCode += getMf_email().hashCode();
        }
        if (getMf_desc() != null) {
            _hashCode += getMf_desc().hashCode();
        }
        if (getMf_category_id() != null) {
            _hashCode += getMf_category_id().hashCode();
        }
        if (getMf_url() != null) {
            _hashCode += getMf_url().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Manufacturer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Users/", "Manufacturer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturer_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manufacturer_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mf_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mf_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mf_email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mf_email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mf_desc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mf_desc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mf_category_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mf_category_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mf_url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mf_url"));
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
