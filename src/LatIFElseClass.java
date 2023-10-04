import java.util.Scanner;

public class LatIFElseClass {
    public String nama,ket;
    public int nilAkhir;
    Scanner input = new Scanner(System.in);

    public void setInputdata () {
        System.out.println("Masukkan nama Siswa : ");
        nama = input.nextLine();
        System.out.println("Masukkan Nilai Akhir : ");
        nilAkhir= input.nextInt();
    }

    public String getKeterangan() {
        if(nilAkhir > 70) {
            //perintah jika kondisi true
            ket="lulus";
        }else{
            //perintah jika kondisi false
            ket="Gagal";
        }
        return ket;
    }
}
