package net.virtuemart.www.test;

import com.openbravo.basic.BasicException;
import com.openbravo.pos.forms.AppConfig;
import com.openbravo.pos.forms.DataLogicSales;

import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import net.virtuemart.www.VM_Categories.AddCategoryInput;
import net.virtuemart.www.VM_Categories.GetChildsCategoriesRequestInput;
import net.virtuemart.www.VM_Categories.VM_CategoriesProxy;
import net.virtuemart.www.VM_Categories.Categorie;

import net.virtuemart.www.VM_Order.AddShippingCarriersInput;
import net.virtuemart.www.VM_Order.VM_OrderProxy;
import net.virtuemart.www.VM_Product.ProductFromCatIdInput;
import net.virtuemart.www.VM_Product.ProductFromIdInput;
import net.virtuemart.www.VM_Product.Produit;
import net.virtuemart.www.VM_Product.UpdateProductInput;
import net.virtuemart.www.VM_Product.VM_ProductProxy;
import net.virtuemart.www.VM_SQLQueries.SQLInsertRequest;
import net.virtuemart.www.VM_SQLQueries.VM_SQLQueriesProxy;
import net.virtuemart.www.VM_Tools.LoginInfo;
import net.virtuemart.www.VM_Users.AddUserInput;
import net.virtuemart.www.VM_Users.User;
import net.virtuemart.www.VM_Users.VM_UsersProxy;

public class testWS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmss");
		String tmpstring = sdf.format(new Date());
		long exp =(long) java.lang.Math.exp(8 * java.lang.Math.log(10));
    	int posID = 1234;
		long tmpint = Long.parseLong(tmpstring) + (posID * exp) ;
		
		System.out.println(String.valueOf(tmpint));

		String tmp11 = sdf.format(new Date());
		
		Long.parseLong(tmp11);
		
		LoginInfo login = new LoginInfo();
		login.setLogin("tii");
		login.setPassword("titoupass");
		
		/**
		 * retrieve configurations
		 */
                AppConfig config = new AppConfig(args);
                config.load();

                // set WS.
                String wsuser = config.getProperty("ws.user");
                String wspassword = config.getProperty("ws.password");
                String wsurl = config.getProperty("ws.URL");
                String wsposid = config.getProperty("ws.posid");

                String vm_path = "/administrator/components/com_vm_soa/services/VM_";
                String vm_path_end = "Service.php";
                String CategoriesURL = wsurl+vm_path+"Categories"+vm_path_end;
                String ProductURL = wsurl+vm_path+"Product"+vm_path_end;
                String UsersURL = wsurl+vm_path+"Users"+vm_path_end;
                String OrderURL = wsurl+vm_path+"Orders"+vm_path_end;
                String QueryURL = wsurl+vm_path+"SQLQueries"+vm_path_end;

                //System.out.println(CategoriesURL);

                /**
		 * Setting endpoints
		 */
		VM_CategoriesProxy cp = new VM_CategoriesProxy();
                cp.setEndpoint(CategoriesURL);
		//cp.setEndpoint("http://beyours.be/greenpos/administrator/components/com_vm_soa/services/VM_CategoriesService.php");
                

		VM_ProductProxy pp = new VM_ProductProxy();
                pp.setEndpoint(ProductURL);
		//pp.setEndpoint("http://beyours.be/greenpos/administrator/components/com_vm_soa/services/VM_ProductService.php");

		VM_UsersProxy up = new VM_UsersProxy();
                pp.setEndpoint(UsersURL);
		//up.setEndpoint("http://beyours.be/greenpos/administrator/components/com_vm_soa/services/VM_UsersService.php");
	
		VM_OrderProxy op = new VM_OrderProxy();
                pp.setEndpoint(OrderURL);

		//up.setEndpoint("http://beyours.be/greenpos/administrator/components/com_vm_soa/services/VM_OrdersService.php");
	
    			//Categorie[] cats = externalsales.getCategories();
    			
    		//	for (Categorie categorie : cats) {
    			//	System.out.println(categorie.getName()+" "+categorie.getParentcat());
    		//	}
        //return ;        
	
//		GetChildsCategoriesRequestInput parent = new GetChildsCategoriesRequestInput(login,"3");
	
//        VM_SQLQueriesProxy qp = new VM_SQLQueriesProxy();
//        qp.setEndpoint(QueryURL);   
//        
//        
//        SQLInsertRequest parameters = new SQLInsertRequest(login, table, whereClause, columns, values)
//		qp.executeSQLInsertQuery(parameters);                
//		
            	
				Produit produit = new Produit();
				
				
				
				produit.setId("1");
				produit.setName("TEST");
				produit.setProduct_sku("123");
				produit.setAtribute("");	
				produit.setAtribute_value("");
				produit.setBigdescription("");
				produit.setChild_option_ids("");
				produit.setChild_options("");
					produit.setCustom_attribute("CUSTOM");
				produit.setDescription("TEST");
				produit.setDiscount("");
				produit.setDiscount_is_percent("");
				produit.setFullimage("");
				produit.setHas_childs("");
				produit.setChilds_id("");
				produit.setImage("");
				produit.setParent_produit_id("");
				produit.setPrice("1.0");
				produit.setProduct_availability("");
				produit.setProduct_available_date("");
				produit.setProduct_categories("1");
				produit.setProduct_currency("Û");
				produit.setProduct_discount_id("");
				produit.setProduct_height("");
				produit.setProduct_length("");
				produit.setProduct_lwh_uom("");
				produit.setProduct_order_levels("");
				produit.setProduct_packaging("");
				produit.setProduct_publish("true");
				produit.setProduct_sales("");
				produit.setProduct_special("");
				produit.setProduct_tax_id("2");
				produit.setProduct_unit("");
				produit.setProduct_url("");
				produit.setProduct_weight("");
				produit.setProduct_weight_uom("");
				produit.setProduct_width("");
				produit.setQuantity("");
				produit.setQuantity_options("");
				produit.setManufacturer_id("");
				produit.setVendor_id("1");
				
				UpdateProductInput parameters = new UpdateProductInput(login,produit);
				try {
					pp.addProduct(parameters );
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}    			 
        
//        Categorie category = new Categorie();
//		category.setId("33");
//		category.setName("TESTING55");
//		category.setImage("");
//		category.setDescription("SYN TEST");
//		category.setParentcat("");
//		category.setNumberofproducts("");
//		category.setProducts_per_row("1");
//		category.setFullimage("");
//		category.setCategory_publish("Y");
//		category.setCategory_browsepage("");
//		category.setCategory_flypage("");
//
//		
//		AddCategoryInput para = new AddCategoryInput(login, category );
//		try {
//			cp.updateCategory(para);
//		} catch (RemoteException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
                
                
//		try {
//			ProductFromCatIdInput pfci = new ProductFromCatIdInput(login,"4");
//			
//			//Produit pAdd = new Produit("name", "1", "1", "0","description"," bigdescription", "image", "fullimage", "id", "quantity","", "", "", "", "","1", "1");
//			//
//			Produit pAdd = new Produit();
//			pAdd.setId("1");
//			pAdd.setName("name");
//			pAdd.setPrice("1.0");
//			pAdd.setDiscount("0.0");
//			pAdd.setDiscount_is_percent("false");
//			pAdd.setDescription("description");
//			pAdd.setBigdescription("bigdescription");
//			pAdd.setImage("");
//			pAdd.setFullimage("");
//			pAdd.setQuantity("0");
//			pAdd.setParent_produit_id("");
//			pAdd.setHas_childs("");
//			pAdd.setChilds_id("");
//			pAdd.setAtribute("");
//			pAdd.setAtribute_value("");
//			pAdd.setProduct_sku("1");
//			pAdd.setProduct_publish("");
//			pAdd.setCustom_attribute("1");
//			pAdd.setProduct_sales("");
//			
//			UpdateProductInput upi = new UpdateProductInput(login, pAdd);
// 		String r = pp.addProduct(upi);
 		
 		//System.out.println(r);
 		
//			ProductFromIdInput id = new ProductFromIdInput(login,"2");
//System.out.println("TEST getProductFromId");
//			Produit p1 = pp.getProductFromId(id);
//			
//			System.out.println(p1.getName()+" "+p1.getPrice()+" "+p1.getDescription()+" "+p1.getBigdescription());
//			
//System.out.println("TEST getProductsFromCategory");
//			Produit [] p = pp.getProductsFromCategory(pfci);
			
//			for (Produit p1 : p) {
//				System.out.println(p1.getName()+" "+p1.getPrice()+" "+p1.getDescription()+" "+p1.getBigdescription());
				
//			}
//			
//System.out.println("TEST getAllCats");
//			
//			Categorie [] cat = cp.getAllCategories(login);
//			
//			for (Categorie categorie : cat) {
//				System.out.println(categorie.getName());
//			}
//			
//		} catch (RemoteException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		
		
//		pp.getProductsFromCategory(parameters)
		
//		System.out.println("TEST getUsers");
//
//		
//			
//		System.out.println("TEST 1");
//		
//		User userAdd = new User();
//		userAdd.setLogin("Testeur1");
//		userAdd.setId("33");
//		userAdd.setFirstname("firstname");
//		userAdd.setLastname("lastname");
//		userAdd.setPassword("passssss");
//		userAdd.setTitle("Mr");
//		userAdd.setEmail("test1@beyours.be");
//		userAdd.setDescription("");
//		userAdd.setAddress("address");
//		userAdd.setAddress2("address2");
//
//		userAdd.setState_region("address");
//		userAdd.setCity("Brussels");
//		userAdd.setCountry("Belgium");
//		userAdd.setZipcode("1000");
//		userAdd.setPhone("003223334455");
//		userAdd.setMobile("0032477112233");
//		userAdd.setFax("0032244455544");
//		
		
		
		}

}
