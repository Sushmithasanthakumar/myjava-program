import java.util.Scanner;

public class scanmeth {
	
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
	    	   
	    	String customerName2 = customerName();
	    	String shopName1 =  shopName();
	    	String shopAddress2 = shopAddress();
	    	int price1 = price();
	    	customerDetails(customerName2 , price1);
	    	shopDetails(shopName1, shopAddress2);
	    	
	       }
	
	    static Scanner myObj = new Scanner(System.in);
		static void shopDetails(String shopName1,String shopAddress2) {
			System.out.println("shop name "+ shopName1);
			System.out.println("shop address "+ shopAddress2);
			
		}
		static void customerDetails(String customerName2,int price1 ) {
			System.out.println("customer "+ customerName2);
			System.out.println("price " + price1);
		}
		static String shopName() {
			System.out.println("enter shop name");
			String shopname = myObj.nextLine();
			return shopname;
		}
		static String shopAddress() {
			System.out.println("enter address name");
			String shopaddress = myObj.nextLine();
			return shopaddress;
		}
		static String customerName() {
			System.out.println("enter customer name");
			String customername1 = myObj.nextLine();
			return customername1;
		}
		static int price() {
			System.out.println("enter price");
			int price = myObj.nextInt();
			return price;
		}
		      
	}


