import java.util.Scanner;

// 연습문제 1-10
// 두 변수 a, b에 정수를 입력하고 b - a를 출력하는 프로그램을 작성하세요.
// 단, 변수 b에 입력한 값이 a 이하면 변수 b의 값을 다시 입력하세요.
class Difference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a의 값 : ");
        int a = scanner.nextInt();
        int b;

        while (true) {
            System.out.print("b의 값 : ");
            b = scanner.nextInt();
            if (b > a) break;
            System.out.println("a보다 큰 값을 입력하세요!");
        }

        System.out.println("b - a는 " + (b - a) + "입니다.");
    }
}