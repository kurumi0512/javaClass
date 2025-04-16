public class tree{
	public static void main(String[] args){
		java.util.Scanner sc=new java.util.Scanner(System.in);
			System.out.print("三角形層數:");
			int level=sc.nextInt();
			for(int i=0;i<level;i++){
				for(int j=0;j<level-1-i;j++)
					System.out.print(" ");
					char c=(char)('A'+i);
				for(int k=0;k<1+2*i;k++)
					System.out.print(c);
				System.out.println();
				

			}
		
	}
}