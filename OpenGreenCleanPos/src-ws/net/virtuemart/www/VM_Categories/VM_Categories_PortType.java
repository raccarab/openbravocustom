/**
 * VM_Categories_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Categories;

public interface VM_Categories_PortType extends java.rmi.Remote {
    public net.virtuemart.www.VM_Categories.Categorie[] getAllCategories(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException;
    public net.virtuemart.www.VM_Categories.Categorie[] getChildsCategories(net.virtuemart.www.VM_Categories.GetChildsCategoriesRequestInput parameters) throws java.rmi.RemoteException;
    public java.lang.String addCategory(net.virtuemart.www.VM_Categories.AddCategoryInput parameters) throws java.rmi.RemoteException;
    public java.lang.String deleteCategory(net.virtuemart.www.VM_Categories.DeleteCategoryInput parameters) throws java.rmi.RemoteException;
    public net.virtuemart.www.VM_Categories.AvalaibleImage[] getAvailableImages(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException;
    public java.lang.String updateCategory(net.virtuemart.www.VM_Categories.AddCategoryInput parameters) throws java.rmi.RemoteException;
}
