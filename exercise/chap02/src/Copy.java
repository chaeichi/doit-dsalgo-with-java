import java.util.Scanner;

// 연습문제 2-4
// 배열 b의 모든 요소를 배열 a에 복사하는 메서드 copy를 작성하세요.
class Copy {
    static void copy(int[] a, int[] b) {
        int num = Math.min(a.length, b.length);
        for (int i = 0; i < num; i++) {
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열 a의 요솟수 : ");
        int na = sc.nextInt(); // 배열 a의 요솟수
        int[] a = new int[na]; // 요솟수가 na인 배열

        for (int i = 0; i < na; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = sc.nextInt();
        }

        System.out.print("배열 b의 요솟수 : ");
        int nb = sc.nextInt(); // 배열 b의 요솟수
        int[] b = new int[nb]; // 요솟수가 nb인 배열

        for (int i = 0; i < nb; i++) {
            System.out.print("b[" + i + "] : ");
            b[i] = sc.nextInt();
        }

        copy(a, b);

        System.out.println("배열 b의 모든 요소를 배열 a에 복사하였습니다.");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] : " + a[i]);
        }
    }
}