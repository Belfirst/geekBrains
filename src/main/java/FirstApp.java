public class FirstApp {


    public static void main(String[] args) {


        System.out.println("Hello World");

        byte h = 2;
        short s = 30000;
        int i = 35000;
        long l = 20000000L;
        float f = 9.53f;
        double e = 9.5341;
        char g = 'd';
        boolean bool = true;
        String string = "Hello";

        System.out.println(expression(6.23f, 5.15f, 7.11f, 8.07f));

        System.out.println(compareNumber(10, 10));

        checkSing(0);

        System.out.println(getCheckSing(30));

        printName("Name");

        year(1962);

    }

    public static float expression(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean compareNumber(int a, int b) {
        return a + b <= 20 && a + b >= 10;
    }

    public static void checkSing(int a) {
        if (a >= 0)
            System.out.println("Число положительное.");
        else System.out.println("Число отрицательное");
    }

    public static boolean getCheckSing(int a) {
        return a >= 0;
    }

    public static void printName(String name) {
        System.out.println("Привет " + name);
    }

    public static void year(int a) {
        if (a % 4 == 0)
            System.out.println("Год высокосный.");
        else System.out.println("Обычный такой год");
    }

}
