import java.util.LinkedList;

public class Kuyruk {
    // LinkedList veri yapısı, kuyruğu temsil eder.
    private LinkedList<String> kuyruk;

    // Constructor: Kuyruk oluşturulduğunda LinkedList başlatılır.
    public Kuyruk() {
        kuyruk = new LinkedList<>();
    }

    // 1. Kuyruğa eleman ekleme (enqueue) işlemi
    public void elemanEkle(String eleman) {
        // Eleman LinkedList'in sonuna eklenir.
        kuyruk.add(eleman);
    }

    // 2. Kuyruktan eleman çekme (dequeue) işlemi
    public String elemanCek() {
        // Eğer kuyruk boşsa uyarı mesajı döner.
        if (kuyruk.isEmpty()) {
            return "Kuyruk boş!";
        }
        // Kuyruğun başındaki eleman kaldırılır ve döndürülür.
        return kuyruk.removeFirst();
    }

    // 3. Kuyrukta eleman arama işlemi
    public boolean elemanAra(String eleman) {
        // Elemanın LinkedList içinde olup olmadığı kontrol edilir.
        return kuyruk.contains(eleman);
    }

    // 4. Kuyruğun boş olup olmadığını kontrol eder
    public boolean kuyrukBosMu() {
        // LinkedList'in boş olup olmadığını döndürür.
        return kuyruk.isEmpty();
    }

    // 5. Kuyruktaki tüm elemanları yazdırma işlemi
    public void tumElemanlariYazdir() {
        // Eğer kuyruk boşsa uyarı mesajı yazdırılır.
        if (kuyruk.isEmpty()) {
            System.out.println("Kuyruk boş!");
        } else {
            // Kuyruktaki elemanlar ekrana yazdırılır.
            System.out.println("Kuyruktaki elemanlar: " + kuyruk);
        }
    }

    // Programın ana metodu
    public static void main(String[] args) {
        // Yeni bir kuyruk (queue) nesnesi oluşturulur.
        Kuyruk kuyruk = new Kuyruk();

        // Kuyruğa eleman eklenir ve durum yazdırılır.
        kuyruk.elemanEkle("A");
        kuyruk.elemanEkle("B");
        kuyruk.elemanEkle("C");
        System.out.println("Elemanlar eklendi:");
        kuyruk.tumElemanlariYazdir();

        // Kuyruktan eleman çekilir ve durum yazdırılır.
        System.out.println("Çekilen eleman: " + kuyruk.elemanCek());
        kuyruk.tumElemanlariYazdir();

        // Belirli bir eleman kuyruğun içinde mi kontrol edilir.
        System.out.println("B elemanı kuyruğun içinde mi? " + kuyruk.elemanAra("B"));

        // Kuyruğun boş olup olmadığı kontrol edilir.
        System.out.println("Kuyruk boş mu? " + kuyruk.kuyrukBosMu());

        // Kalan elemanlar yazdırılır.
        kuyruk.tumElemanlariYazdir();
    }
}
