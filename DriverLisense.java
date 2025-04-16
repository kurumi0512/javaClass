public class DriverLisense {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
		while(true){
			System.out.print("輸入學號(-1結束):");
			int sid=scanner.nextInt();
			if(sid==-1)
				break;
			System.out.print("輸入筆試成績");
			int score1=scanner.nextInt();
			if(score1<85){
				System.out.println("筆試失敗");
				continue;
			}
			System.out.println("輸入路考成績");
			int score2=scanner.nextInt();
			if (score2<70){
				System.out.println("路考失敗");
				continue;
			}
			System.out.println("輸入道路駕駛成績");
			int score3=scanner.nextInt();
			if (score3<70){
				System.out.println("道路駕駛失敗");
				continue;
			}
			System.out.println(sid+"學員取得駕照!");		
			
		}
	}
}

public class hello{
	public static void main(String[] args){
		for(int i=1;i<=3;i++){
			for(int j=0;j<=5;j++){
				System.out.println("@");
			}
		}
		
	}	
}