import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        boolean game = true;
        while (game) {

            //вводим рандомное число countPc
            //int coun
            Random countPc = new Random();
            int countRandom = countPc.nextInt(10);
            System.out.println(countRandom);

            for (int i = 1; i <= 3; i++) {
            //ввод числа пользователем
            System.out.println("Введите число от 0 до 9. Попытка №" +i);
            Scanner countUser = new Scanner(System.in);
            int count = countUser.nextInt();


            //for (int i = 1; i <= 3; i++) {
                if (countRandom > count) {
                    System.out.println("Введённое значение меньше загадонного");
                } else if (countRandom < count) {
                    System.out.println("Введённое значение больше загадонного");
                } else {
                    System.out.println("Вы угадали!");
                }
            }

            System.out.println("Повторить игру ещё раз? 1 – да / 0 – нет");
            Scanner newGame = new Scanner(System.in);
            int choise = newGame.nextInt();
            if (choise == 0) {
                game = false;
            }


            //System.out.println(count);

        }







    }
}
