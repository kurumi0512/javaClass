public class LeapYear {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
	System.out.print("請輸入西元年：");
	int year = scanner.nextInt();
	if(year%4==0){
		if(year%100==0){
			if(year%400==0) {
				System.out.println(year +"年是閏年");        
			} else {
				System.out.println(year +"年不是閏年",);
			}
			} else {
				System.out.println(year +"年是閏年",);
			}
			} else {
				System.out.println(year+"年不是閏年");
 }    