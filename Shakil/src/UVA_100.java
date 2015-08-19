import java.util.Scanner;

/**
 * Created by Arif Shakil on 8/19/2015.
 */
public class UVA_100 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            int start = in.nextInt();
            int end = in.nextInt();
            int number = 0;
            int cycle = 1;
            int maxCycle = 0;

            for (int j = start; j <= end; j++) {
                number = j;
                while(number != 1) {
                    if(number%2 != 0)
                        number = number*3 +1;
                    else if(number%2 == 0) {
                        number = number/2;
                    }
                    cycle++;
                }
                if(cycle>maxCycle) {
                    maxCycle = cycle;
                }
                cycle = 1;
            }
            System.out.println(start +" "+ end +" "+ maxCycle);
        }
    }
}
