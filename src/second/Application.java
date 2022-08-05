package second;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int first = getRandomInt(3,6), second = getRandomInt(3,6);
        Car[][] carArray = new Car[first][second];

        System.out.println("Info: carArray[" + first + "][" + second + "]");

        for (int i = 0; i < first; i++)
            for (int j = 0; j < second; j++)
                carArray[i][j] = new Car(new StearingWheel(getRandomInt(1,3), "Leather"),
                        new Engine(getRandomInt(2,12)), getRandomInt(100,700), getRandomInt(1990, 2022));

        while(true) {
            System.out.println("\n1 - Вивести toString() даних елементів масиву на консоль");
            System.out.println("2 - Для всіх об`єктів даного масиву засетити одинаковий об`єкт класу Авто");

            System.out.print("Enter: ");
            int k = scn.nextInt();
            if (k == 1)
                System.out.println(Arrays.deepToString(carArray));
            else if (k == 2)
                for (int i = 0; i < first; i++)
                    Arrays.fill(carArray[i], new Car());
        }
    }

    public static int getRandomInt(int min, int max) {
        Random rnd = new Random();
        return rnd.nextInt(max - min + 1) + min;
    }
}
