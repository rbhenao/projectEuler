import java.math.BigInteger;
public class problem16 {
	public static void main(String args[]){
		long time = System.currentTimeMillis();
		BigInteger bigTwo = new BigInteger ("2");
		BigInteger bigNum = bigTwo.pow(1000);
		String bigString = bigNum.toString();
		int sum   = 0;
		for(int i=0;i<bigString.length();i++){
			char a = bigString.charAt(i);
			sum += (a -'0');
			}
		System.out.println(sum);
		System.out.println("Completed in " + (System.currentTimeMillis() - time) + "ms");
	}
}
