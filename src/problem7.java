
public class problem7 {
	public static void main(String args[]){
		boolean[] prime = new boolean[150000];
		int counter = 0;
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
			if(prime[x]==false){
				counter++;
				if(counter==10001){
					System.out.println(x);
				}
			}
		}
	}
}
