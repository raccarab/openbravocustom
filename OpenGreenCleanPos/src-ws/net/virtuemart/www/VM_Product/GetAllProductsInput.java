/**
 * GetAllProductsInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Product;

public class GetAllProductsInput  implements java.io.Serializable {
    private net.virtuemart.www.VM_Tools.LoginInfo loginInfo;

    private java.lang.String product_publish;

    private java.lang.String with_childs;

    private java.lang.String limite_start;

    private java.lang.String limite_end;

    public GetAllProductsInput() {
    }

    public GetAllProductsInput(
           net.virtuemart.www.VM_Tools.LoginInfo loginInfo,
           java.lang.String product_publish,
           java.lang.String with_childs,
           java.lang.String limite_start,
           java.lang.String limite_end) {
           this.loginInfo = loginInfo;
           this.product_publish = product_publish;
           this.with_childs = with_childs;
           this.limite_start = limite_start;
           this.limite_end = limite_end;
    }


    /**
     * Gets the loginInfo value for this GetAllProductsInput.
     * 
     * @return loginInfo
     */
    public net.virtuemart.www.VM_Tools.LoginInfo getLoginInfo() {
        return loginInfo;
    }


    /**
     * Sets the loginInfo value for this GetAllProductsInput.
     * 
     * @param loginInfo
     */
    public void setLoginInfo(net.virtuemart.www.VM_Tools.LoginInfo loginInfo) {
        this.loginInfo = loginInfo;
    }


    /**
     * Gets the product_publish value for this GetAllProductsInput.
     * 
     * @return product_publish
     */
    public java.lang.String getProduct_publish() {
        return product_publish;
    }


    /**
     * Sets the product_publish value for this GetAllProductsInput.
     * 
     * @param product_publish
     */
    public void setProduct_publish(java.lang.String product_publish) {
        this.product_publish = product_publish;
    }


    /**
     * Gets the with_childs value for this GetAllProductsInput.
     * 
     * @return with_childs
     */
    public java.lang.String getWith_childs() {
        return with_childs;
    }


    /**
     * Sets the with_childs value for this GetAllProductsInput.
     * 
     * @param with_childs
     */
    public void setWith_childs(java.lang.String with_childs) {
        this.with_childs = with_childs;
    }


    /**
     * Gets the limite_start value for this GetAllProductsInput.
     * 
     * @return limite_start
     */
    public java.lang.String getLimite_start() {
        return limite_start;
    }


    /**
     * Sets the limite_start value for this GetAllProductsInput.
     * 
     * @param limite_start
     */
    public void setLimite_start(java.lang.String limite_start) {
        this.limite_start = limite_start;
    }


    /**
     * Gets the limite_end value for this GetAllProductsInput.
     * 
     * @return limite_end
     */
    public java.lang.String getLimite_end() {
        return limite_end;
    }


    /**
     * Sets the limite_end value for this GetAllProductsInput.
     * 
     * @param limite_end
     */
    public void setLimite_end(java.lang.String limite_end) {
        this.limite_end = limite_end;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllProductsInput)) return false;
        GetAllProductsInput other = (GetAllProductsInput) obj;
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
            ((this.product_publish==null && other.getProduct_publish()==null) || 
             (this.product_publish!=null &&
              this.product_publish.equals(other.getProduct_publish()))) &&
            ((this.with_childs==null && other.getWith_childs()==null) || 
             (this.with_childs!=null &&
              this.with_childs.equals(other.getWith_childs()))) &&
            ((this.limite_start==null && other.getLimite_start()==null) || 
             (this.limite_start!=null &&
              this.limite_start.equals(other.getLimite_start()))) &&
            ((this.limite_end==null && other.getLimite_end()==null) || 
             (this.limite_end!=null &&
              this.limite_end.equals(other.getLimite_end())));
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
        if (getProduct_publish() != null) {
            _hashCode += getProduct_publish().hashCode();
        }
        if (getWith_childs() != null) {
            _hashCode += getWith_childs().hashCode();
        }
        if (getLimite_start() != null) {
            _hashCode += getLimite_start().hashCode();
        }
        if (getLimite_end() != null) {
            _hashCode += getLimite_end().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAllProductsInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "GetAllProductsInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loginInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "loginInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_publish");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product_publish"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("with_childs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "with_childs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limite_start");
        elemField.setXmlName(new javax.xml.namespace.QName("", "limite_start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limite_end");
        elemField.setXmlName(new javax.xml.namespace.QName("", "limite_end"));
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
