public class Penjumlahan_Ganjil {
    public static void main(String[] args) {
        
        System.out.println("Menghitung 10 deret bilangan ganjil dengan hasilnya");
        System.out.println("==================================================");

        int i=1, ganjil=1,jumlah=0;

            while(i<=10){

                System.out.print(ganjil + " ");
                jumlah += ganjil;
                ganjil = ganjil+2;
                i++;
            }
            System.out.println("\n Jumlah => " + jumlah);
    }
}
