public class Operator_Pembanding {
    public static void main(String[] args) {
        
        int a, b, c, d, e, f;
        boolean aa, bb, cc, dd, ee, ff;

        a = 6; b = 7; c = 4; d = 10; e = 9; f = 3;

        aa = a == b;
        bb = b > c;
        cc = c < d;
        dd = d >= e;
        ee = e <= f;
        ff = b != a;

        System.out.println("apakah " + a + " == " + b + " ? Jawabannya = " + aa);
        System.out.println("apakah " + b + " > " + c + " ? Jawabannya = " + bb);
        System.out.println("apakah " + c + " < " + d + " ? Jawabannya = " + cc);
        System.out.println("apakah " + d + " >= " + e + " ? Jawabannya = " + dd);
        System.out.println("apakah " + e + " <= " + f + " ? Jawabannya = " + ee);
        System.out.println("apakah " + b + " != " + a + " ? Jawabannya = " + ff);
    }
}
