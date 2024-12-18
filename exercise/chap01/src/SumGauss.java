import java.util.Scanner;

// 연습문제 1-8
// 1부터 10까지의 합은 (1 + 10) * 5와 같은 방법으로 구할 수 있습니다.
// 가우스의 덧셈이라는 방법을 이용하여 1부터 n까지의 정수 합을 구하는 프로그램을 작성하세요.
class SumGauss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값 : ");
        int n = scanner.nextInt();

        int sum = n * (n + 1) / 2;
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}