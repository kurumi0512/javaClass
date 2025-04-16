public class MathTools{
	
	
	public static double getHypotenuse(double bottom,double height){
		return Math.sqrt(bottom*bottom+Math.pow(height,2));
	}
	
	public static boolean isPrime(int num){
		for(int i=2;i<num;i++)
			if(num%i==0)
				return false;
		return true;
		
	}
	public static int getFarenheit(int celsuis){
			return 9*celsuis/5+32;
	}
	
	public static double getBMI(int height,int weight){
		double h= height/100.0;
		return weight/Math.pow(h,2);
	}
	
	public static String diagnose(double bmi){
		String result="數值錯誤";
		if(bmi>=300)
			result="肥胖";
		else if(bmi>=25)
			result="過重";
		else if(bmi>18.5)
			result="正常";
		else if(bmi>=0)
			result="過輕";
		return result;
	
	}
	public static void main(String[] args){
		double bmi=getBMI(178,80);
		System.out.println("身高178公分體重80公斤");
		System.out.println("BMI為"+bmi);
		System.out.println("診斷結果"+diagnose(bmi));
		
		
		
		for(int i=0;i<=100;i+=10)
			System.out.println("攝氏"+i+"度等於華氏"+getFarenheit(i)+"度");
		
		System.out.println("底為3高為4的直角三角形,斜邊為"+MathTools.getHypotenuse(3,4));
		System.out.println("底為5高為12的直角三角形,斜邊為"+MathTools.getHypotenuse(5,12));
		System.out.println("89"+(isPrime(89)?"是質數":"不是質數"));
		System.out.println("89"+(isPrime(87)?"是質數":"不是質數"));
		
	
	}
	
	
	
	
	
	/*public static boolean isPrime(int num){
		if(num<2){
			return false; 
		}
		for(int i=2;i<=Math.sqrt(num);i++){
			if(i%num==0){
				return false;
			}
		}	
	}*/
}


/*
撰寫一個數學工具類別 MathTools.java 類別，提供下列 static 工具方法 
求直角三角形斜邊長 
驗證某數是否為質數 


將攝氏溫度轉為華氏溫度 
計算BMI 
撰寫主方法main()，不需建立物件，即可使用這些工具方法 */