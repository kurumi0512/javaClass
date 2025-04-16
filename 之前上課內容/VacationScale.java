public class VacationScale {
	public int yearsOfService;
	public int[] vacationDays = new int[]
					{10, 15 , 15, 15, 20, 20, 25};
	public void displayVacationDays(){
		System.out.print("年資"+yearsOfService+"年");
		if(yearsOfService<=6)
			System.out.println("特休有"+vacationDays[yearsOfService]+"天");
		else
			System.out.println("特休有"+vacationDays[6]+"天");
	}
}
