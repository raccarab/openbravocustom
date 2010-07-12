package net.virtuemart.www.VM_Users;

public class VM_UsersProxy implements net.virtuemart.www.VM_Users.VM_Users_PortType {
  private String _endpoint = null;
  private net.virtuemart.www.VM_Users.VM_Users_PortType vM_Users_PortType = null;
  
  public VM_UsersProxy() {
    _initVM_UsersProxy();
  }
  
  public VM_UsersProxy(String endpoint) {
    _endpoint = endpoint;
    _initVM_UsersProxy();
  }
  
  private void _initVM_UsersProxy() {
    try {
      vM_Users_PortType = (new net.virtuemart.www.VM_Users.VM_Users_ServiceLocator()).getVM_UsersSOAP();
      if (vM_Users_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)vM_Users_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)vM_Users_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (vM_Users_PortType != null)
      ((javax.xml.rpc.Stub)vM_Users_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public net.virtuemart.www.VM_Users.VM_Users_PortType getVM_Users_PortType() {
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType;
  }
  
  public net.virtuemart.www.VM_Users.User[] getUsers(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.getUsers(parameters);
  }
  
  public java.lang.String authentification(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.authentification(parameters);
  }
  
  public java.lang.String addUser(net.virtuemart.www.VM_Users.AddUserInput parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.addUser(parameters);
  }
  
  public java.lang.String deleteUser(net.virtuemart.www.VM_Users.DeleteUserInput parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.deleteUser(parameters);
  }
  
  public java.lang.String sendMail(net.virtuemart.www.VM_Users.SendMailInput parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.sendMail(parameters);
  }
  
  public net.virtuemart.www.VM_Users.User getUserFromEmailOrUsername(net.virtuemart.www.VM_Users.GetUserFromEmailOrUsernameInput parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.getUserFromEmailOrUsername(parameters);
  }
  
  public net.virtuemart.www.VM_Users.Country[] getAllCountryCode(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.getAllCountryCode(parameters);
  }
  
  public net.virtuemart.www.VM_Users.AuthGroup[] getAuthGroup(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.getAuthGroup(parameters);
  }
  
  public java.lang.String addAuthGroup(net.virtuemart.www.VM_Users.AddAuthGroupInput parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.addAuthGroup(parameters);
  }
  
  public java.lang.String deleteAuthGroup(net.virtuemart.www.VM_Users.DelAuthGroupInput parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.deleteAuthGroup(parameters);
  }
  
  public net.virtuemart.www.VM_Users.State[] getAllStates(net.virtuemart.www.VM_Users.GetStatesInput parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.getAllStates(parameters);
  }
  
  public java.lang.String addStates(net.virtuemart.www.VM_Users.AddStatesInput parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.addStates(parameters);
  }
  
  public java.lang.String deleteStates(net.virtuemart.www.VM_Users.DelInput parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.deleteStates(parameters);
  }
  
  public net.virtuemart.www.VM_Users.ShopperGroup[] getShopperGroup(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.getShopperGroup(parameters);
  }
  
  public java.lang.String addShopperGroup(net.virtuemart.www.VM_Users.AddShopperGroupsInput parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.addShopperGroup(parameters);
  }
  
  public java.lang.String updateShopperGroup(net.virtuemart.www.VM_Users.AddShopperGroupsInput parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.updateShopperGroup(parameters);
  }
  
  public java.lang.String deleteShopperGroup(net.virtuemart.www.VM_Users.DelInput parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.deleteShopperGroup(parameters);
  }
  
  public java.lang.String updateUser(net.virtuemart.www.VM_Users.AddUserInput parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.updateUser(parameters);
  }
  
  public java.lang.String addVendor(net.virtuemart.www.VM_Users.AddVendorInput parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.addVendor(parameters);
  }
  
  public net.virtuemart.www.VM_Users.Vendor[] getAllVendor(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.getAllVendor(parameters);
  }
  
  public java.lang.String updateVendor(net.virtuemart.www.VM_Users.AddVendorInput parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.updateVendor(parameters);
  }
  
  public java.lang.String deleteVendor(net.virtuemart.www.VM_Users.DelInput parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.deleteVendor(parameters);
  }
  
  public net.virtuemart.www.VM_Users.VendorCategory[] getAllVendorCategory(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.getAllVendorCategory(parameters);
  }
  
  public java.lang.String updateVendorCategory(net.virtuemart.www.VM_Users.AddVendorCatInput parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.updateVendorCategory(parameters);
  }
  
  public java.lang.String addVendorCategory(net.virtuemart.www.VM_Users.AddVendorCatInput parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.addVendorCategory(parameters);
  }
  
  public java.lang.String deleteVendorCategory(net.virtuemart.www.VM_Users.DelInput parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.deleteVendorCategory(parameters);
  }
  
  public net.virtuemart.www.VM_Users.Manufacturer[] getAllManufacturer(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.getAllManufacturer(parameters);
  }
  
  public java.lang.String addManufacturer(net.virtuemart.www.VM_Users.AddManufacturerInput parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.addManufacturer(parameters);
  }
  
  public java.lang.String updateManufacturer(net.virtuemart.www.VM_Users.AddManufacturerInput parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.updateManufacturer(parameters);
  }
  
  public java.lang.String deleteManufacturer(net.virtuemart.www.VM_Users.DelInput parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.deleteManufacturer(parameters);
  }
  
  public net.virtuemart.www.VM_Users.ManufacturerCat[] getAllManufacturerCat(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.getAllManufacturerCat(parameters);
  }
  
  public java.lang.String addManufacturerCat(net.virtuemart.www.VM_Users.AddManufacturerCatInput parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.addManufacturerCat(parameters);
  }
  
  public java.lang.String updateManufacturerCat(net.virtuemart.www.VM_Users.AddManufacturerCatInput parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.updateManufacturerCat(parameters);
  }
  
  public java.lang.String deleteManufacturerCat(net.virtuemart.www.VM_Users.DelInput parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.deleteManufacturerCat(parameters);
  }
  
  public net.virtuemart.www.VM_Users.AvalaibleImage[] getAvailableVendorImages(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException{
    if (vM_Users_PortType == null)
      _initVM_UsersProxy();
    return vM_Users_PortType.getAvailableVendorImages(parameters);
  }
  
  
}