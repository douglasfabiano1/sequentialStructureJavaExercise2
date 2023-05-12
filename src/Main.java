import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double radius = sc.nextDouble();

        double area = 3.14159 * Math.pow(radius, 2.0);

        System.out.printf("AREA = %.4f", area);
        sc.close();
    }
}
