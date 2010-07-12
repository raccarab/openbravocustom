/**
 * Categorie.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Categories;

public class Categorie  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String name;

    private java.lang.String description;

    private java.lang.String parentcat;

    private java.lang.String image;

    private java.lang.String fullimage;

    private java.lang.String numberofproducts;

    private java.lang.String category_publish;

    private java.lang.String category_browsepage;

    private java.lang.String category_flypage;

    private java.lang.String products_per_row;

    public Categorie() {
    }

    public Categorie(
           java.lang.String id,
           java.lang.String name,
           java.lang.String description,
           java.lang.String parentcat,
           java.lang.String image,
           java.lang.String fullimage,
           java.lang.String numberofproducts,
           java.lang.String category_publish,
           java.lang.String category_browsepage,
           java.lang.String category_flypage,
           java.lang.String products_per_row) {
           this.id = id;
           this.name = name;
           this.description = description;
           this.parentcat = parentcat;
           this.image = image;
           this.fullimage = fullimage;
           this.numberofproducts = numberofproducts;
           this.category_publish = category_publish;
           this.category_browsepage = category_browsepage;
           this.category_flypage = category_flypage;
           this.products_per_row = products_per_row;
    }


    /**
     * Gets the id value for this Categorie.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Categorie.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Categorie.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Categorie.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this Categorie.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Categorie.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the parentcat value for this Categorie.
     * 
     * @return parentcat
     */
    public java.lang.String getParentcat() {
        return parentcat;
    }


    /**
     * Sets the parentcat value for this Categorie.
     * 
     * @param parentcat
     */
    public void setParentcat(java.lang.String parentcat) {
        this.parentcat = parentcat;
    }


    /**
     * Gets the image value for this Categorie.
     * 
     * @return image
     */
    public java.lang.String getImage() {
        return image;
    }


    /**
     * Sets the image value for this Categorie.
     * 
     * @param image
     */
    public void setImage(java.lang.String image) {
        this.image = image;
    }


    /**
     * Gets the fullimage value for this Categorie.
     * 
     * @return fullimage
     */
    public java.lang.String getFullimage() {
        return fullimage;
    }


    /**
     * Sets the fullimage value for this Categorie.
     * 
     * @param fullimage
     */
    public void setFullimage(java.lang.String fullimage) {
        this.fullimage = fullimage;
    }


    /**
     * Gets the numberofproducts value for this Categorie.
     * 
     * @return numberofproducts
     */
    public java.lang.String getNumberofproducts() {
        return numberofproducts;
    }


    /**
     * Sets the numberofproducts value for this Categorie.
     * 
     * @param numberofproducts
     */
    public void setNumberofproducts(java.lang.String numberofproducts) {
        this.numberofproducts = numberofproducts;
    }


    /**
     * Gets the category_publish value for this Categorie.
     * 
     * @return category_publish
     */
    public java.lang.String getCategory_publish() {
        return category_publish;
    }


    /**
     * Sets the category_publish value for this Categorie.
     * 
     * @param category_publish
     */
    public void setCategory_publish(java.lang.String category_publish) {
        this.category_publish = category_publish;
    }


    /**
     * Gets the category_browsepage value for this Categorie.
     * 
     * @return category_browsepage
     */
    public java.lang.String getCategory_browsepage() {
        return category_browsepage;
    }


    /**
     * Sets the category_browsepage value for this Categorie.
     * 
     * @param category_browsepage
     */
    public void setCategory_browsepage(java.lang.String category_browsepage) {
        this.category_browsepage = category_browsepage;
    }


    /**
     * Gets the category_flypage value for this Categorie.
     * 
     * @return category_flypage
     */
    public java.lang.String getCategory_flypage() {
        return category_flypage;
    }


    /**
     * Sets the category_flypage value for this Categorie.
     * 
     * @param category_flypage
     */
    public void setCategory_flypage(java.lang.String category_flypage) {
        this.category_flypage = category_flypage;
    }


    /**
     * Gets the products_per_row value for this Categorie.
     * 
     * @return products_per_row
     */
    public java.lang.String getProducts_per_row() {
        return products_per_row;
    }


    /**
     * Sets the products_per_row value for this Categorie.
     * 
     * @param products_per_row
     */
    public void setProducts_per_row(java.lang.String products_per_row) {
        this.products_per_row = products_per_row;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Categorie)) return false;
        Categorie other = (Categorie) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.parentcat==null && other.getParentcat()==null) || 
             (this.parentcat!=null &&
              this.parentcat.equals(other.getParentcat()))) &&
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              this.image.equals(other.getImage()))) &&
            ((this.fullimage==null && other.getFullimage()==null) || 
             (this.fullimage!=null &&
              this.fullimage.equals(other.getFullimage()))) &&
            ((this.numberofproducts==null && other.getNumberofproducts()==null) || 
             (this.numberofproducts!=null &&
              this.numberofproducts.equals(other.getNumberofproducts()))) &&
            ((this.category_publish==null && other.getCategory_publish()==null) || 
             (this.category_publish!=null &&
              this.category_publish.equals(other.getCategory_publish()))) &&
            ((this.category_browsepage==null && other.getCategory_browsepage()==null) || 
             (this.category_browsepage!=null &&
              this.category_browsepage.equals(other.getCategory_browsepage()))) &&
            ((this.category_flypage==null && other.getCategory_flypage()==null) || 
             (this.category_flypage!=null &&
              this.category_flypage.equals(other.getCategory_flypage()))) &&
            ((this.products_per_row==null && other.getProducts_per_row()==null) || 
             (this.products_per_row!=null &&
              this.products_per_row.equals(other.getProducts_per_row())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getParentcat() != null) {
            _hashCode += getParentcat().hashCode();
        }
        if (getImage() != null) {
            _hashCode += getImage().hashCode();
        }
        if (getFullimage() != null) {
            _hashCode += getFullimage().hashCode();
        }
        if (getNumberofproducts() != null) {
            _hashCode += getNumberofproducts().hashCode();
        }
        if (getCategory_publish() != null) {
            _hashCode += getCategory_publish().hashCode();
        }
        if (getCategory_browsepage() != null) {
            _hashCode += getCategory_browsepage().hashCode();
        }
        if (getCategory_flypage() != null) {
            _hashCode += getCategory_flypage().hashCode();
        }
        if (getProducts_per_row() != null) {
            _hashCode += getProducts_per_row().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Categorie.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Categories/", "Categorie"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentcat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentcat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new javax.xml.namespace.QName("", "image"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullimage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fullimage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberofproducts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberofproducts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category_publish");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category_publish"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category_browsepage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category_browsepage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category_flypage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category_flypage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("products_per_row");
        elemField.setXmlName(new javax.xml.namespace.QName("", "products_per_row"));
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
