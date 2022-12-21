package Modul4_Tree;

public class Main {
    // public static void main adalah fungsi main yang akan mengkesekusi
    // semua perintah dalam program
    public static void main(String[] args) {
        // Tree obj = new Tree(); berarti membuat object baru yaitu obj yang
        // dimana object tersebut akan ditempatkan di dalam memory
        Tree obj = new Tree();
        // menambahkan data (Daus) dari node root dengan menggunakan method makeTree
        obj.makeTree("Daus");
        // menambahkan data (Putri) dari child sebelah kiri dengan menggunakan method
        // setLeft
        obj.setLeft("Putri");
        // mengembalikan variabel current agar dapat menunjuk predeccesor
        // dari node yang ditunjuk oleh current
        obj.backToParent();
        // menambahkan data (Daden) dari child sebelah kanan dengan menggunakan method
        // setRight
        obj.setRight("Daden");
        // mengembalikan variabel current agar dapat menunjuk predeccesor
        // dari node yang ditunjuk oleh current
        obj.backToParent();
        // mengembalikkan variabel current agar dapat menunjuk succesor
        // sebelah kiri dari node yang ditunjuk oleh current
        obj.nextToLeft();
        // menambahkan data (Ari) dari child sebelah kiri dengan menggunakan method
        // setLeft
        obj.setLeft("Ari");
        // mengembalikan variabel current agar dapat menunjuk predeccesor
        // dari node yang ditunjuk oleh current
        obj.backToParent();
        // menambahkan data (Lilul) dari child sebelah kanan dengan menggunakan method
        // setRight
        obj.setRight("Lilul");
        // mengembalikan variabel current agar dapat menunjuk predeccesor
        // dari node yang ditunjuk oleh current
        obj.backToParent();
        // mengembalikan variabel current agar dapat menunjuk predeccesor
        // dari node yang ditunjuk oleh current
        obj.backToParent();

        // mengembalikkan variabel current agar dapat menunjuk succesor
        // sebelah kanan dari node yang ditunjuk oleh current
        obj.nextToRight();
        // menambahkan data (Arsan) dari child sebelah kiri dengan menggunakan method
        // setLeft
        obj.setLeft("Arsan");
        // mengembalikan variabel current agar dapat menunjuk predeccesor
        // dari node yang ditunjuk oleh current
        obj.backToParent();
        // menambahkan data (Jidan) dari child sebelah kanan dengan menggunakan method
        // setRight
        obj.setRight("Jidan");
        // mengembalikan variabel current agar dapat menunjuk predeccesor
        // dari node yang ditunjuk oleh current
        obj.backToParent();

        // mengembalikan variabel current agar dapat menunjuk predeccesor
        // dari node yang ditunjuk oleh current
        obj.backToParent();
        // mengembalikkan variabel current agar dapat menunjuk succesor
        // sebelah kiri dari node yang ditunjuk oleh current
        obj.nextToLeft();

        // mengembalikkan variabel current agar dapat menunjuk succesor
        // sebelah kiri dari node yang ditunjuk oleh current
        obj.nextToLeft();
        // menambahkan data (Uno) dari child sebelah kiri dengan menggunakan method
        // setLeft
        obj.setLeft("Uno");
        // mengembalikan variabel current agar dapat menunjuk predeccesor
        // dari node yang ditunjuk oleh current
        obj.backToParent();
        // menambahkan data (Shafa) dari child sebelah kanan dengan menggunakan method
        // setRight
        obj.setRight("Shafa");

        // mengembalikan variabel current agar dapat menunjuk predeccesor
        // dari node yang ditunjuk oleh current
        obj.backToParent();
        // mengembalikan variabel current agar dapat menunjuk predeccesor
        // dari node yang ditunjuk oleh current
        obj.backToParent();

        // mengembalikkan variabel current agar dapat menunjuk succesor
        // sebelah kanan dari node yang ditunjuk oleh current
        obj.nextToRight();
        // menambahkan data (Diaz) dari child sebelah kiri dengan menggunakan method
        // setLeft
        obj.setLeft("Diaz");
        // mengembalikan variabel current agar dapat menunjuk predeccesor
        // dari node yang ditunjuk oleh current
        obj.backToParent();
        // menambahkan data (Melki) dari child sebelah kanan dengan menggunakan method
        // setRight
        obj.setRight("Melki");

        // mengembalikan variabel current agar dapat menunjuk predeccesor
        // dari node yang ditunjuk oleh current
        obj.backToParent();
        // mengembalikan variabel current agar dapat menunjuk predeccesor
        // dari node yang ditunjuk oleh current
        obj.backToParent();
        // mengembalikan variabel current agar dapat menunjuk predeccesor
        // dari node yang ditunjuk oleh current
        obj.backToParent();

        // mengembalikkan variabel current agar dapat menunjuk succesor
        // sebelah kanan dari node yang ditunjuk oleh current
        obj.nextToRight();

        // mengembalikkan variabel current agar dapat menunjuk succesor
        // sebelah kiri dari node yang ditunjuk oleh current
        obj.nextToLeft();
        // menambahkan data (Mahen) dari child sebelah kiri dengan menggunakan method
        // setLeft
        obj.setLeft("Mahen");
        // mengembalikan variabel current agar dapat menunjuk predeccesor
        // dari node yang ditunjuk oleh current
        obj.backToParent();
        // menambahkan data (Alita) dari child sebelah kanan dengan menggunakan method
        // setRight
        obj.setRight("Alita");

        // mengembalikan variabel current agar dapat menunjuk predeccesor
        // dari node yang ditunjuk oleh current
        obj.backToParent();
        // mengembalikan variabel current agar dapat menunjuk predeccesor
        // dari node yang ditunjuk oleh current
        obj.backToParent();

        // mengembalikkan variabel current agar dapat menunjuk succesor
        // sebelah kanan dari node yang ditunjuk oleh current
        obj.nextToRight();
        // menambahkan data (Rozaki) dari child sebelah kiri dengan menggunakan method
        // setLeft
        obj.setLeft("Rozaki");
        // mengembalikan variabel current agar dapat menunjuk predeccesor
        // dari node yang ditunjuk oleh current
        obj.backToParent();
        // menambahkan data (Agung) dari child sebelah kanan dengan menggunakan method
        // setRight
        obj.setRight("Agung");

        // menampilkan tulisan "Hubungan"
        System.out.println("\nHubungan");
        // menentukan hubungan sebagai anak antara Putri dan Daus menggunakan method
        // isAnak
        obj.isAnak("Putri", "Daus");
        // menentukan hubungan sebagai cicit antara Shafa dan Daus menggunakan method
        // isCicit
        obj.isCicit("Shafa", "Daus");
        // menentukan hubungan sebagai saudara antara Mahen dan Alita menggunakan method
        // isSaudara
        obj.isSaudara("Mahen", "Alita");
        // menentukan hubungan sebagai saudara jauh antara Mahen dan Uno menggunakan
        // method isSaudaraJauh
        obj.isSaudaraJauh("Mahen", "Uno");
        // menentukan hubungan sebagai cucu antara Lilul dan Daus menggunakan method
        // isCucu
        obj.isCucu("Lilul", "Daus");
        // menentukan hubungan sebagai cucu jauh antara Melki dan Daden menggunakan
        // method isCucuJauh
        obj.isCucuJauh("Melki", "Daden");
        // menentukan hubungan sebagai keponakan antara Rozaki dan Arsan menggunakan
        // method isKeponakan
        obj.isKeponakan("Rozaki", "Arsan");
        // menentukan hubungan sebagai keponakan jauh antara Rozaki dan Ari menggunakan
        // method isKeponakanJauh
        obj.isKeponakanJauh("Rozaki", "Ari");
        // menentukan hubungan sebagai saudara jauh antara Diaz dan Agung menggunakan
        // method isSaudaraJauh
        obj.isSaudaraJauh("Diaz", "Agung");

        // menampilkan tulisan "Pre-Order Parent : Child"
        System.out.println("\nPre-Order\nParent : Child");
        // mencetak tree secara pre-order
        obj.printPreorder(obj.root);

    }
}
