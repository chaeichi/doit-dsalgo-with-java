import java.util.Scanner;

// 연습문제 1-17
// 아래를 향한 n단의 숫자 피라미드를 출력하는 메서드를 작성하세요.
// i행에 출력하는 숫자는 i % 10으로 구하세요.
class NumPira {
    static void npira(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i-1) * 2 + 1; k++) {
                System.out.print(i % 10);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("n단의 숫자 피라미드를 출력합니다.");
        System.out.printf("n의 값 : ");
        int n = scanner.nextInt();

        npira(n);
    }
}