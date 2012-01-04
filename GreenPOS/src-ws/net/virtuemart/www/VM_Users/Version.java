/**
 * Version.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Users;

public class Version  implements java.io.Serializable {
    private java.lang.String SOA_For_Virtuemart_Version;

    private java.lang.String joomla_Version;

    private java.lang.String virtuemart_Version;

    private java.lang.String database_Version;

    private java.lang.String author;

    public Version() {
    }

    public Version(
           java.lang.String SOA_For_Virtuemart_Version,
           java.lang.String joomla_Version,
           java.lang.String virtuemart_Version,
           java.lang.String database_Version,
           java.lang.String author) {
           this.SOA_For_Virtuemart_Version = SOA_For_Virtuemart_Version;
           this.joomla_Version = joomla_Version;
           this.virtuemart_Version = virtuemart_Version;
           this.database_Version = database_Version;
           this.author = author;
    }


    /**
     * Gets the SOA_For_Virtuemart_Version value for this Version.
     * 
     * @return SOA_For_Virtuemart_Version
     */
    public java.lang.String getSOA_For_Virtuemart_Version() {
        return SOA_For_Virtuemart_Version;
    }


    /**
     * Sets the SOA_For_Virtuemart_Version value for this Version.
     * 
     * @param SOA_For_Virtuemart_Version
     */
    public void setSOA_For_Virtuemart_Version(java.lang.String SOA_For_Virtuemart_Version) {
        this.SOA_For_Virtuemart_Version = SOA_For_Virtuemart_Version;
    }


    /**
     * Gets the joomla_Version value for this Version.
     * 
     * @return joomla_Version
     */
    public java.lang.String getJoomla_Version() {
        return joomla_Version;
    }


    /**
     * Sets the joomla_Version value for this Version.
     * 
     * @param joomla_Version
     */
    public void setJoomla_Version(java.lang.String joomla_Version) {
        this.joomla_Version = joomla_Version;
    }


    /**
     * Gets the virtuemart_Version value for this Version.
     * 
     * @return virtuemart_Version
     */
    public java.lang.String getVirtuemart_Version() {
        return virtuemart_Version;
    }


    /**
     * Sets the virtuemart_Version value for this Version.
     * 
     * @param virtuemart_Version
     */
    public void setVirtuemart_Version(java.lang.String virtuemart_Version) {
        this.virtuemart_Version = virtuemart_Version;
    }


    /**
     * Gets the database_Version value for this Version.
     * 
     * @return database_Version
     */
    public java.lang.String getDatabase_Version() {
        return database_Version;
    }


    /**
     * Sets the database_Version value for this Version.
     * 
     * @param database_Version
     */
    public void setDatabase_Version(java.lang.String database_Version) {
        this.database_Version = database_Version;
    }


    /**
     * Gets the author value for this Version.
     * 
     * @return author
     */
    public java.lang.String getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this Version.
     * 
     * @param author
     */
    public void setAuthor(java.lang.String author) {
        this.author = author;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Version)) return false;
        Version other = (Version) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SOA_For_Virtuemart_Version==null && other.getSOA_For_Virtuemart_Version()==null) || 
             (this.SOA_For_Virtuemart_Version!=null &&
              this.SOA_For_Virtuemart_Version.equals(other.getSOA_For_Virtuemart_Version()))) &&
            ((this.joomla_Version==null && other.getJoomla_Version()==null) || 
             (this.joomla_Version!=null &&
              this.joomla_Version.equals(other.getJoomla_Version()))) &&
            ((this.virtuemart_Version==null && other.getVirtuemart_Version()==null) || 
             (this.virtuemart_Version!=null &&
              this.virtuemart_Version.equals(other.getVirtuemart_Version()))) &&
            ((this.database_Version==null && other.getDatabase_Version()==null) || 
             (this.database_Version!=null &&
              this.database_Version.equals(other.getDatabase_Version()))) &&
            ((this.author==null && other.getAuthor()==null) || 
             (this.author!=null &&
              this.author.equals(other.getAuthor())));
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
        if (getSOA_For_Virtuemart_Version() != null) {
            _hashCode += getSOA_For_Virtuemart_Version().hashCode();
        }
        if (getJoomla_Version() != null) {
            _hashCode += getJoomla_Version().hashCode();
        }
        if (getVirtuemart_Version() != null) {
            _hashCode += getVirtuemart_Version().hashCode();
        }
        if (getDatabase_Version() != null) {
            _hashCode += getDatabase_Version().hashCode();
        }
        if (getAuthor() != null) {
            _hashCode += getAuthor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Version.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Users/", "Version"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SOA_For_Virtuemart_Version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SOA_For_Virtuemart_Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("joomla_Version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Joomla_Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtuemart_Version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Virtuemart_Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("database_Version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Database_Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("author");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Author"));
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
