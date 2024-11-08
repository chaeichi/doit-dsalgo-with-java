import java.util.Scanner;

// 연습문제 1-16
// n단의 피라미드를 출력하는 메서드를 작성하세요.
class StarPira {
    static void spira(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i - 1) * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("n단의 피라미드를 출력합니다.");
        System.out.printf("n의 값 : ");
        int n = scanner.nextInt();

        spira(n);
    }
}