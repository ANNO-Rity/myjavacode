public class PemberiNILAI {
    public static void main(String[] args) {
        int a, c, d, e;
        double b;
        a = 8; b = 10; c = 16; d = 6; e = 9;

        //penggunaan assignment operator
        a *= 2;
        b /= 2;
        c %= 2;
        d += 2;
        e -= 2;

        System.out.println("Nilai pada masing-masing variable sebagai berikut :");
        System.out.println("a = 8; b = 10; c = 16; d = 6; e = 9;");

        System.out.println("Nilai a *= 2 adalah : " + a);
        System.out.println("Nilai b /= 2 adalah : " + b);
        System.out.println("Nilai c %= 2 adalah : " + c);
        System.out.println("Nilai d += 2 adalah : " + d);
        System.out.println("Nilai e -= 2 adalah : " + e);
    }
}
