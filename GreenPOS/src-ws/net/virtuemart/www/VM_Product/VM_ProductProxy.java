package net.virtuemart.www.VM_Product;

public class VM_ProductProxy implements net.virtuemart.www.VM_Product.VM_Product_PortType {
  private String _endpoint = null;
  private net.virtuemart.www.VM_Product.VM_Product_PortType vM_Product_PortType = null;
  
  public VM_ProductProxy() {
    _initVM_ProductProxy();
  }
  
  public VM_ProductProxy(String endpoint) {
    _endpoint = endpoint;
    _initVM_ProductProxy();
  }
  
  private void _initVM_ProductProxy() {
    try {
      vM_Product_PortType = (new net.virtuemart.www.VM_Product.VM_Product_ServiceLocator()).getVM_ProductSOAP();
      if (vM_Product_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)vM_Product_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)vM_Product_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (vM_Product_PortType != null)
      ((javax.xml.rpc.Stub)vM_Product_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public net.virtuemart.www.VM_Product.VM_Product_PortType getVM_Product_PortType() {
    if (vM_Product_PortType == null)
      _initVM_ProductProxy();
    return vM_Product_PortType;
  }
  
  public net.virtuemart.www.VM_Product.Produit[] getProductsFromCategory(net.virtuemart.www.VM_Product.ProductFromCatIdInput parameters) throws java.rmi.RemoteException{
    if (vM_Product_PortType == null)
      _initVM_ProductProxy();
    return vM_Product_PortType.getProductsFromCategory(parameters);
  }
  
  public net.virtuemart.www.VM_Product.Produit[] getChildsProduct(net.virtuemart.www.VM_Product.ProductFromIdInput parameters) throws java.rmi.RemoteException{
    if (vM_Product_PortType == null)
      _initVM_ProductProxy();
    return vM_Product_PortType.getChildsProduct(parameters);
  }
  
  public net.virtuemart.www.VM_Product.Produit getProductFromId(net.virtuemart.www.VM_Product.ProductFromIdInput parameters) throws java.rmi.RemoteException{
    if (vM_Product_PortType == null)
      _initVM_ProductProxy();
    return vM_Product_PortType.getProductFromId(parameters);
  }
  
  public java.lang.String updateProduct(net.virtuemart.www.VM_Product.UpdateProductInput parameters) throws java.rmi.RemoteException{
    if (vM_Product_PortType == null)
      _initVM_ProductProxy();
    return vM_Product_PortType.updateProduct(parameters);
  }
  
  public net.virtuemart.www.VM_Product.OrderItemInfo[] getProductsFromOrderId(net.virtuemart.www.VM_Product.ProductsFromOrderIdInput parameters) throws java.rmi.RemoteException{
    if (vM_Product_PortType == null)
      _initVM_ProductProxy();
    return vM_Product_PortType.getProductsFromOrderId(parameters);
  }
  
  public java.lang.String addProduct(net.virtuemart.www.VM_Product.UpdateProductInput parameters) throws java.rmi.RemoteException{
    if (vM_Product_PortType == null)
      _initVM_ProductProxy();
    return vM_Product_PortType.addProduct(parameters);
  }
  
  public java.lang.String deleteProduct(net.virtuemart.www.VM_Product.ProductFromIdInput parameters) throws java.rmi.RemoteException{
    if (vM_Product_PortType == null)
      _initVM_ProductProxy();
    return vM_Product_PortType.deleteProduct(parameters);
  }
  
  public net.virtuemart.www.VM_Product.Currency[] getAllCurrency(net.virtuemart.www.VM_Product.GetAllCurrencyInput parameters) throws java.rmi.RemoteException{
    if (vM_Product_PortType == null)
      _initVM_ProductProxy();
    return vM_Product_PortType.getAllCurrency(parameters);
  }
  
  public net.virtuemart.www.VM_Product.Tax[] getAllTax(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException{
    if (vM_Product_PortType == null)
      _initVM_ProductProxy();
    return vM_Product_PortType.getAllTax(parameters);
  }
  
  public java.lang.String addTax(net.virtuemart.www.VM_Product.TaxesInput parameters) throws java.rmi.RemoteException{
    if (vM_Product_PortType == null)
      _initVM_ProductProxy();
    return vM_Product_PortType.addTax(parameters);
  }
  
  public java.lang.String updateTax(net.virtuemart.www.VM_Product.TaxesInput parameters) throws java.rmi.RemoteException{
    if (vM_Product_PortType == null)
      _initVM_ProductProxy();
    return vM_Product_PortType.updateTax(parameters);
  }
  
  public java.lang.String deleteTax(net.virtuemart.www.VM_Product.DelInput parameters) throws java.rmi.RemoteException{
    if (vM_Product_PortType == null)
      _initVM_ProductProxy();
    return vM_Product_PortType.deleteTax(parameters);
  }
  
  public net.virtuemart.www.VM_Product.Produit[] getAllProducts(net.virtuemart.www.VM_Product.GetAllProductsInput parameters) throws java.rmi.RemoteException{
    if (vM_Product_PortType == null)
      _initVM_ProductProxy();
    return vM_Product_PortType.getAllProducts(parameters);
  }
  
  public net.virtuemart.www.VM_Product.AvalaibleImage[] getAvailableImages(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException{
    if (vM_Product_PortType == null)
      _initVM_ProductProxy();
    return vM_Product_PortType.getAvailableImages(parameters);
  }
  
  
}