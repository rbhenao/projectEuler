import java.math.BigInteger;
public class problem15 {
	public static void main(String args[]){
		long time = System.currentTimeMillis();
		BigInteger nFact = new BigInteger("1");
		BigInteger nMinusrFact = new BigInteger("1");
		for(int i = 40;i>0;i--){
			BigInteger a = new BigInteger(Integer.toString(i));
			nFact        = nFact.multiply(a);
		}
		for(int x = 20;x>0;x--){
			BigInteger b = new BigInteger(Integer.toString(x));
			nMinusrFact  = nMinusrFact.multiply(b);
		}
		BigInteger mtotal = nMinusrFact.multiply(nMinusrFact);
		BigInteger total  = nFact.divide(mtotal);
		System.out.println(total);
		System.out.println("Completed in " + (System.currentTimeMillis() - time) + "ms");
	}
}
