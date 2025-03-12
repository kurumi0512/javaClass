public class count1 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("輸入最大值:");
		int Maxcount=scanner.nextInt();
		int sum=0;		
		for(int i=1;i<=Maxcount;i++){
			sum+=i;
		}
		System.out.println("1+...加總到"+Maxcount+"="+sum);
	}
}	