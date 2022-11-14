import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int fatorial;

            System.out.println("Fatorial de!: ");
            fatorial = scan.nextInt();

            int mult = 1;

            for(int i = fatorial; i >= 1; i--){
               mult = mult * i;
            }
            System.out.println(mult);
        }

    }
}
