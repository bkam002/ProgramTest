package algorithmic;
//int billions, int hundredMillion, int tenMillion, int million, int hundredThousand, int tenThousand, int thousand, int hundred, int ten, int one
public class Mountains {
	public static String check;

	public static void main(String[] args) {
number(121);
System.out.println(check);
	}

	public static String number(int number){
		int hundredThousands = ((number%1000000-number%100000)/100000);
		int tenThousands = ((number%100000-number%10000)/10000);
		int thousands = ((number%10000-number%1000)/1000);
		int hundreds = ((number%1000-number%100)/100); 
		int tens = ((number%100)-number%10)/10;
		int ones = number%10;
if(ones<tens && hundredThousands<tenThousands){
			check="Mountainous";
		}
		return check;
	}
}
