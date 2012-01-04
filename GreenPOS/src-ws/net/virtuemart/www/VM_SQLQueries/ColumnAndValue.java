/**
 * ColumnAndValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_SQLQueries;

public class ColumnAndValue  implements java.io.Serializable {
    private java.lang.String idx;

    private java.lang.String column;

    private java.lang.String value;

    public ColumnAndValue() {
    }

    public ColumnAndValue(
           java.lang.String idx,
           java.lang.String column,
           java.lang.String value) {
           this.idx = idx;
           this.column = column;
           this.value = value;
    }


    /**
     * Gets the idx value for this ColumnAndValue.
     * 
     * @return idx
     */
    public java.lang.String getIdx() {
        return idx;
    }


    /**
     * Sets the idx value for this ColumnAndValue.
     * 
     * @param idx
     */
    public void setIdx(java.lang.String idx) {
        this.idx = idx;
    }


    /**
     * Gets the column value for this ColumnAndValue.
     * 
     * @return column
     */
    public java.lang.String getColumn() {
        return column;
    }


    /**
     * Sets the column value for this ColumnAndValue.
     * 
     * @param column
     */
    public void setColumn(java.lang.String column) {
        this.column = column;
    }


    /**
     * Gets the value value for this ColumnAndValue.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this ColumnAndValue.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ColumnAndValue)) return false;
        ColumnAndValue other = (ColumnAndValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idx==null && other.getIdx()==null) || 
             (this.idx!=null &&
              this.idx.equals(other.getIdx()))) &&
            ((this.column==null && other.getColumn()==null) || 
             (this.column!=null &&
              this.column.equals(other.getColumn()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getIdx() != null) {
            _hashCode += getIdx().hashCode();
        }
        if (getColumn() != null) {
            _hashCode += getColumn().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ColumnAndValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_SQLQueries/", "columnAndValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idx");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("column");
        elemField.setXmlName(new javax.xml.namespace.QName("", "column"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
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
