package Modul1_no1_linkedList;

public class Main {
    //  membuat fungsi main yang berfungsi untuk menjalankan program yang kita inginkan karena program
//  hanya akan mengeksekusi fungsi main
    public static void main(String[] args) {
//      membuat list baru dengan nama object data dari class double linked list
        DoubleLinkedList data = new DoubleLinkedList();
//      selanjutnya memasukkan semua data nama, tinggi dan power berdasarkan perintah soal
//      menggunakan fungsi addlast dengan cara data penunjuk ke fungsi addLast
        data.addLast("Alita",155,33);
        data.addLast("Putri",158,34);
        data.addLast("Devian",160,36);
        data.addLast("Melki",165,40);
        data.addLast("Pande",168,51);
        data.addLast("Azzam",170,57);
        data.addLast("Weng",182,61);
        data.addLast("Jidan",183,62);
//      mencetak keterangan bahwa data yang kita masukkan adalah ketika penampilan feast
        System.out.println("KETIKA PENAMPILAN FEAST");
//      mencetak semua data dari linked list
        data.printAll();

//      karena devian keluar dari list maka fungsi yang tepat adalah delete by value
//      yang dimana variabel acuan nya nama Devian
        data.deleteByValue("Devian");
//      mencetak keterangan bahwa data yang kita masukkan adalah ketika devian keluar barisan
        System.out.println("KETIKA DEVIAN KELUAR DARI BARISAN");
//      mencetak semua data dari linked list
        data.printAll();

//      karena dadi mengganti posisi Devian maka Dadi akan di tambahkan setelah data putri
//      fungsi yang tepat adalah addAfter dengan acuan data nama dari putri
        data.addAfter("Putri","Dadi", 164, 32);
//      mencetak keterangan bahwa data yang kita masukkan adalah setelah dadi gantikan devian
        System.out.println("SETELAH DADI GANTIKAN DEVIAN");
//      mencetak semua data dari linked list
        data.printAll();

//      karena Azzam keluar dari list maka fungsi yang tepat adalah delete by value
//      yang dimana variabel acuan nya nama Azzam
        data.deleteByValue("Azzam");
//      mencetak keterangan bahwa data yang kita masukkan adalah ketika azzam keluar barisan
        System.out.println("KETIKA Azzam KELUAR DARI BARISAN");
//      mencetak semua data dari linked list
        data.printAll();

//      karena Agus mengganti posisi Azzam maka Agus akan di tambahkan setelah data Pande
//      fungsi yang tepat adalah addAfter dengan acuan data nama dari Pande
        data.addAfter("Pande","Agus", 169, 54);
//      mencetak keterangan bahwa data yang kita masukkan adalah setelah agus gantikan azzam
        System.out.println("SETELAH AGUS GANTIKAN AZZAM");
//      mencetak semua data dari linked list
        data.printAll();
    }

}
