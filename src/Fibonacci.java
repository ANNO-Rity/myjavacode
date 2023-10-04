public class Fibonacci {
    public static void main(String[] args) {
        int bil_input = 7, total_bil = 0, bil1 = 0, bil2 = 1, bil_ulang = 0 ;
        while (bil_ulang <= bil_input) {
            total_bil = bil1 + bil2;
            bil2 = bil1;
            bil1 = total_bil;

            System.out.print(" " + total_bil);
            bil_ulang++;
        }
    }
}
