

public class Ex5 {
	public static void main(String[] args) {
		 String input="Hello*world"; 
		 System.out.println(check(input));
		}
		public static boolean check(String input) {
		 boolean b=false;
		 String[] arrOfStr = input.split("\\*", 2);
		 if(arrOfStr[0]==arrOfStr[1])
		  b=true;
		 return b;
		}

}
