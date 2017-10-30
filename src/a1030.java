public class a1030  {
        public static void main(String[] args) {
            java.util.Scanner aa = new java.util.Scanner(System.in);
            System.out.println("請輸入成績");

            int grade= aa.nextInt();

            if (grade  >=60){
                System.out.println("成績及格:" + grade);
            }
            else
            {
                System.out.println("成績不及格:" + grade);
            }
        }
    }



