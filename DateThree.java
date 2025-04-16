public class DateThree{
	private int day;
	private int month;
	private int year;
	
	public DateThree(int d,int m,int y){
		day=d; 
		month=m; 
		year=y;
	}
	public void setday (int d) {
		if(d<0 && <=31)
		day= d;
	}
	public void setmonth(int m){
		if(m<0 && m<=12)
		month=m;		
	}	
	public int year(){
		return year;
		
	}	
	
}