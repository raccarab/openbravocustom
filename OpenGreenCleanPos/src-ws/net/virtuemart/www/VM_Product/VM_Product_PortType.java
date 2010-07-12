/**
 * VM_Product_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.virtuemart.www.VM_Product;

public interface VM_Product_PortType extends java.rmi.Remote {
    public net.virtuemart.www.VM_Product.Produit[] getProductsFromCategory(net.virtuemart.www.VM_Product.ProductFromCatIdInput parameters) throws java.rmi.RemoteException;
    public net.virtuemart.www.VM_Product.Produit[] getChildsProduct(net.virtuemart.www.VM_Product.ProductFromIdInput parameters) throws java.rmi.RemoteException;
    public net.virtuemart.www.VM_Product.Produit getProductFromId(net.virtuemart.www.VM_Product.ProductFromIdInput parameters) throws java.rmi.RemoteException;
    public java.lang.String updateProduct(net.virtuemart.www.VM_Product.UpdateProductInput parameters) throws java.rmi.RemoteException;
    public net.virtuemart.www.VM_Product.OrderItemInfo[] getProductsFromOrderId(net.virtuemart.www.VM_Product.ProductsFromOrderIdInput parameters) throws java.rmi.RemoteException;
    public java.lang.String addProduct(net.virtuemart.www.VM_Product.UpdateProductInput parameters) throws java.rmi.RemoteException;
    public java.lang.String deleteProduct(net.virtuemart.www.VM_Product.ProductFromIdInput parameters) throws java.rmi.RemoteException;
    public net.virtuemart.www.VM_Product.Currency[] getAllCurrency(net.virtuemart.www.VM_Product.GetAllCurrencyInput parameters) throws java.rmi.RemoteException;
    public net.virtuemart.www.VM_Product.Tax[] getAllTax(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException;
    public java.lang.String addTax(net.virtuemart.www.VM_Product.TaxesInput parameters) throws java.rmi.RemoteException;
    public java.lang.String updateTax(net.virtuemart.www.VM_Product.TaxesInput parameters) throws java.rmi.RemoteException;
    public java.lang.String deleteTax(net.virtuemart.www.VM_Product.DelInput parameters) throws java.rmi.RemoteException;
    public net.virtuemart.www.VM_Product.Produit[] getAllProducts(net.virtuemart.www.VM_Product.GetAllProductsInput parameters) throws java.rmi.RemoteException;
    public net.virtuemart.www.VM_Product.AvalaibleImage[] getAvailableImages(net.virtuemart.www.VM_Tools.LoginInfo parameters) throws java.rmi.RemoteException;
}
