public class Sepeda {
    
    Package inheritance;

    class sepeda {
        //nilai
        int kecepatan = 0;
        int gir = 0;

        //method
        void UbahGir(int PertambahanGir ) {
            System.out.println("Gir = " + gir);
        }

        void TambahKecepatan (int PertambahanKecepatan) {
            kecepatan = kecepatan + PertambahanKecepatan;
            System.out.println("Kecepatan = " + kecepatan);
        }

    }
}
