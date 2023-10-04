import java.io.*;


public class LatBuffered {
    public static void main(String[] args) throws Exception {
        
        //making new object 
        InputStreamReader keyreader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(keyreader);

        //deklareasi variable
        String word1, word2;

        System.out.println("Masukkan Kata Pertama : ");
        word1 = input.readLine();
        System.out.println("Masukkan Kata Kedua : ");
        word2 = input.readLine();
        System.out.println("\n Hasil Input String : " + word1 + " " + word2);
    }
}
