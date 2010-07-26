/**
 * SQLResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_SQLQueries;

public class SQLResult  implements java.io.Serializable {
    private net.virtuemart.www.VM_SQLQueries.ColumnAndValue[] columnsAndValues;

    public SQLResult() {
    }

    public SQLResult(
           net.virtuemart.www.VM_SQLQueries.ColumnAndValue[] columnsAndValues) {
           this.columnsAndValues = columnsAndValues;
    }


    /**
     * Gets the columnsAndValues value for this SQLResult.
     * 
     * @return columnsAndValues
     */
    public net.virtuemart.www.VM_SQLQueries.ColumnAndValue[] getColumnsAndValues() {
        return columnsAndValues;
    }


    /**
     * Sets the columnsAndValues value for this SQLResult.
     * 
     * @param columnsAndValues
     */
    public void setColumnsAndValues(net.virtuemart.www.VM_SQLQueries.ColumnAndValue[] columnsAndValues) {
        this.columnsAndValues = columnsAndValues;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SQLResult)) return false;
        SQLResult other = (SQLResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.columnsAndValues==null && other.getColumnsAndValues()==null) || 
             (this.columnsAndValues!=null &&
              java.util.Arrays.equals(this.columnsAndValues, other.getColumnsAndValues())));
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
        if (getColumnsAndValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getColumnsAndValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getColumnsAndValues(), i);
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
        new org.apache.axis.description.TypeDesc(SQLResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_SQLQueries/", "SQLResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnsAndValues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "columnsAndValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_SQLQueries/", "columnAndValue"));
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
