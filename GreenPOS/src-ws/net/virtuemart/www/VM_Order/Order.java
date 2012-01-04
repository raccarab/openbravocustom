/**
 * Order.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Order;

public class Order  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String user_id;

    private java.lang.String vendor_id;

    private java.lang.String order_number;

    private java.lang.String user_info_id;

    private java.lang.String order_total;

    private java.lang.String order_subtotal;

    private java.lang.String order_tax;

    private java.lang.String order_tax_details;

    private java.lang.String order_shipping;

    private java.lang.String order_shipping_tax;

    private java.lang.String coupon_discount;

    private java.lang.String coupon_code;

    private java.lang.String order_discount;

    private java.lang.String order_currency;

    private java.lang.String order_status;

    private java.lang.String cdate;

    private java.lang.String mdate;

    private java.lang.String ship_method_id;

    private java.lang.String customer_note;

    private java.lang.String ip_address;

    public Order() {
    }

    public Order(
           java.lang.String id,
           java.lang.String user_id,
           java.lang.String vendor_id,
           java.lang.String order_number,
           java.lang.String user_info_id,
           java.lang.String order_total,
           java.lang.String order_subtotal,
           java.lang.String order_tax,
           java.lang.String order_tax_details,
           java.lang.String order_shipping,
           java.lang.String order_shipping_tax,
           java.lang.String coupon_discount,
           java.lang.String coupon_code,
           java.lang.String order_discount,
           java.lang.String order_currency,
           java.lang.String order_status,
           java.lang.String cdate,
           java.lang.String mdate,
           java.lang.String ship_method_id,
           java.lang.String customer_note,
           java.lang.String ip_address) {
           this.id = id;
           this.user_id = user_id;
           this.vendor_id = vendor_id;
           this.order_number = order_number;
           this.user_info_id = user_info_id;
           this.order_total = order_total;
           this.order_subtotal = order_subtotal;
           this.order_tax = order_tax;
           this.order_tax_details = order_tax_details;
           this.order_shipping = order_shipping;
           this.order_shipping_tax = order_shipping_tax;
           this.coupon_discount = coupon_discount;
           this.coupon_code = coupon_code;
           this.order_discount = order_discount;
           this.order_currency = order_currency;
           this.order_status = order_status;
           this.cdate = cdate;
           this.mdate = mdate;
           this.ship_method_id = ship_method_id;
           this.customer_note = customer_note;
           this.ip_address = ip_address;
    }


    /**
     * Gets the id value for this Order.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Order.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the user_id value for this Order.
     * 
     * @return user_id
     */
    public java.lang.String getUser_id() {
        return user_id;
    }


    /**
     * Sets the user_id value for this Order.
     * 
     * @param user_id
     */
    public void setUser_id(java.lang.String user_id) {
        this.user_id = user_id;
    }


    /**
     * Gets the vendor_id value for this Order.
     * 
     * @return vendor_id
     */
    public java.lang.String getVendor_id() {
        return vendor_id;
    }


    /**
     * Sets the vendor_id value for this Order.
     * 
     * @param vendor_id
     */
    public void setVendor_id(java.lang.String vendor_id) {
        this.vendor_id = vendor_id;
    }


    /**
     * Gets the order_number value for this Order.
     * 
     * @return order_number
     */
    public java.lang.String getOrder_number() {
        return order_number;
    }


    /**
     * Sets the order_number value for this Order.
     * 
     * @param order_number
     */
    public void setOrder_number(java.lang.String order_number) {
        this.order_number = order_number;
    }


    /**
     * Gets the user_info_id value for this Order.
     * 
     * @return user_info_id
     */
    public java.lang.String getUser_info_id() {
        return user_info_id;
    }


    /**
     * Sets the user_info_id value for this Order.
     * 
     * @param user_info_id
     */
    public void setUser_info_id(java.lang.String user_info_id) {
        this.user_info_id = user_info_id;
    }


    /**
     * Gets the order_total value for this Order.
     * 
     * @return order_total
     */
    public java.lang.String getOrder_total() {
        return order_total;
    }


    /**
     * Sets the order_total value for this Order.
     * 
     * @param order_total
     */
    public void setOrder_total(java.lang.String order_total) {
        this.order_total = order_total;
    }


    /**
     * Gets the order_subtotal value for this Order.
     * 
     * @return order_subtotal
     */
    public java.lang.String getOrder_subtotal() {
        return order_subtotal;
    }


    /**
     * Sets the order_subtotal value for this Order.
     * 
     * @param order_subtotal
     */
    public void setOrder_subtotal(java.lang.String order_subtotal) {
        this.order_subtotal = order_subtotal;
    }


    /**
     * Gets the order_tax value for this Order.
     * 
     * @return order_tax
     */
    public java.lang.String getOrder_tax() {
        return order_tax;
    }


    /**
     * Sets the order_tax value for this Order.
     * 
     * @param order_tax
     */
    public void setOrder_tax(java.lang.String order_tax) {
        this.order_tax = order_tax;
    }


    /**
     * Gets the order_tax_details value for this Order.
     * 
     * @return order_tax_details
     */
    public java.lang.String getOrder_tax_details() {
        return order_tax_details;
    }


    /**
     * Sets the order_tax_details value for this Order.
     * 
     * @param order_tax_details
     */
    public void setOrder_tax_details(java.lang.String order_tax_details) {
        this.order_tax_details = order_tax_details;
    }


    /**
     * Gets the order_shipping value for this Order.
     * 
     * @return order_shipping
     */
    public java.lang.String getOrder_shipping() {
        return order_shipping;
    }


    /**
     * Sets the order_shipping value for this Order.
     * 
     * @param order_shipping
     */
    public void setOrder_shipping(java.lang.String order_shipping) {
        this.order_shipping = order_shipping;
    }


    /**
     * Gets the order_shipping_tax value for this Order.
     * 
     * @return order_shipping_tax
     */
    public java.lang.String getOrder_shipping_tax() {
        return order_shipping_tax;
    }


    /**
     * Sets the order_shipping_tax value for this Order.
     * 
     * @param order_shipping_tax
     */
    public void setOrder_shipping_tax(java.lang.String order_shipping_tax) {
        this.order_shipping_tax = order_shipping_tax;
    }


    /**
     * Gets the coupon_discount value for this Order.
     * 
     * @return coupon_discount
     */
    public java.lang.String getCoupon_discount() {
        return coupon_discount;
    }


    /**
     * Sets the coupon_discount value for this Order.
     * 
     * @param coupon_discount
     */
    public void setCoupon_discount(java.lang.String coupon_discount) {
        this.coupon_discount = coupon_discount;
    }


    /**
     * Gets the coupon_code value for this Order.
     * 
     * @return coupon_code
     */
    public java.lang.String getCoupon_code() {
        return coupon_code;
    }


    /**
     * Sets the coupon_code value for this Order.
     * 
     * @param coupon_code
     */
    public void setCoupon_code(java.lang.String coupon_code) {
        this.coupon_code = coupon_code;
    }


    /**
     * Gets the order_discount value for this Order.
     * 
     * @return order_discount
     */
    public java.lang.String getOrder_discount() {
        return order_discount;
    }


    /**
     * Sets the order_discount value for this Order.
     * 
     * @param order_discount
     */
    public void setOrder_discount(java.lang.String order_discount) {
        this.order_discount = order_discount;
    }


    /**
     * Gets the order_currency value for this Order.
     * 
     * @return order_currency
     */
    public java.lang.String getOrder_currency() {
        return order_currency;
    }


    /**
     * Sets the order_currency value for this Order.
     * 
     * @param order_currency
     */
    public void setOrder_currency(java.lang.String order_currency) {
        this.order_currency = order_currency;
    }


    /**
     * Gets the order_status value for this Order.
     * 
     * @return order_status
     */
    public java.lang.String getOrder_status() {
        return order_status;
    }


    /**
     * Sets the order_status value for this Order.
     * 
     * @param order_status
     */
    public void setOrder_status(java.lang.String order_status) {
        this.order_status = order_status;
    }


    /**
     * Gets the cdate value for this Order.
     * 
     * @return cdate
     */
    public java.lang.String getCdate() {
        return cdate;
    }


    /**
     * Sets the cdate value for this Order.
     * 
     * @param cdate
     */
    public void setCdate(java.lang.String cdate) {
        this.cdate = cdate;
    }


    /**
     * Gets the mdate value for this Order.
     * 
     * @return mdate
     */
    public java.lang.String getMdate() {
        return mdate;
    }


    /**
     * Sets the mdate value for this Order.
     * 
     * @param mdate
     */
    public void setMdate(java.lang.String mdate) {
        this.mdate = mdate;
    }


    /**
     * Gets the ship_method_id value for this Order.
     * 
     * @return ship_method_id
     */
    public java.lang.String getShip_method_id() {
        return ship_method_id;
    }


    /**
     * Sets the ship_method_id value for this Order.
     * 
     * @param ship_method_id
     */
    public void setShip_method_id(java.lang.String ship_method_id) {
        this.ship_method_id = ship_method_id;
    }


    /**
     * Gets the customer_note value for this Order.
     * 
     * @return customer_note
     */
    public java.lang.String getCustomer_note() {
        return customer_note;
    }


    /**
     * Sets the customer_note value for this Order.
     * 
     * @param customer_note
     */
    public void setCustomer_note(java.lang.String customer_note) {
        this.customer_note = customer_note;
    }


    /**
     * Gets the ip_address value for this Order.
     * 
     * @return ip_address
     */
    public java.lang.String getIp_address() {
        return ip_address;
    }


    /**
     * Sets the ip_address value for this Order.
     * 
     * @param ip_address
     */
    public void setIp_address(java.lang.String ip_address) {
        this.ip_address = ip_address;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Order)) return false;
        Order other = (Order) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.user_id==null && other.getUser_id()==null) || 
             (this.user_id!=null &&
              this.user_id.equals(other.getUser_id()))) &&
            ((this.vendor_id==null && other.getVendor_id()==null) || 
             (this.vendor_id!=null &&
              this.vendor_id.equals(other.getVendor_id()))) &&
            ((this.order_number==null && other.getOrder_number()==null) || 
             (this.order_number!=null &&
              this.order_number.equals(other.getOrder_number()))) &&
            ((this.user_info_id==null && other.getUser_info_id()==null) || 
             (this.user_info_id!=null &&
              this.user_info_id.equals(other.getUser_info_id()))) &&
            ((this.order_total==null && other.getOrder_total()==null) || 
             (this.order_total!=null &&
              this.order_total.equals(other.getOrder_total()))) &&
            ((this.order_subtotal==null && other.getOrder_subtotal()==null) || 
             (this.order_subtotal!=null &&
              this.order_subtotal.equals(other.getOrder_subtotal()))) &&
            ((this.order_tax==null && other.getOrder_tax()==null) || 
             (this.order_tax!=null &&
              this.order_tax.equals(other.getOrder_tax()))) &&
            ((this.order_tax_details==null && other.getOrder_tax_details()==null) || 
             (this.order_tax_details!=null &&
              this.order_tax_details.equals(other.getOrder_tax_details()))) &&
            ((this.order_shipping==null && other.getOrder_shipping()==null) || 
             (this.order_shipping!=null &&
              this.order_shipping.equals(other.getOrder_shipping()))) &&
            ((this.order_shipping_tax==null && other.getOrder_shipping_tax()==null) || 
             (this.order_shipping_tax!=null &&
              this.order_shipping_tax.equals(other.getOrder_shipping_tax()))) &&
            ((this.coupon_discount==null && other.getCoupon_discount()==null) || 
             (this.coupon_discount!=null &&
              this.coupon_discount.equals(other.getCoupon_discount()))) &&
            ((this.coupon_code==null && other.getCoupon_code()==null) || 
             (this.coupon_code!=null &&
              this.coupon_code.equals(other.getCoupon_code()))) &&
            ((this.order_discount==null && other.getOrder_discount()==null) || 
             (this.order_discount!=null &&
              this.order_discount.equals(other.getOrder_discount()))) &&
            ((this.order_currency==null && other.getOrder_currency()==null) || 
             (this.order_currency!=null &&
              this.order_currency.equals(other.getOrder_currency()))) &&
            ((this.order_status==null && other.getOrder_status()==null) || 
             (this.order_status!=null &&
              this.order_status.equals(other.getOrder_status()))) &&
            ((this.cdate==null && other.getCdate()==null) || 
             (this.cdate!=null &&
              this.cdate.equals(other.getCdate()))) &&
            ((this.mdate==null && other.getMdate()==null) || 
             (this.mdate!=null &&
              this.mdate.equals(other.getMdate()))) &&
            ((this.ship_method_id==null && other.getShip_method_id()==null) || 
             (this.ship_method_id!=null &&
              this.ship_method_id.equals(other.getShip_method_id()))) &&
            ((this.customer_note==null && other.getCustomer_note()==null) || 
             (this.customer_note!=null &&
              this.customer_note.equals(other.getCustomer_note()))) &&
            ((this.ip_address==null && other.getIp_address()==null) || 
             (this.ip_address!=null &&
              this.ip_address.equals(other.getIp_address())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getUser_id() != null) {
            _hashCode += getUser_id().hashCode();
        }
        if (getVendor_id() != null) {
            _hashCode += getVendor_id().hashCode();
        }
        if (getOrder_number() != null) {
            _hashCode += getOrder_number().hashCode();
        }
        if (getUser_info_id() != null) {
            _hashCode += getUser_info_id().hashCode();
        }
        if (getOrder_total() != null) {
            _hashCode += getOrder_total().hashCode();
        }
        if (getOrder_subtotal() != null) {
            _hashCode += getOrder_subtotal().hashCode();
        }
        if (getOrder_tax() != null) {
            _hashCode += getOrder_tax().hashCode();
        }
        if (getOrder_tax_details() != null) {
            _hashCode += getOrder_tax_details().hashCode();
        }
        if (getOrder_shipping() != null) {
            _hashCode += getOrder_shipping().hashCode();
        }
        if (getOrder_shipping_tax() != null) {
            _hashCode += getOrder_shipping_tax().hashCode();
        }
        if (getCoupon_discount() != null) {
            _hashCode += getCoupon_discount().hashCode();
        }
        if (getCoupon_code() != null) {
            _hashCode += getCoupon_code().hashCode();
        }
        if (getOrder_discount() != null) {
            _hashCode += getOrder_discount().hashCode();
        }
        if (getOrder_currency() != null) {
            _hashCode += getOrder_currency().hashCode();
        }
        if (getOrder_status() != null) {
            _hashCode += getOrder_status().hashCode();
        }
        if (getCdate() != null) {
            _hashCode += getCdate().hashCode();
        }
        if (getMdate() != null) {
            _hashCode += getMdate().hashCode();
        }
        if (getShip_method_id() != null) {
            _hashCode += getShip_method_id().hashCode();
        }
        if (getCustomer_note() != null) {
            _hashCode += getCustomer_note().hashCode();
        }
        if (getIp_address() != null) {
            _hashCode += getIp_address().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Order.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "Order"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_id"));
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
        elemField.setFieldName("order_number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_info_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_info_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_total");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_subtotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_subtotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_tax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_tax_details");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_tax_details"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_shipping");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_shipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_shipping_tax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_shipping_tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coupon_discount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coupon_discount"));
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
        elemField.setFieldName("order_discount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_discount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdate"));
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
        elemField.setFieldName("ship_method_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ship_method_id"));
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
        elemField.setFieldName("ip_address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ip_address"));
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
