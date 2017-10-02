public class temperature {
    public static void main(String[] args) {
        //顯示訊息
        java.util.Scanner sc  = new java.util.Scanner(System.in);

        System.out.println("請輸入攝氏") ;
        double c = sc.nextDouble();

        double f = c * 9/5+32;

        System.out.println("攝氏: " + c);
        System.out.println("華氏 : " + f);
    }

}
