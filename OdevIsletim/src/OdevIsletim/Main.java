// Main.java

package OdevIsletim;

public class Main {
    public static void main(String[] args) {
        BagliListe liste = new BagliListe();
        DosyadanOkuma dosyaOkuma = new DosyadanOkuma("C:\\Users\\keren\\eclipse-workspace\\OdevIsletim\\src\\OdevIsletim\\giris.txt");

        dosyaOkuma.okuma(liste);

        
       
    }
}
