import java.util.Scanner;

public class ContactList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean running = true;
        int indexArray=10;
        int i=0;
        String array[]= new String[indexArray];
        int arrayNumber[] = new  int[indexArray];
        while (running) {
            System.out.println("\n=== Простой список контактов ===");
            System.out.println("1. Добавить контакт");
            System.out.println("2. Показать все контакты");
            System.out.println("3. Выйти");
            System.out.print("Выберите действие: ");
            int selectedNumber= in.nextInt();

            switch(selectedNumber){
                case 1 :
                    if(i < indexArray){
                    System.out.print("Напиши имя: ");
                    in.nextLine();
                    String name = in.nextLine();
                    System.out.print("Номер : ");
                    int numberPhone= in.nextInt();
                    array[i]=name;
                    arrayNumber[i]= numberPhone;
                    i=i+1;
                    } else {
                        System.out.print(" Массив уже содержит "+ indexArray +" элементов");
                    }
                    break;
                case 2 :
                    for(int j =0 ; j < i; j++ ){
                        System.out.println("id :" + (1 + j) );
                        System.out.println("Имя :"+ array[j]);
                        System.out.println("Номер : " + arrayNumber[j] );
                        System.out.println("::::::::::::::::::::::::::::::::::"  );
                    }
                    break;
                case 3 :
                    running=false;
                    break;
                default:
                    System.out.println("not this number");
            }
        }

    }
}