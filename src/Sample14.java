public class Sample14 {
    public static void main(String[] args) {
        int d = 2;
        double pi = 3.14;

        System.out.println("直徑是 " + d + " 公分的圓");
        System.out.println("其圓周為 " + (d * pi) + " 公分");

        int num1 = 5;
        int num2 = 4;

        double div1 = num1 / num2;             // 整數相除 → 結果仍是整數
        double div2 = (double) num1 / num2;    // 轉型為 double → 正確小數結果

        System.out.println("5 / 4 等於 " + div1);
        System.out.println("5 / 4 等於 " + div2);
    }
}
