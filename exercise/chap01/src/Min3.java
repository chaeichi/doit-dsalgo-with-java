import java.util.Scanner;

// 연습문제 1-2
// 세 값의 최솟값을 구하는 min3 메서드를 작성하세요.
class Min3 {
    static int min3(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("세 정수의 최솟값을 구합니다.");
        System.out.print("a의 값 : "); int a = scanner.nextInt();
        System.out.print("b의 값 : "); int b = scanner.nextInt();
        System.out.print("c의 값 : "); int c = scanner.nextInt();

        System.out.println("최솟값은 " + min3(a,b,c) + "입니다.");
    }
}