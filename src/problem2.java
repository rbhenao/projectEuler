
public class problem2 {
	public static void main(String args[]){
		int x = 1;
		int y = 2;
		int total = 0;
			while(y <= 4000000){
				int c = x + y;
					//System.out.println(c);
				if(y % 2 == 0){
					total+= y;
				}
				x = y;
				y = c;
				c = 0;
			}
			System.out.println(total);
	}
}
