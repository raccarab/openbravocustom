/**
 * ManufacturerCat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Users;

public class ManufacturerCat  implements java.io.Serializable {
    private java.lang.String mf_category_id;

    private java.lang.String mf_category_name;

    private java.lang.String mf_category_desc;

    public ManufacturerCat() {
    }

    public ManufacturerCat(
           java.lang.String mf_category_id,
           java.lang.String mf_category_name,
           java.lang.String mf_category_desc) {
           this.mf_category_id = mf_category_id;
           this.mf_category_name = mf_category_name;
           this.mf_category_desc = mf_category_desc;
    }


    /**
     * Gets the mf_category_id value for this ManufacturerCat.
     * 
     * @return mf_category_id
     */
    public java.lang.String getMf_category_id() {
        return mf_category_id;
    }


    /**
     * Sets the mf_category_id value for this ManufacturerCat.
     * 
     * @param mf_category_id
     */
    public void setMf_category_id(java.lang.String mf_category_id) {
        this.mf_category_id = mf_category_id;
    }


    /**
     * Gets the mf_category_name value for this ManufacturerCat.
     * 
     * @return mf_category_name
     */
    public java.lang.String getMf_category_name() {
        return mf_category_name;
    }


    /**
     * Sets the mf_category_name value for this ManufacturerCat.
     * 
     * @param mf_category_name
     */
    public void setMf_category_name(java.lang.String mf_category_name) {
        this.mf_category_name = mf_category_name;
    }


    /**
     * Gets the mf_category_desc value for this ManufacturerCat.
     * 
     * @return mf_category_desc
     */
    public java.lang.String getMf_category_desc() {
        return mf_category_desc;
    }


    /**
     * Sets the mf_category_desc value for this ManufacturerCat.
     * 
     * @param mf_category_desc
     */
    public void setMf_category_desc(java.lang.String mf_category_desc) {
        this.mf_category_desc = mf_category_desc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManufacturerCat)) return false;
        ManufacturerCat other = (ManufacturerCat) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mf_category_id==null && other.getMf_category_id()==null) || 
             (this.mf_category_id!=null &&
              this.mf_category_id.equals(other.getMf_category_id()))) &&
            ((this.mf_category_name==null && other.getMf_category_name()==null) || 
             (this.mf_category_name!=null &&
              this.mf_category_name.equals(other.getMf_category_name()))) &&
            ((this.mf_category_desc==null && other.getMf_category_desc()==null) || 
             (this.mf_category_desc!=null &&
              this.mf_category_desc.equals(other.getMf_category_desc())));
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
        if (getMf_category_id() != null) {
            _hashCode += getMf_category_id().hashCode();
        }
        if (getMf_category_name() != null) {
            _hashCode += getMf_category_name().hashCode();
        }
        if (getMf_category_desc() != null) {
            _hashCode += getMf_category_desc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManufacturerCat.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Users/", "ManufacturerCat"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mf_category_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mf_category_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mf_category_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mf_category_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mf_category_desc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mf_category_desc"));
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
