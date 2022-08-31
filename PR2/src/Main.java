import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Literals();
        System.out.println("Сума 2 і 4 = " + Sum(2,4));
        System.out.println("Віднімання 2 і 4 = " + Substract(2,4));
        System.out.println("Множення 2 і 4 = " + Multi(2,4));
        System.out.println("Ділення 4 і 2 = " + Divide(4,2));
        OddCheck(5);
        Scan();
        DaysIfElse(4);
        DaysSwitch(3);
        FirstCycle();
        SecondCycle();
        Fact();
    }

    static void Literals()
    {
        boolean a = true;
        String b = "hello";
        char c = 'a';
        int d2 = 8;
        int d8 = 255;
        int d10 = 1024;
        int d16 = 65535;
        float e = 5.5f;
        double f = 1.0232151512;
        System.out.println("Логічний: " + a);
        System.out.println("Рядковий " + b);
        System.out.println("Символьний " + c);
        System.out.println("Ціле число 2 порядку " + d2);
        System.out.println("Ціле число 8 порядку " + d8);
        System.out.println("Ціле число 10 порядку " + d10);
        System.out.println("Ціле число 16 порядку " + d16);
        System.out.println("Число типу float " + e);
        System.out.println("Число типу double " + f);
    }

    static int Sum(int a, int b)
    {
        return a + b;
    }
    static int Substract(int a, int b)
    {
        return a - b;
    }
    static int Multi(int a, int b)
    {
        return a * b;
    }
    static int Divide(int a, int b)
    {
        return a / b;
    }

    static void OddCheck(int a)
    {
        if(a % 2 != 0)
        {
            System.out.println(a);
        }
    }
    static void Scan()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть число");
        int num = sc.nextInt();
        if(num >= 0 && num <=10)
        {
            System.out.println("Позитивне число менше 10 або нуль");
        }
        else
        {
            System.out.println("Позитивне число більше 10 або негативне");
        }
    }

    static void DaysIfElse(int day)
    {
        if(day < 1 || day > 7)
        {
            return;
        }

        if(day == 1)
        {
            System.out.println("Пн");
        }
        else if(day == 2)
        {
            System.out.println("Вт");
        }
        else if(day == 3)
        {
            System.out.println("Ср");
        }
        else if(day == 4)
        {
            System.out.println("Чт");
        }
        else if(day == 5)
        {
            System.out.println("Пт");
        }
        else
        {
            System.out.println("Вихідний");
        }
    }

    static void DaysSwitch(int day)
    {
        if(day < 1 || day > 7)
        {
            return;
        }

        switch (day){
            case 1: System.out.println("Пн");
                break;
            case 2: System.out.println("Вт");
                break;
            case 3: System.out.println("Ср");
                break;
            case 4: System.out.println("Чт");
                break;
            case 5: System.out.println("Пт");
                break;
            default: System.out.println("Вихідний");
                break;
        }
    }

    static void FirstCycle()
    {
        int i = 1;
        while(i <= 10)
        {
            System.out.println("Task" + i);
            i++;
        }
    }
    static void SecondCycle()
    {
        int i = 1;
        do
        {
            if(i % 5 == 0)
            {
                System.out.println(i);
            }
            i++;
        }while (i <= 100);
    }

    static void Fact()
    {
        int fact = 1;
        int rand = (int)(Math.random() * 5 + 1);
        for(int i = 1; i <= rand; i++)
        {
            fact *= i;
        }
        System.out.println(fact);
    }

}