package Modul4_Tree;

public class Node {
    // menginisialisasi variabel right,left dan paerent dengan tipe data node
    // yang nantinya akan berfungsi sebagai penunjuk ke node selanjutnya
    // dimana right akan menjunjuk ke child sebelah kanan dan left akan menunjuk
    // ke cild sebelah kiri dan parent akan berfungsi sebagai predeccesor
    Node right;
    Node left;
    Node parent;
    // menginisialisasi variabel data sebagai sebuah
    // variabel bertipe data String  karena node yang akan diisi
    // nanti adalah nama sehingga tipe data yang cocok adalah String
    String data;
    // menginisialisasi variabel level sebagai sebuah
    // variabel bertipe data integer karena node yang akan diisi
    // nanti derajat dari treee yang dibuat
    int level = 1;

    // Constructor node berfungsi untuk meletakkan objek-objek yang
    // telah di construc ke dalam memory
    Node(String data){
        // this.data berguna untuk mencegah terjadinya variabel
        // shadowing
        this.data = data;
    }
    // Constructor node berfungsi untuk meletakkan objek-objek yang
    // telah di construc ke dalam memory

    Node(String data, int level){
        // this.data berguna untuk mencegah terjadinya variabel
        // shadowing
        this.data = data;
        // this.level berguna untuk mencegah terjadinya variabel
        // shadowing
        this.level = level;
    }

    // berfungsi sebagai method untuk mendapatkan data dari child sebelah kanan
    // dengan kondisi dimana jika node right nya null maka nilai yang di return adalah "-"
    // namun jika node sebelah kanan terisi maka nilai yang di kembalikan adalah
    // data dari node sebelah kanan
    public String getRightData() {
        if (right == null){
            return  "-";}
        return right.data;
    }

    // berfungsi sebagai method untuk mendapatkan data dari child sebelah kiri
    // dengan kondisi dimana jika node left-nya null maka nilai yang di return adalah "-"
    // namun jika node sebelah kiri terisi maka nilai yang di kembalikan adalah
    // data dari node sebelah kiri
    public String getLeftData() {
        if (left == null) return  "";
        return left.data + " & ";
    }
}
