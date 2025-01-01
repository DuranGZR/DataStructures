public class Ana {

    public static void main(String[] args) {

        Sinif A = new Sinif();
        Sinif B = new Sinif();
        Sinif C = new Sinif();


        A.sayi = 11;
        B.sayi = 22;
        C.sayi = 33;

        System.out.println(A.sayi);
        System.out.println(B.sayi);
        System.out.println(C.sayi);

        A.next = B;
        B.next = C;
        C.next = null;

        Sinif tmp = A;

        while (tmp != null){
            System.out.println(tmp.sayi);
            tmp = tmp.next;
        }
    }
}
