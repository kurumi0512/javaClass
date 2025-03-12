public class praclass {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("請輸入今天星期幾");
        String todayclass = scanner.next();
		String class1="";
		switch(todayclass){
				case "Mon":
					class1="鋼琴課";
					break;
				case "Tue":
					class1="圍棋課";
					break;
				case "Wed":
					class1="英文課";
					break;
				case "Thu":
					class1="桌球課";
					break;
				case "Fri":
					class1="跆拳道";
					break;
				case "Sat":
					class1="電腦課";
					break;
				case "Sun":
					class1="作文課";
					break;
		}
		System.out.print(todayclass+"小明要上"+class1);
		}		
	
}