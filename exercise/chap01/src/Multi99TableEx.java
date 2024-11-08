// 연습문제 1-12
// 오른쪽과 같이 위쪽과 왼쪽에 곱하는 수가 있는 곱셈표를 출력하는 프로그램을 작성하세요.
// 구분선은 수직선 기호(|), 마이너스 기호(-), 플러스 기호(+)를 사용하세요.
class Multi99TableEx {
    public static void main(String[] args) {
        System.out.print("   |");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        System.out.println("---+---------------------------");

        for (int i = 1; i <= 9; i++) {
            System.out.print("  " + i + "|");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}