/**
 * Tax.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Product;

public class Tax  implements java.io.Serializable {
    private java.lang.String tax_rate_id;

    private java.lang.String vendor_id;

    private java.lang.String tax_state;

    private java.lang.String tax_country;

    private java.lang.String mdate;

    private java.lang.String tax_rate;

    public Tax() {
    }

    public Tax(
           java.lang.String tax_rate_id,
           java.lang.String vendor_id,
           java.lang.String tax_state,
           java.lang.String tax_country,
           java.lang.String mdate,
           java.lang.String tax_rate) {
           this.tax_rate_id = tax_rate_id;
           this.vendor_id = vendor_id;
           this.tax_state = tax_state;
           this.tax_country = tax_country;
           this.mdate = mdate;
           this.tax_rate = tax_rate;
    }


    /**
     * Gets the tax_rate_id value for this Tax.
     * 
     * @return tax_rate_id
     */
    public java.lang.String getTax_rate_id() {
        return tax_rate_id;
    }


    /**
     * Sets the tax_rate_id value for this Tax.
     * 
     * @param tax_rate_id
     */
    public void setTax_rate_id(java.lang.String tax_rate_id) {
        this.tax_rate_id = tax_rate_id;
    }


    /**
     * Gets the vendor_id value for this Tax.
     * 
     * @return vendor_id
     */
    public java.lang.String getVendor_id() {
        return vendor_id;
    }


    /**
     * Sets the vendor_id value for this Tax.
     * 
     * @param vendor_id
     */
    public void setVendor_id(java.lang.String vendor_id) {
        this.vendor_id = vendor_id;
    }


    /**
     * Gets the tax_state value for this Tax.
     * 
     * @return tax_state
     */
    public java.lang.String getTax_state() {
        return tax_state;
    }


    /**
     * Sets the tax_state value for this Tax.
     * 
     * @param tax_state
     */
    public void setTax_state(java.lang.String tax_state) {
        this.tax_state = tax_state;
    }


    /**
     * Gets the tax_country value for this Tax.
     * 
     * @return tax_country
     */
    public java.lang.String getTax_country() {
        return tax_country;
    }


    /**
     * Sets the tax_country value for this Tax.
     * 
     * @param tax_country
     */
    public void setTax_country(java.lang.String tax_country) {
        this.tax_country = tax_country;
    }


    /**
     * Gets the mdate value for this Tax.
     * 
     * @return mdate
     */
    public java.lang.String getMdate() {
        return mdate;
    }


    /**
     * Sets the mdate value for this Tax.
     * 
     * @param mdate
     */
    public void setMdate(java.lang.String mdate) {
        this.mdate = mdate;
    }


    /**
     * Gets the tax_rate value for this Tax.
     * 
     * @return tax_rate
     */
    public java.lang.String getTax_rate() {
        return tax_rate;
    }


    /**
     * Sets the tax_rate value for this Tax.
     * 
     * @param tax_rate
     */
    public void setTax_rate(java.lang.String tax_rate) {
        this.tax_rate = tax_rate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Tax)) return false;
        Tax other = (Tax) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tax_rate_id==null && other.getTax_rate_id()==null) || 
             (this.tax_rate_id!=null &&
              this.tax_rate_id.equals(other.getTax_rate_id()))) &&
            ((this.vendor_id==null && other.getVendor_id()==null) || 
             (this.vendor_id!=null &&
              this.vendor_id.equals(other.getVendor_id()))) &&
            ((this.tax_state==null && other.getTax_state()==null) || 
             (this.tax_state!=null &&
              this.tax_state.equals(other.getTax_state()))) &&
            ((this.tax_country==null && other.getTax_country()==null) || 
             (this.tax_country!=null &&
              this.tax_country.equals(other.getTax_country()))) &&
            ((this.mdate==null && other.getMdate()==null) || 
             (this.mdate!=null &&
              this.mdate.equals(other.getMdate()))) &&
            ((this.tax_rate==null && other.getTax_rate()==null) || 
             (this.tax_rate!=null &&
              this.tax_rate.equals(other.getTax_rate())));
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
        if (getTax_rate_id() != null) {
            _hashCode += getTax_rate_id().hashCode();
        }
        if (getVendor_id() != null) {
            _hashCode += getVendor_id().hashCode();
        }
        if (getTax_state() != null) {
            _hashCode += getTax_state().hashCode();
        }
        if (getTax_country() != null) {
            _hashCode += getTax_country().hashCode();
        }
        if (getMdate() != null) {
            _hashCode += getMdate().hashCode();
        }
        if (getTax_rate() != null) {
            _hashCode += getTax_rate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Tax.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "Tax"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax_rate_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tax_rate_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendor_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendor_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax_state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tax_state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax_country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tax_country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax_rate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tax_rate"));
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
