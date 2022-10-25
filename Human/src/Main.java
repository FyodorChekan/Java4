import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите год рождения, имя и фамилию");
        int born_year = scanner1.nextInt();
        Scanner scanner = new Scanner(System.in);
        String first_name = scanner.nextLine();
        String last_name = scanner.nextLine();
        Human person1 = new Human ();
        Human person2 = new Human (first_name, last_name, born_year);
        person1.printHuman();
        person2.printHuman();
    }
}
