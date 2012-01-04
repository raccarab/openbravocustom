/**
 * ShopperGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Users;

public class ShopperGroup  implements java.io.Serializable {
    private java.lang.String shopper_group_id;

    private java.lang.String vendor_id;

    private java.lang.String shopper_group_name;

    private java.lang.String shopper_group_desc;

    private java.lang.String shopper_group_discount;

    private java.lang.String show_price_including_tax;

    private java.lang.String _default;

    public ShopperGroup() {
    }

    public ShopperGroup(
           java.lang.String shopper_group_id,
           java.lang.String vendor_id,
           java.lang.String shopper_group_name,
           java.lang.String shopper_group_desc,
           java.lang.String shopper_group_discount,
           java.lang.String show_price_including_tax,
           java.lang.String _default) {
           this.shopper_group_id = shopper_group_id;
           this.vendor_id = vendor_id;
           this.shopper_group_name = shopper_group_name;
           this.shopper_group_desc = shopper_group_desc;
           this.shopper_group_discount = shopper_group_discount;
           this.show_price_including_tax = show_price_including_tax;
           this._default = _default;
    }


    /**
     * Gets the shopper_group_id value for this ShopperGroup.
     * 
     * @return shopper_group_id
     */
    public java.lang.String getShopper_group_id() {
        return shopper_group_id;
    }


    /**
     * Sets the shopper_group_id value for this ShopperGroup.
     * 
     * @param shopper_group_id
     */
    public void setShopper_group_id(java.lang.String shopper_group_id) {
        this.shopper_group_id = shopper_group_id;
    }


    /**
     * Gets the vendor_id value for this ShopperGroup.
     * 
     * @return vendor_id
     */
    public java.lang.String getVendor_id() {
        return vendor_id;
    }


    /**
     * Sets the vendor_id value for this ShopperGroup.
     * 
     * @param vendor_id
     */
    public void setVendor_id(java.lang.String vendor_id) {
        this.vendor_id = vendor_id;
    }


    /**
     * Gets the shopper_group_name value for this ShopperGroup.
     * 
     * @return shopper_group_name
     */
    public java.lang.String getShopper_group_name() {
        return shopper_group_name;
    }


    /**
     * Sets the shopper_group_name value for this ShopperGroup.
     * 
     * @param shopper_group_name
     */
    public void setShopper_group_name(java.lang.String shopper_group_name) {
        this.shopper_group_name = shopper_group_name;
    }


    /**
     * Gets the shopper_group_desc value for this ShopperGroup.
     * 
     * @return shopper_group_desc
     */
    public java.lang.String getShopper_group_desc() {
        return shopper_group_desc;
    }


    /**
     * Sets the shopper_group_desc value for this ShopperGroup.
     * 
     * @param shopper_group_desc
     */
    public void setShopper_group_desc(java.lang.String shopper_group_desc) {
        this.shopper_group_desc = shopper_group_desc;
    }


    /**
     * Gets the shopper_group_discount value for this ShopperGroup.
     * 
     * @return shopper_group_discount
     */
    public java.lang.String getShopper_group_discount() {
        return shopper_group_discount;
    }


    /**
     * Sets the shopper_group_discount value for this ShopperGroup.
     * 
     * @param shopper_group_discount
     */
    public void setShopper_group_discount(java.lang.String shopper_group_discount) {
        this.shopper_group_discount = shopper_group_discount;
    }


    /**
     * Gets the show_price_including_tax value for this ShopperGroup.
     * 
     * @return show_price_including_tax
     */
    public java.lang.String getShow_price_including_tax() {
        return show_price_including_tax;
    }


    /**
     * Sets the show_price_including_tax value for this ShopperGroup.
     * 
     * @param show_price_including_tax
     */
    public void setShow_price_including_tax(java.lang.String show_price_including_tax) {
        this.show_price_including_tax = show_price_including_tax;
    }


    /**
     * Gets the _default value for this ShopperGroup.
     * 
     * @return _default
     */
    public java.lang.String get_default() {
        return _default;
    }


    /**
     * Sets the _default value for this ShopperGroup.
     * 
     * @param _default
     */
    public void set_default(java.lang.String _default) {
        this._default = _default;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShopperGroup)) return false;
        ShopperGroup other = (ShopperGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shopper_group_id==null && other.getShopper_group_id()==null) || 
             (this.shopper_group_id!=null &&
              this.shopper_group_id.equals(other.getShopper_group_id()))) &&
            ((this.vendor_id==null && other.getVendor_id()==null) || 
             (this.vendor_id!=null &&
              this.vendor_id.equals(other.getVendor_id()))) &&
            ((this.shopper_group_name==null && other.getShopper_group_name()==null) || 
             (this.shopper_group_name!=null &&
              this.shopper_group_name.equals(other.getShopper_group_name()))) &&
            ((this.shopper_group_desc==null && other.getShopper_group_desc()==null) || 
             (this.shopper_group_desc!=null &&
              this.shopper_group_desc.equals(other.getShopper_group_desc()))) &&
            ((this.shopper_group_discount==null && other.getShopper_group_discount()==null) || 
             (this.shopper_group_discount!=null &&
              this.shopper_group_discount.equals(other.getShopper_group_discount()))) &&
            ((this.show_price_including_tax==null && other.getShow_price_including_tax()==null) || 
             (this.show_price_including_tax!=null &&
              this.show_price_including_tax.equals(other.getShow_price_including_tax()))) &&
            ((this._default==null && other.get_default()==null) || 
             (this._default!=null &&
              this._default.equals(other.get_default())));
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
        if (getShopper_group_id() != null) {
            _hashCode += getShopper_group_id().hashCode();
        }
        if (getVendor_id() != null) {
            _hashCode += getVendor_id().hashCode();
        }
        if (getShopper_group_name() != null) {
            _hashCode += getShopper_group_name().hashCode();
        }
        if (getShopper_group_desc() != null) {
            _hashCode += getShopper_group_desc().hashCode();
        }
        if (getShopper_group_discount() != null) {
            _hashCode += getShopper_group_discount().hashCode();
        }
        if (getShow_price_including_tax() != null) {
            _hashCode += getShow_price_including_tax().hashCode();
        }
        if (get_default() != null) {
            _hashCode += get_default().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShopperGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Users/", "ShopperGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopper_group_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shopper_group_id"));
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
        elemField.setFieldName("shopper_group_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shopper_group_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopper_group_desc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shopper_group_desc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopper_group_discount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shopper_group_discount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("show_price_including_tax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "show_price_including_tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_default");
        elemField.setXmlName(new javax.xml.namespace.QName("", "default"));
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
