import java.util.Scanner;

public class LatScanner {
    public static void main(String[] args) {
        
        //memabuat objek baru
        Scanner input = new Scanner(System.in);

        //deklarasi variable

        String nama;
        int n2;
        double n1, n3;

        System.out.println("Masukkan Nama Anda : ");
        nama = input.nextLine();
        System.out.println("Masukkan Nilai 1 : ");
        n1 = input.nextDouble();
        System.out.println("Masukkan Nilai 2 : ");
        n2 = input.nextInt();

        n3 = n1 + n2;
        System.out.println("\n Nama Anda : " + nama);

        System.out.println("Nilai Anda : " + n3);
    }
}
