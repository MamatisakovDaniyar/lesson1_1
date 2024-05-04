import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String myCity;

        final int NUM = 1;

        String word = "Bishkek";


        myCity = NUM + word;
        System.out.println("Значения mycity " + myCity);
        System.out.println("Значения NUM " + NUM );
        System.out.println("Значения word " + word );

        if (NUM<0 ){
            System.out.println(" Вы сохранили отрицательное число");
        }else if (NUM>0){
            System.out.println(" Вы сохранили положительное число");
        } else {
            System.out.println(" Вы сохранили ноль");
        }


        System.out.print(" Введите ваше имя");


        Scanner scanner = new Scanner(System.in);
        String myname = scanner.nextLine();


        System.out.println(" Привет " + myname + "!");

        scanner.close();

    }
}