public class CustomerTest{
	public static void main(String[] args){
	Customer cust1=new Customer();
	Customer cust2=new Customer();
	
	cust1.setCustomerInfo(1,"Harry","234 Maple St.","0987-542-321");
	cust2.setCustomerInfo(2,"Sally","567 Maple St.","0987-888-321");
	
	cust1.display();
	cust2.display();
	
	
	}
	
}


