import java.util.Scanner;

// 연습문제 1-15
// 왼쪽 아래, 왼쪽 위, 오른쪽 위, 오른쪽 아래가 직각인 이등변 삼각형을 출력하는 메서드를 작성하세요.
class Triangle {
    static void triangleLB(int n) { // 왼쪽 아래가 직각인 이등변 삼각형을 출력
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleLU(int n) { // 왼쪽 위가 직각인 이등변 삼각형을 출력
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRU(int n) { // 오른쪽 위가 직각인 이등변 삼각형을 출력
        for (int i = n; i >= 1; i--) {
            for (int k = 1; k <= (n-i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRB(int n) { // 오른쪽 아래가 직각인 이등변 삼각형을 출력
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n-i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("몇 단 삼각형입니까? : ");
            n = scanner.nextInt();
        } while (n <= 0);

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
        triangleLB(n);

        System.out.println("왼쪽 위가 직각인 이등변 삼각형을 출력합니다.");
        triangleLU(n);

        System.out.println("오른쪽 위가 직각인 이등변 삼각형을 출력합니다.");
        triangleRU(n);

        System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
        triangleRB(n);
    }
}