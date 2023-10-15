
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> gidilecek_yerler = new LinkedList<String>();

        /*
        gidilecek_yerler.add("posthane");
        gidilecek_yerler.add("okul");
        gidilecek_yerler.add("market");

        gidilecek_yerler.add(2, "manitanin ev");                      // EKLEME
        gidilecek_yerler.remove(0);                                   // CIKARMA
*/

        sirali_ekle(gidilecek_yerler, "berkcan");
        sirali_ekle(gidilecek_yerler, "cengiz");
        sirali_ekle(gidilecek_yerler, "mustafa");
        sirali_ekle(gidilecek_yerler, "atakan");
        
        bastir(gidilecek_yerler);
    }

    public static void bastir(LinkedList<String> x) {

        ListIterator<String> iterator = x.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void sirali_ekle(LinkedList<String> x, String yeni) {                   // bu fonksiyonun işlevinin tam yerine gelmesi için tüm değerleri bununla girmek lazım çnk
        ListIterator<String> iterator = x.listIterator();                                 // geçmişteki değerlerin siralamasini yapmiyor.

        while (iterator.hasNext()) {
            int karsilastir = iterator.next().compareTo(yeni);

            if (karsilastir == 0) {
                System.out.println(yeni + " zaten listede mevcut.");

            } else if (karsilastir < 0) {

            } else if (karsilastir > 0) {

                iterator.previous();
                iterator.add(yeni);
                return;
            }
        }
        iterator.add(yeni);

    }

}
