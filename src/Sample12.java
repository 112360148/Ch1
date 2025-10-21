public class Sample12 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        System.out.println("num1 和 num2 的各種運算:");
        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println("num1 % num2 = " + (num1 % num2));

        int a = 0, b = 0, c = 0;
        b = a++;   // 後置遞增：先指定再加 1
        c = ++a;   // 前置遞增：先加 1 再指定

        System.out.println("因為 a 是在指定後才遞增，所以 b 的值為 " + b);
        System.out.println("因為 a 是在遞增之後才指定，所以 c 的值為 " + c);
    }
}
