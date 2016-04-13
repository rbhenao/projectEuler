import java.math.BigInteger;
public class problem20 {
	public static void main(String args[]){
		long time = System.currentTimeMillis();
		int n   = 100;
		int sum = 0;
		BigInteger factorial = new BigInteger( "1" );
	    BigInteger temp;
	        for ( int i = 1; i <= n; i++ ) {            
	            temp = new BigInteger(Integer.toString(i));
	            factorial = factorial.multiply(temp);            
	        }
	     String bigString = factorial.toString();
	     for(int z=0;z<bigString.length();z++){
				char a = bigString.charAt(z);
				sum += (a -'0');
				}
			System.out.println(sum);
			System.out.println("Completed in " + (System.currentTimeMillis() - time) + "ms");
	}
}
