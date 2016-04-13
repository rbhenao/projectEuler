
public class problem4 {
	public static void main(String args[]){
		int tal = 0;
		for(int i =100;i<1000;i++){
			for(int y = 100;y<1000;y++){
				if(y * i > 100000){
						int num = y * i;
						int a   = num / 100000;
						int a1  = num % 10;
						int b   = (num / 10000) % 10;
						int b1  = (num % 100  ) / 10;
						int c   = (num / 1000 ) % 10;
						int c1  = (num % 1000 ) / 100;
					if(a == a1 && b == b1 && c == c1){
						if(num >= tal)tal = num;
					}
				}
			}
		}
		System.out.println(tal);
	}
	
}
