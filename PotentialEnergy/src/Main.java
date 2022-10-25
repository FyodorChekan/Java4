import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту(м) и массу тела(кг):");
        double h = scanner.nextDouble();
        double m = scanner.nextDouble();
        PotentialEnergy first = new PotentialEnergy();
        PotentialEnergy second = new PotentialEnergy(h, m);
        first.printInformation();
        second.printInformation();
    }
}