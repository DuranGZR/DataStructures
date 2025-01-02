// Daha kısa bir İkili Arama Ağacı (Binary Search Tree - BST) Java Uygulaması

// Bir düğüm (node) sınıfı tanımlanır. Her düğüm bir anahtar ve iki alt düğüm içerir.


// İkili Arama Ağacı (Binary Search Tree - BST) ana sınıfı
class BST {
    class Node {
        int key;
        Node left, right;

        Node(int key) {
            this.key = key; // Düğümün anahtar değeri
            this.left = this.right = null; // Başlangıçta sol ve sağ alt düğümler null
        }
    }
    private Node root; // Ağacın kök düğümü

    // Ağaca yeni bir anahtar eklemek için metot
    public void add(int key) {
        root = addRec(root, key); // Özyinelemeli ekleme işlemi
    }

    // Özyinelemeli ekleme işlemi
    private Node addRec(Node root, int key) {
        if (root == null) return new Node(key); // Eğer düğüm boşsa, yeni düğüm oluşturulur
        if (key < root.key) root.left = addRec(root.left, key); // Sol alt ağaçta devam et
        else if (key > root.key) root.right = addRec(root.right, key); // Sağ alt ağaçta devam et
        return root; // Mevcut düğüm döndürülür
    }

    // Ağacın sıralı dolaşımı (in-order traversal) için metot
    public void inOrderTraversal() {
        inOrderRec(root); // Özyinelemeli sıralı dolaşım işlemi
    }

    // Özyinelemeli sıralı dolaşım işlemi
    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left); // Sol alt ağacı dolaş
            System.out.print(root.key + " "); // Mevcut düğümün anahtarını yazdır
            inOrderRec(root.right); // Sağ alt ağacı dolaş
        }
    }

    // Ağacın bir anahtarını silmek için metot
    public void deleteKey(int key) {
        root = deleteRec(root, key); // Özyinelemeli silme işlemi
    }

    // Özyinelemeli silme işlemi
    private Node deleteRec(Node root, int key) {
        if (root == null) return null; // Eğer düğüm boşsa, null döndür
        if (key < root.key) root.left = deleteRec(root.left, key); // Sol alt ağaçta devam et
        else if (key > root.key) root.right = deleteRec(root.right, key); // Sağ alt ağaçta devam et
        else {
            // Silinecek düğüm bulundu
            if (root.left == null) return root.right; // Sol alt düğüm boşsa, sağ düğüm döndürülür
            if (root.right == null) return root.left; // Sağ alt düğüm boşsa, sol düğüm döndürülür
            root.key = minValueRec(root.right); // Sağ alt ağacın minimum değeri bulunur
            root.right = deleteRec(root.right, root.key); // Sağ alt ağaçtan minimum değer silinir
        }
        return root; // Mevcut düğüm döndürülür
    }

    // Bütün ağaçtaki minimum değeri bulmak için metot
    public Integer minValue() {
        if (root == null) return null; // Ağaç boşsa null döndür
        return minValueRec(root);
    }

    private int minValueRec(Node root) {
        while (root.left != null) root = root.left; // Sol alt düğümler boyunca ilerlenir
        return root.key; // Minimum değer döndürülür
    }

    // Bütün ağaçtaki maksimum değeri bulmak için metot
    public Integer maxValue() {
        if (root == null) return null; // Ağaç boşsa null döndür
        return maxValueRec(root);
    }

    private int maxValueRec(Node root) {
        while (root.right != null) root = root.right; // Sağ alt düğümler boyunca ilerlenir
        return root.key; // Maksimum değer döndürülür
    }

    public static void main(String[] args) {
        BST tree = new BST(); // Yeni bir İkili Arama Ağacı oluşturulur
        int[] elements = {50, 30, 20, 40, 70, 60, 80}; // Ağaca eklenecek elemanlar
        for (int element : elements) tree.add(element); // Elemanlar sırayla ağaca eklenir

        System.out.println("Ağacın sıralı dolaşımı:");
        tree.inOrderTraversal(); // Ağacın sıralı dolaşımı yazdırılır

        System.out.println("\n\n20'yi sil");
        tree.deleteKey(20); // 20 silinir
        tree.inOrderTraversal(); // Güncellenen ağaç yazdırılır

        System.out.println("\n\n30'u sil");
        tree.deleteKey(30); // 30 silinir
        tree.inOrderTraversal(); // Güncellenen ağaç yazdırılır

        System.out.println("\n\n50'yi sil");
        tree.deleteKey(50); // 50 silinir
        tree.inOrderTraversal(); // Güncellenen ağaç yazdırılır
    }
}
