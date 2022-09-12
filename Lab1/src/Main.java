public class Main {
    public static void main(String[] args)
    {
        Vector3 vec1 = new Vector3(1,5,3);
        vec1.Print();

        Vector3 vec2 = new Vector3();
        vec2.Initialize();
        vec2.Print();

        Vector3 vec3 = Vector3.Add(vec1,vec2);
        vec3.Print();

        Vector3 vec4 = Vector3.Subtract(vec1,vec2);
        vec4.Print();
        System.out.println(vec4.Length());
    }
}