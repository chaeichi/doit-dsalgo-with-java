import java.util.Scanner;

// 연습문제 1-9
// 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 아래 메서드를 작성하세요.
class SumOf {
    static int sumof(int a, int b) {
        int min;
        int max;

        if (a < b) {
            min = a; max = b;
        } else {
            min = b; max = a;
        }

        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구합니다.");
        System.out.print("a의 값 : "); int a = scanner.nextInt();
        System.out.print("b의 값 : "); int b = scanner.nextInt();

        System.out.println("정수 a, b 사이의 모든 정수의 합은 " + sumof(a,b) + "입니다.");
    }
}