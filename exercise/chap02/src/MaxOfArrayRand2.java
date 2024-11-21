import java.util.Random;
import java.util.Scanner;

// 연습문제 2-1
// 키뿐만 아니라 사람 수도 난수로 생성하도록 실습 2-5를 수정하여 프로그램을 작성하세요.
class MaxOfArrayRand2 {
    // 배열 a의 최댓값을 구하여 반환합니다.
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) max = a[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        int num = rand.nextInt(10) + 1; // 사람 수를 1 ~ 10까지의 난수로 설정
        System.out.println("사람 수는 " + num + "명입니다.");

        int[] height = new int[num];

        System.out.println("키 값은 아래와 같습니다.");
        for (int i = 0; i < num; i++) {
            height[i] = 100 + rand.nextInt(90); // 요소의 값을 난수로 결정
            System.out.println("height[" + i + "] : " + height[i]);
        }

        System.out.println("최댓값은 " + maxOf(height) + "입니다.");
    }
}