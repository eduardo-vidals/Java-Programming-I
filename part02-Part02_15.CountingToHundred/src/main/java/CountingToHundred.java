
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = Integer.valueOf(scanner.nextLine());
        for (int i = value; i <= 100; i++){
            if (value <= 100){
                System.out.println(value);
                value += 1;
            }
        }
    }
}
