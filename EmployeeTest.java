public class EmployeeTest{
	public static void main(String[] args){
		System.out.println("公司地址:"+Employee.address);
		System.out.println("公司電話:"+Employee.getPhone());
		Employee e1=new Employee("Sean");
		Employee e2=new Employee("David");
		
		System.out.println("Sean 辦公室在"+e1.getAddress());
		System.out.println(e1.call());
		System.out.println("David 公司電話"+e2.getPhone());
		System.out.println(e2.call());
		
		System.out.println("公司搬家改電話");
		Employee.setAddress("台北市公園路30號");
		e2.setPhone("02-53455-7890");
		
		System.out.println("公司地址:"+Employee.address);
		System.out.println("公司電話:"+Employee.getPhone());
		System.out.println(e1.call());
		System.out.println(e2.call());
	}
}