public class DateOne {
    private int year;
    private int month;
    private int day;

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getDateStr() {
        return year + "/" + month + "/" + day;
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private int calcDaysInMonth(int year, int month) {
        int days = 0; // ✅ 先宣告變數
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                if (isLeapYear(year))
                    days = 29;
                else
                    days = 28;
                break;
            default:
                System.out.println("月份錯誤");
        }
        return days;
    }

    public void setDate(int year, int month, int day) {
        if (year >= 2000 && year <= 2030) {
            if (month >= 1 && month <= 12) { // ✅ 修正錯誤
                if (day >= 1 && day <= this.calcDaysInMonth(year, month)) { // ✅ 修正 `if` 括號錯誤
                    this.day = day;
                    this.month = month;
                    this.year = year;
                } else {
                    System.out.println("日期錯誤設定失敗");
                }
            } else {
                System.out.println("月份錯誤設定失敗");
            }
        } else {
            System.out.println("年份錯誤設定失敗");
        }
    }
}
	
	
	/*public void setDay(int day){
			if(day>=1 &&day<=31)
				this.day=day;
			else
				System.out.println("日期錯誤設定失敗");
		
	}
	
	public void setMonth(int month){
			if(month>=1 &&day<=12)
				this.month=month;
			else
				System.out.println("月份錯誤設定失敗");
		
	}
	
	public void setYear(int year){
			if(year>=2000 &&year<=2030)
				this.year=year;
			else
				System.out.println("年份錯誤設定失敗");
		
	}


}*/