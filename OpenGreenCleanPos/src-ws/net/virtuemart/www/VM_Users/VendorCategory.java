/**
 * VendorCategory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Users;

public class VendorCategory  implements java.io.Serializable {
    private java.lang.String vendor_category_id;

    private java.lang.String vendor_category_name;

    private java.lang.String vendor_category_desc;

    public VendorCategory() {
    }

    public VendorCategory(
           java.lang.String vendor_category_id,
           java.lang.String vendor_category_name,
           java.lang.String vendor_category_desc) {
           this.vendor_category_id = vendor_category_id;
           this.vendor_category_name = vendor_category_name;
           this.vendor_category_desc = vendor_category_desc;
    }


    /**
     * Gets the vendor_category_id value for this VendorCategory.
     * 
     * @return vendor_category_id
     */
    public java.lang.String getVendor_category_id() {
        return vendor_category_id;
    }


    /**
     * Sets the vendor_category_id value for this VendorCategory.
     * 
     * @param vendor_category_id
     */
    public void setVendor_category_id(java.lang.String vendor_category_id) {
        this.vendor_category_id = vendor_category_id;
    }


    /**
     * Gets the vendor_category_name value for this VendorCategory.
     * 
     * @return vendor_category_name
     */
    public java.lang.String getVendor_category_name() {
        return vendor_category_name;
    }


    /**
     * Sets the vendor_category_name value for this VendorCategory.
     * 
     * @param vendor_category_name
     */
    public void setVendor_category_name(java.lang.String vendor_category_name) {
        this.vendor_category_name = vendor_category_name;
    }


    /**
     * Gets the vendor_category_desc value for this VendorCategory.
     * 
     * @return vendor_category_desc
     */
    public java.lang.String getVendor_category_desc() {
        return vendor_category_desc;
    }


    /**
     * Sets the vendor_category_desc value for this VendorCategory.
     * 
     * @param vendor_category_desc
     */
    public void setVendor_category_desc(java.lang.String vendor_category_desc) {
        this.vendor_category_desc = vendor_category_desc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VendorCategory)) return false;
        VendorCategory other = (VendorCategory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vendor_category_id==null && other.getVendor_category_id()==null) || 
             (this.vendor_category_id!=null &&
              this.vendor_category_id.equals(other.getVendor_category_id()))) &&
            ((this.vendor_category_name==null && other.getVendor_category_name()==null) || 
             (this.vendor_category_name!=null &&
              this.vendor_category_name.equals(other.getVendor_category_name()))) &&
            ((this.vendor_category_desc==null && other.getVendor_category_desc()==null) || 
             (this.vendor_category_desc!=null &&
              this.vendor_category_desc.equals(other.getVendor_category_desc())));
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
        if (getVendor_category_id() != null) {
            _hashCode += getVendor_category_id().hashCode();
        }
        if (getVendor_category_name() != null) {
            _hashCode += getVendor_category_name().hashCode();
        }
        if (getVendor_category_desc() != null) {
            _hashCode += getVendor_category_desc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VendorCategory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Users/", "VendorCategory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendor_category_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendor_category_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendor_category_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendor_category_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendor_category_desc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendor_category_desc"));
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
