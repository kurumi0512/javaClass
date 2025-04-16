public class Customer {

    public int customerID = 0; // Default ID for the customer
    public String name = "-name required-" ; // default
    public String address = "-address required-"; // default
	public String phoneNumber ="-phone required-";
	public String email = "-email optional-";
	
	public void setCustomerInfo(int id, String nm, String addr,String phNum){
		customerID = id;
		name = nm;
		address = addr;
		phoneNumber = phNum;
	}
		
	public void setCustomerInfo(int id,String nm, String addr,String phNum,String email){
		customerID = id;
		name = nm;
		address = addr;
		phoneNumber = phNum;
		email = email;
	}
	public void display(){
		System.out.println("********客戶資訊*******");
		System.out.println("Customer: "+customerID);
		System.out.println("name: "+name);
		System.out.println("地址: "+address);
		System.out.println("電話: "+phoneNumber);
		System.out.println("Email: "+email);
		System.out.println("***********************");
	}
} // end of class


