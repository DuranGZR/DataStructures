import java.util.LinkedList;

public class yigin {
    private LinkedList<String> stack;

    public  yigin() {
        this.stack = new LinkedList<>();
    }

    // Yığına eleman ekleme
    public void ekle(String eleman) {
        stack.addLast(eleman);
    }

    // Yığından eleman çekme (yığın boş mu kontrolü yaparak)
    public String cek() {
        if (bosMu()) {
            System.out.println("Yığın boş, çekilecek eleman yok.");
            return null;
        }
        return stack.removeLast();
    }

    // Yığında eleman arama
    public boolean ara(String eleman) {
        return stack.contains(eleman);
    }

    // Yığın boş mu kontrolü
    public boolean bosMu() {
        return stack.isEmpty();
    }

    // Yığındaki tüm elemanları yazdırma
    public void yazdir() {
        if (bosMu()) {
            System.out.println("Yığın boş, yazdırılacak eleman yok.");
            return;
        }

        System.out.println("Yığın elemanları:");
        for (String eleman : stack) {
            System.out.println(eleman);
        }
    }

    public static  void main(String[] args) {
        yigin yigin = new yigin();

        // Eleman ekleme
        yigin.ekle("Ali");
        yigin.yazdir();

        yigin.ekle("Baki");
        yigin.yazdir();

        yigin.ekle("Can");
        yigin.yazdir();

        yigin.ekle("Kaan");
        yigin.yazdir();

        // Eleman çekme ve yazdırma
        while (!yigin.bosMu()) {
            String cekilenEleman = yigin.cek();
            System.out.println("Çekilen Eleman: " + cekilenEleman);
            yigin.yazdir();
        }
    }
}