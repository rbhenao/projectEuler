import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class problem13 {
	public static void main(String[] args){
	long time = System.currentTimeMillis();
	StringBuffer contents = new StringBuffer();
	BigInteger sum = new BigInteger("0");
	try{
		BufferedReader input = new BufferedReader(new FileReader("C:\\Users\\Ryan\\Desktop\\Website\\projectEuler\\bin\\number.txt"));
		try{
			String line = null;
			
			while((line = input.readLine()) != null){
				contents.append(line);
				contents.append(System.getProperty("line.separator"));
			}
		}
			finally{
				input.close();
			}
		
	}
	catch(Exception e){
		e.printStackTrace();
	}
	
	String[] names = contents.toString().split(System.getProperty("line.separator"));
	
	for(int i =0;i<names.length;i++){
		BigInteger a = new BigInteger(names[i]);
		sum = sum.add(a);
	}
	System.out.println(sum.toString().substring(0, 10));
	System.out.println("Completed in " + (System.currentTimeMillis() - time) + "ms");
	}
	
}
