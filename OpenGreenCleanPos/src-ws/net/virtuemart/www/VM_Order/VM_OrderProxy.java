package net.virtuemart.www.VM_Order;

public class VM_OrderProxy implements net.virtuemart.www.VM_Order.VM_Order_PortType {
  private String _endpoint = null;
  private net.virtuemart.www.VM_Order.VM_Order_PortType vM_Order_PortType = null;
  
  public VM_OrderProxy() {
    _initVM_OrderProxy();
  }
  
  public VM_OrderProxy(String endpoint) {
    _endpoint = endpoint;
    _initVM_OrderProxy();
  }
  
  private void _initVM_OrderProxy() {
    try {
      vM_Order_PortType = (new net.virtuemart.www.VM_Order.VM_Order_ServiceLocator()).getVM_OrderSOAP();
      if (vM_Order_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)vM_Order_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)vM_Order_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (vM_Order_PortType != null)
      ((javax.xml.rpc.Stub)vM_Order_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public net.virtuemart.www.VM_Order.VM_Order_PortType getVM_Order_PortType() {
    if (vM_Order_PortType == null)
      _initVM_OrderProxy();
    return vM_Order_PortType;
  }
  
  public net.virtuemart.www.VM_Order.Order[] getAllOrders(net.virtuemart.www.VM_Order.AllOrderRequest parameters) throws java.rmi.RemoteException{
    if (vM_Order_PortType == null)
      _initVM_OrderProxy();
    return vM_Order_PortType.getAllOrders(parameters);
  }
  
  public net.virtuemart.www.VM_Order.Order getOrder(net.virtuemart.www.VM_Order.OrderRequest parameters) throws java.rmi.RemoteException{
    if (vM_Order_PortType == null)
      _initVM_OrderProxy();
    return vM_Order_PortType.getOrder(parameters);
  }
  
  public net.virtuemart.www.VM_Order.Order[] getOrdersFromStatus(net.virtuemart.www.VM_Order.OrderRequestWithStatus parameters) throws java.rmi.RemoteException{
    if (vM_Order_PortType == null)
      _initVM_OrderProxy();
    return vM_Order_PortType.getOrdersFromStatus(parameters);
  }
  
  public net.virtuemart.www.VM_Order.OrderStatus[] getOrderStatus(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException{
    if (vM_Order_PortType == null)
      _initVM_OrderProxy();
    return vM_Order_PortType.getOrderStatus(parameters);
  }
  
  public java.lang.String updateOrderStatus(net.virtuemart.www.VM_Order.UpdateOrderStatusInput parameters) throws java.rmi.RemoteException{
    if (vM_Order_PortType == null)
      _initVM_OrderProxy();
    return vM_Order_PortType.updateOrderStatus(parameters);
  }
  
  public java.lang.String deleteOrder(net.virtuemart.www.VM_Order.DeleteOrderInput parameters) throws java.rmi.RemoteException{
    if (vM_Order_PortType == null)
      _initVM_OrderProxy();
    return vM_Order_PortType.deleteOrder(parameters);
  }
  
  public net.virtuemart.www.VM_Order.ReturnOutput createOrder(net.virtuemart.www.VM_Order.CreateOrderInput parameters) throws java.rmi.RemoteException{
    if (vM_Order_PortType == null)
      _initVM_OrderProxy();
    return vM_Order_PortType.createOrder(parameters);
  }
  
  public net.virtuemart.www.VM_Order.Coupon[] getAllCouponCode(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException{
    if (vM_Order_PortType == null)
      _initVM_OrderProxy();
    return vM_Order_PortType.getAllCouponCode(parameters);
  }
  
  public java.lang.String addCouponCode(net.virtuemart.www.VM_Order.AddCouponInput parameters) throws java.rmi.RemoteException{
    if (vM_Order_PortType == null)
      _initVM_OrderProxy();
    return vM_Order_PortType.addCouponCode(parameters);
  }
  
  public java.lang.String deleteCouponCode(net.virtuemart.www.VM_Order.DelInput parameters) throws java.rmi.RemoteException{
    if (vM_Order_PortType == null)
      _initVM_OrderProxy();
    return vM_Order_PortType.deleteCouponCode(parameters);
  }
  
  public net.virtuemart.www.VM_Order.ShippingRate[] getAllShippingRate(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException{
    if (vM_Order_PortType == null)
      _initVM_OrderProxy();
    return vM_Order_PortType.getAllShippingRate(parameters);
  }
  
  public net.virtuemart.www.VM_Order.ShippingCarrier[] getAllShippingCarrier(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException{
    if (vM_Order_PortType == null)
      _initVM_OrderProxy();
    return vM_Order_PortType.getAllShippingCarrier(parameters);
  }
  
  public java.lang.String addShippingRate(net.virtuemart.www.VM_Order.AddShippingRatesInput parameters) throws java.rmi.RemoteException{
    if (vM_Order_PortType == null)
      _initVM_OrderProxy();
    return vM_Order_PortType.addShippingRate(parameters);
  }
  
  public java.lang.String addShippingCarrier(net.virtuemart.www.VM_Order.AddShippingCarriersInput parameters) throws java.rmi.RemoteException{
    if (vM_Order_PortType == null)
      _initVM_OrderProxy();
    return vM_Order_PortType.addShippingCarrier(parameters);
  }
  
  public java.lang.String deleteShippingRate(net.virtuemart.www.VM_Order.DelInput parameters) throws java.rmi.RemoteException{
    if (vM_Order_PortType == null)
      _initVM_OrderProxy();
    return vM_Order_PortType.deleteShippingRate(parameters);
  }
  
  public java.lang.String deleteShippingCarrier(net.virtuemart.www.VM_Order.DelInput parameters) throws java.rmi.RemoteException{
    if (vM_Order_PortType == null)
      _initVM_OrderProxy();
    return vM_Order_PortType.deleteShippingCarrier(parameters);
  }
  
  public net.virtuemart.www.VM_Order.PaymentMethod[] getAllPaymentMethod(net.virtuemart.www.VM_Order.GetPaymentMethodInput parameters) throws java.rmi.RemoteException{
    if (vM_Order_PortType == null)
      _initVM_OrderProxy();
    return vM_Order_PortType.getAllPaymentMethod(parameters);
  }
  
  public java.lang.String addPaymentMethod(net.virtuemart.www.VM_Order.AddPaymentMethodInput parameters) throws java.rmi.RemoteException{
    if (vM_Order_PortType == null)
      _initVM_OrderProxy();
    return vM_Order_PortType.addPaymentMethod(parameters);
  }
  
  public java.lang.String updatePaymentMethod(net.virtuemart.www.VM_Order.AddPaymentMethodInput parameters) throws java.rmi.RemoteException{
    if (vM_Order_PortType == null)
      _initVM_OrderProxy();
    return vM_Order_PortType.updatePaymentMethod(parameters);
  }
  
  public java.lang.String deletePaymentMethod(net.virtuemart.www.VM_Order.DelInput parameters) throws java.rmi.RemoteException{
    if (vM_Order_PortType == null)
      _initVM_OrderProxy();
    return vM_Order_PortType.deletePaymentMethod(parameters);
  }
  
  public net.virtuemart.www.VM_Order.Order[] getOrderFromDate(net.virtuemart.www.VM_Order.GetOrderFromDateInput parameters) throws java.rmi.RemoteException{
    if (vM_Order_PortType == null)
      _initVM_OrderProxy();
    return vM_Order_PortType.getOrderFromDate(parameters);
  }
  
  public net.virtuemart.www.VM_Order.Creditcard[] getAllCreditCard(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException{
    if (vM_Order_PortType == null)
      _initVM_OrderProxy();
    return vM_Order_PortType.getAllCreditCard(parameters);
  }
  
  public net.virtuemart.www.VM_Order.Creditcard[] addCreditCard(net.virtuemart.www.VM_Order.AddCreditCardInput parameters) throws java.rmi.RemoteException{
    if (vM_Order_PortType == null)
      _initVM_OrderProxy();
    return vM_Order_PortType.addCreditCard(parameters);
  }
  
  public net.virtuemart.www.VM_Order.Creditcard[] updateCreditCard(net.virtuemart.www.VM_Order.AddCreditCardInput parameters) throws java.rmi.RemoteException{
    if (vM_Order_PortType == null)
      _initVM_OrderProxy();
    return vM_Order_PortType.updateCreditCard(parameters);
  }
  
  public java.lang.String deleteCreditCard(net.virtuemart.www.VM_Order.DelCreditCardInput parameters) throws java.rmi.RemoteException{
    if (vM_Order_PortType == null)
      _initVM_OrderProxy();
    return vM_Order_PortType.deleteCreditCard(parameters);
  }
  
  public java.lang.String addOrderStatusCode(net.virtuemart.www.VM_Order.AddStatusInput parameters) throws java.rmi.RemoteException{
    if (vM_Order_PortType == null)
      _initVM_OrderProxy();
    return vM_Order_PortType.addOrderStatusCode(parameters);
  }
  
  public java.lang.String updateOrderStatusCode(net.virtuemart.www.VM_Order.AddStatusInput parameters) throws java.rmi.RemoteException{
    if (vM_Order_PortType == null)
      _initVM_OrderProxy();
    return vM_Order_PortType.updateOrderStatusCode(parameters);
  }
  
  public java.lang.String deleteOrderStatusCode(net.virtuemart.www.VM_Order.DeleteStatusInput parameters) throws java.rmi.RemoteException{
    if (vM_Order_PortType == null)
      _initVM_OrderProxy();
    return vM_Order_PortType.deleteOrderStatusCode(parameters);
  }
  
  public java.lang.String updateShippingCarrier(net.virtuemart.www.VM_Order.AddShippingCarriersInput parameters) throws java.rmi.RemoteException{
    if (vM_Order_PortType == null)
      _initVM_OrderProxy();
    return vM_Order_PortType.updateShippingCarrier(parameters);
  }
  
  public java.lang.String updateShippingRate(net.virtuemart.www.VM_Order.AddShippingRatesInput parameters) throws java.rmi.RemoteException{
    if (vM_Order_PortType == null)
      _initVM_OrderProxy();
    return vM_Order_PortType.updateShippingRate(parameters);
  }
  
  
}