import java.util.Scanner;

public class Vector3 {
    int a,b,c;
    public Vector3(){};

    public Vector3(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void Initialize()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть перше значення вектора");
        a = sc.nextInt();
        System.out.println("Введіть друге значення вектора");
        b = sc.nextInt();
        System.out.println("Введіть третє значення вектора");
        c = sc.nextInt();
    }
    public void Print()
    {
        System.out.println("Перше значення: " + a);
        System.out.println("Друге значення: " + b);
        System.out.println("Третє значення: " + c);
    }
    public static Vector3 Add(Vector3 first, Vector3 second)
    {
        Vector3 temp = new Vector3();
        temp.a = first.a + second.a;
        temp.b = first.b + second.b;
        temp.c = first.c + second.c;
        return  temp;
    }
    public static Vector3 Subtract(Vector3 first, Vector3 second)
    {
        Vector3 temp = new Vector3();
        temp.a = first.a - second.a;
        temp.b = first.b - second.b;
        temp.c = first.c - second.c;
        return  temp;
    }
    public double Length()
    {
        return Math.sqrt(this.a * this.a + this.b * this.b + this.c * this.c);
    }

}
