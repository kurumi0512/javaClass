public class OrderTest1 {
	public static void main(String[] args){
		Order order=new Order();//類別、類別名稱
		Shirt s1 = new Shirt();
		s1.shirtID =1;
		s1.price = 14.99;
		s1.description = "T-shirt";
		double total = order.addShirt(s1);
		System.out.println("T-shirt加入訂單,總金額:" +total);
		
		Shirt s2 = new Shirt();
		s2.shirtID = 2;
		s2.price = 23.55;
		s2.description = "POLO";
		total = order.addShirt(s2);
		System.out.println("POLO加入訂單,總金額:" +total);
		
		Shirt s3 = new Shirt();
		s3.shirtID = 3;
		s3.price = 49.99;
		s3.description = "Jacket";
		total = order.addShirt(s3);
		System.out.println("Jacket加入訂單,總金額:" +total);

		order.display();
	}
}