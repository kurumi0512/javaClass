public class Find2or3 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("請輸入一個整數:");
        int num = scanner.nextInt();
		if(num%2==0){
			System.out.print("是2的倍數");
			if(num%3==0){
				System.out.print("也是3的倍數");
			}else{
				System.out.println();
			}
		}else{
			if(num%3==0){
				System.out.print("是3的倍數");	
			}else{
				System.out.print("不是3和2的倍數");	
			}
		}
	}
}		