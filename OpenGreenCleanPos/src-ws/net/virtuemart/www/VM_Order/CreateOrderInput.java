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

    private java.lang.String shipping;

    private java.lang.String shipping_rate;

    private java.lang.String shipping_opt;

    private java.lang.String shipping_price;

    private java.lang.String shipping_id;

    private java.lang.String price_including_tax;

    private java.lang.String product_currency;

    private java.lang.String customer_note;

    private java.lang.String payment_method_id;

    private java.lang.String coupon_code;

    private net.virtuemart.www.VM_Order.Product[] products;

    public CreateOrderInput() {
    }

    public CreateOrderInput(
           net.virtuemart.www.VM_Tools.LoginInfo loginInfo,
           java.lang.String user_id,
           java.lang.String shipping,
           java.lang.String shipping_rate,
           java.lang.String shipping_opt,
           java.lang.String shipping_price,
           java.lang.String shipping_id,
           java.lang.String price_including_tax,
           java.lang.String product_currency,
           java.lang.String customer_note,
           java.lang.String payment_method_id,
           java.lang.String coupon_code,
           net.virtuemart.www.VM_Order.Product[] products) {
           this.loginInfo = loginInfo;
           this.user_id = user_id;
           this.shipping = shipping;
           this.shipping_rate = shipping_rate;
           this.shipping_opt = shipping_opt;
           this.shipping_price = shipping_price;
           this.shipping_id = shipping_id;
           this.price_including_tax = price_including_tax;
           this.product_currency = product_currency;
           this.customer_note = customer_note;
           this.payment_method_id = payment_method_id;
           this.coupon_code = coupon_code;
           this.products = products;
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
     * Gets the shipping value for this CreateOrderInput.
     * 
     * @return shipping
     */
    public java.lang.String getShipping() {
        return shipping;
    }


    /**
     * Sets the shipping value for this CreateOrderInput.
     * 
     * @param shipping
     */
    public void setShipping(java.lang.String shipping) {
        this.shipping = shipping;
    }


    /**
     * Gets the shipping_rate value for this CreateOrderInput.
     * 
     * @return shipping_rate
     */
    public java.lang.String getShipping_rate() {
        return shipping_rate;
    }


    /**
     * Sets the shipping_rate value for this CreateOrderInput.
     * 
     * @param shipping_rate
     */
    public void setShipping_rate(java.lang.String shipping_rate) {
        this.shipping_rate = shipping_rate;
    }


    /**
     * Gets the shipping_opt value for this CreateOrderInput.
     * 
     * @return shipping_opt
     */
    public java.lang.String getShipping_opt() {
        return shipping_opt;
    }


    /**
     * Sets the shipping_opt value for this CreateOrderInput.
     * 
     * @param shipping_opt
     */
    public void setShipping_opt(java.lang.String shipping_opt) {
        this.shipping_opt = shipping_opt;
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
     * Gets the shipping_id value for this CreateOrderInput.
     * 
     * @return shipping_id
     */
    public java.lang.String getShipping_id() {
        return shipping_id;
    }


    /**
     * Sets the shipping_id value for this CreateOrderInput.
     * 
     * @param shipping_id
     */
    public void setShipping_id(java.lang.String shipping_id) {
        this.shipping_id = shipping_id;
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
            ((this.shipping==null && other.getShipping()==null) || 
             (this.shipping!=null &&
              this.shipping.equals(other.getShipping()))) &&
            ((this.shipping_rate==null && other.getShipping_rate()==null) || 
             (this.shipping_rate!=null &&
              this.shipping_rate.equals(other.getShipping_rate()))) &&
            ((this.shipping_opt==null && other.getShipping_opt()==null) || 
             (this.shipping_opt!=null &&
              this.shipping_opt.equals(other.getShipping_opt()))) &&
            ((this.shipping_price==null && other.getShipping_price()==null) || 
             (this.shipping_price!=null &&
              this.shipping_price.equals(other.getShipping_price()))) &&
            ((this.shipping_id==null && other.getShipping_id()==null) || 
             (this.shipping_id!=null &&
              this.shipping_id.equals(other.getShipping_id()))) &&
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
              java.util.Arrays.equals(this.products, other.getProducts())));
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
        if (getShipping() != null) {
            _hashCode += getShipping().hashCode();
        }
        if (getShipping_rate() != null) {
            _hashCode += getShipping_rate().hashCode();
        }
        if (getShipping_opt() != null) {
            _hashCode += getShipping_opt().hashCode();
        }
        if (getShipping_price() != null) {
            _hashCode += getShipping_price().hashCode();
        }
        if (getShipping_id() != null) {
            _hashCode += getShipping_id().hashCode();
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
        elemField.setFieldName("shipping");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipping_rate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipping_rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipping_opt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipping_opt"));
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
        elemField.setFieldName("shipping_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipping_id"));
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
