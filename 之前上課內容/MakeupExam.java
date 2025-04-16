public class MakeupExam {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("考試分數:");
        int score = scanner.nextInt();
		if(score>=40 && score<60){
			System.out.println("你需要補考");
		}else
			System.out.println("你不需要補考");
	}
}