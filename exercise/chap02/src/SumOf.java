import java.util.Scanner;

// 연습문제 2-3
// 배열 a의 모든 요소의 합계를 구하여 반환하는 메서드를 작성하세요.
class SumOf {
    static int sumOf(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요솟수 : ");
        int num = sc.nextInt(); // 요솟수

        int[] x = new int[num]; // 요솟수가 num인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        System.out.println("모든 요소의 합계는 " + sumOf(x) + "입니다.");
    }
}