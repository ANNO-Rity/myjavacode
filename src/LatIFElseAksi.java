public class LatIFElseAksi {
    public static void main(String[] args) {
        
        //bikin objek baru dari class LatIFElseClass.java
        LatIFElseClass ifclass = new LatIFElseClass();

        ifclass.setInputdata();
        ifclass.getKeterangan();
         System.out.println("hasil akhir");
         System.out.println("=======================================================");
         System.out.println("Nama Siswa               : " + ifclass.nama);
         System.out.println("Nilai Akhir yang Didapat : " + ifclass.nilAkhir);
         System.out.println("Keterangan               : " + ifclass.getKeterangan());
         System.out.println("========================================================");
    }
}
