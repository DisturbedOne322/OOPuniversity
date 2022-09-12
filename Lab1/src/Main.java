public class Main {
    public static void main(String[] args)
    {
        Vector3 vec1 = new Vector3(1,5,3);
        System.out.println("Перший вектор: ");
        vec1.Print();
        System.out.println();


        Vector3 vec2 = new Vector3();
        System.out.println("Другий вектор: ");
        vec2.Initialize();
        vec2.Print();
        System.out.println();


        Vector3 vec3 = Vector3.Add(vec1,vec2);
        System.out.println("Третій вектор, який дорівнює сумі перших двох: ");
        vec3.Print();
        System.out.println();


        Vector3 vec4 = Vector3.Subtract(vec1,vec2);
        System.out.println("Четвертий вектор, який дорівнює різниці перших двох: ");
        vec4.Print();
        System.out.println("Довжина четвертого вектора");
        System.out.println(vec4.Length());

    }
}