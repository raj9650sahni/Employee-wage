package assignment;
import java.util.*; 

public class Employee {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("Wage per hr = ");
		int Wage_per_hr= sc.nextInt();
		
		 
		System.out.println("Full_day_hr = ");
		int Full_day_hr= sc.nextInt();
		
		System.out.println("Part_time_hr = ");
		int Part_time_hr= sc.nextInt();
		
		System.out.println("Total_w_days = ");
		int Total_w_days= sc.nextInt();
	
		Scanner dp= new Scanner(System.in); 
		System.out.println("Enter the things you want to check or calculate  : ");
		String str= dp.nextLine(); 
		
		switch(str)
		{
		case "check employee status":
			int attendence = (int) Math.round(Math.random());
			if (attendence==1) {
				System.out.println("Employee is present");
			}else {
			
				System.out.println("Employee is absent");
			}
			break;
		
		case "calculate daily emp wage":
			int Total_daily_wage = Wage_per_hr * Full_day_hr;
			System.out.println("Total Daily Wage are = " + Total_daily_wage);
			break;
			
		case "calculate monthly wage":
			int Total_monthly_wages = ( Total_w_days * Full_day_hr + Part_time_hr ) * Wage_per_hr;
			System.out.println("Total montly wages is = " + Total_monthly_wages);
			break;
			
		case "calculate wage for fixed working hrs":
			
			String fixed_hrs = "100hrs and 20 days";
			int total_hrs  = 100 + (8*20);
			int Wage  = total_hrs * Wage_per_hr;
			System.out.println("Total wage for a fixed hours and days is =" + Wage );
			break;
			
		default:
			System.out.println(" You have given the wrong input or the check from the above list ");
		
		
		}
		
	}

}
