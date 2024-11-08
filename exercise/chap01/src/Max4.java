import java.util.Scanner;

// 연습문제 1-1
// 네 값의 최대값을 구하는 Max4 메서드를 작성하세요.
class Max4 {
    static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("네 정수의 최대값을 구합니다.");
        System.out.print("a의 값 : "); int a = scanner.nextInt();
        System.out.print("b의 값 : "); int b = scanner.nextInt();
        System.out.print("c의 값 : "); int c = scanner.nextInt();
        System.out.print("d의 값 : "); int d = scanner.nextInt();

        System.out.println("최대값은 " + max4(a,b,c,d) + "입니다.");
    }
}