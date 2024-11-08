import java.util.Scanner;

// 연습문제 1-11
// 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요.
// 예를 들어 135를 입력하면 '그 수는 3자리입니다.'라고 출력하고,
// 1314를 입력하면 '그 수는 4자리입니다.'라고 출력하면 됩니다.
class DigitsNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("양의 정수를 입력하세요 : ");
            n = scanner.nextInt();
        } while (n <= 0);

        int digitsNo = 0;
        while (n > 0) {
            n /= 10;
            digitsNo++;
        }

        System.out.println("그 수는 " + digitsNo + "자리 입니다.");
    }
}