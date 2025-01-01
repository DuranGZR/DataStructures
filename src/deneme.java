class BagliListe {
    private Node bas;

    // İç düğüm sınıfı
    class Node {
        int veri;
        Node sonraki;

        Node(int veri) {
            this.veri = veri;
            this.sonraki = null;
        }
    }

    // Başa eleman ekler
    public void ekle(int veri) {
        Node yeniDugum = new Node(veri);
        yeniDugum.sonraki = bas;
        bas = yeniDugum;
    }

    // Bağlı listenin uzunluğunu hesapla
    public int uzunluk() {
        Node gecici = bas;
        int uzunluk = 0;

        while (gecici != null) {
            uzunluk++;
            gecici = gecici.sonraki;
        }

        return uzunluk;
    }

    // Listeyi ikiye böl
    public BagliListe ikiyeBol() {
        int uzunluk = uzunluk();

        if (uzunluk < 2) {
            return null; // Tek eleman varsa ikinci liste yok
        }

        // Orta noktaya kadar ilerle
        int orta = uzunluk / 2;
        Node gecici = bas;
        Node once = null;

        for (int i = 0; i < orta; i++) {
            once = gecici;
            gecici = gecici.sonraki;
        }

        // İkiye bölme işlemi
        once.sonraki = null;

        // İkinci listeyi oluştur
        BagliListe ikinciListe = new BagliListe();
        ikinciListe.bas = gecici;

        return ikinciListe;
    }

    // Listeyi yazdır
    public void yazdir() {
        Node gecici = bas;
        while (gecici != null) {
            System.out.print(gecici.veri + " ");
            gecici = gecici.sonraki;
        }
        System.out.println();
    }

    // Test metodu
    public static void main(String[] args) {
        BagliListe liste = new BagliListe();
        liste.ekle(1);
        liste.ekle(2);
        liste.ekle(3);
        liste.ekle(4);
        liste.ekle(5);
        liste.ekle(6);

        System.out.println("Orijinal Liste:");
        liste.yazdir();

        BagliListe ikinciListe = liste.ikiyeBol();

        System.out.println("Birinci Liste:");
        liste.yazdir();

        System.out.println("İkinci Liste:");
        ikinciListe.yazdir();
    }
}
