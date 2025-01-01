import java.util.LinkedList;

public class KarmaVeriYapisi {
    // 1. Karma metodu
    public static int karma(int sayi, int N) {
        return sayi % N;
    }

    // 2. Eleman ekleme metodu
    public static void elemanEkle(LinkedList<Integer>[] listeler, int sayi, int N) {
        int index = karma(sayi, N); // Karma fonksiyonunu kullanarak index belirle
        listeler[index].add(sayi); // Belirtilen listeye eleman ekle
    }

    // 3. Parametre olarak verilen sıranın tüm elemanlarını yazdırma metodu
    public static void listeYazdir(LinkedList<Integer>[] listeler, int index) {
        if (index >= 0 && index < listeler.length) {
            System.out.println("Liste " + index + ": " + listeler[index]);
        } else {
            System.out.println("Geçersiz liste indexi: " + index);
        }
    }

    // 4. Tüm karma listeyi yazdırma metodu
    public static void tumListeyiYazdir(LinkedList<Integer>[] listeler) {
        for (int i = 0; i < listeler.length; i++) {
            System.out.println("Liste " + i + ": " + listeler[i]);
        }
    }

    public static void main(String[] args) {
        int N = 5; // Bağlı liste sayısı
        LinkedList<Integer>[] listeler = new LinkedList[N];

        // Listeleri başlat
        for (int i = 0; i < N; i++) {
            listeler[i] = new LinkedList<>();
        }

        // Karma yapıda en az 5 eleman ekle
        int[] elemanlar = {12, 7, 5, 19, 49};
        for (int eleman : elemanlar) {
            elemanEkle(listeler, eleman, N);
        }

        // Belirli bir sıranın elemanlarını yazdır (örnek: 0. liste)
        listeYazdir(listeler, 2);

        // Tüm karma listeyi yazdır
        tumListeyiYazdir(listeler);
    }
}
