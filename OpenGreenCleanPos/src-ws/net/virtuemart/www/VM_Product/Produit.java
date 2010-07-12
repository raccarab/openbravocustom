/**
 * Produit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Product;

public class Produit  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String name;

    private java.lang.String product_sku;

    private java.lang.String product_sales;

    private java.lang.String price;

    private java.lang.String discount;

    private java.lang.String discount_is_percent;

    private java.lang.String description;

    private java.lang.String bigdescription;

    private java.lang.String image;

    private java.lang.String fullimage;

    private java.lang.String quantity;

    private java.lang.String parent_produit_id;

    private java.lang.String has_childs;

    private java.lang.String childs_id;

    private java.lang.String atribute;

    private java.lang.String atribute_value;

    private java.lang.String product_publish;

    private java.lang.String product_weight;

    private java.lang.String product_weight_uom;

    private java.lang.String product_length;

    private java.lang.String product_width;

    private java.lang.String product_height;

    private java.lang.String product_lwh_uom;

    private java.lang.String product_unit;

    private java.lang.String product_packaging;

    private java.lang.String product_url;

    private java.lang.String custom_attribute;

    private java.lang.String product_available_date;

    private java.lang.String product_availability;

    private java.lang.String product_special;

    private java.lang.String child_options;

    private java.lang.String quantity_options;

    private java.lang.String product_discount_id;

    private java.lang.String product_tax_id;

    private java.lang.String child_option_ids;

    private java.lang.String product_order_levels;

    private java.lang.String product_categories;

    private java.lang.String product_currency;

    public Produit() {
    }

    public Produit(
           java.lang.String id,
           java.lang.String name,
           java.lang.String product_sku,
           java.lang.String product_sales,
           java.lang.String price,
           java.lang.String discount,
           java.lang.String discount_is_percent,
           java.lang.String description,
           java.lang.String bigdescription,
           java.lang.String image,
           java.lang.String fullimage,
           java.lang.String quantity,
           java.lang.String parent_produit_id,
           java.lang.String has_childs,
           java.lang.String childs_id,
           java.lang.String atribute,
           java.lang.String atribute_value,
           java.lang.String product_publish,
           java.lang.String product_weight,
           java.lang.String product_weight_uom,
           java.lang.String product_length,
           java.lang.String product_width,
           java.lang.String product_height,
           java.lang.String product_lwh_uom,
           java.lang.String product_unit,
           java.lang.String product_packaging,
           java.lang.String product_url,
           java.lang.String custom_attribute,
           java.lang.String product_available_date,
           java.lang.String product_availability,
           java.lang.String product_special,
           java.lang.String child_options,
           java.lang.String quantity_options,
           java.lang.String product_discount_id,
           java.lang.String product_tax_id,
           java.lang.String child_option_ids,
           java.lang.String product_order_levels,
           java.lang.String product_categories,
           java.lang.String product_currency) {
           this.id = id;
           this.name = name;
           this.product_sku = product_sku;
           this.product_sales = product_sales;
           this.price = price;
           this.discount = discount;
           this.discount_is_percent = discount_is_percent;
           this.description = description;
           this.bigdescription = bigdescription;
           this.image = image;
           this.fullimage = fullimage;
           this.quantity = quantity;
           this.parent_produit_id = parent_produit_id;
           this.has_childs = has_childs;
           this.childs_id = childs_id;
           this.atribute = atribute;
           this.atribute_value = atribute_value;
           this.product_publish = product_publish;
           this.product_weight = product_weight;
           this.product_weight_uom = product_weight_uom;
           this.product_length = product_length;
           this.product_width = product_width;
           this.product_height = product_height;
           this.product_lwh_uom = product_lwh_uom;
           this.product_unit = product_unit;
           this.product_packaging = product_packaging;
           this.product_url = product_url;
           this.custom_attribute = custom_attribute;
           this.product_available_date = product_available_date;
           this.product_availability = product_availability;
           this.product_special = product_special;
           this.child_options = child_options;
           this.quantity_options = quantity_options;
           this.product_discount_id = product_discount_id;
           this.product_tax_id = product_tax_id;
           this.child_option_ids = child_option_ids;
           this.product_order_levels = product_order_levels;
           this.product_categories = product_categories;
           this.product_currency = product_currency;
    }


    /**
     * Gets the id value for this Produit.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Produit.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Produit.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Produit.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the product_sku value for this Produit.
     * 
     * @return product_sku
     */
    public java.lang.String getProduct_sku() {
        return product_sku;
    }


    /**
     * Sets the product_sku value for this Produit.
     * 
     * @param product_sku
     */
    public void setProduct_sku(java.lang.String product_sku) {
        this.product_sku = product_sku;
    }


    /**
     * Gets the product_sales value for this Produit.
     * 
     * @return product_sales
     */
    public java.lang.String getProduct_sales() {
        return product_sales;
    }


    /**
     * Sets the product_sales value for this Produit.
     * 
     * @param product_sales
     */
    public void setProduct_sales(java.lang.String product_sales) {
        this.product_sales = product_sales;
    }


    /**
     * Gets the price value for this Produit.
     * 
     * @return price
     */
    public java.lang.String getPrice() {
        return price;
    }


    /**
     * Sets the price value for this Produit.
     * 
     * @param price
     */
    public void setPrice(java.lang.String price) {
        this.price = price;
    }


    /**
     * Gets the discount value for this Produit.
     * 
     * @return discount
     */
    public java.lang.String getDiscount() {
        return discount;
    }


    /**
     * Sets the discount value for this Produit.
     * 
     * @param discount
     */
    public void setDiscount(java.lang.String discount) {
        this.discount = discount;
    }


    /**
     * Gets the discount_is_percent value for this Produit.
     * 
     * @return discount_is_percent
     */
    public java.lang.String getDiscount_is_percent() {
        return discount_is_percent;
    }


    /**
     * Sets the discount_is_percent value for this Produit.
     * 
     * @param discount_is_percent
     */
    public void setDiscount_is_percent(java.lang.String discount_is_percent) {
        this.discount_is_percent = discount_is_percent;
    }


    /**
     * Gets the description value for this Produit.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Produit.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the bigdescription value for this Produit.
     * 
     * @return bigdescription
     */
    public java.lang.String getBigdescription() {
        return bigdescription;
    }


    /**
     * Sets the bigdescription value for this Produit.
     * 
     * @param bigdescription
     */
    public void setBigdescription(java.lang.String bigdescription) {
        this.bigdescription = bigdescription;
    }


    /**
     * Gets the image value for this Produit.
     * 
     * @return image
     */
    public java.lang.String getImage() {
        return image;
    }


    /**
     * Sets the image value for this Produit.
     * 
     * @param image
     */
    public void setImage(java.lang.String image) {
        this.image = image;
    }


    /**
     * Gets the fullimage value for this Produit.
     * 
     * @return fullimage
     */
    public java.lang.String getFullimage() {
        return fullimage;
    }


    /**
     * Sets the fullimage value for this Produit.
     * 
     * @param fullimage
     */
    public void setFullimage(java.lang.String fullimage) {
        this.fullimage = fullimage;
    }


    /**
     * Gets the quantity value for this Produit.
     * 
     * @return quantity
     */
    public java.lang.String getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this Produit.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.String quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the parent_produit_id value for this Produit.
     * 
     * @return parent_produit_id
     */
    public java.lang.String getParent_produit_id() {
        return parent_produit_id;
    }


    /**
     * Sets the parent_produit_id value for this Produit.
     * 
     * @param parent_produit_id
     */
    public void setParent_produit_id(java.lang.String parent_produit_id) {
        this.parent_produit_id = parent_produit_id;
    }


    /**
     * Gets the has_childs value for this Produit.
     * 
     * @return has_childs
     */
    public java.lang.String getHas_childs() {
        return has_childs;
    }


    /**
     * Sets the has_childs value for this Produit.
     * 
     * @param has_childs
     */
    public void setHas_childs(java.lang.String has_childs) {
        this.has_childs = has_childs;
    }


    /**
     * Gets the childs_id value for this Produit.
     * 
     * @return childs_id
     */
    public java.lang.String getChilds_id() {
        return childs_id;
    }


    /**
     * Sets the childs_id value for this Produit.
     * 
     * @param childs_id
     */
    public void setChilds_id(java.lang.String childs_id) {
        this.childs_id = childs_id;
    }


    /**
     * Gets the atribute value for this Produit.
     * 
     * @return atribute
     */
    public java.lang.String getAtribute() {
        return atribute;
    }


    /**
     * Sets the atribute value for this Produit.
     * 
     * @param atribute
     */
    public void setAtribute(java.lang.String atribute) {
        this.atribute = atribute;
    }


    /**
     * Gets the atribute_value value for this Produit.
     * 
     * @return atribute_value
     */
    public java.lang.String getAtribute_value() {
        return atribute_value;
    }


    /**
     * Sets the atribute_value value for this Produit.
     * 
     * @param atribute_value
     */
    public void setAtribute_value(java.lang.String atribute_value) {
        this.atribute_value = atribute_value;
    }


    /**
     * Gets the product_publish value for this Produit.
     * 
     * @return product_publish
     */
    public java.lang.String getProduct_publish() {
        return product_publish;
    }


    /**
     * Sets the product_publish value for this Produit.
     * 
     * @param product_publish
     */
    public void setProduct_publish(java.lang.String product_publish) {
        this.product_publish = product_publish;
    }


    /**
     * Gets the product_weight value for this Produit.
     * 
     * @return product_weight
     */
    public java.lang.String getProduct_weight() {
        return product_weight;
    }


    /**
     * Sets the product_weight value for this Produit.
     * 
     * @param product_weight
     */
    public void setProduct_weight(java.lang.String product_weight) {
        this.product_weight = product_weight;
    }


    /**
     * Gets the product_weight_uom value for this Produit.
     * 
     * @return product_weight_uom
     */
    public java.lang.String getProduct_weight_uom() {
        return product_weight_uom;
    }


    /**
     * Sets the product_weight_uom value for this Produit.
     * 
     * @param product_weight_uom
     */
    public void setProduct_weight_uom(java.lang.String product_weight_uom) {
        this.product_weight_uom = product_weight_uom;
    }


    /**
     * Gets the product_length value for this Produit.
     * 
     * @return product_length
     */
    public java.lang.String getProduct_length() {
        return product_length;
    }


    /**
     * Sets the product_length value for this Produit.
     * 
     * @param product_length
     */
    public void setProduct_length(java.lang.String product_length) {
        this.product_length = product_length;
    }


    /**
     * Gets the product_width value for this Produit.
     * 
     * @return product_width
     */
    public java.lang.String getProduct_width() {
        return product_width;
    }


    /**
     * Sets the product_width value for this Produit.
     * 
     * @param product_width
     */
    public void setProduct_width(java.lang.String product_width) {
        this.product_width = product_width;
    }


    /**
     * Gets the product_height value for this Produit.
     * 
     * @return product_height
     */
    public java.lang.String getProduct_height() {
        return product_height;
    }


    /**
     * Sets the product_height value for this Produit.
     * 
     * @param product_height
     */
    public void setProduct_height(java.lang.String product_height) {
        this.product_height = product_height;
    }


    /**
     * Gets the product_lwh_uom value for this Produit.
     * 
     * @return product_lwh_uom
     */
    public java.lang.String getProduct_lwh_uom() {
        return product_lwh_uom;
    }


    /**
     * Sets the product_lwh_uom value for this Produit.
     * 
     * @param product_lwh_uom
     */
    public void setProduct_lwh_uom(java.lang.String product_lwh_uom) {
        this.product_lwh_uom = product_lwh_uom;
    }


    /**
     * Gets the product_unit value for this Produit.
     * 
     * @return product_unit
     */
    public java.lang.String getProduct_unit() {
        return product_unit;
    }


    /**
     * Sets the product_unit value for this Produit.
     * 
     * @param product_unit
     */
    public void setProduct_unit(java.lang.String product_unit) {
        this.product_unit = product_unit;
    }


    /**
     * Gets the product_packaging value for this Produit.
     * 
     * @return product_packaging
     */
    public java.lang.String getProduct_packaging() {
        return product_packaging;
    }


    /**
     * Sets the product_packaging value for this Produit.
     * 
     * @param product_packaging
     */
    public void setProduct_packaging(java.lang.String product_packaging) {
        this.product_packaging = product_packaging;
    }


    /**
     * Gets the product_url value for this Produit.
     * 
     * @return product_url
     */
    public java.lang.String getProduct_url() {
        return product_url;
    }


    /**
     * Sets the product_url value for this Produit.
     * 
     * @param product_url
     */
    public void setProduct_url(java.lang.String product_url) {
        this.product_url = product_url;
    }


    /**
     * Gets the custom_attribute value for this Produit.
     * 
     * @return custom_attribute
     */
    public java.lang.String getCustom_attribute() {
        return custom_attribute;
    }


    /**
     * Sets the custom_attribute value for this Produit.
     * 
     * @param custom_attribute
     */
    public void setCustom_attribute(java.lang.String custom_attribute) {
        this.custom_attribute = custom_attribute;
    }


    /**
     * Gets the product_available_date value for this Produit.
     * 
     * @return product_available_date
     */
    public java.lang.String getProduct_available_date() {
        return product_available_date;
    }


    /**
     * Sets the product_available_date value for this Produit.
     * 
     * @param product_available_date
     */
    public void setProduct_available_date(java.lang.String product_available_date) {
        this.product_available_date = product_available_date;
    }


    /**
     * Gets the product_availability value for this Produit.
     * 
     * @return product_availability
     */
    public java.lang.String getProduct_availability() {
        return product_availability;
    }


    /**
     * Sets the product_availability value for this Produit.
     * 
     * @param product_availability
     */
    public void setProduct_availability(java.lang.String product_availability) {
        this.product_availability = product_availability;
    }


    /**
     * Gets the product_special value for this Produit.
     * 
     * @return product_special
     */
    public java.lang.String getProduct_special() {
        return product_special;
    }


    /**
     * Sets the product_special value for this Produit.
     * 
     * @param product_special
     */
    public void setProduct_special(java.lang.String product_special) {
        this.product_special = product_special;
    }


    /**
     * Gets the child_options value for this Produit.
     * 
     * @return child_options
     */
    public java.lang.String getChild_options() {
        return child_options;
    }


    /**
     * Sets the child_options value for this Produit.
     * 
     * @param child_options
     */
    public void setChild_options(java.lang.String child_options) {
        this.child_options = child_options;
    }


    /**
     * Gets the quantity_options value for this Produit.
     * 
     * @return quantity_options
     */
    public java.lang.String getQuantity_options() {
        return quantity_options;
    }


    /**
     * Sets the quantity_options value for this Produit.
     * 
     * @param quantity_options
     */
    public void setQuantity_options(java.lang.String quantity_options) {
        this.quantity_options = quantity_options;
    }


    /**
     * Gets the product_discount_id value for this Produit.
     * 
     * @return product_discount_id
     */
    public java.lang.String getProduct_discount_id() {
        return product_discount_id;
    }


    /**
     * Sets the product_discount_id value for this Produit.
     * 
     * @param product_discount_id
     */
    public void setProduct_discount_id(java.lang.String product_discount_id) {
        this.product_discount_id = product_discount_id;
    }


    /**
     * Gets the product_tax_id value for this Produit.
     * 
     * @return product_tax_id
     */
    public java.lang.String getProduct_tax_id() {
        return product_tax_id;
    }


    /**
     * Sets the product_tax_id value for this Produit.
     * 
     * @param product_tax_id
     */
    public void setProduct_tax_id(java.lang.String product_tax_id) {
        this.product_tax_id = product_tax_id;
    }


    /**
     * Gets the child_option_ids value for this Produit.
     * 
     * @return child_option_ids
     */
    public java.lang.String getChild_option_ids() {
        return child_option_ids;
    }


    /**
     * Sets the child_option_ids value for this Produit.
     * 
     * @param child_option_ids
     */
    public void setChild_option_ids(java.lang.String child_option_ids) {
        this.child_option_ids = child_option_ids;
    }


    /**
     * Gets the product_order_levels value for this Produit.
     * 
     * @return product_order_levels
     */
    public java.lang.String getProduct_order_levels() {
        return product_order_levels;
    }


    /**
     * Sets the product_order_levels value for this Produit.
     * 
     * @param product_order_levels
     */
    public void setProduct_order_levels(java.lang.String product_order_levels) {
        this.product_order_levels = product_order_levels;
    }


    /**
     * Gets the product_categories value for this Produit.
     * 
     * @return product_categories
     */
    public java.lang.String getProduct_categories() {
        return product_categories;
    }


    /**
     * Sets the product_categories value for this Produit.
     * 
     * @param product_categories
     */
    public void setProduct_categories(java.lang.String product_categories) {
        this.product_categories = product_categories;
    }


    /**
     * Gets the product_currency value for this Produit.
     * 
     * @return product_currency
     */
    public java.lang.String getProduct_currency() {
        return product_currency;
    }


    /**
     * Sets the product_currency value for this Produit.
     * 
     * @param product_currency
     */
    public void setProduct_currency(java.lang.String product_currency) {
        this.product_currency = product_currency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Produit)) return false;
        Produit other = (Produit) obj;
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
            ((this.product_sku==null && other.getProduct_sku()==null) || 
             (this.product_sku!=null &&
              this.product_sku.equals(other.getProduct_sku()))) &&
            ((this.product_sales==null && other.getProduct_sales()==null) || 
             (this.product_sales!=null &&
              this.product_sales.equals(other.getProduct_sales()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.discount==null && other.getDiscount()==null) || 
             (this.discount!=null &&
              this.discount.equals(other.getDiscount()))) &&
            ((this.discount_is_percent==null && other.getDiscount_is_percent()==null) || 
             (this.discount_is_percent!=null &&
              this.discount_is_percent.equals(other.getDiscount_is_percent()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.bigdescription==null && other.getBigdescription()==null) || 
             (this.bigdescription!=null &&
              this.bigdescription.equals(other.getBigdescription()))) &&
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              this.image.equals(other.getImage()))) &&
            ((this.fullimage==null && other.getFullimage()==null) || 
             (this.fullimage!=null &&
              this.fullimage.equals(other.getFullimage()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.parent_produit_id==null && other.getParent_produit_id()==null) || 
             (this.parent_produit_id!=null &&
              this.parent_produit_id.equals(other.getParent_produit_id()))) &&
            ((this.has_childs==null && other.getHas_childs()==null) || 
             (this.has_childs!=null &&
              this.has_childs.equals(other.getHas_childs()))) &&
            ((this.childs_id==null && other.getChilds_id()==null) || 
             (this.childs_id!=null &&
              this.childs_id.equals(other.getChilds_id()))) &&
            ((this.atribute==null && other.getAtribute()==null) || 
             (this.atribute!=null &&
              this.atribute.equals(other.getAtribute()))) &&
            ((this.atribute_value==null && other.getAtribute_value()==null) || 
             (this.atribute_value!=null &&
              this.atribute_value.equals(other.getAtribute_value()))) &&
            ((this.product_publish==null && other.getProduct_publish()==null) || 
             (this.product_publish!=null &&
              this.product_publish.equals(other.getProduct_publish()))) &&
            ((this.product_weight==null && other.getProduct_weight()==null) || 
             (this.product_weight!=null &&
              this.product_weight.equals(other.getProduct_weight()))) &&
            ((this.product_weight_uom==null && other.getProduct_weight_uom()==null) || 
             (this.product_weight_uom!=null &&
              this.product_weight_uom.equals(other.getProduct_weight_uom()))) &&
            ((this.product_length==null && other.getProduct_length()==null) || 
             (this.product_length!=null &&
              this.product_length.equals(other.getProduct_length()))) &&
            ((this.product_width==null && other.getProduct_width()==null) || 
             (this.product_width!=null &&
              this.product_width.equals(other.getProduct_width()))) &&
            ((this.product_height==null && other.getProduct_height()==null) || 
             (this.product_height!=null &&
              this.product_height.equals(other.getProduct_height()))) &&
            ((this.product_lwh_uom==null && other.getProduct_lwh_uom()==null) || 
             (this.product_lwh_uom!=null &&
              this.product_lwh_uom.equals(other.getProduct_lwh_uom()))) &&
            ((this.product_unit==null && other.getProduct_unit()==null) || 
             (this.product_unit!=null &&
              this.product_unit.equals(other.getProduct_unit()))) &&
            ((this.product_packaging==null && other.getProduct_packaging()==null) || 
             (this.product_packaging!=null &&
              this.product_packaging.equals(other.getProduct_packaging()))) &&
            ((this.product_url==null && other.getProduct_url()==null) || 
             (this.product_url!=null &&
              this.product_url.equals(other.getProduct_url()))) &&
            ((this.custom_attribute==null && other.getCustom_attribute()==null) || 
             (this.custom_attribute!=null &&
              this.custom_attribute.equals(other.getCustom_attribute()))) &&
            ((this.product_available_date==null && other.getProduct_available_date()==null) || 
             (this.product_available_date!=null &&
              this.product_available_date.equals(other.getProduct_available_date()))) &&
            ((this.product_availability==null && other.getProduct_availability()==null) || 
             (this.product_availability!=null &&
              this.product_availability.equals(other.getProduct_availability()))) &&
            ((this.product_special==null && other.getProduct_special()==null) || 
             (this.product_special!=null &&
              this.product_special.equals(other.getProduct_special()))) &&
            ((this.child_options==null && other.getChild_options()==null) || 
             (this.child_options!=null &&
              this.child_options.equals(other.getChild_options()))) &&
            ((this.quantity_options==null && other.getQuantity_options()==null) || 
             (this.quantity_options!=null &&
              this.quantity_options.equals(other.getQuantity_options()))) &&
            ((this.product_discount_id==null && other.getProduct_discount_id()==null) || 
             (this.product_discount_id!=null &&
              this.product_discount_id.equals(other.getProduct_discount_id()))) &&
            ((this.product_tax_id==null && other.getProduct_tax_id()==null) || 
             (this.product_tax_id!=null &&
              this.product_tax_id.equals(other.getProduct_tax_id()))) &&
            ((this.child_option_ids==null && other.getChild_option_ids()==null) || 
             (this.child_option_ids!=null &&
              this.child_option_ids.equals(other.getChild_option_ids()))) &&
            ((this.product_order_levels==null && other.getProduct_order_levels()==null) || 
             (this.product_order_levels!=null &&
              this.product_order_levels.equals(other.getProduct_order_levels()))) &&
            ((this.product_categories==null && other.getProduct_categories()==null) || 
             (this.product_categories!=null &&
              this.product_categories.equals(other.getProduct_categories()))) &&
            ((this.product_currency==null && other.getProduct_currency()==null) || 
             (this.product_currency!=null &&
              this.product_currency.equals(other.getProduct_currency())));
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
        if (getProduct_sku() != null) {
            _hashCode += getProduct_sku().hashCode();
        }
        if (getProduct_sales() != null) {
            _hashCode += getProduct_sales().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getDiscount() != null) {
            _hashCode += getDiscount().hashCode();
        }
        if (getDiscount_is_percent() != null) {
            _hashCode += getDiscount_is_percent().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getBigdescription() != null) {
            _hashCode += getBigdescription().hashCode();
        }
        if (getImage() != null) {
            _hashCode += getImage().hashCode();
        }
        if (getFullimage() != null) {
            _hashCode += getFullimage().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getParent_produit_id() != null) {
            _hashCode += getParent_produit_id().hashCode();
        }
        if (getHas_childs() != null) {
            _hashCode += getHas_childs().hashCode();
        }
        if (getChilds_id() != null) {
            _hashCode += getChilds_id().hashCode();
        }
        if (getAtribute() != null) {
            _hashCode += getAtribute().hashCode();
        }
        if (getAtribute_value() != null) {
            _hashCode += getAtribute_value().hashCode();
        }
        if (getProduct_publish() != null) {
            _hashCode += getProduct_publish().hashCode();
        }
        if (getProduct_weight() != null) {
            _hashCode += getProduct_weight().hashCode();
        }
        if (getProduct_weight_uom() != null) {
            _hashCode += getProduct_weight_uom().hashCode();
        }
        if (getProduct_length() != null) {
            _hashCode += getProduct_length().hashCode();
        }
        if (getProduct_width() != null) {
            _hashCode += getProduct_width().hashCode();
        }
        if (getProduct_height() != null) {
            _hashCode += getProduct_height().hashCode();
        }
        if (getProduct_lwh_uom() != null) {
            _hashCode += getProduct_lwh_uom().hashCode();
        }
        if (getProduct_unit() != null) {
            _hashCode += getProduct_unit().hashCode();
        }
        if (getProduct_packaging() != null) {
            _hashCode += getProduct_packaging().hashCode();
        }
        if (getProduct_url() != null) {
            _hashCode += getProduct_url().hashCode();
        }
        if (getCustom_attribute() != null) {
            _hashCode += getCustom_attribute().hashCode();
        }
        if (getProduct_available_date() != null) {
            _hashCode += getProduct_available_date().hashCode();
        }
        if (getProduct_availability() != null) {
            _hashCode += getProduct_availability().hashCode();
        }
        if (getProduct_special() != null) {
            _hashCode += getProduct_special().hashCode();
        }
        if (getChild_options() != null) {
            _hashCode += getChild_options().hashCode();
        }
        if (getQuantity_options() != null) {
            _hashCode += getQuantity_options().hashCode();
        }
        if (getProduct_discount_id() != null) {
            _hashCode += getProduct_discount_id().hashCode();
        }
        if (getProduct_tax_id() != null) {
            _hashCode += getProduct_tax_id().hashCode();
        }
        if (getChild_option_ids() != null) {
            _hashCode += getChild_option_ids().hashCode();
        }
        if (getProduct_order_levels() != null) {
            _hashCode += getProduct_order_levels().hashCode();
        }
        if (getProduct_categories() != null) {
            _hashCode += getProduct_categories().hashCode();
        }
        if (getProduct_currency() != null) {
            _hashCode += getProduct_currency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Produit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "Produit"));
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
        elemField.setFieldName("product_sku");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product_sku"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_sales");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product_sales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "discount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discount_is_percent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "discount_is_percent"));
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
        elemField.setFieldName("bigdescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bigdescription"));
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
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent_produit_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parent_produit_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("has_childs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "has_childs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childs_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "childs_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atribute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "atribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atribute_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "atribute_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_publish");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product_publish"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_weight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product_weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_weight_uom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product_weight_uom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_length");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product_length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_width");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product_width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_height");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product_height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_lwh_uom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product_lwh_uom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_unit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product_unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_packaging");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product_packaging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product_url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custom_attribute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "custom_attribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_available_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product_available_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_availability");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product_availability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_special");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product_special"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("child_options");
        elemField.setXmlName(new javax.xml.namespace.QName("", "child_options"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity_options");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantity_options"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_discount_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product_discount_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_tax_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product_tax_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("child_option_ids");
        elemField.setXmlName(new javax.xml.namespace.QName("", "child_option_ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_order_levels");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product_order_levels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_categories");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product_categories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product_currency"));
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
