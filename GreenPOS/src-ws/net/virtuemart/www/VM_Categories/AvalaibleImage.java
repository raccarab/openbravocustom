/**
 * AvalaibleImage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Categories;

public class AvalaibleImage  implements java.io.Serializable {
    private java.lang.String image_name;

    private java.lang.String image_url;

    public AvalaibleImage() {
    }

    public AvalaibleImage(
           java.lang.String image_name,
           java.lang.String image_url) {
           this.image_name = image_name;
           this.image_url = image_url;
    }


    /**
     * Gets the image_name value for this AvalaibleImage.
     * 
     * @return image_name
     */
    public java.lang.String getImage_name() {
        return image_name;
    }


    /**
     * Sets the image_name value for this AvalaibleImage.
     * 
     * @param image_name
     */
    public void setImage_name(java.lang.String image_name) {
        this.image_name = image_name;
    }


    /**
     * Gets the image_url value for this AvalaibleImage.
     * 
     * @return image_url
     */
    public java.lang.String getImage_url() {
        return image_url;
    }


    /**
     * Sets the image_url value for this AvalaibleImage.
     * 
     * @param image_url
     */
    public void setImage_url(java.lang.String image_url) {
        this.image_url = image_url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AvalaibleImage)) return false;
        AvalaibleImage other = (AvalaibleImage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.image_name==null && other.getImage_name()==null) || 
             (this.image_name!=null &&
              this.image_name.equals(other.getImage_name()))) &&
            ((this.image_url==null && other.getImage_url()==null) || 
             (this.image_url!=null &&
              this.image_url.equals(other.getImage_url())));
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
        if (getImage_name() != null) {
            _hashCode += getImage_name().hashCode();
        }
        if (getImage_url() != null) {
            _hashCode += getImage_url().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AvalaibleImage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Categories/", "AvalaibleImage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "image_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image_url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "image_url"));
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
