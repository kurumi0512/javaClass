public class Primenumber{
	public static void main(String [] args){
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("請輸入一個正整數:");
		int num=scanner.nextInt();
		boolean Prime=true;
		for(int i=2;i<num;i++){
			if(num%i==0){
				Prime=false;
				break;
			}
		}
			if(Prime)
				System.out.println(num+"是質數");
			else
				System.out.println(num+"不是質數");
			
		
	}
 }
 
 