/**
 * VM_OrderSOAPStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Order;

public class VM_OrderSOAPStub extends org.apache.axis.client.Stub implements net.virtuemart.www.VM_Order.VM_Order_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[30];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "getOrderRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "OrderRequest"), net.virtuemart.www.VM_Order.OrderRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "Order"));
        oper.setReturnClass(net.virtuemart.www.VM_Order.Order.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "getOrderResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOrdersFromStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "getOrdersFromStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "OrderRequestWithStatus"), net.virtuemart.www.VM_Order.OrderRequestWithStatus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "OrderArray"));
        oper.setReturnClass(net.virtuemart.www.VM_Order.Order[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "getOrdersFromStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOrderStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "getOrderStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "loginInfo"), net.virtuemart.www.VM_Tools.LoginInfo.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "StatusArray"));
        oper.setReturnClass(net.virtuemart.www.VM_Order.OrderStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "getOrderStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllOrders");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "getAllOrdersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "AllOrderRequest"), net.virtuemart.www.VM_Order.AllOrderRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "OrderArray"));
        oper.setReturnClass(net.virtuemart.www.VM_Order.Order[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "getAllOrdersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateOrderStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "UpdateOrderStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "UpdateOrderStatusInput"), net.virtuemart.www.VM_Order.UpdateOrderStatusInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "UpdateOrderStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "DeleteOrderRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "DeleteOrderInput"), net.virtuemart.www.VM_Order.DeleteOrderInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "DeleteOrderResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "CreateOrderRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "CreateOrderInput"), net.virtuemart.www.VM_Order.CreateOrderInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "returnOutput"));
        oper.setReturnClass(net.virtuemart.www.VM_Order.ReturnOutput.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "CreateOrderResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAllCouponCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "GetAllCouponCodeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "loginInfo"), net.virtuemart.www.VM_Tools.LoginInfo.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "CouponArray"));
        oper.setReturnClass(net.virtuemart.www.VM_Order.Coupon[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "GetAllCouponCodeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddCouponCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "AddCouponCodeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "AddCouponInput"), net.virtuemart.www.VM_Order.AddCouponInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "AddCouponCodeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteCouponCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "DeleteCouponCodeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "DelInput"), net.virtuemart.www.VM_Order.DelInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "DeleteCouponCodeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAllShippingRate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "GetAllShippingRateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "loginInfo"), net.virtuemart.www.VM_Tools.LoginInfo.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "ShippingRateArray"));
        oper.setReturnClass(net.virtuemart.www.VM_Order.ShippingRate[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "GetAllShippingRateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAllShippingCarrier");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "GetAllShippingCarrierRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "loginInfo"), net.virtuemart.www.VM_Tools.LoginInfo.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "ShippingCarrierArray"));
        oper.setReturnClass(net.virtuemart.www.VM_Order.ShippingCarrier[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "GetAllShippingCarrierResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddShippingRate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "AddShippingRateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "AddShippingRatesInput"), net.virtuemart.www.VM_Order.AddShippingRatesInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "AddShippingRateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddShippingCarrier");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "AddShippingCarrierRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "AddShippingCarriersInput"), net.virtuemart.www.VM_Order.AddShippingCarriersInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "AddShippingCarrierResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteShippingRate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "DeleteShippingRateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "DelInput"), net.virtuemart.www.VM_Order.DelInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "DeleteShippingRateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteShippingCarrier");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "DeleteShippingCarrierRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "DelInput"), net.virtuemart.www.VM_Order.DelInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "DeleteShippingCarrierResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAllPaymentMethod");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "GetAllPaymentMethodRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "GetPaymentMethodInput"), net.virtuemart.www.VM_Order.GetPaymentMethodInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "PaymentMethodArray"));
        oper.setReturnClass(net.virtuemart.www.VM_Order.PaymentMethod[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "GetAllPaymentMethodResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddPaymentMethod");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "AddPaymentMethodRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "AddPaymentMethodInput"), net.virtuemart.www.VM_Order.AddPaymentMethodInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "AddPaymentMethodResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdatePaymentMethod");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "UpdatePaymentMethodRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "AddPaymentMethodInput"), net.virtuemart.www.VM_Order.AddPaymentMethodInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "UpdatePaymentMethodResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeletePaymentMethod");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "DeletePaymentMethodRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "DelInput"), net.virtuemart.www.VM_Order.DelInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "DeletePaymentMethodResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetOrderFromDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "GetOrderFromDateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "GetOrderFromDateInput"), net.virtuemart.www.VM_Order.GetOrderFromDateInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "OrderArray"));
        oper.setReturnClass(net.virtuemart.www.VM_Order.Order[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "GetOrderFromDateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAllCreditCard");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "GetAllCreditCardRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "loginInfo"), net.virtuemart.www.VM_Tools.LoginInfo.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "CreditcardArray"));
        oper.setReturnClass(net.virtuemart.www.VM_Order.Creditcard[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "GetAllCreditCardResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddCreditCard");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "AddCreditCardRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "AddCreditCardInput"), net.virtuemart.www.VM_Order.AddCreditCardInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "CreditcardArray"));
        oper.setReturnClass(net.virtuemart.www.VM_Order.Creditcard[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "AddCreditCardResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateCreditCard");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "UpdateCreditCardRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "AddCreditCardInput"), net.virtuemart.www.VM_Order.AddCreditCardInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "CreditcardArray"));
        oper.setReturnClass(net.virtuemart.www.VM_Order.Creditcard[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "UpdateCreditCardResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteCreditCard");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "DeleteCreditCardRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "DelCreditCardInput"), net.virtuemart.www.VM_Order.DelCreditCardInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "DeleteCreditCardResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddOrderStatusCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "AddOrderStatusCodeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "AddStatusInput"), net.virtuemart.www.VM_Order.AddStatusInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "AddOrderStatusCodeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateOrderStatusCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "UpdateOrderStatusCodeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "AddStatusInput"), net.virtuemart.www.VM_Order.AddStatusInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "UpdateOrderStatusCodeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteOrderStatusCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "DeleteOrderStatusCodeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "DeleteStatusInput"), net.virtuemart.www.VM_Order.DeleteStatusInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "DeleteOrderStatusCodeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateShippingCarrier");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "UpdateShippingCarrierRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "AddShippingCarriersInput"), net.virtuemart.www.VM_Order.AddShippingCarriersInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "UpdateShippingCarrierResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateShippingRate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "UpdateShippingRateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "AddShippingRatesInput"), net.virtuemart.www.VM_Order.AddShippingRatesInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "UpdateShippingRateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    public VM_OrderSOAPStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public VM_OrderSOAPStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public VM_OrderSOAPStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "AddCouponInput");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.AddCouponInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "AddCreditCardInput");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.AddCreditCardInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "AddPaymentMethodInput");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.AddPaymentMethodInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "AddShippingCarriersInput");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.AddShippingCarriersInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "AddShippingRatesInput");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.AddShippingRatesInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "AddStatusInput");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.AddStatusInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "AllOrderRequest");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.AllOrderRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "Coupon");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.Coupon.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "CouponArray");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.Coupon[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "Coupon");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "coupons");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.Coupon[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "Coupon");
            qName2 = new javax.xml.namespace.QName("", "coupon");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "CreateOrderInput");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.CreateOrderInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "Creditcard");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.Creditcard.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "CreditcardArray");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.Creditcard[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "Creditcard");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "DelCreditCardInput");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.DelCreditCardInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "DeleteOrderInput");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.DeleteOrderInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "DeleteStatusInput");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.DeleteStatusInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "DelInput");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.DelInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "GetOrderFromDateInput");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.GetOrderFromDateInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "GetPaymentMethodInput");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.GetPaymentMethodInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "ids");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "id");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "loginInfo");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Tools.LoginInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "Order");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.Order.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "OrderArray");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.Order[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "Order");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "OrderRequest");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.OrderRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "OrderRequestWithStatus");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.OrderRequestWithStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "OrderStatus");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.OrderStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "PaymentMethod");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.PaymentMethod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "PaymentMethodArray");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.PaymentMethod[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "PaymentMethod");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "product");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.Product.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "products");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.Product[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "product");
            qName2 = new javax.xml.namespace.QName("", "product");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "returnOutput");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.ReturnOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "shipping_carriers");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.ShippingCarrier[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "ShippingCarrier");
            qName2 = new javax.xml.namespace.QName("", "shipping_carrier");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "shipping_rates");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.ShippingRate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "ShippingRate");
            qName2 = new javax.xml.namespace.QName("", "shippingrate");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "ShippingCarrier");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.ShippingCarrier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "ShippingCarrierArray");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.ShippingCarrier[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "ShippingCarrier");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "ShippingRate");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.ShippingRate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "ShippingRateArray");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.ShippingRate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "ShippingRate");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "StatusArray");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.OrderStatus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "OrderStatus");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "UpdateOrderStatusInput");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.UpdateOrderStatusInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "UpdateOrderStatusParam");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.UpdateOrderStatusParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "UpdateOrderStatusParams");
            cachedSerQNames.add(qName);
            cls = net.virtuemart.www.VM_Order.UpdateOrderStatusParam[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.virtuemart.net/VM_Order/", "UpdateOrderStatusParam");
            qName2 = new javax.xml.namespace.QName("", "UpdateOrderStatusParam");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

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

    public net.virtuemart.www.VM_Order.Order getOrder(net.virtuemart.www.VM_Order.OrderRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Order/getOrder");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.virtuemart.www.VM_Order.Order) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.virtuemart.www.VM_Order.Order) org.apache.axis.utils.JavaUtils.convert(_resp, net.virtuemart.www.VM_Order.Order.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.virtuemart.www.VM_Order.Order[] getOrdersFromStatus(net.virtuemart.www.VM_Order.OrderRequestWithStatus parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Order/getOrdersFromStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getOrdersFromStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.virtuemart.www.VM_Order.Order[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.virtuemart.www.VM_Order.Order[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.virtuemart.www.VM_Order.Order[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.virtuemart.www.VM_Order.OrderStatus[] getOrderStatus(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Order/getOrderStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getOrderStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.virtuemart.www.VM_Order.OrderStatus[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.virtuemart.www.VM_Order.OrderStatus[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.virtuemart.www.VM_Order.OrderStatus[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.virtuemart.www.VM_Order.Order[] getAllOrders(net.virtuemart.www.VM_Order.AllOrderRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Order/getAllOrders");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getAllOrders"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.virtuemart.www.VM_Order.Order[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.virtuemart.www.VM_Order.Order[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.virtuemart.www.VM_Order.Order[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String updateOrderStatus(net.virtuemart.www.VM_Order.UpdateOrderStatusInput parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Order/UpdateOrderStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateOrderStatus"));

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

    public java.lang.String deleteOrder(net.virtuemart.www.VM_Order.DeleteOrderInput parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Order/DeleteOrder");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteOrder"));

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

    public net.virtuemart.www.VM_Order.ReturnOutput createOrder(net.virtuemart.www.VM_Order.CreateOrderInput parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Order/CreateOrder");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.virtuemart.www.VM_Order.ReturnOutput) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.virtuemart.www.VM_Order.ReturnOutput) org.apache.axis.utils.JavaUtils.convert(_resp, net.virtuemart.www.VM_Order.ReturnOutput.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.virtuemart.www.VM_Order.Coupon[] getAllCouponCode(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Order/GetAllCouponCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAllCouponCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.virtuemart.www.VM_Order.Coupon[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.virtuemart.www.VM_Order.Coupon[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.virtuemart.www.VM_Order.Coupon[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String addCouponCode(net.virtuemart.www.VM_Order.AddCouponInput parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Order/AddCouponCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AddCouponCode"));

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

    public java.lang.String deleteCouponCode(net.virtuemart.www.VM_Order.DelInput parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Order/DeleteCouponCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteCouponCode"));

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

    public net.virtuemart.www.VM_Order.ShippingRate[] getAllShippingRate(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Order/GetAllShippingRate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAllShippingRate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.virtuemart.www.VM_Order.ShippingRate[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.virtuemart.www.VM_Order.ShippingRate[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.virtuemart.www.VM_Order.ShippingRate[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.virtuemart.www.VM_Order.ShippingCarrier[] getAllShippingCarrier(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Order/GetAllShippingCarrier");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAllShippingCarrier"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.virtuemart.www.VM_Order.ShippingCarrier[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.virtuemart.www.VM_Order.ShippingCarrier[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.virtuemart.www.VM_Order.ShippingCarrier[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String addShippingRate(net.virtuemart.www.VM_Order.AddShippingRatesInput parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Order/AddShippingRate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AddShippingRate"));

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

    public java.lang.String addShippingCarrier(net.virtuemart.www.VM_Order.AddShippingCarriersInput parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Order/AddShippingRate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AddShippingCarrier"));

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

    public java.lang.String deleteShippingRate(net.virtuemart.www.VM_Order.DelInput parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Order/DeleteShippingRate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteShippingRate"));

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

    public java.lang.String deleteShippingCarrier(net.virtuemart.www.VM_Order.DelInput parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Order/DeleteShippingCarrier");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteShippingCarrier"));

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

    public net.virtuemart.www.VM_Order.PaymentMethod[] getAllPaymentMethod(net.virtuemart.www.VM_Order.GetPaymentMethodInput parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Order/GetAllPaymentMethod");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAllPaymentMethod"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.virtuemart.www.VM_Order.PaymentMethod[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.virtuemart.www.VM_Order.PaymentMethod[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.virtuemart.www.VM_Order.PaymentMethod[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String addPaymentMethod(net.virtuemart.www.VM_Order.AddPaymentMethodInput parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Order/AddPaymentMethod");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AddPaymentMethod"));

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

    public java.lang.String updatePaymentMethod(net.virtuemart.www.VM_Order.AddPaymentMethodInput parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Order/UpdatePaymentMethod");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdatePaymentMethod"));

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

    public java.lang.String deletePaymentMethod(net.virtuemart.www.VM_Order.DelInput parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Order/DeletePaymentMethod");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeletePaymentMethod"));

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

    public net.virtuemart.www.VM_Order.Order[] getOrderFromDate(net.virtuemart.www.VM_Order.GetOrderFromDateInput parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Order/GetOrderFromDate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetOrderFromDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.virtuemart.www.VM_Order.Order[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.virtuemart.www.VM_Order.Order[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.virtuemart.www.VM_Order.Order[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.virtuemart.www.VM_Order.Creditcard[] getAllCreditCard(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Order/GetAllCreditCard");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAllCreditCard"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.virtuemart.www.VM_Order.Creditcard[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.virtuemart.www.VM_Order.Creditcard[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.virtuemart.www.VM_Order.Creditcard[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.virtuemart.www.VM_Order.Creditcard[] addCreditCard(net.virtuemart.www.VM_Order.AddCreditCardInput parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Order/AddCreditCard");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AddCreditCard"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.virtuemart.www.VM_Order.Creditcard[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.virtuemart.www.VM_Order.Creditcard[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.virtuemart.www.VM_Order.Creditcard[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public net.virtuemart.www.VM_Order.Creditcard[] updateCreditCard(net.virtuemart.www.VM_Order.AddCreditCardInput parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Order/UpdateCreditCard");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateCreditCard"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (net.virtuemart.www.VM_Order.Creditcard[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (net.virtuemart.www.VM_Order.Creditcard[]) org.apache.axis.utils.JavaUtils.convert(_resp, net.virtuemart.www.VM_Order.Creditcard[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String deleteCreditCard(net.virtuemart.www.VM_Order.DelCreditCardInput parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Order/DeleteCreditCard");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteCreditCard"));

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

    public java.lang.String addOrderStatusCode(net.virtuemart.www.VM_Order.AddStatusInput parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Order/AddOrderStatusCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AddOrderStatusCode"));

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

    public java.lang.String updateOrderStatusCode(net.virtuemart.www.VM_Order.AddStatusInput parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Order/UpdateOrderStatusCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateOrderStatusCode"));

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

    public java.lang.String deleteOrderStatusCode(net.virtuemart.www.VM_Order.DeleteStatusInput parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Order/DeleteOrderStatusCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteOrderStatusCode"));

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

    public java.lang.String updateShippingCarrier(net.virtuemart.www.VM_Order.AddShippingCarriersInput parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Order/UpdateShippingCarrier");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateShippingCarrier"));

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

    public java.lang.String updateShippingRate(net.virtuemart.www.VM_Order.AddShippingRatesInput parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.virtuemart.net/VM_Order/UpdateShippingRate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateShippingRate"));

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

}
