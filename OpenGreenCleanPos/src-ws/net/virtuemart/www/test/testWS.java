package net.virtuemart.www.test;

import java.rmi.RemoteException;

import net.virtuemart.www.VM_Categories.GetChildsCategoriesRequestInput;
import net.virtuemart.www.VM_Categories.VM_CategoriesProxy;
import net.virtuemart.www.VM_Categories.Categorie;

import net.virtuemart.www.VM_Order.VM_OrderProxy;
import net.virtuemart.www.VM_Product.ProductFromCatIdInput;
import net.virtuemart.www.VM_Product.ProductFromIdInput;
import net.virtuemart.www.VM_Product.Produit;
import net.virtuemart.www.VM_Product.UpdateProductInput;
import net.virtuemart.www.VM_Product.VM_ProductProxy;
import net.virtuemart.www.VM_Tools.LoginInfo;
import net.virtuemart.www.VM_Users.AddUserInput;
import net.virtuemart.www.VM_Users.User;
import net.virtuemart.www.VM_Users.VM_UsersProxy;

public class testWS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LoginInfo login = new LoginInfo();
		login.setLogin("tii");
		login.setPassword("titoupass");
		
		
		/**
		 * Setting endpoints
		 */
		VM_CategoriesProxy cp = new VM_CategoriesProxy();
		cp.setEndpoint("http://beyours.be/greenpos/administrator/components/com_vm_soa/services/VM_CategoriesService.php");

		VM_ProductProxy pp = new VM_ProductProxy();
		pp.setEndpoint("http://beyours.be/greenpos/administrator/components/com_vm_soa/services/VM_ProductService.php");

		VM_UsersProxy up = new VM_UsersProxy();
		up.setEndpoint("http://beyours.be/greenpos/administrator/components/com_vm_soa/services/VM_UsersService.php");
	
		VM_OrderProxy op = new VM_OrderProxy();
		up.setEndpoint("http://beyours.be/greenpos/administrator/components/com_vm_soa/services/VM_UsersService.php");
	
		
	
//		GetChildsCategoriesRequestInput parent = new GetChildsCategoriesRequestInput(login,"3");
	
		
		try {
			ProductFromCatIdInput pfci = new ProductFromCatIdInput(login,"4");
			
			//Produit pAdd = new Produit("name", "1", "1", "0","description"," bigdescription", "image", "fullimage", "id", "quantity","", "", "", "", "","1", "1");
			//
			Produit pAdd = new Produit();
			pAdd.setId("1");
			pAdd.setName("name");
			pAdd.setPrice("1.0");
			pAdd.setDiscount("0.0");
			pAdd.setDiscount_is_percent("false");
			pAdd.setDescription("description");
			pAdd.setBigdescription("bigdescription");
			pAdd.setImage("");
			pAdd.setFullimage("");
			pAdd.setQuantity("0");
			pAdd.setParent_produit_id("");
			pAdd.setHas_childs("");
			pAdd.setChilds_id("");
			pAdd.setAtribute("");
			pAdd.setAtribute_value("");
			pAdd.setProduct_sku("1");
			pAdd.setProduct_publish("");
			
			//UpdateProductInput upi = new UpdateProductInput(login, pAdd);
 		//String r = pp.addProduct(upi);
 		
 		//System.out.println(r);
 		
//			ProductFromIdInput id = new ProductFromIdInput(login,"2");
//System.out.println("TEST getProductFromId");
//			Produit p1 = pp.getProductFromId(id);
//			
//			System.out.println(p1.getName()+" "+p1.getPrice()+" "+p1.getDescription()+" "+p1.getBigdescription());
//			
System.out.println("TEST getProductsFromCategory");
			Produit [] p = pp.getProductsFromCategory(pfci);
			
			for (Produit p1 : p) {
				System.out.println(p1.getName()+" "+p1.getPrice()+" "+p1.getDescription()+" "+p1.getBigdescription());
				
			}
			
System.out.println("TEST getAllCats");
			
			Categorie [] cat = cp.getAllCategories(login);
			
			for (Categorie categorie : cat) {
				System.out.println(categorie.getName());
			}
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
//		pp.getProductsFromCategory(parameters)
		
		System.out.println("TEST getUsers");

		
			
		try {
			System.out.println("TEST 1");
			
			User userAdd = new User();
			userAdd.setLogin("Testeur");
			userAdd.setId("23");
			userAdd.setFirstname("firstname");
			userAdd.setLastname("lastname");
			userAdd.setPassword("passssss");
			userAdd.setTitle("Mr");
			userAdd.setEmail("test@beyours.be");
			userAdd.setDescription("");
			userAdd.setAddress("address");
			userAdd.setAddress2("address2");

			userAdd.setState_region("address");
			userAdd.setCity("Brussels");
			userAdd.setCountry("Belgium");
			userAdd.setZipcode("1000");
			userAdd.setPhone("003223334455");
			userAdd.setMobile("0032477112233");
			userAdd.setFax("0032244455544");
		
			AddUserInput parameters = new AddUserInput(login, userAdd);
		
			//OK
			//String tmp = up.addUser(parameters);
			//System.out.println(tmp);
				
			
			User[] users = up.getUsers(login);			
			
			
			System.out.println("TEST 2");
			
			for (User user : users) {
				System.out.println(user.getLogin());
			}
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
