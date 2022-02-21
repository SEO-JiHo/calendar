import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        System.out.println("Hello, Calendar");

        //입력한 달의 최대 일수 출력하기
        System.out.println("몇 월?");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int[] k = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.printf("%d월은 %d일 까지 있습니다.", a, k[a]);
        }

}
