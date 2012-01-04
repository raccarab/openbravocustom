/**
 * AuthGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Users;

public class AuthGroup  implements java.io.Serializable {
    private java.lang.String group_id;

    private java.lang.String group_name;

    private java.lang.String group_level;

    public AuthGroup() {
    }

    public AuthGroup(
           java.lang.String group_id,
           java.lang.String group_name,
           java.lang.String group_level) {
           this.group_id = group_id;
           this.group_name = group_name;
           this.group_level = group_level;
    }


    /**
     * Gets the group_id value for this AuthGroup.
     * 
     * @return group_id
     */
    public java.lang.String getGroup_id() {
        return group_id;
    }


    /**
     * Sets the group_id value for this AuthGroup.
     * 
     * @param group_id
     */
    public void setGroup_id(java.lang.String group_id) {
        this.group_id = group_id;
    }


    /**
     * Gets the group_name value for this AuthGroup.
     * 
     * @return group_name
     */
    public java.lang.String getGroup_name() {
        return group_name;
    }


    /**
     * Sets the group_name value for this AuthGroup.
     * 
     * @param group_name
     */
    public void setGroup_name(java.lang.String group_name) {
        this.group_name = group_name;
    }


    /**
     * Gets the group_level value for this AuthGroup.
     * 
     * @return group_level
     */
    public java.lang.String getGroup_level() {
        return group_level;
    }


    /**
     * Sets the group_level value for this AuthGroup.
     * 
     * @param group_level
     */
    public void setGroup_level(java.lang.String group_level) {
        this.group_level = group_level;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthGroup)) return false;
        AuthGroup other = (AuthGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.group_id==null && other.getGroup_id()==null) || 
             (this.group_id!=null &&
              this.group_id.equals(other.getGroup_id()))) &&
            ((this.group_name==null && other.getGroup_name()==null) || 
             (this.group_name!=null &&
              this.group_name.equals(other.getGroup_name()))) &&
            ((this.group_level==null && other.getGroup_level()==null) || 
             (this.group_level!=null &&
              this.group_level.equals(other.getGroup_level())));
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
        if (getGroup_id() != null) {
            _hashCode += getGroup_id().hashCode();
        }
        if (getGroup_name() != null) {
            _hashCode += getGroup_name().hashCode();
        }
        if (getGroup_level() != null) {
            _hashCode += getGroup_level().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Users/", "AuthGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group_level");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group_level"));
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
