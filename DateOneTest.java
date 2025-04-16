/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */

public class DateOneTest {
  public static void main(String args[]) {
    DateOne d= new DateOne();
	
	d.setDate(2800, 12, 25);  // ✅ 改用 setDate()
        System.out.println("日期：" + d.getDateStr());
        
    d.setDate(2025, 3, 30);   // ✅ 改用 setDate()
        System.out.println("日期：" + d.getDateStr());
	
	
	/*
	d.setDay(1234);
	d.setMonth(0);
	d.setYear(2800); //d.year=2800
	
	//System.out.println("日期為"+d.getYear()+"/"+ d.getMonth()+"/"+d.getDay());
	System.out.println("日期:"+d.getDateStr());
	
	d.setDay(30);
	d.setMonth(3);
	d.setYear(2025); //d.year=2800
	
	System.out.println("日期:"+d.getDateStr());
	//System.out.println("日期為"+d.getYear()+"/"+ d.getMonth()+"/"+d.getDay());*/
	
	
    
  }// end main

} // end class

