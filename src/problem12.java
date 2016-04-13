public class problem12 {
	public static void main(String args[]){
		long time = System.currentTimeMillis();
		boolean[] prime = new boolean[20];
			for(int n = 2;n<prime.length;n++){
				for(int i = n;i<prime.length;i+=n){
					if(i!=n){
						if(prime[i] == false){
							prime[i] = true;
						}
					}
				}
			}
			int TopDivisor = 1;
			int TopNum = 1;
			for(int a = 12000;a<12376;a++){
			int triNum = (a*(a+1))/2;
			int divisor = 1;
				for(int x = 2;x<prime.length;x++){
				int count   = 1;
				int num = triNum;
						if(prime[x] == false){
							if(num % x == 0){
								while(num % x == 0){
								num = num / x;
								count+=1;
								}
							}
						}
					if(count > 1){
						divisor*=count;	
					}
				}
				if(divisor > TopDivisor){
					TopDivisor = divisor;
					TopNum = triNum;
				}
			}
				System.out.println(TopNum);
				System.out.println(TopDivisor);
				System.out.println("Completed in " + (System.currentTimeMillis() - time) + "ms");
	}
}
