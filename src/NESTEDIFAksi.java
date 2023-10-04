public class NESTEDIFAksi {
    public static void main(String[] args) {
        NESTEDIFClass nestedif = new NESTEDIFClass();

        nestedif.Pendapatansales();
        nestedif.getPotongan();

        System.out.println("\n Uang Jasa : " + (int)nestedif.jasa);
        System.out.println(" Uang Komisi : " + (int)nestedif.komisi);
        System.out.println("=====================================================");
        System.out.println(" Uang Total : " + (int)nestedif.total);
    }
}
