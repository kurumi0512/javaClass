public class BigSale {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("消費金額00：");
        int amount = scanner.nextInt();
		int payment=0;

        if (amount >= 5000) 
            payment=(int)(amount*0.7);
        else if (amount > 3000) 
           payment=(int)(amount*0.8);
        else if (amount > 2000) 
            payment=(int)(amount*0.85);
        else if (amount > 0) {
            payment=(int)(amount*0.9);
		}
        if(amount>0){
				System.out.println("消費金額:"+amount+"元");
				System.out.println("折扣金額:"+payment+"元");
        } else 
            System.out.println("消費金額錯誤");
      
    }

}