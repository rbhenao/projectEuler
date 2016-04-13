//Amicable numbers
/*
 * Amicable number is a number such that its divisors add up to another number. And that numbers divisors adds to  the original number
 * ex:
 * d(220) = 1 + 2 + 4 + 5 + 10 + 11 + 20 + 44 + 55 + 110 + 220 = 284
 * d(284) = 1 + 2 + 4 + 71 + 142 = 220
 */
public class problem21 {
	public static void main(String args[]){
		//finds divisors given num
		int count = 0;
		
		//loops to find amicable numbers to 10000
		for(int i = 200;i<10000;i++){
			int sum1 = 0;
			int sum2 = 0;
			//finds divisors of first number
			for(int j = 1;j<Math.sqrt(i);j++){
				if(i%j == 0){
					sum1 = sum1 + j + (i/j);
				}
			}
			sum1 = sum1-i;
			//checks with second number
			for(int k = 1;k<Math.sqrt(sum1);k++){
				if(sum1%k == 0){
					sum2 = sum2 + k + (sum1/k);
				}
			}
			sum2 = sum2 - sum1;
			//if match add it to list
			if(sum2 == i && i != sum1){
				System.out.println(i+" "+" "+sum1);
				count+=i; 
				count+=sum1;
				if(sum1>i){
					i = sum1+1;
				}
			}
		}
		System.out.println(count);
	}
}
