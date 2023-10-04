public class penjumlahan_genap {
    public static void main(String[] args) {
        System.out.println("Menghitung 10 deret bilangan genap dengan hasilnya");
        System.out.println("==================================================");

        int i=1, genap=2,jumlah=0;

            while(i<=10){

                System.out.print(genap + " ");
                jumlah += genap;
                genap = genap+2;
                i++;
            }
            System.out.println("\n Jumlah => " + jumlah);
    }
}
