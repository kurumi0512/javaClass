public class OrderTest{
	public static void main(String[]args){
		Order order=new Order();
		Shirt s1=new Shirt();
		s1.ShirtID=0;
		s1.price=14.99;
		s1.descr="T-shirt";
		double total=order.addShirt(s1);
		
		Shirt s2=new Shirt();
		s2.ShirtID=1;
		total=order.addShirt(s2);
		
		
		
	}
}

public class Order{
	public Shirt[]shirts=new Shirt[5];
	public int itemNum=0;
	public double totalPrice=0.0;
	
	public double addShirt(Shirt shirt){
			shirt[itemNum++]=shirt;
			totalPrice=totalPrice+shirt.price;
			return totalPrice;
		}
		public void display(){
			for(int i=0;i<itemNum;i++){
				shirts[i].display;
				
			}
		}
	}
}



public class CustomerTest{
	
	Customer cust1=new Customer();
	Customer cust2=new Customer();
	
	cust1.setCustomerInfo(1,"Harry","234""0955522");
	
	cust1.display();
	cust2.display();
	
}
	
	public void setCustomerInfo(int id,Sting nm,String addr){
		customerID=id;
	
	public void displayinformation{
			System.out.println("...");
		
	}
		
	public void setPrice(double p){
			price=p;
	}
	
	public double getprice(){
			return price;
	}
