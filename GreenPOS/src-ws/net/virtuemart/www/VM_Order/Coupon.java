/**
 * Coupon.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Order;

public class Coupon  implements java.io.Serializable {
    private java.lang.String coupon_id;

    private java.lang.String coupon_code;

    private java.lang.String percent_or_total;

    private java.lang.String coupon_type;

    private java.lang.String coupon_value;

    public Coupon() {
    }

    public Coupon(
           java.lang.String coupon_id,
           java.lang.String coupon_code,
           java.lang.String percent_or_total,
           java.lang.String coupon_type,
           java.lang.String coupon_value) {
           this.coupon_id = coupon_id;
           this.coupon_code = coupon_code;
           this.percent_or_total = percent_or_total;
           this.coupon_type = coupon_type;
           this.coupon_value = coupon_value;
    }


    /**
     * Gets the coupon_id value for this Coupon.
     * 
     * @return coupon_id
     */
    public java.lang.String getCoupon_id() {
        return coupon_id;
    }


    /**
     * Sets the coupon_id value for this Coupon.
     * 
     * @param coupon_id
     */
    public void setCoupon_id(java.lang.String coupon_id) {
        this.coupon_id = coupon_id;
    }


    /**
     * Gets the coupon_code value for this Coupon.
     * 
     * @return coupon_code
     */
    public java.lang.String getCoupon_code() {
        return coupon_code;
    }


    /**
     * Sets the coupon_code value for this Coupon.
     * 
     * @param coupon_code
     */
    public void setCoupon_code(java.lang.String coupon_code) {
        this.coupon_code = coupon_code;
    }


    /**
     * Gets the percent_or_total value for this Coupon.
     * 
     * @return percent_or_total
     */
    public java.lang.String getPercent_or_total() {
        return percent_or_total;
    }


    /**
     * Sets the percent_or_total value for this Coupon.
     * 
     * @param percent_or_total
     */
    public void setPercent_or_total(java.lang.String percent_or_total) {
        this.percent_or_total = percent_or_total;
    }


    /**
     * Gets the coupon_type value for this Coupon.
     * 
     * @return coupon_type
     */
    public java.lang.String getCoupon_type() {
        return coupon_type;
    }


    /**
     * Sets the coupon_type value for this Coupon.
     * 
     * @param coupon_type
     */
    public void setCoupon_type(java.lang.String coupon_type) {
        this.coupon_type = coupon_type;
    }


    /**
     * Gets the coupon_value value for this Coupon.
     * 
     * @return coupon_value
     */
    public java.lang.String getCoupon_value() {
        return coupon_value;
    }


    /**
     * Sets the coupon_value value for this Coupon.
     * 
     * @param coupon_value
     */
    public void setCoupon_value(java.lang.String coupon_value) {
        this.coupon_value = coupon_value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Coupon)) return false;
        Coupon other = (Coupon) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coupon_id==null && other.getCoupon_id()==null) || 
             (this.coupon_id!=null &&
              this.coupon_id.equals(other.getCoupon_id()))) &&
            ((this.coupon_code==null && other.getCoupon_code()==null) || 
             (this.coupon_code!=null &&
              this.coupon_code.equals(other.getCoupon_code()))) &&
            ((this.percent_or_total==null && other.getPercent_or_total()==null) || 
             (this.percent_or_total!=null &&
              this.percent_or_total.equals(other.getPercent_or_total()))) &&
            ((this.coupon_type==null && other.getCoupon_type()==null) || 
             (this.coupon_type!=null &&
              this.coupon_type.equals(other.getCoupon_type()))) &&
            ((this.coupon_value==null && other.getCoupon_value()==null) || 
             (this.coupon_value!=null &&
              this.coupon_value.equals(other.getCoupon_value())));
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
        if (getCoupon_id() != null) {
            _hashCode += getCoupon_id().hashCode();
        }
        if (getCoupon_code() != null) {
            _hashCode += getCoupon_code().hashCode();
        }
        if (getPercent_or_total() != null) {
            _hashCode += getPercent_or_total().hashCode();
        }
        if (getCoupon_type() != null) {
            _hashCode += getCoupon_type().hashCode();
        }
        if (getCoupon_value() != null) {
            _hashCode += getCoupon_value().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Coupon.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "Coupon"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coupon_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coupon_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coupon_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coupon_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percent_or_total");
        elemField.setXmlName(new javax.xml.namespace.QName("", "percent_or_total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coupon_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coupon_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coupon_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coupon_value"));
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
