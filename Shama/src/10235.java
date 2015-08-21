import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


 class UVA10235 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = br.readLine()) != null) {
			int number = Integer.parseInt(line);
	    	String prime = isPrime(number);
	    	if(prime.equals("prime")){
	    		String emirp = isEmirp(number);
	    		if(emirp.equals("emirp")){
	    			prime = "emirp";
	    		}
	    	}
    	System.out.println(number + " is " + prime +".");
	    	
	    }
	}
	public static String isPrime(int number){
		for(int i = 2; i < number; i++){
			if(number % i == 0){
				return "not prime";
			}
		}
		return "prime";
	}
	public static String isEmirp(int number){
		String output = "";
		String num = "" + number;
		String rev = new StringBuilder(num).reverse().toString();
		int emp = Integer.parseInt(rev);
		if(emp == number){
			return "prime";
		}
		output = isPrime(emp);
		if(output.equals("prime")){
			output = "emirp";
		}
		return output;
	}
}
