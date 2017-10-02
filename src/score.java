public class score {
    public static void main(String[] args) {
        //顯示訊息
        java.util.Scanner sc = new java.util.Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();

        double sum = n1 + n2 + n3;
        double average = sum / 3;

        System.out.println(sum + " " + average);

    }
}
