public class problem10 {
	public static void main(String args[]){
		long time = System.currentTimeMillis();
		boolean[] prime = new boolean[2000000];
		long counter = 0;
		for(int n = 2;n<prime.length;n++){
			for(int i = n;i<prime.length;i+=n){
				if(i!=n){
					if(prime[i] == false){
						prime[i] = true;
					}
				}
				//System.out.println(i + "  "+  n + "   " + prime[i]);
			}
		}
		for(int x = 2;x<prime.length;x++){
			if(prime[x]==false && x < 2000000){
				counter+=x;
			}
		}
		System.out.println(counter);
		System.out.println("Completed in " + (System.currentTimeMillis() - time) + "ms");
	}
}
