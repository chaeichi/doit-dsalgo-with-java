// 연습문제 1-5
// 중앙값을 구하는 메서드는 다음과 같이 작성할 수도 있습니다.
// 그러나 실습 1C-1의 med3 메서드에 비해 효율이 떨어지는데, 그 이유를 설명하세요.
class Med3x {
    // 처음 if가 성립하지 않는 경우, 2번째 if에서 실질적으로 동일한 판단을 수행하므로 효율이 나빠진다.
    // if 'b >= a' 및 'b <= a'가 else if 'a > b' 및 'a < b'로 수행
    static int med3(int a, int b, int c) {
        if ((b >= a && c <= a) || (b <= a && c >= a))
            return a;
        else if ((a > b && c < b) || (a < b && c > b))
            return b;
        return c;
    }

    public static void main(String[] args) {
        System.out.println("med(3,2,1) = " + med3(3,2,1)); // [A] a > b > c
        System.out.println("med(3,2,2) = " + med3(3,2,2)); // [B] a > b = c
        System.out.println("med(3,1,2) = " + med3(3,1,2)); // [C] a > c > b
        System.out.println("med(3,2,3) = " + med3(3,2,3)); // [D] a = c > b
        System.out.println("med(2,1,3) = " + med3(2,1,3)); // [E] c > a > b
        System.out.println("med(3,3,2) = " + med3(3,3,2)); // [F] a = b > c
        System.out.println("med(3,3,3) = " + med3(3,3,3)); // [G] a = b = c
        System.out.println("med(2,2,3) = " + med3(2,2,3)); // [H] c > a = b
        System.out.println("med(2,3,1) = " + med3(2,3,1)); // [I] b > a > c
        System.out.println("med(2,3,2) = " + med3(2,3,2)); // [J] b > a = c
        System.out.println("med(1,3,2) = " + med3(1,3,2)); // [K] b > c > a
        System.out.println("med(2,3,3) = " + med3(2,3,3)); // [L] b = c > a
        System.out.println("med(1,2,3) = " + med3(1,2,3)); // [M] c > b > a
    }
}