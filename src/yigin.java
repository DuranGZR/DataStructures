import java.util.LinkedList;

public class yigin {
    // LinkedList veri yapısı, yığını (stack) temsil eder.
    private LinkedList<String> stack;

    // Constructor: Yığın oluşturulduğunda LinkedList örneği başlatılır.
    public yigin() {
        this.stack = new LinkedList<>();
    }

    // Yığına eleman ekleme (push) işlemi
    public void ekle(String eleman) {
        // Elemanı LinkedList'in sonuna ekler.
        stack.addLast(eleman);
    }

    // Yığından eleman çekme (pop) işlemi
    public String cek() {
        // Yığın boşsa uyarı mesajı verir ve null döner.
        if (bosMu()) {
            System.out.println("Yığın boş, çekilecek eleman yok.");
            return null;
        }
        // Yığının sonundaki elemanı kaldırır ve geri döner.
        return stack.removeLast();
    }

    // Yığında belirli bir elemanın var olup olmadığını kontrol eder
    public boolean ara(String eleman) {
        // LinkedList'in eleman içerip içermediğini kontrol eder.
        return stack.contains(eleman);
    }

    // Yığının boş olup olmadığını kontrol eder
    public boolean bosMu() {
        // LinkedList'in boş olup olmadığını döner.
        return stack.isEmpty();
    }

    // Yığındaki tüm elemanları yazdırır
    public void yazdir() {
        // Eğer yığın boşsa uyarı mesajı verir.
        if (bosMu()) {
            System.out.println("Yığın boş, yazdırılacak eleman yok.");
            return;
        }
        // Yığında mevcut tüm elemanları yazdırır.
        System.out.println("Yığın elemanları:");
        for (String eleman : stack) {
            System.out.println(eleman);
        }
    }

    // Programın ana metodu
    public static void main(String[] args) {
        // Yeni bir yığın (stack) oluşturulur.
        yigin yigin = new yigin();

        // Yığına eleman eklenir ve durum yazdırılır.
        yigin.ekle("Emir");
        yigin.yazdir();

        yigin.ekle("Can");
        yigin.yazdir();

        yigin.ekle("Can");
        yigin.yazdir();

        yigin.ekle("Kanat");
        yigin.yazdir();

        // Yığından eleman çekilir ve her çekişten sonra durum yazdırılır.
        while (!yigin.bosMu()) {
            // Yığının sonundaki eleman çekilir.
            String cekilenEleman = yigin.cek();
            // Çekilen eleman ekrana yazdırılır.
            System.out.println("Çekilen Eleman: " + cekilenEleman);
            // Güncel yığın durumu yazdırılır.
            yigin.yazdir();
        }
    }
}
