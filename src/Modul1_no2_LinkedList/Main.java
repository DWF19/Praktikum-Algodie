package Modul1_no2_LinkedList;

public class Main {
    public static void main(String[] args) {
//      membuat list pertama dengan nama object data dari class double linked list
        DoubleLinkedList data = new DoubleLinkedList();
//      membuat list kedua dengan nama object data2 dari class double linked list
        DoubleLinkedList data2 = new DoubleLinkedList();

//      selanjutnya memasukkan semua data nama, tinggi dan power berdasarkan perintah soal untuk berteduh
//      ke list pertama menggunakan fungsi addlast dengan cara data penunjuk ke fungsi addLast
        data.addLast("Agus",169,54);
        data.addLast("Dadi",164,37);
        data.addLast("Jidan",183,62);
        data.addLast("Weng",182,61);
//      mencetak keterangan bahwa data yang kita masukkan adalah List data Berteduh
        System.out.println("BERTEDUH");
//      mencetak semua data dari linked list
        data.printAll();

//      selanjutnya memasukkan semua data nama, tinggi dan power berdasarkan perintah soal untuk menonton konser
//      ke list kedua menggunakan fungsi addlast dengan cara data penunjuk ke fungsi addLast
        data2.addLast("Alita",155,33);
        data2.addLast("Putri",158,34);
        data2.addLast("Permadi",168,51);
        data2.addLast("Melki",165,40);
//      mencetak keterangan bahwa data yang kita masukkan adalah List data menonton konser
        System.out.println("TETAP MENONTON KONSER");
//      mencetak semua data dari linked list
        data2.printAll();

//      sesuai perintah soal untuk menghubungkan dua buah list maka list data satu dan dua
//      dengan data satu sebagai list yang utama dengan cara data penunjuk connectnode dengan parameter
//      object list data dan list data2
        data.connectNode(data, data2);
//      mencetak keterangan bahwa data yang digabungkan adalah List setelah keduan barisan dihubungkan
        System.out.println("Setelah Kedua Barisan Dihubungkan");
//      setelah menghubungkan dua buah data selanjutnya mengurutkan semua data berdasarkan tinggi dari setiap data
//      agar sesuai dengan ouput dari soal
        data.Ordered();
//      mencetak semua data dari linked list
        data.printAll();

    }
}
