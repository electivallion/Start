package part1.task1;

public class Main {
    public static void main(String[] args) {
        byte byte2 = 8;
        System.out.println(byte2);
        short short2 = 16;
        System.out.println(short2);
        int int2 = 32;
        System.out.println(int2);
        long long2 = 64L;
        System.out.println(long2);
        float float2 = 32.0f;
        System.out.println(float2);
        double double2 = 64.00;
        System.out.println(double2);
        char char2 = '?';
        System.out.println(char2);
        boolean boolean2 = true;
        System.out.println(boolean2);

        int a = 400;
        int b = 20;
        int c = 30;
        int d = 40;
        String e = "Фанзиль";

        double result3 = method1(a, b, c, d);
        System.out.println(result3);

        boolean result4 = method2(a, b);
        System.out.println(result4);

        method3(a);

        boolean result6 = method4(a);
        System.out.println(result6);

        method5(e);

        method6(a);
    }

    public static double method1(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    public static boolean method2(double a, double b) {
        if ((a + b >= 10) && (a + b <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    public static void method3(int a) {
        if (a >= 0) {
            System.out.println("Ваше число положительное!");
        } else {
            System.out.println("Ваше число отрицательное!");
        }
    }

    public static boolean method4(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void method5(String e) {
        System.out.println("Привет, " + e + "!");
    }

    public static void method6(int a) {
        if ((a % 400 == 0) || ((a % 4 == 0) && (a % 100 != 0))) {
            System.out.println(a + "-й год является високосным!");
        } else {
            System.out.println(a + "-й год не является високосным!");
        }
    }
}