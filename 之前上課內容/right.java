public class right {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("使用者輸入字元R、L、U、D:");
        char step = scanner.next().charAt(0);
		switch(step){
				case 'R':
				case 'r':
					System.out.print("向右走");
					break;
				case 'L':
				case 'l':
					System.out.print("向左走");
					break;
				case 'U':
				case 'u':
					System.out.print("向上走");
					break;
				case 'D':
				case 'd':
					System.out.print("向下走");
					break;
				default:
					System.out.print("無效的輸入");
		}		
	}
}