/**
 * VM_Order_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Order;

public interface VM_Order_PortType extends java.rmi.Remote {
    public net.virtuemart.www.VM_Order.Order[] getAllOrders(net.virtuemart.www.VM_Order.AllOrderRequest parameters) throws java.rmi.RemoteException;
    public net.virtuemart.www.VM_Order.Order getOrder(net.virtuemart.www.VM_Order.OrderRequest parameters) throws java.rmi.RemoteException;
    public net.virtuemart.www.VM_Order.Order[] getOrdersFromStatus(net.virtuemart.www.VM_Order.OrderRequestWithStatus parameters) throws java.rmi.RemoteException;
    public net.virtuemart.www.VM_Order.OrderStatus[] getOrderStatus(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException;
    public java.lang.String updateOrderStatus(net.virtuemart.www.VM_Order.UpdateOrderStatusInput parameters) throws java.rmi.RemoteException;
    public java.lang.String deleteOrder(net.virtuemart.www.VM_Order.DeleteOrderInput parameters) throws java.rmi.RemoteException;
    public net.virtuemart.www.VM_Order.ReturnOutput createOrder(net.virtuemart.www.VM_Order.CreateOrderInput parameters) throws java.rmi.RemoteException;
    public net.virtuemart.www.VM_Order.Coupon[] getAllCouponCode(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException;
    public java.lang.String addCouponCode(net.virtuemart.www.VM_Order.AddCouponInput parameters) throws java.rmi.RemoteException;
    public java.lang.String deleteCouponCode(net.virtuemart.www.VM_Order.DelInput parameters) throws java.rmi.RemoteException;
    public net.virtuemart.www.VM_Order.ShippingRate[] getAllShippingRate(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException;
    public net.virtuemart.www.VM_Order.ShippingCarrier[] getAllShippingCarrier(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException;
    public java.lang.String addShippingRate(net.virtuemart.www.VM_Order.AddShippingRatesInput parameters) throws java.rmi.RemoteException;
    public java.lang.String addShippingCarrier(net.virtuemart.www.VM_Order.AddShippingCarriersInput parameters) throws java.rmi.RemoteException;
    public java.lang.String deleteShippingRate(net.virtuemart.www.VM_Order.DelInput parameters) throws java.rmi.RemoteException;
    public java.lang.String deleteShippingCarrier(net.virtuemart.www.VM_Order.DelInput parameters) throws java.rmi.RemoteException;
    public net.virtuemart.www.VM_Order.PaymentMethod[] getAllPaymentMethod(net.virtuemart.www.VM_Order.GetPaymentMethodInput parameters) throws java.rmi.RemoteException;
    public java.lang.String addPaymentMethod(net.virtuemart.www.VM_Order.AddPaymentMethodInput parameters) throws java.rmi.RemoteException;
    public java.lang.String updatePaymentMethod(net.virtuemart.www.VM_Order.AddPaymentMethodInput parameters) throws java.rmi.RemoteException;
    public java.lang.String deletePaymentMethod(net.virtuemart.www.VM_Order.DelInput parameters) throws java.rmi.RemoteException;
    public net.virtuemart.www.VM_Order.Order[] getOrderFromDate(net.virtuemart.www.VM_Order.GetOrderFromDateInput parameters) throws java.rmi.RemoteException;
    public net.virtuemart.www.VM_Order.Creditcard[] getAllCreditCard(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException;
    public net.virtuemart.www.VM_Order.Creditcard[] addCreditCard(net.virtuemart.www.VM_Order.AddCreditCardInput parameters) throws java.rmi.RemoteException;
    public net.virtuemart.www.VM_Order.Creditcard[] updateCreditCard(net.virtuemart.www.VM_Order.AddCreditCardInput parameters) throws java.rmi.RemoteException;
    public java.lang.String deleteCreditCard(net.virtuemart.www.VM_Order.DelCreditCardInput parameters) throws java.rmi.RemoteException;
    public java.lang.String addOrderStatusCode(net.virtuemart.www.VM_Order.AddStatusInput parameters) throws java.rmi.RemoteException;
    public java.lang.String updateOrderStatusCode(net.virtuemart.www.VM_Order.AddStatusInput parameters) throws java.rmi.RemoteException;
    public java.lang.String deleteOrderStatusCode(net.virtuemart.www.VM_Order.DeleteStatusInput parameters) throws java.rmi.RemoteException;
    public java.lang.String updateShippingCarrier(net.virtuemart.www.VM_Order.AddShippingCarriersInput parameters) throws java.rmi.RemoteException;
    public java.lang.String updateShippingRate(net.virtuemart.www.VM_Order.AddShippingRatesInput parameters) throws java.rmi.RemoteException;
}
