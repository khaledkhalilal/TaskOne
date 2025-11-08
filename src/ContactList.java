import java.util.Scanner;

public class ContactList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean running = true;
        int indexArray=10;
        int i=0;
        String namesArray[]= new String[indexArray];
        int agesArray[] = new int[indexArray];
        String phoneNumbersArray[] = new  String[indexArray];
        String emailsArray[] = new String[indexArray];
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
                    System.out.print("Введи возраст: ");
                    int age = in.nextInt();
                    if (age < 18){
                        System.out.println("Возраст меньше требуемого");
                        break;
                    }else if (age >= 100){
                        System.out.println("Возраст большие требуемого");
                        break;
                    }else{

                    }
                    System.out.print("Номер: ");
                    in.nextLine();
                    String numberPhone= in.nextLine();
                    if(numberPhone.length()==12 && numberPhone.startsWith("+7")||
                            numberPhone.length()==11 && numberPhone.startsWith("8")){

                    }else {
                        System.out.println("Неправильный номер. пожалуйста введи его еще раз ");
                          break;
                    }
                    System.out.println("Введи адрес электронной почты:");
                    String email = in.nextLine();
                    if(email.indexOf("@")!= -1 && email.indexOf(".") != -1){
                        System.out.println("Проверочный код был выслан на почту");
                    }else {
                        System.out.println("Неправильный адрес электронной почты. пожалуйста введи его еще раз ");
                        break;
                    }
                    int numberCod=1111;
                    System.out.println("Пожалуйста введи код:");
                    int code = in.nextInt();
                    for(int n=1 ; n<=3 ; n++){
                    if(code==numberCod) {
                        System.out.println("Регистрация прошла успешно!");
                        namesArray[i]=name;
                        phoneNumbersArray[i]= numberPhone;
                        agesArray[i]=age;
                        emailsArray[i]=email;
                        i=i+1;
                        break;
                    } else if(n >= 3){
                        System.out.println("Неверный код");
                        break;
                    }else {
                        System.out.println("Неверный код");
                        System.out.println("Введи код еще раз:");
                        code = in.nextInt();
                    }
                    }
                    } else {
                        System.out.print(" Массив уже содержит "+ indexArray +" элементов");
                    }
                    break;
                case 2 :
                    for(int j =0 ; j < i; j++ ){
                        System.out.println("id:" + (1 + j) );
                        System.out.println("Имя:"+ namesArray[j]);
                        System.out.println("возраст:"+ agesArray[j]);
                        System.out.println("Номер:" + phoneNumbersArray[j] );
                        System.out.println("адрес электронной почты:"+ emailsArray[j]);
                        System.out.println("::::::::::::::::::::::::::::::::::"  );
                    }
                    break;
                case 3 :
                    running=false;
                    break;
                default:
                    System.out.println("Неправильный выбор, пожалуйста, попробуй еще раз...");
            }
        }

    }
}