package net.virtuemart.www.VM_Categories;

public class VM_CategoriesProxy implements net.virtuemart.www.VM_Categories.VM_Categories_PortType {
  private String _endpoint = null;
  private net.virtuemart.www.VM_Categories.VM_Categories_PortType vM_Categories_PortType = null;
  
  public VM_CategoriesProxy() {
    _initVM_CategoriesProxy();
  }
  
  public VM_CategoriesProxy(String endpoint) {
    _endpoint = endpoint;
    _initVM_CategoriesProxy();
  }
  
  private void _initVM_CategoriesProxy() {
    try {
      vM_Categories_PortType = (new net.virtuemart.www.VM_Categories.VM_Categories_ServiceLocator()).getVM_CategoriesSOAP();
      if (vM_Categories_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)vM_Categories_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)vM_Categories_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (vM_Categories_PortType != null)
      ((javax.xml.rpc.Stub)vM_Categories_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public net.virtuemart.www.VM_Categories.VM_Categories_PortType getVM_Categories_PortType() {
    if (vM_Categories_PortType == null)
      _initVM_CategoriesProxy();
    return vM_Categories_PortType;
  }
  
  public net.virtuemart.www.VM_Categories.Categorie[] getAllCategories(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException{
    if (vM_Categories_PortType == null)
      _initVM_CategoriesProxy();
    return vM_Categories_PortType.getAllCategories(parameters);
  }
  
  public net.virtuemart.www.VM_Categories.Categorie[] getChildsCategories(net.virtuemart.www.VM_Categories.GetChildsCategoriesRequestInput parameters) throws java.rmi.RemoteException{
    if (vM_Categories_PortType == null)
      _initVM_CategoriesProxy();
    return vM_Categories_PortType.getChildsCategories(parameters);
  }
  
  public java.lang.String addCategory(net.virtuemart.www.VM_Categories.AddCategoryInput parameters) throws java.rmi.RemoteException{
    if (vM_Categories_PortType == null)
      _initVM_CategoriesProxy();
    return vM_Categories_PortType.addCategory(parameters);
  }
  
  public java.lang.String deleteCategory(net.virtuemart.www.VM_Categories.DeleteCategoryInput parameters) throws java.rmi.RemoteException{
    if (vM_Categories_PortType == null)
      _initVM_CategoriesProxy();
    return vM_Categories_PortType.deleteCategory(parameters);
  }
  
  public net.virtuemart.www.VM_Categories.AvalaibleImage[] getAvailableImages(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException{
    if (vM_Categories_PortType == null)
      _initVM_CategoriesProxy();
    return vM_Categories_PortType.getAvailableImages(parameters);
  }
  
  public java.lang.String updateCategory(net.virtuemart.www.VM_Categories.AddCategoryInput parameters) throws java.rmi.RemoteException{
    if (vM_Categories_PortType == null)
      _initVM_CategoriesProxy();
    return vM_Categories_PortType.updateCategory(parameters);
  }
  
  
}