public class problem14 {
	public static void main(String args[]){
		long count   = 0;
		long chain   = 0;
		long number  = 0;
		for(long i = 800000;i<1000000;i++){
			long x = i;
			while(x !=1){
				//System.out.print(x+"  ");
				if(x%2==0){
					x = x/2;
				}else{
					x = (3*x)+1;
				}
				count++;
			}
			//System.out.println("1");
			//System.out.println(count);
			if(count > chain){
				chain  = count;
				number = i;
			}
			count = 1;
		}
		System.out.println(number);
	}
}
