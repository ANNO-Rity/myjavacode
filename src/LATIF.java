import java.util.*;


public class LATIF {
    public static void main(String[] args) 
    {
    double tot_beli, potongan=0, jml_bayar=0;
    Scanner input = new Scanner(System.in); 
    
    System.out.println("Total Pembelian Rp. ");
    tot_beli = input.nextDouble();

        if (tot_beli >= 50000)
        potongan = 0.2 * tot_beli;

    System.out.println("Besarnya Potongan Rp. " + potongan);
    jml_bayar = tot_beli - potongan;
    System.out.println("Jml yang harus dibayarkan Rp. " + jml_bayar);
    }
}
