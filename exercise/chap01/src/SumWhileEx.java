import java.util.Scanner;

// 연습문제 1-6
// 실습 1-4에서 while문이 종료될 때 변수 i 값이 n + 1이 됨을 확인하세요
// (변수 i의 값을 출력하도록 프로그램을 수정하세요)
class SumWhileEx {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값 : ");
        int n = stdIn.nextInt();

        int sum = 0; // 합
        int i = 1;

        while (i <= n) { // i가 n 이하면 반복합니다.
            sum += i; // sum에 i를 더합니다.
            i++; // i 값을 1만큼 증가시킵니다.
        }

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
        System.out.println("i의 값은 " + i + "입니다.");
    }
}