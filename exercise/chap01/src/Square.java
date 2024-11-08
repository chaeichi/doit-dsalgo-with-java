import java.util.Scanner;

// 연습문제 1-14
// 오른쪽과 같이 입력한 수를 한 변으로 하는 정사각형을 * 기호로 출력하는 프로그램을 작성하세요.
class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("사각형을 출력합니다.");
        System.out.print("단 수 : ");
        int dan = scanner.nextInt();

        for (int i = 1; i <= dan; i++) {
            for (int j = 1; j <= dan; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}