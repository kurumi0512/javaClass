public class Person {
    private StringBuilder name;
    private StringBuilder phoneNumber;

    public Person(String name, String phone) {
        this.name = new StringBuilder(name);
        this.phoneNumber = new StringBuilder(phone);
    }

    public void addLastname(String lName) {
        name.append(" ");
        name.append(lName);
        // 0298765432 -> 02-98765432
        phoneNumber.insert(2, "-");
        phoneNumber.insert(7, "-"); // 02-9876-5432
    }

    public void displayInfo() {
        System.out.printf("姓名: %s%n", name);
        
        int pos = name.toString().indexOf(" ");
        if (pos != -1) {
            System.out.printf("姓氏: %s%n", name.substring(pos + 1));
            System.out.printf("名字: %s%n", name.substring(0, pos));
        } else {
            System.out.println("沒有姓氏");
        }

        System.out.printf("姓名長度: %d%n", name.length());
        System.out.printf("姓名容量: %d%n", name.capacity());
        System.out.printf("電話: %s%n", phoneNumber);
        System.out.printf("電話長度: %d%n", phoneNumber.length());
        System.out.printf("電話容量: %d%n", phoneNumber.capacity());
    }
}






/*public class Person{
	private StringBuilder name;
	private StringBuilder phoneNumber;
	
	public Person(String name , String phone){
		this.name = new StringBuilder(name);
		this.phoneNumber = new StringBuilder(phone);
	}
	
	public void addLastname(String lName){
		name.append(" ");
		name.append(1Name);
		//0298765432
		phoneNumber.insert(2,"-");
		//02-98765432
		phoneNumber.insert(7,"-");
		//02-9876-5432
	}
	
	public void displayInfo(){
		System.out.printf("姓名:"%s%n,name);
		int pos = name.indexOf(" ");
		System.out.printf("姓氏:"%s%n,name.substring(pos+1));
		System.out.printf("名字:"%s%n,name.substring(0,pos));
		System.out.printf("姓名長度:%d$n",name.length());
		System.out.printf("姓名長度:%d$n",name.capacity());
		System.out.printf("電話:"%s%n,name.phoneNumber);
		System.out.printf("電話長度:%d$n",phoneNumber.length());
		System.out.printf("電話容量:%d$n",phoneNumber.capacity());
	}
}*/