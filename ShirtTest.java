public class ShirtTest{
	public static void main(String[] args){
	Shirt s1=new Shirt();
	System.out.println("=====衣服資訊=====");
	System.out.println("編號: "+s1.shirtID);
	System.out.println("顏色: "+s1.colorCode);
	System.out.println("商品描述: "+s1.description);
	System.out.println("價格: "+s1.price);
	System.out.println("庫存: "+s1.quantityInStock);
	
	Shirt s2=new Shirt();
	s2.shirtID=102;
	s2.price=500;
	System.out.println("=====衣服資訊=====");
	System.out.println("編號: "+s2.shirtID);
	System.out.println("顏色: "+s2.colorCode);
	System.out.println("商品描述: "+s2.description);
	System.out.println("價格: "+s2.price);
	System.out.println("庫存: "+s2.quantityInStock);
	
	}
}
