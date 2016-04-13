/*
 * 
 * counts the number of letters used in number equivalent words
 * ex: 1+2 = one + two = six letters
 */
public class problem17 {
	public static void main(String args[]){
		String[] oneThruNineteen        = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String[] twentyThruNinety       = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		String[] onehundredThruNine = {"","onehundred","twohundred","threehundred","fourhundred","fivehundred","sixhundred","sevenhundred","eighthundred","ninehundred","onethousand"};
		
		String totalStr = "";
		for(int i = 1;i<1001;i++){
			//prints the 100s
			if(i / 100 >= 1 && i % 100 == 0){
				//System.out.print(onehundredThruNine[i/100]);
				totalStr = totalStr + onehundredThruNine[i/100].trim();
			}else if(i/100 >= 1){
				//System.out.print(onehundredThruNine[i/100]+" and");
				//System.out.print(" ");
				totalStr = totalStr + onehundredThruNine[i/100].trim() +"and";
			}
			//prints the 20s
			if((i%100)/10 >=2){
				//System.out.print(twentyThruNinety[(i%100)/10]);
				//System.out.print(" ");
				 totalStr = totalStr + twentyThruNinety[(i%100)/10].trim();
			}
			//prints the 10s
			if(i % 100 < 20 && i % 100 != 0){
				//System.out.print(oneThruNineteen[i%100]);
				totalStr = totalStr + oneThruNineteen[i%100].trim();
			}else if((i % 100)%10 != 0){
				//System.out.print(oneThruNineteen[(i%100)%10]);
				totalStr = totalStr + oneThruNineteen[(i%100)%10];
			}
			//System.out.print(" "+i);
			//System.out.println();
		}
		System.out.println(totalStr.length());
	}
}