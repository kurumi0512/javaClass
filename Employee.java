public class Employee{
	public static int count=0;
	public static String address ="台北市中正路100號";
	public static String phone="02 245112";
	private String name;
	private int ext;
	
	public Employee(String name){
		this.ext = ++count;
		this.name = name;
	}
	public static String getAddress(){
		return address;
	}
	public static void setAddress(String address){
		Employee.address =address;  //類別屬性不能用this,跳過遮蔽現象
	}
	public static String getPhone() {
			return phone;
	}
	public static void setPhone(String phone){
		Employee.phone =phone;
	}
	public String call(){
		return "找"+name+"請撥"+phone+"分機:"+ext;
	}
}