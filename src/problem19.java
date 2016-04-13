/*
 * finds how many sundays fell on the first of the month
 * 
 */
public class problem19 {
	static int year = 1901;
	static int day = 2;
	static int feb = isLeap(year);
	static int[] months = {31,feb,31,30,31,30,31,31,30,31,30,31};
	static int SundayCounter = 0;
	
	public static void main(String args[]){
		//loops through each year
		for(int i = 0;i<100;i++){
			//loops through each month
			for(int j = 0;j<months.length;j++){
				int remainder = getMonths()[j] % 7;
				day = day+remainder;
				//increments the first of the month day and if its 7 adds 1 to sunday counter
				if(day > 7){
					day = day - 7;
				}
				if(day == 7){
					SundayCounter++;
				}
			}
			year+=1;
			months[1] = isLeap(year);
		}
		System.out.println(SundayCounter);
	}
	//leap year checker
	public static int isLeap(int year){
		if(year % 4 != 0 ){
			return 28;
		}else if(year % 400 == 0){
			return 29;
		}else if(year % 100 == 0){
			return 28;
		}else{
			return 29;
		}
	}
	public static int[] getMonths(){
		return(months);
	}
}
