/**
 * GetAllCategoriesInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Categories;

public class GetAllCategoriesInput  implements java.io.Serializable {
    private net.virtuemart.www.VM_Tools.LoginInfo loginInfo;

    private java.lang.String category_publish;

    public GetAllCategoriesInput() {
    }

    public GetAllCategoriesInput(
           net.virtuemart.www.VM_Tools.LoginInfo loginInfo,
           java.lang.String category_publish) {
           this.loginInfo = loginInfo;
           this.category_publish = category_publish;
    }


    /**
     * Gets the loginInfo value for this GetAllCategoriesInput.
     * 
     * @return loginInfo
     */
    public net.virtuemart.www.VM_Tools.LoginInfo getLoginInfo() {
        return loginInfo;
    }


    /**
     * Sets the loginInfo value for this GetAllCategoriesInput.
     * 
     * @param loginInfo
     */
    public void setLoginInfo(net.virtuemart.www.VM_Tools.LoginInfo loginInfo) {
        this.loginInfo = loginInfo;
    }


    /**
     * Gets the category_publish value for this GetAllCategoriesInput.
     * 
     * @return category_publish
     */
    public java.lang.String getCategory_publish() {
        return category_publish;
    }


    /**
     * Sets the category_publish value for this GetAllCategoriesInput.
     * 
     * @param category_publish
     */
    public void setCategory_publish(java.lang.String category_publish) {
        this.category_publish = category_publish;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllCategoriesInput)) return false;
        GetAllCategoriesInput other = (GetAllCategoriesInput) obj;
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
            ((this.category_publish==null && other.getCategory_publish()==null) || 
             (this.category_publish!=null &&
              this.category_publish.equals(other.getCategory_publish())));
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
        if (getCategory_publish() != null) {
            _hashCode += getCategory_publish().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAllCategoriesInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Categories/", "GetAllCategoriesInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loginInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Categories/", "loginInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category_publish");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category_publish"));
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
