/**
 * State.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Users;

public class State  implements java.io.Serializable {
    private java.lang.String state_id;

    private java.lang.String country_id;

    private java.lang.String state_name;

    private java.lang.String state_3_code;

    private java.lang.String state_2_code;

    public State() {
    }

    public State(
           java.lang.String state_id,
           java.lang.String country_id,
           java.lang.String state_name,
           java.lang.String state_3_code,
           java.lang.String state_2_code) {
           this.state_id = state_id;
           this.country_id = country_id;
           this.state_name = state_name;
           this.state_3_code = state_3_code;
           this.state_2_code = state_2_code;
    }


    /**
     * Gets the state_id value for this State.
     * 
     * @return state_id
     */
    public java.lang.String getState_id() {
        return state_id;
    }


    /**
     * Sets the state_id value for this State.
     * 
     * @param state_id
     */
    public void setState_id(java.lang.String state_id) {
        this.state_id = state_id;
    }


    /**
     * Gets the country_id value for this State.
     * 
     * @return country_id
     */
    public java.lang.String getCountry_id() {
        return country_id;
    }


    /**
     * Sets the country_id value for this State.
     * 
     * @param country_id
     */
    public void setCountry_id(java.lang.String country_id) {
        this.country_id = country_id;
    }


    /**
     * Gets the state_name value for this State.
     * 
     * @return state_name
     */
    public java.lang.String getState_name() {
        return state_name;
    }


    /**
     * Sets the state_name value for this State.
     * 
     * @param state_name
     */
    public void setState_name(java.lang.String state_name) {
        this.state_name = state_name;
    }


    /**
     * Gets the state_3_code value for this State.
     * 
     * @return state_3_code
     */
    public java.lang.String getState_3_code() {
        return state_3_code;
    }


    /**
     * Sets the state_3_code value for this State.
     * 
     * @param state_3_code
     */
    public void setState_3_code(java.lang.String state_3_code) {
        this.state_3_code = state_3_code;
    }


    /**
     * Gets the state_2_code value for this State.
     * 
     * @return state_2_code
     */
    public java.lang.String getState_2_code() {
        return state_2_code;
    }


    /**
     * Sets the state_2_code value for this State.
     * 
     * @param state_2_code
     */
    public void setState_2_code(java.lang.String state_2_code) {
        this.state_2_code = state_2_code;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof State)) return false;
        State other = (State) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.state_id==null && other.getState_id()==null) || 
             (this.state_id!=null &&
              this.state_id.equals(other.getState_id()))) &&
            ((this.country_id==null && other.getCountry_id()==null) || 
             (this.country_id!=null &&
              this.country_id.equals(other.getCountry_id()))) &&
            ((this.state_name==null && other.getState_name()==null) || 
             (this.state_name!=null &&
              this.state_name.equals(other.getState_name()))) &&
            ((this.state_3_code==null && other.getState_3_code()==null) || 
             (this.state_3_code!=null &&
              this.state_3_code.equals(other.getState_3_code()))) &&
            ((this.state_2_code==null && other.getState_2_code()==null) || 
             (this.state_2_code!=null &&
              this.state_2_code.equals(other.getState_2_code())));
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
        if (getState_id() != null) {
            _hashCode += getState_id().hashCode();
        }
        if (getCountry_id() != null) {
            _hashCode += getCountry_id().hashCode();
        }
        if (getState_name() != null) {
            _hashCode += getState_name().hashCode();
        }
        if (getState_3_code() != null) {
            _hashCode += getState_3_code().hashCode();
        }
        if (getState_2_code() != null) {
            _hashCode += getState_2_code().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(State.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Users/", "State"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state_3_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state_3_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state_2_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state_2_code"));
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
