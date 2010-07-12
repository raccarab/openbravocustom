/**
 * PaymentMethod.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Order;

public class PaymentMethod  implements java.io.Serializable {
    private java.lang.String payment_method_id;

    private java.lang.String vendor_id;

    private java.lang.String payment_method_name;

    private java.lang.String payment_class;

    private java.lang.String shopper_group_id;

    private java.lang.String payment_method_discount;

    private java.lang.String payment_method_discount_is_percent;

    private java.lang.String payment_method_discount_max_amount;

    private java.lang.String payment_method_discount_min_amount;

    private java.lang.String list_order;

    private java.lang.String payment_method_code;

    private java.lang.String enable_processor;

    private java.lang.String is_creditcard;

    private java.lang.String payment_enabled;

    private java.lang.String accepted_creditcards;

    private java.lang.String payment_extrainfo;

    public PaymentMethod() {
    }

    public PaymentMethod(
           java.lang.String payment_method_id,
           java.lang.String vendor_id,
           java.lang.String payment_method_name,
           java.lang.String payment_class,
           java.lang.String shopper_group_id,
           java.lang.String payment_method_discount,
           java.lang.String payment_method_discount_is_percent,
           java.lang.String payment_method_discount_max_amount,
           java.lang.String payment_method_discount_min_amount,
           java.lang.String list_order,
           java.lang.String payment_method_code,
           java.lang.String enable_processor,
           java.lang.String is_creditcard,
           java.lang.String payment_enabled,
           java.lang.String accepted_creditcards,
           java.lang.String payment_extrainfo) {
           this.payment_method_id = payment_method_id;
           this.vendor_id = vendor_id;
           this.payment_method_name = payment_method_name;
           this.payment_class = payment_class;
           this.shopper_group_id = shopper_group_id;
           this.payment_method_discount = payment_method_discount;
           this.payment_method_discount_is_percent = payment_method_discount_is_percent;
           this.payment_method_discount_max_amount = payment_method_discount_max_amount;
           this.payment_method_discount_min_amount = payment_method_discount_min_amount;
           this.list_order = list_order;
           this.payment_method_code = payment_method_code;
           this.enable_processor = enable_processor;
           this.is_creditcard = is_creditcard;
           this.payment_enabled = payment_enabled;
           this.accepted_creditcards = accepted_creditcards;
           this.payment_extrainfo = payment_extrainfo;
    }


    /**
     * Gets the payment_method_id value for this PaymentMethod.
     * 
     * @return payment_method_id
     */
    public java.lang.String getPayment_method_id() {
        return payment_method_id;
    }


    /**
     * Sets the payment_method_id value for this PaymentMethod.
     * 
     * @param payment_method_id
     */
    public void setPayment_method_id(java.lang.String payment_method_id) {
        this.payment_method_id = payment_method_id;
    }


    /**
     * Gets the vendor_id value for this PaymentMethod.
     * 
     * @return vendor_id
     */
    public java.lang.String getVendor_id() {
        return vendor_id;
    }


    /**
     * Sets the vendor_id value for this PaymentMethod.
     * 
     * @param vendor_id
     */
    public void setVendor_id(java.lang.String vendor_id) {
        this.vendor_id = vendor_id;
    }


    /**
     * Gets the payment_method_name value for this PaymentMethod.
     * 
     * @return payment_method_name
     */
    public java.lang.String getPayment_method_name() {
        return payment_method_name;
    }


    /**
     * Sets the payment_method_name value for this PaymentMethod.
     * 
     * @param payment_method_name
     */
    public void setPayment_method_name(java.lang.String payment_method_name) {
        this.payment_method_name = payment_method_name;
    }


    /**
     * Gets the payment_class value for this PaymentMethod.
     * 
     * @return payment_class
     */
    public java.lang.String getPayment_class() {
        return payment_class;
    }


    /**
     * Sets the payment_class value for this PaymentMethod.
     * 
     * @param payment_class
     */
    public void setPayment_class(java.lang.String payment_class) {
        this.payment_class = payment_class;
    }


    /**
     * Gets the shopper_group_id value for this PaymentMethod.
     * 
     * @return shopper_group_id
     */
    public java.lang.String getShopper_group_id() {
        return shopper_group_id;
    }


    /**
     * Sets the shopper_group_id value for this PaymentMethod.
     * 
     * @param shopper_group_id
     */
    public void setShopper_group_id(java.lang.String shopper_group_id) {
        this.shopper_group_id = shopper_group_id;
    }


    /**
     * Gets the payment_method_discount value for this PaymentMethod.
     * 
     * @return payment_method_discount
     */
    public java.lang.String getPayment_method_discount() {
        return payment_method_discount;
    }


    /**
     * Sets the payment_method_discount value for this PaymentMethod.
     * 
     * @param payment_method_discount
     */
    public void setPayment_method_discount(java.lang.String payment_method_discount) {
        this.payment_method_discount = payment_method_discount;
    }


    /**
     * Gets the payment_method_discount_is_percent value for this PaymentMethod.
     * 
     * @return payment_method_discount_is_percent
     */
    public java.lang.String getPayment_method_discount_is_percent() {
        return payment_method_discount_is_percent;
    }


    /**
     * Sets the payment_method_discount_is_percent value for this PaymentMethod.
     * 
     * @param payment_method_discount_is_percent
     */
    public void setPayment_method_discount_is_percent(java.lang.String payment_method_discount_is_percent) {
        this.payment_method_discount_is_percent = payment_method_discount_is_percent;
    }


    /**
     * Gets the payment_method_discount_max_amount value for this PaymentMethod.
     * 
     * @return payment_method_discount_max_amount
     */
    public java.lang.String getPayment_method_discount_max_amount() {
        return payment_method_discount_max_amount;
    }


    /**
     * Sets the payment_method_discount_max_amount value for this PaymentMethod.
     * 
     * @param payment_method_discount_max_amount
     */
    public void setPayment_method_discount_max_amount(java.lang.String payment_method_discount_max_amount) {
        this.payment_method_discount_max_amount = payment_method_discount_max_amount;
    }


    /**
     * Gets the payment_method_discount_min_amount value for this PaymentMethod.
     * 
     * @return payment_method_discount_min_amount
     */
    public java.lang.String getPayment_method_discount_min_amount() {
        return payment_method_discount_min_amount;
    }


    /**
     * Sets the payment_method_discount_min_amount value for this PaymentMethod.
     * 
     * @param payment_method_discount_min_amount
     */
    public void setPayment_method_discount_min_amount(java.lang.String payment_method_discount_min_amount) {
        this.payment_method_discount_min_amount = payment_method_discount_min_amount;
    }


    /**
     * Gets the list_order value for this PaymentMethod.
     * 
     * @return list_order
     */
    public java.lang.String getList_order() {
        return list_order;
    }


    /**
     * Sets the list_order value for this PaymentMethod.
     * 
     * @param list_order
     */
    public void setList_order(java.lang.String list_order) {
        this.list_order = list_order;
    }


    /**
     * Gets the payment_method_code value for this PaymentMethod.
     * 
     * @return payment_method_code
     */
    public java.lang.String getPayment_method_code() {
        return payment_method_code;
    }


    /**
     * Sets the payment_method_code value for this PaymentMethod.
     * 
     * @param payment_method_code
     */
    public void setPayment_method_code(java.lang.String payment_method_code) {
        this.payment_method_code = payment_method_code;
    }


    /**
     * Gets the enable_processor value for this PaymentMethod.
     * 
     * @return enable_processor
     */
    public java.lang.String getEnable_processor() {
        return enable_processor;
    }


    /**
     * Sets the enable_processor value for this PaymentMethod.
     * 
     * @param enable_processor
     */
    public void setEnable_processor(java.lang.String enable_processor) {
        this.enable_processor = enable_processor;
    }


    /**
     * Gets the is_creditcard value for this PaymentMethod.
     * 
     * @return is_creditcard
     */
    public java.lang.String getIs_creditcard() {
        return is_creditcard;
    }


    /**
     * Sets the is_creditcard value for this PaymentMethod.
     * 
     * @param is_creditcard
     */
    public void setIs_creditcard(java.lang.String is_creditcard) {
        this.is_creditcard = is_creditcard;
    }


    /**
     * Gets the payment_enabled value for this PaymentMethod.
     * 
     * @return payment_enabled
     */
    public java.lang.String getPayment_enabled() {
        return payment_enabled;
    }


    /**
     * Sets the payment_enabled value for this PaymentMethod.
     * 
     * @param payment_enabled
     */
    public void setPayment_enabled(java.lang.String payment_enabled) {
        this.payment_enabled = payment_enabled;
    }


    /**
     * Gets the accepted_creditcards value for this PaymentMethod.
     * 
     * @return accepted_creditcards
     */
    public java.lang.String getAccepted_creditcards() {
        return accepted_creditcards;
    }


    /**
     * Sets the accepted_creditcards value for this PaymentMethod.
     * 
     * @param accepted_creditcards
     */
    public void setAccepted_creditcards(java.lang.String accepted_creditcards) {
        this.accepted_creditcards = accepted_creditcards;
    }


    /**
     * Gets the payment_extrainfo value for this PaymentMethod.
     * 
     * @return payment_extrainfo
     */
    public java.lang.String getPayment_extrainfo() {
        return payment_extrainfo;
    }


    /**
     * Sets the payment_extrainfo value for this PaymentMethod.
     * 
     * @param payment_extrainfo
     */
    public void setPayment_extrainfo(java.lang.String payment_extrainfo) {
        this.payment_extrainfo = payment_extrainfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentMethod)) return false;
        PaymentMethod other = (PaymentMethod) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.payment_method_id==null && other.getPayment_method_id()==null) || 
             (this.payment_method_id!=null &&
              this.payment_method_id.equals(other.getPayment_method_id()))) &&
            ((this.vendor_id==null && other.getVendor_id()==null) || 
             (this.vendor_id!=null &&
              this.vendor_id.equals(other.getVendor_id()))) &&
            ((this.payment_method_name==null && other.getPayment_method_name()==null) || 
             (this.payment_method_name!=null &&
              this.payment_method_name.equals(other.getPayment_method_name()))) &&
            ((this.payment_class==null && other.getPayment_class()==null) || 
             (this.payment_class!=null &&
              this.payment_class.equals(other.getPayment_class()))) &&
            ((this.shopper_group_id==null && other.getShopper_group_id()==null) || 
             (this.shopper_group_id!=null &&
              this.shopper_group_id.equals(other.getShopper_group_id()))) &&
            ((this.payment_method_discount==null && other.getPayment_method_discount()==null) || 
             (this.payment_method_discount!=null &&
              this.payment_method_discount.equals(other.getPayment_method_discount()))) &&
            ((this.payment_method_discount_is_percent==null && other.getPayment_method_discount_is_percent()==null) || 
             (this.payment_method_discount_is_percent!=null &&
              this.payment_method_discount_is_percent.equals(other.getPayment_method_discount_is_percent()))) &&
            ((this.payment_method_discount_max_amount==null && other.getPayment_method_discount_max_amount()==null) || 
             (this.payment_method_discount_max_amount!=null &&
              this.payment_method_discount_max_amount.equals(other.getPayment_method_discount_max_amount()))) &&
            ((this.payment_method_discount_min_amount==null && other.getPayment_method_discount_min_amount()==null) || 
             (this.payment_method_discount_min_amount!=null &&
              this.payment_method_discount_min_amount.equals(other.getPayment_method_discount_min_amount()))) &&
            ((this.list_order==null && other.getList_order()==null) || 
             (this.list_order!=null &&
              this.list_order.equals(other.getList_order()))) &&
            ((this.payment_method_code==null && other.getPayment_method_code()==null) || 
             (this.payment_method_code!=null &&
              this.payment_method_code.equals(other.getPayment_method_code()))) &&
            ((this.enable_processor==null && other.getEnable_processor()==null) || 
             (this.enable_processor!=null &&
              this.enable_processor.equals(other.getEnable_processor()))) &&
            ((this.is_creditcard==null && other.getIs_creditcard()==null) || 
             (this.is_creditcard!=null &&
              this.is_creditcard.equals(other.getIs_creditcard()))) &&
            ((this.payment_enabled==null && other.getPayment_enabled()==null) || 
             (this.payment_enabled!=null &&
              this.payment_enabled.equals(other.getPayment_enabled()))) &&
            ((this.accepted_creditcards==null && other.getAccepted_creditcards()==null) || 
             (this.accepted_creditcards!=null &&
              this.accepted_creditcards.equals(other.getAccepted_creditcards()))) &&
            ((this.payment_extrainfo==null && other.getPayment_extrainfo()==null) || 
             (this.payment_extrainfo!=null &&
              this.payment_extrainfo.equals(other.getPayment_extrainfo())));
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
        if (getPayment_method_id() != null) {
            _hashCode += getPayment_method_id().hashCode();
        }
        if (getVendor_id() != null) {
            _hashCode += getVendor_id().hashCode();
        }
        if (getPayment_method_name() != null) {
            _hashCode += getPayment_method_name().hashCode();
        }
        if (getPayment_class() != null) {
            _hashCode += getPayment_class().hashCode();
        }
        if (getShopper_group_id() != null) {
            _hashCode += getShopper_group_id().hashCode();
        }
        if (getPayment_method_discount() != null) {
            _hashCode += getPayment_method_discount().hashCode();
        }
        if (getPayment_method_discount_is_percent() != null) {
            _hashCode += getPayment_method_discount_is_percent().hashCode();
        }
        if (getPayment_method_discount_max_amount() != null) {
            _hashCode += getPayment_method_discount_max_amount().hashCode();
        }
        if (getPayment_method_discount_min_amount() != null) {
            _hashCode += getPayment_method_discount_min_amount().hashCode();
        }
        if (getList_order() != null) {
            _hashCode += getList_order().hashCode();
        }
        if (getPayment_method_code() != null) {
            _hashCode += getPayment_method_code().hashCode();
        }
        if (getEnable_processor() != null) {
            _hashCode += getEnable_processor().hashCode();
        }
        if (getIs_creditcard() != null) {
            _hashCode += getIs_creditcard().hashCode();
        }
        if (getPayment_enabled() != null) {
            _hashCode += getPayment_enabled().hashCode();
        }
        if (getAccepted_creditcards() != null) {
            _hashCode += getAccepted_creditcards().hashCode();
        }
        if (getPayment_extrainfo() != null) {
            _hashCode += getPayment_extrainfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentMethod.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "PaymentMethod"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment_method_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payment_method_id"));
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
        elemField.setFieldName("payment_method_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payment_method_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment_class");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payment_class"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopper_group_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shopper_group_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment_method_discount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payment_method_discount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment_method_discount_is_percent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payment_method_discount_is_percent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment_method_discount_max_amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payment_method_discount_max_amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment_method_discount_min_amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payment_method_discount_min_amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("list_order");
        elemField.setXmlName(new javax.xml.namespace.QName("", "list_order"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment_method_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payment_method_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enable_processor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enable_processor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is_creditcard");
        elemField.setXmlName(new javax.xml.namespace.QName("", "is_creditcard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment_enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payment_enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accepted_creditcards");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accepted_creditcards"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment_extrainfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payment_extrainfo"));
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
