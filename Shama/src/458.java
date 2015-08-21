import java.util.Scanner;


class UVA458 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String input = sc.next();
			System.out.println(converter(input));
		}
	}
	public static String converter(String str){
		String coded = "";
		for(int i = 0; i < str.length(); i++){
			int value = str.charAt(i) - 7;
			char ch = (char) value;
			coded += ch;
		}
		return coded;
	}
}
