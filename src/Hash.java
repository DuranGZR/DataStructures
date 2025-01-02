import java.util.LinkedList;
public class Hash {

    // KARMA METHODU
    public static int karma(int sayi, int N){
        return sayi%N;
    }

    // ELEMAN EKLE
    public static void elemanEkle(LinkedList<Integer>[] listeler, int N, int sayi){
        int index = karma(sayi, N);
        listeler[index].add(sayi);
    }

    //  N. LİSTEYİ YAZDIR
    private static void ListeYazdir(LinkedList<Integer>[] listeler,  int index){
        if(index >= 0 && index < listeler.length){
            System.out.println(listeler[index]);
        }
        else{
            System.out.println("Yazdir bulunamadi");
        }
    }

    //  TÜM ELEMANLARI YAZDIR
     public static void tğümListeyiYAzdir(LinkedList<Integer>[] listeler){
        for (int i = 0; i < listeler.length; i ++){
            System.out.println(listeler[i]);
        }
     }
}
