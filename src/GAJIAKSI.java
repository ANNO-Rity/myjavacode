public class GAJIAKSI extends GAJICLASS {
    public static void main(String[] args) {
        
        // bikin objek "scan" buat manggil method dari GAJICLASS.java

        GAJICLASS scan = new GAJICLASS();

        System.out.println("Dingin Damai Memberikan Tunjangan Honor");
        System.out.println("=======================================");
        System.out.println("Kode        Golongan        Tunjangan");
        System.out.println(" 1             1                5%    ");
        System.out.println(" 2             2                10%   ");
        System.out.println(" 3             3                15%   ");
        System.out.println("\n =======================================");

        System.out.println("Kode        Pendidikan        Tunjangan");
        System.out.println(" 1              SMU              2.5%  ");
        System.out.println(" 2              D3                 5%  ");
        System.out.println(" 3              S1               7.5%  ");
        System.out.println("==========================================");

        //manggil Input/Output method pake "scan" Object

        scan.nama_karyawan();
        scan.Pemilihan_Golongan();
        scan.Proses_Golongan();
        scan.Pemilihan_Pendidikan();
        scan.Proses_Pendidikan();
        scan.Durasi_kerja();
        scan.Proses_JamKerja();
        scan.Proses_Akhir();

        System.out.println("=============================================");
        //Calling input / output method by using "scan" method

        scan.nama_karyawan();
        scan.Pemilihan_Golongan();
        scan.Proses_Golongan();
        scan.Pemilihan_Pendidikan();
        scan.Proses_Pendidikan();
        scan.Durasi_kerja();
        scan.Proses_JamKerja();
        scan.Proses_Akhir();

        System.out.println("=============================================");

        System.out.println("Karyawan yang Bernama : " + scan.getName());
        System.out.println("HONOR YANG DITERIMA");
        System.out.println("Honor Tetap : Rp. " + scan.gethonor());
        System.out.println("tunjangan Jabatan : Rp. " + scan.getGolongan());
        System.out.println("Tunjangan Pendidikan : Rp. " + scan.getPendidikan());
        System.out.println("Honor Lembur : Rp. " + scan.getLembur());
        System.out.println("==============================================");
        System.out.println("Total Honor yang diterima : Rp. " + scan.getHonor_Akhir());
        
    }
}
