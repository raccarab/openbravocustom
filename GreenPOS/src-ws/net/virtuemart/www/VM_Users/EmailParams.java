/**
 * EmailParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Users;

public class EmailParams  implements java.io.Serializable {
    private java.lang.String from_mail;

    private java.lang.String from_name;

    private java.lang.String recipient;

    private java.lang.String subject;

    private java.lang.String body;

    private java.lang.String altbody;

    public EmailParams() {
    }

    public EmailParams(
           java.lang.String from_mail,
           java.lang.String from_name,
           java.lang.String recipient,
           java.lang.String subject,
           java.lang.String body,
           java.lang.String altbody) {
           this.from_mail = from_mail;
           this.from_name = from_name;
           this.recipient = recipient;
           this.subject = subject;
           this.body = body;
           this.altbody = altbody;
    }


    /**
     * Gets the from_mail value for this EmailParams.
     * 
     * @return from_mail
     */
    public java.lang.String getFrom_mail() {
        return from_mail;
    }


    /**
     * Sets the from_mail value for this EmailParams.
     * 
     * @param from_mail
     */
    public void setFrom_mail(java.lang.String from_mail) {
        this.from_mail = from_mail;
    }


    /**
     * Gets the from_name value for this EmailParams.
     * 
     * @return from_name
     */
    public java.lang.String getFrom_name() {
        return from_name;
    }


    /**
     * Sets the from_name value for this EmailParams.
     * 
     * @param from_name
     */
    public void setFrom_name(java.lang.String from_name) {
        this.from_name = from_name;
    }


    /**
     * Gets the recipient value for this EmailParams.
     * 
     * @return recipient
     */
    public java.lang.String getRecipient() {
        return recipient;
    }


    /**
     * Sets the recipient value for this EmailParams.
     * 
     * @param recipient
     */
    public void setRecipient(java.lang.String recipient) {
        this.recipient = recipient;
    }


    /**
     * Gets the subject value for this EmailParams.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this EmailParams.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the body value for this EmailParams.
     * 
     * @return body
     */
    public java.lang.String getBody() {
        return body;
    }


    /**
     * Sets the body value for this EmailParams.
     * 
     * @param body
     */
    public void setBody(java.lang.String body) {
        this.body = body;
    }


    /**
     * Gets the altbody value for this EmailParams.
     * 
     * @return altbody
     */
    public java.lang.String getAltbody() {
        return altbody;
    }


    /**
     * Sets the altbody value for this EmailParams.
     * 
     * @param altbody
     */
    public void setAltbody(java.lang.String altbody) {
        this.altbody = altbody;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmailParams)) return false;
        EmailParams other = (EmailParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.from_mail==null && other.getFrom_mail()==null) || 
             (this.from_mail!=null &&
              this.from_mail.equals(other.getFrom_mail()))) &&
            ((this.from_name==null && other.getFrom_name()==null) || 
             (this.from_name!=null &&
              this.from_name.equals(other.getFrom_name()))) &&
            ((this.recipient==null && other.getRecipient()==null) || 
             (this.recipient!=null &&
              this.recipient.equals(other.getRecipient()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.body==null && other.getBody()==null) || 
             (this.body!=null &&
              this.body.equals(other.getBody()))) &&
            ((this.altbody==null && other.getAltbody()==null) || 
             (this.altbody!=null &&
              this.altbody.equals(other.getAltbody())));
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
        if (getFrom_mail() != null) {
            _hashCode += getFrom_mail().hashCode();
        }
        if (getFrom_name() != null) {
            _hashCode += getFrom_name().hashCode();
        }
        if (getRecipient() != null) {
            _hashCode += getRecipient().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getBody() != null) {
            _hashCode += getBody().hashCode();
        }
        if (getAltbody() != null) {
            _hashCode += getAltbody().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmailParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Users/", "EmailParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("from_mail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "from_mail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("from_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "from_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipient");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("body");
        elemField.setXmlName(new javax.xml.namespace.QName("", "body"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altbody");
        elemField.setXmlName(new javax.xml.namespace.QName("", "altbody"));
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
