public class program2 {
    public static void main(String[] args) {
        boolean[] isPrime = new boolean[1001];
        for (int i = 2; i <= 1000; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= 1000; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= 1000; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        System.out.print("Простые числа от 1 до 1000:\n");
        for (int i = 2; i <= 1000; i++) {
            if (isPrime[i]) System.out.print(i + " ");
            }
        }
}
