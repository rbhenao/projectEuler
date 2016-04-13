public class problem3 {
	public static void main(String args[]){
		long number    = 600851475143L; //600851475143L;
		long limit = number;
		long i = 3L;
		while(i < Math.sqrt(limit)){
			if(limit % i == 0){
				limit = limit / i;
				i=3;
			}
		i+=2;
		}
		System.out.println(limit);
	}
}
