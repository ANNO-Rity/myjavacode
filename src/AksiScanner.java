import java.util.Scanner;

public class AksiScanner {
    public static void main(String[] args) {
        
        ClassScanner scan = new ClassScanner();

        scan.inputScanner();
        System.out.println("\n Nama Anda : " + scan.getnama());
        System.out.println("Nilai Anda : " + scan.rata());
    }
}
