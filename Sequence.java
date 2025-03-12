public class Sequence {
    public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("輸入數列範圍:");
		int max=scanner.nextInt();
		int n1=1,n2=1;
		System.out.print(n1+"..,"+n2);
		int next=n1+n2;
		while(next<max){
				System.out.print(","+next);
				n1=n2;
				n2=next;
				next=n1+n2;			
		}
	}	
}		
      