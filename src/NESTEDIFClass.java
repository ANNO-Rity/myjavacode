import java.util.Scanner;

public class NESTEDIFClass {
    public int pendapatan;
    public double jasa, komisi, total;

    Scanner input = new Scanner(System.in);
    public void Pendapatansales () {
        System.out.println("Masukkan pendapatan Sales : ");
        pendapatan = input.nextInt();
    }

    public double getPotongan () {
        if (pendapatan >= 0 && pendapatan <= 200000 ) {
            jasa = 10000;
            komisi = 0.1 * pendapatan;
            total = komisi + jasa;
        }
        
        else if (pendapatan <= 500000) {
            jasa = 20000;
            komisi = 0.15 * pendapatan;
            total = komisi + jasa;
        }

        else{
            jasa = 30000;
            komisi = 0.20 * pendapatan;
            total = komisi + jasa;
        }
        return total;
    }
}
