import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длины катетов:");
        double cathet1 = scanner.nextDouble();
        double cathet2 = scanner.nextDouble();
        RightTriangle triangle1 = new RightTriangle(cathet1, cathet2);
        triangle1.printTriangle();
    }
}