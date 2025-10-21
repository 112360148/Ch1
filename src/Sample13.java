public class Sample13 {
    public static void main(String[] args) {
        double dnum = 160.5;
        System.out.println("身高是 " + dnum + " 公分");

        System.out.println("指定給 int 型態的變數");
        int inum = (int) dnum;  // 強制轉型 (cast)
        System.out.println("身高是 " + inum + " 公分");
    }
}
