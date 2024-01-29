package androidbasicscompose;

public class JavaFunctions {

    public static void main(String[] args) {
        int x = javaMethodParametersAreMutable(2, 3);
        System.out.println(x);
    }

    private static int javaMethodParametersAreMutable(int a, int b) {
        a += 1;
        int c = a + b;
        return c;
    }
}
