public class IFClass {
    public double TotBeli, Potongan;

    public void SetTotalbeli (double a) {
        TotBeli = a;
    }

    public double getPotongan() {
        if (TotBeli >= 50000) {
            Potongan = 0.2 * TotBeli;
        }
        return Potongan;
    }
    public double JMLBayar () {
        return (TotBeli - Potongan);
    }
}
