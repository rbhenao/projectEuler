public class problem5 {
	public static void main(String args[]){
		boolean theLoop = false;
		int i = 1;
		while(!(theLoop)){
			int total = 0;
				for(int x = 1;x<21;x++){
					total+= i % x;
				}
			if(total == 0){
				theLoop = true;
			}else{
				i++;
			}
		}
			System.out.println(i);
	}
}
