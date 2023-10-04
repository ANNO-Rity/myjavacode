import java.util.Scanner;

public class GAJICLASS {
    
    //Deklarasi variable
    String nama;
    int kode_Golongan;
    int Kode_Pendidikan;
    int jam_Kerja;
    int honor_lembur;
    int honor_final;
    double Tunjangan_Golongan;
    double Tunjangan_Pendidikan;
    int Kode_Jabatan;
    int honor_tetap = 300000;

    //bikin objek Scan
    Scanner input = new Scanner (System.in);

    public int gethonor () {
        return honor_tetap;
    }

    public void nama_karyawan () {
        System.out.print("Nama Karyawan : ");
        nama = input.nextLine();
    }

    public String getName () {
        return nama;
    }

    public void Pemilihan_Golongan () {
        System.out.print("Golongan : ");
        kode_Golongan = input.nextInt();
    }

    public void Proses_Golongan () {
        if (kode_Golongan == 1) {
            Tunjangan_Golongan = 0.5 * honor_tetap;
        }
        else if (kode_Golongan == 2) {
            Tunjangan_Golongan = 0.10 * honor_tetap ;
        }
        else if (kode_Golongan == 3) {
            Tunjangan_Golongan = 0.15 * honor_tetap ;
        }
        else {
            System.out.print("Maaf Kode Golongan Salah, Coba Lagi");
        }
    }

        public double getGolongan () {
            return Tunjangan_Golongan;
        }

    public void Pemilihan_Pendidikan () {
        System.out.print("Pendidikan (SMU / D3 / S1) : ");
        Kode_Pendidikan = input.nextInt();
    }

    public void Proses_Pendidikan () {
        if (Kode_Pendidikan == 1) {
            Tunjangan_Pendidikan = 2.5 * honor_tetap;
        }

        else if (Kode_Pendidikan == 2) {
            Tunjangan_Pendidikan = 5.0 * honor_tetap;
        }

        else if (Kode_Pendidikan == 3) {
            Tunjangan_Pendidikan = 7.5 * honor_tetap;
        }

        else {
            System.out.print("Kode Pendidikan Salah, Coba Lagi");
        }

    }

        public double getPendidikan () {
            return Tunjangan_Pendidikan;
        }

    public void Durasi_kerja() {
        System.out.print("Jumlah Jam Kerja : ");
        jam_Kerja = input.nextInt();
    }

    public void Proses_JamKerja () {
        if (jam_Kerja > 8) {
            honor_lembur = jam_Kerja *= 2500;
        }
    }

    public double getLembur () {
        return honor_lembur;
    }

    public void Proses_Akhir () {
        honor_final = (int) (honor_tetap + Tunjangan_Golongan + Tunjangan_Pendidikan + honor_lembur);
    }

    public int getHonor_Akhir () {
        return honor_final;
    }
}
