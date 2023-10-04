public class LatihanVar {
    
    public static void main(String[] args) {
        System.out.println("PBO 17.2A.11");
        System.out.println("NIM : 17210850");
        System.out.println("NAMA : ARIE KURNIA PUTRATAMA");
        System.out.println("===================================");
        System.out.println("Keliling Lingkaran");
        System.out.println("jari-jari = 14");

        //variable-nya
        int JariJari=14;
        double keliling;
        final double Pi = 3.14;

        //rumus-nya
        keliling = 2*Pi*JariJari;
        System.out.println("Keliling = 2x " + Pi + " x " + JariJari);
        System.out.println("Keliling Lingkaran adalah = "+keliling);
        System.out.println("=====================================");
        
        System.out.println("");
        
        System.out.println("-------------------------------------");
        System.out.println("-------------Luas Segitiga-----------");

        //variable utk menghitung luas segitiga
        int Alas = 10;
        double Luas;
        final double Tinggi = 20;

        //rumus luas Segitiga
        Luas = 0.5*Alas*Tinggi;
        System.out.println("Luas = 0.5x" + Alas + " x " + Tinggi);
        System.out.println("Luas Segitiga adalah = " + Luas);
        System.out.println("====================================");
        
        System.out.println("");
        
        System.out.println("-------------------------------------");
        System.out.println("-------------keliling segitiga-------");

        //variable utk menghiitung keliling segitiga
        int sisi1 = 10;
        double KELILING;
        final double sisi2 = 25;

        //rumus luas Segitiga
        KELILING = sisi1 + sisi2 + sisi2;
        System.out.println("Keliling segitiga = " + sisi1 + " + " + sisi2 + " + " + sisi2);
        System.out.println("Keliling Segitiga = " + KELILING);
        System.out.println("====================================");

        
        System.out.println("");
        
        System.out.println("-------------------------------------");
        System.out.println("---------Luas Persegi Panjang--------");

        //variable utk menghitung luas persegi panjang
        int panjang = 60;
        double luas;
        final double lebar = 40;

        //rumus luas persegi panjang 
        luas = panjang*lebar;
        System.out.println("Luas = " + panjang + " x " + lebar);
        System.out.println("Luas Persegi Panjang adalah = " + luas);
        System.out.println("-------------------------------------");

        System.out.println("");

        System.out.println("======================================");
        System.out.println("------Keliling Persegi Panjang--------");

        //variable utk menghitung keliling persegi panjang
        int Panjang = 60 ;
        double Kelilingpersegipanjang ;
        final double Lebar = 40 ;

        //rumus keliling persegi panjang
        Kelilingpersegipanjang = 2*(Panjang+Lebar);
        System.out.println("Keliling persegi panjang adalah = 2 x ( " + Panjang + " + " + Lebar + " )" );
        System.out.println("Keliling Persegi Panjang adalah = " + Kelilingpersegipanjang);
        System.out.println("***********************************************************");



    }
}
