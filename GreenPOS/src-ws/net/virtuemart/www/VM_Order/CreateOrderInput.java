/**
 * CreateOrderInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Order;

public class CreateOrderInput  implements java.io.Serializable {
    private net.virtuemart.www.VM_Tools.LoginInfo loginInfo;

    private java.lang.String user_id;

    private java.lang.String shipping_method;

    private java.lang.String shipping_carrier_name;

    private java.lang.String shipping_rate_name;

    private java.lang.String shipping_price;

    private java.lang.String shipping_rate_id;

    private java.lang.String price_including_tax;

    private java.lang.String product_currency;

    private java.lang.String customer_note;

    private java.lang.String payment_method_id;

    private java.lang.String coupon_code;

    private net.virtuemart.www.VM_Order.Product[] products;

    private java.lang.String vendor_id;

    public CreateOrderInput() {
    }

    public CreateOrderInput(
           net.virtuemart.www.VM_Tools.LoginInfo loginInfo,
           java.lang.String user_id,
           java.lang.String shipping_method,
           java.lang.String shipping_carrier_name,
           java.lang.String shipping_rate_name,
           java.lang.String shipping_price,
           java.lang.String shipping_rate_id,
           java.lang.String price_including_tax,
           java.lang.String product_currency,
           java.lang.String customer_note,
           java.lang.String payment_method_id,
           java.lang.String coupon_code,
           net.virtuemart.www.VM_Order.Product[] products,
           java.lang.String vendor_id) {
           this.loginInfo = loginInfo;
           this.user_id = user_id;
           this.shipping_method = shipping_method;
           this.shipping_carrier_name = shipping_carrier_name;
           this.shipping_rate_name = shipping_rate_name;
           this.shipping_price = shipping_price;
           this.shipping_rate_id = shipping_rate_id;
           this.price_including_tax = price_including_tax;
           this.product_currency = product_currency;
           this.customer_note = customer_note;
           this.payment_method_id = payment_method_id;
           this.coupon_code = coupon_code;
           this.products = products;
           this.vendor_id = vendor_id;
    }


    /**
     * Gets the loginInfo value for this CreateOrderInput.
     * 
     * @return loginInfo
     */
    public net.virtuemart.www.VM_Tools.LoginInfo getLoginInfo() {
        return loginInfo;
    }


    /**
     * Sets the loginInfo value for this CreateOrderInput.
     * 
     * @param loginInfo
     */
    public void setLoginInfo(net.virtuemart.www.VM_Tools.LoginInfo loginInfo) {
        this.loginInfo = loginInfo;
    }


    /**
     * Gets the user_id value for this CreateOrderInput.
     * 
     * @return user_id
     */
    public java.lang.String getUser_id() {
        return user_id;
    }


    /**
     * Sets the user_id value for this CreateOrderInput.
     * 
     * @param user_id
     */
    public void setUser_id(java.lang.String user_id) {
        this.user_id = user_id;
    }


    /**
     * Gets the shipping_method value for this CreateOrderInput.
     * 
     * @return shipping_method
     */
    public java.lang.String getShipping_method() {
        return shipping_method;
    }


    /**
     * Sets the shipping_method value for this CreateOrderInput.
     * 
     * @param shipping_method
     */
    public void setShipping_method(java.lang.String shipping_method) {
        this.shipping_method = shipping_method;
    }


    /**
     * Gets the shipping_carrier_name value for this CreateOrderInput.
     * 
     * @return shipping_carrier_name
     */
    public java.lang.String getShipping_carrier_name() {
        return shipping_carrier_name;
    }


    /**
     * Sets the shipping_carrier_name value for this CreateOrderInput.
     * 
     * @param shipping_carrier_name
     */
    public void setShipping_carrier_name(java.lang.String shipping_carrier_name) {
        this.shipping_carrier_name = shipping_carrier_name;
    }


    /**
     * Gets the shipping_rate_name value for this CreateOrderInput.
     * 
     * @return shipping_rate_name
     */
    public java.lang.String getShipping_rate_name() {
        return shipping_rate_name;
    }


    /**
     * Sets the shipping_rate_name value for this CreateOrderInput.
     * 
     * @param shipping_rate_name
     */
    public void setShipping_rate_name(java.lang.String shipping_rate_name) {
        this.shipping_rate_name = shipping_rate_name;
    }


    /**
     * Gets the shipping_price value for this CreateOrderInput.
     * 
     * @return shipping_price
     */
    public java.lang.String getShipping_price() {
        return shipping_price;
    }


    /**
     * Sets the shipping_price value for this CreateOrderInput.
     * 
     * @param shipping_price
     */
    public void setShipping_price(java.lang.String shipping_price) {
        this.shipping_price = shipping_price;
    }


    /**
     * Gets the shipping_rate_id value for this CreateOrderInput.
     * 
     * @return shipping_rate_id
     */
    public java.lang.String getShipping_rate_id() {
        return shipping_rate_id;
    }


    /**
     * Sets the shipping_rate_id value for this CreateOrderInput.
     * 
     * @param shipping_rate_id
     */
    public void setShipping_rate_id(java.lang.String shipping_rate_id) {
        this.shipping_rate_id = shipping_rate_id;
    }


    /**
     * Gets the price_including_tax value for this CreateOrderInput.
     * 
     * @return price_including_tax
     */
    public java.lang.String getPrice_including_tax() {
        return price_including_tax;
    }


    /**
     * Sets the price_including_tax value for this CreateOrderInput.
     * 
     * @param price_including_tax
     */
    public void setPrice_including_tax(java.lang.String price_including_tax) {
        this.price_including_tax = price_including_tax;
    }


    /**
     * Gets the product_currency value for this CreateOrderInput.
     * 
     * @return product_currency
     */
    public java.lang.String getProduct_currency() {
        return product_currency;
    }


    /**
     * Sets the product_currency value for this CreateOrderInput.
     * 
     * @param product_currency
     */
    public void setProduct_currency(java.lang.String product_currency) {
        this.product_currency = product_currency;
    }


    /**
     * Gets the customer_note value for this CreateOrderInput.
     * 
     * @return customer_note
     */
    public java.lang.String getCustomer_note() {
        return customer_note;
    }


    /**
     * Sets the customer_note value for this CreateOrderInput.
     * 
     * @param customer_note
     */
    public void setCustomer_note(java.lang.String customer_note) {
        this.customer_note = customer_note;
    }


    /**
     * Gets the payment_method_id value for this CreateOrderInput.
     * 
     * @return payment_method_id
     */
    public java.lang.String getPayment_method_id() {
        return payment_method_id;
    }


    /**
     * Sets the payment_method_id value for this CreateOrderInput.
     * 
     * @param payment_method_id
     */
    public void setPayment_method_id(java.lang.String payment_method_id) {
        this.payment_method_id = payment_method_id;
    }


    /**
     * Gets the coupon_code value for this CreateOrderInput.
     * 
     * @return coupon_code
     */
    public java.lang.String getCoupon_code() {
        return coupon_code;
    }


    /**
     * Sets the coupon_code value for this CreateOrderInput.
     * 
     * @param coupon_code
     */
    public void setCoupon_code(java.lang.String coupon_code) {
        this.coupon_code = coupon_code;
    }


    /**
     * Gets the products value for this CreateOrderInput.
     * 
     * @return products
     */
    public net.virtuemart.www.VM_Order.Product[] getProducts() {
        return products;
    }


    /**
     * Sets the products value for this CreateOrderInput.
     * 
     * @param products
     */
    public void setProducts(net.virtuemart.www.VM_Order.Product[] products) {
        this.products = products;
    }


    /**
     * Gets the vendor_id value for this CreateOrderInput.
     * 
     * @return vendor_id
     */
    public java.lang.String getVendor_id() {
        return vendor_id;
    }


    /**
     * Sets the vendor_id value for this CreateOrderInput.
     * 
     * @param vendor_id
     */
    public void setVendor_id(java.lang.String vendor_id) {
        this.vendor_id = vendor_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateOrderInput)) return false;
        CreateOrderInput other = (CreateOrderInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.loginInfo==null && other.getLoginInfo()==null) || 
             (this.loginInfo!=null &&
              this.loginInfo.equals(other.getLoginInfo()))) &&
            ((this.user_id==null && other.getUser_id()==null) || 
             (this.user_id!=null &&
              this.user_id.equals(other.getUser_id()))) &&
            ((this.shipping_method==null && other.getShipping_method()==null) || 
             (this.shipping_method!=null &&
              this.shipping_method.equals(other.getShipping_method()))) &&
            ((this.shipping_carrier_name==null && other.getShipping_carrier_name()==null) || 
             (this.shipping_carrier_name!=null &&
              this.shipping_carrier_name.equals(other.getShipping_carrier_name()))) &&
            ((this.shipping_rate_name==null && other.getShipping_rate_name()==null) || 
             (this.shipping_rate_name!=null &&
              this.shipping_rate_name.equals(other.getShipping_rate_name()))) &&
            ((this.shipping_price==null && other.getShipping_price()==null) || 
             (this.shipping_price!=null &&
              this.shipping_price.equals(other.getShipping_price()))) &&
            ((this.shipping_rate_id==null && other.getShipping_rate_id()==null) || 
             (this.shipping_rate_id!=null &&
              this.shipping_rate_id.equals(other.getShipping_rate_id()))) &&
            ((this.price_including_tax==null && other.getPrice_including_tax()==null) || 
             (this.price_including_tax!=null &&
              this.price_including_tax.equals(other.getPrice_including_tax()))) &&
            ((this.product_currency==null && other.getProduct_currency()==null) || 
             (this.product_currency!=null &&
              this.product_currency.equals(other.getProduct_currency()))) &&
            ((this.customer_note==null && other.getCustomer_note()==null) || 
             (this.customer_note!=null &&
              this.customer_note.equals(other.getCustomer_note()))) &&
            ((this.payment_method_id==null && other.getPayment_method_id()==null) || 
             (this.payment_method_id!=null &&
              this.payment_method_id.equals(other.getPayment_method_id()))) &&
            ((this.coupon_code==null && other.getCoupon_code()==null) || 
             (this.coupon_code!=null &&
              this.coupon_code.equals(other.getCoupon_code()))) &&
            ((this.products==null && other.getProducts()==null) || 
             (this.products!=null &&
              java.util.Arrays.equals(this.products, other.getProducts()))) &&
            ((this.vendor_id==null && other.getVendor_id()==null) || 
             (this.vendor_id!=null &&
              this.vendor_id.equals(other.getVendor_id())));
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
        if (getLoginInfo() != null) {
            _hashCode += getLoginInfo().hashCode();
        }
        if (getUser_id() != null) {
            _hashCode += getUser_id().hashCode();
        }
        if (getShipping_method() != null) {
            _hashCode += getShipping_method().hashCode();
        }
        if (getShipping_carrier_name() != null) {
            _hashCode += getShipping_carrier_name().hashCode();
        }
        if (getShipping_rate_name() != null) {
            _hashCode += getShipping_rate_name().hashCode();
        }
        if (getShipping_price() != null) {
            _hashCode += getShipping_price().hashCode();
        }
        if (getShipping_rate_id() != null) {
            _hashCode += getShipping_rate_id().hashCode();
        }
        if (getPrice_including_tax() != null) {
            _hashCode += getPrice_including_tax().hashCode();
        }
        if (getProduct_currency() != null) {
            _hashCode += getProduct_currency().hashCode();
        }
        if (getCustomer_note() != null) {
            _hashCode += getCustomer_note().hashCode();
        }
        if (getPayment_method_id() != null) {
            _hashCode += getPayment_method_id().hashCode();
        }
        if (getCoupon_code() != null) {
            _hashCode += getCoupon_code().hashCode();
        }
        if (getProducts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProducts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProducts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVendor_id() != null) {
            _hashCode += getVendor_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateOrderInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "CreateOrderInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loginInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "loginInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipping_method");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipping_method"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipping_carrier_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipping_carrier_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipping_rate_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipping_rate_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipping_price");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipping_price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipping_rate_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipping_rate_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price_including_tax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price_including_tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product_currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_note");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_note"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment_method_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payment_method_id"));
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
        elemField.setFieldName("products");
        elemField.setXmlName(new javax.xml.namespace.QName("", "products"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "product"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "product"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendor_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendor_id"));
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
