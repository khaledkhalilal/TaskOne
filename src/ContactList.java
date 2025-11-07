import java.util.Scanner;

public class ContactList {
    public static void main(String[] args) {
        System.out.println("Добавь следующее" );
        System.out.println("1 - Имя " );
        System.out.println("2 - Номер" );
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int numberPhone = in.nextInt();
        System.out.println("Имя: "+ name);
        System.out.print("Номер: "+ numberPhone);
    }
}