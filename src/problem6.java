public class problem6 {
	public static void main(String args[]){
		int total1  = 0;
		int total2  = 0;
			for(int i = 0; i<101;i++){
				total1+= (i*i);
				total2+= i;
			}
				System.out.println((total2*total2)-total1);
	}
}
