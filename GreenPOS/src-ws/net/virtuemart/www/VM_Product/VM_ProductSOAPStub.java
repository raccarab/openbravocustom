/**
 * VM_ProductSOAPStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Product;

public class VM_ProductSOAPStub extends org.apache.axis.client.Stub implements net.virtuemart.www.VM_Product.VM_Product_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[14];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetProductFromId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "GetProductFromIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "ProductFromIdInput"), net.virtuemart.www.VM_Product.ProductFromIdInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "Produit"));
        oper.setReturnClass(net.virtuemart.www.VM_Product.Produit.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "GetProductFromIdResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetProductsFromCategory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "GetProductsFromCategoryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "ProductFromCatIdInput"), net.virtuemart.www.VM_Product.ProductFromCatIdInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "ProduitsArray"));
        oper.setReturnClass(net.virtuemart.www.VM_Product.Produit[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "GetProductsFromCategoryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetChildsProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "GetChildsProductRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "ProductFromIdInput"), net.virtuemart.www.VM_Product.ProductFromIdInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "ProduitsArray"));
        oper.setReturnClass(net.virtuemart.www.VM_Product.Produit[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "GetChildsProductResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "UpdateProductRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "UpdateProductInput"), net.virtuemart.www.VM_Product.UpdateProductInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "UpdateProductResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetProductsFromOrderId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "GetProductsFromOrderIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "ProductsFromOrderIdInput"), net.virtuemart.www.VM_Product.ProductsFromOrderIdInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "OrderItemInfoArray"));
        oper.setReturnClass(net.virtuemart.www.VM_Product.OrderItemInfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "GetProductsFromOrderIdResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "AddProductRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "UpdateProductInput"), net.virtuemart.www.VM_Product.UpdateProductInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "AddProductResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "DeleteProductRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "ProductFromIdInput"), net.virtuemart.www.VM_Product.ProductFromIdInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "DeleteProductResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAllCurrency");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "GetAllCurrencyRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "GetAllCurrencyInput"), net.virtuemart.www.VM_Product.GetAllCurrencyInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "CurrencyArray"));
        oper.setReturnClass(net.virtuemart.www.VM_Product.Currency[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "GetAllCurrencyResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAllTax");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "GetAllTaxRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "loginInfo"), net.virtuemart.www.VM_Tools.LoginInfo.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "TaxArray"));
        oper.setReturnClass(net.virtuemart.www.VM_Product.Tax[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "GetAllTaxResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddTax");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "AddTaxRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "TaxesInput"), net.virtuemart.www.VM_Product.TaxesInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "AddTaxResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateTax");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "UpdateTaxRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "TaxesInput"), net.virtuemart.www.VM_Product.TaxesInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "UpdateTaxResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteTax");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "DeleteTaxRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "DelInput"), net.virtuemart.www.VM_Product.DelInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "DeleteTaxResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAllProducts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "GetAllProductsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "GetAllProductsInput"), net.virtuemart.www.VM_Product.GetAllProductsInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "ProduitsArray"));
        oper.setReturnClass(net.virtuemart.www.VM_Product.Produit[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "GetAllProductsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAvailableImages");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "GetAvailableImagesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "loginInfo"), net.virtuemart.www.VM_Tools.LoginInfo.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "AvalaibleImageArray"));
        oper.setReturnClass(net.virtuemart.www.VM_Product.AvalaibleImage[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "GetAvailableImagesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

    }

    public VM_ProductSOAPStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public VM_ProductSOAPStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public VM_ProductSOAPStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "AvalaibleImage");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Product.AvalaibleImage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "AvalaibleImageArray");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Product.AvalaibleImage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "AvalaibleImage");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "Currency");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Product.Currency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "CurrencyArray");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Product.Currency[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "Currency");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "DelInput");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Product.DelInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "GetAllCurrencyInput");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Product.GetAllCurrencyInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "GetAllProductsInput");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Product.GetAllProductsInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "ids");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "id");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "loginInfo");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Tools.LoginInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "OrderItemInfo");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Product.OrderItemInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "OrderItemInfoArray");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Product.OrderItemInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "OrderItemInfo");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "ProductFromCatIdInput");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Product.ProductFromCatIdInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "ProductFromIdInput");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Product.ProductFromIdInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "ProductsFromOrderIdInput");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Product.ProductsFromOrderIdInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "Produit");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Product.Produit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "ProduitsArray");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Product.Produit[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "Produit");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "Tax");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Product.Tax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "TaxArray");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Product.Tax[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "Tax");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "Taxes");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Product.Tax[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "Tax");
            qName2 = new javax.xml.namespace.QName("", "tax");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "TaxesInput");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Product.TaxesInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Product/", "UpdateProductInput");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Product.UpdateProductInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public net.virtuemart.www.VM_Product.Produit getProductFromId(net.virtuemart.www.VM_Product.ProductFromIdInput parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Product/GetProductFromId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetProductFromId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.virtuemart.www.VM_Product.Produit) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.virtuemart.www.VM_Product.Produit) org.apache.axis.utils.JavaUtils.convert(_resp, net.virtuemart.www.VM_Product.Produit.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.virtuemart.www.VM_Product.Produit[] getProductsFromCategory(net.virtuemart.www.VM_Product.ProductFromCatIdInput parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Product/GetProductsFromCategory");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetProductsFromCategory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.virtuemart.www.VM_Product.Produit[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.virtuemart.www.VM_Product.Produit[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.virtuemart.www.VM_Product.Produit[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.virtuemart.www.VM_Product.Produit[] getChildsProduct(net.virtuemart.www.VM_Product.ProductFromIdInput parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Product/GetChildsProduct");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetChildsProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.virtuemart.www.VM_Product.Produit[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.virtuemart.www.VM_Product.Produit[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.virtuemart.www.VM_Product.Produit[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String updateProduct(net.virtuemart.www.VM_Product.UpdateProductInput parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Product/UpdateProduct");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.virtuemart.www.VM_Product.OrderItemInfo[] getProductsFromOrderId(net.virtuemart.www.VM_Product.ProductsFromOrderIdInput parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Product/GetProductsFromOrderId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetProductsFromOrderId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.virtuemart.www.VM_Product.OrderItemInfo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.virtuemart.www.VM_Product.OrderItemInfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.virtuemart.www.VM_Product.OrderItemInfo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String addProduct(net.virtuemart.www.VM_Product.UpdateProductInput parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Product/AddProduct");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AddProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String deleteProduct(net.virtuemart.www.VM_Product.ProductFromIdInput parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Product/DeleteProduct");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.virtuemart.www.VM_Product.Currency[] getAllCurrency(net.virtuemart.www.VM_Product.GetAllCurrencyInput parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Product/GetAllCurrency");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAllCurrency"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.virtuemart.www.VM_Product.Currency[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.virtuemart.www.VM_Product.Currency[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.virtuemart.www.VM_Product.Currency[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.virtuemart.www.VM_Product.Tax[] getAllTax(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Product/GetAllTax");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAllTax"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.virtuemart.www.VM_Product.Tax[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.virtuemart.www.VM_Product.Tax[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.virtuemart.www.VM_Product.Tax[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String addTax(net.virtuemart.www.VM_Product.TaxesInput parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Product/AddTax");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AddTax"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String updateTax(net.virtuemart.www.VM_Product.TaxesInput parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Product/UpdateTax");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateTax"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String deleteTax(net.virtuemart.www.VM_Product.DelInput parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Product/DeleteTax");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteTax"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.virtuemart.www.VM_Product.Produit[] getAllProducts(net.virtuemart.www.VM_Product.GetAllProductsInput parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Product/GetAllProducts");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAllProducts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.virtuemart.www.VM_Product.Produit[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.virtuemart.www.VM_Product.Produit[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.virtuemart.www.VM_Product.Produit[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.virtuemart.www.VM_Product.AvalaibleImage[] getAvailableImages(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Product/GetAvailableImages");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAvailableImages"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.virtuemart.www.VM_Product.AvalaibleImage[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.virtuemart.www.VM_Product.AvalaibleImage[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.virtuemart.www.VM_Product.AvalaibleImage[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
