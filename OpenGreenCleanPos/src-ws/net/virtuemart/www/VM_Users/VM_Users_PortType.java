/**
 * VM_Users_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Users;

public interface VM_Users_PortType extends java.rmi.Remote {
    public net.virtuemart.www.VM_Users.User[] getUsers(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException;
    public java.lang.String authentification(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException;
    public java.lang.String addUser(net.virtuemart.www.VM_Users.AddUserInput parameters) throws java.rmi.RemoteException;
    public java.lang.String deleteUser(net.virtuemart.www.VM_Users.DeleteUserInput parameters) throws java.rmi.RemoteException;
    public java.lang.String sendMail(net.virtuemart.www.VM_Users.SendMailInput parameters) throws java.rmi.RemoteException;
    public net.virtuemart.www.VM_Users.User getUserFromEmailOrUsername(net.virtuemart.www.VM_Users.GetUserFromEmailOrUsernameInput parameters) throws java.rmi.RemoteException;
    public net.virtuemart.www.VM_Users.Country[] getAllCountryCode(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException;
    public net.virtuemart.www.VM_Users.AuthGroup[] getAuthGroup(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException;
    public java.lang.String addAuthGroup(net.virtuemart.www.VM_Users.AddAuthGroupInput parameters) throws java.rmi.RemoteException;
    public java.lang.String deleteAuthGroup(net.virtuemart.www.VM_Users.DelAuthGroupInput parameters) throws java.rmi.RemoteException;
    public net.virtuemart.www.VM_Users.State[] getAllStates(net.virtuemart.www.VM_Users.GetStatesInput parameters) throws java.rmi.RemoteException;
    public java.lang.String addStates(net.virtuemart.www.VM_Users.AddStatesInput parameters) throws java.rmi.RemoteException;
    public java.lang.String deleteStates(net.virtuemart.www.VM_Users.DelInput parameters) throws java.rmi.RemoteException;
    public net.virtuemart.www.VM_Users.ShopperGroup[] getShopperGroup(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException;
    public java.lang.String addShopperGroup(net.virtuemart.www.VM_Users.AddShopperGroupsInput parameters) throws java.rmi.RemoteException;
    public java.lang.String updateShopperGroup(net.virtuemart.www.VM_Users.AddShopperGroupsInput parameters) throws java.rmi.RemoteException;
    public java.lang.String deleteShopperGroup(net.virtuemart.www.VM_Users.DelInput parameters) throws java.rmi.RemoteException;
    public java.lang.String updateUser(net.virtuemart.www.VM_Users.AddUserInput parameters) throws java.rmi.RemoteException;
    public java.lang.String addVendor(net.virtuemart.www.VM_Users.AddVendorInput parameters) throws java.rmi.RemoteException;
    public net.virtuemart.www.VM_Users.Vendor[] getAllVendor(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException;
    public java.lang.String updateVendor(net.virtuemart.www.VM_Users.AddVendorInput parameters) throws java.rmi.RemoteException;
    public java.lang.String deleteVendor(net.virtuemart.www.VM_Users.DelInput parameters) throws java.rmi.RemoteException;
    public net.virtuemart.www.VM_Users.VendorCategory[] getAllVendorCategory(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException;
    public java.lang.String updateVendorCategory(net.virtuemart.www.VM_Users.AddVendorCatInput parameters) throws java.rmi.RemoteException;
    public java.lang.String addVendorCategory(net.virtuemart.www.VM_Users.AddVendorCatInput parameters) throws java.rmi.RemoteException;
    public java.lang.String deleteVendorCategory(net.virtuemart.www.VM_Users.DelInput parameters) throws java.rmi.RemoteException;
    public net.virtuemart.www.VM_Users.Manufacturer[] getAllManufacturer(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException;
    public java.lang.String addManufacturer(net.virtuemart.www.VM_Users.AddManufacturerInput parameters) throws java.rmi.RemoteException;
    public java.lang.String updateManufacturer(net.virtuemart.www.VM_Users.AddManufacturerInput parameters) throws java.rmi.RemoteException;
    public java.lang.String deleteManufacturer(net.virtuemart.www.VM_Users.DelInput parameters) throws java.rmi.RemoteException;
    public net.virtuemart.www.VM_Users.ManufacturerCat[] getAllManufacturerCat(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException;
    public java.lang.String addManufacturerCat(net.virtuemart.www.VM_Users.AddManufacturerCatInput parameters) throws java.rmi.RemoteException;
    public java.lang.String updateManufacturerCat(net.virtuemart.www.VM_Users.AddManufacturerCatInput parameters) throws java.rmi.RemoteException;
    public java.lang.String deleteManufacturerCat(net.virtuemart.www.VM_Users.DelInput parameters) throws java.rmi.RemoteException;
    public net.virtuemart.www.VM_Users.AvalaibleImage[] getAvailableVendorImages(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException;
}
