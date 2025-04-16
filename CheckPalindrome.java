public class CheckPalindrome{
	public static boolean ispalindrome(String test){
		test = test.toLowerCase();
		int low=0, high=test.length()-1;
		while(low<high){
			if(test.charAt(low)!=test.charAt(high))
				return false;
			low++;
			high--;
		}
		return true;
	}
	public static void main(String[] args){
		java.util.Scanner sc =new java.util.Scanner(System.in,"big5");
		System.out.print("輸入文字(輸入q離開):");
		String str =sc.nextLine();
		while(!str.equalsIgnoreCase("q")){
			if(ispalindrome(str)){
					System.out.printf("%s是迴文%n",str);
			}else{
				System.out.printf("%s不是迴文%n",str);	
			}	
			System.out.print("輸入文字(輸入q離開):");
			str = sc.nextLine();
		}
		System.out.println("結束!");
	}
}




