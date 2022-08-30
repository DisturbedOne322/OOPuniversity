import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        firstTask();
        secondTask();
        thirtTask();
        forthTask();
    }

    private static void firstTask()
    {
        Scanner sc = new Scanner(System.in);
        int katet1, katet2;
        int upperBound = 10000;
        int lowerBound = 0;

        do {
            System.out.println("Введіть перший катет");
            katet1 = sc.nextInt();
            System.out.println("Введіть другий катет");
            katet2 = sc.nextInt();
            if((katet1 < lowerBound || katet1 > upperBound) || (katet2 < lowerBound || katet2 > upperBound))
            {
                System.out.println("Катети повинні бути в межах від " + lowerBound + " до " + upperBound);
            }
        }while ((katet1 < lowerBound && katet1 > upperBound) || (katet2 < lowerBound && katet2 > upperBound));

        System.out.println("Гіпотенуза трикутника дорівнює " + (Math.sqrt(Math.pow(katet1,2) + Math.pow(katet2,2))));
    }

    static void secondTask()
    {
        Scanner sc = new Scanner(System.in);

        int num;
        int upperBound = 10000;
        int lowerBound = 0;

        do {
            System.out.println("Введіть число");
            num = sc.nextInt();

            if(num < lowerBound || num > upperBound)
            {
                System.out.println("Катети повинні бути в межах від " + lowerBound + " до " + upperBound);
            }
        }while (num < lowerBound || num > upperBound);

        System.out.println("Наступне число після числа " + num + "дорівнює " + (num + 1));
        System.out.println("Попереднє число до числа " + num + "дорівнює " + (num - 1));
    }

    static void thirtTask()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть число дітей");
        int numKids = sc.nextInt();
        System.out.println("Введіть число яблук");
        int numApples = sc.nextInt();

        System.out.println("Порівну буде по " + (numApples / numKids));
    }

    static void forthTask()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть число дітей");
        int numKids = sc.nextInt();
        System.out.println("Введіть число яблук");
        int numApples = sc.nextInt();

        System.out.println("Залишок яблук дорівнює " + (numApples % numKids));
    }

}