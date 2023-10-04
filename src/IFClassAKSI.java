import java.util.Scanner;

public class IFClassAKSI {
     public static void main(String[] args) {
         double  tot_beli;
         Scanner input = new Scanner(System.in);
         IFClass fungsiif = new IFClass();

         System.out.println("Total Pembelian Rp. ");
         fungsiif.TotBeli = input.nextDouble();

         System.out.println("Besarnya Potongan Rp. " + fungsiif.getPotongan());
         System.out.println("Jumlah yang harus dibayarkan Rp. " + fungsiif.JMLBayar());
     }
}
