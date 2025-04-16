public class RectangleTest{
	public static void main(String[] args){
	Rectangle r1= new Rectangle();
	System.out.println("R1面積為"+r1.getArea());
	r1.draw();
	
	Rectangle r2= new Rectangle(12);
	System.out.println("R2面積為"+r2.getArea());
	r2.draw();
	
	Rectangle r3= new Rectangle(15,5);
	System.out.println("R3面積為"+r3.getArea());
	r3.draw();
	
	Rectangle r4= new Rectangle(0);
	System.out.println("R4面積為"+r4.getArea());
	r4.draw();
	
	Rectangle r5= new Rectangle(-15,5);
	System.out.println("R5面積為"+r5.getArea());
	r5.draw();
	
	
	}
}