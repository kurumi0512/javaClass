public class UserName{
	public static void main(String args[]){
	java.util.Scanner scanner=new java.util.Scanner(System.in,"Big5");

	System.out.println("請輸入您的名字");
	String name=scanner.nextLine();
	System.out.print("是男性嗎?(true/false):");
	boolean male=scanner.nextBoolean();
	System.out.print(name+(male?"先生":"小姐"));
	System.out.println("您好!");
	}
}
