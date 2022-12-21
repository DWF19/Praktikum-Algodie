package Modul5_Graph;

public class Doubly {
    // membuat class node yang nantinya akan berisi data tahun
    public class Node {
        // mendeklarasikan variabel found bernilai false dengan mengunakan tipe data
        // boolean
        boolean found = false;
        // mendeklarasikan variabel tahun dengan tipe data integer
        int tahun;
        // mendeklarasikan variabel avenger dengan tipe data graph yang merupakan
        // tipe data object
        Graph Avenger;

        // membuat constructor dari class node untuk otomatis menginput nilai dari
        // variabel tahun dan avenger
        Node(int tahun, Graph Avenger) {
            this.tahun = tahun;
            this.Avenger = Avenger;
        }

        Node next;
        Node previous;
    }

    Node head = null;
    Node tail = null;

    // membuat method addlast yang berfungsi untuk menginput data kedalam class
    // double linkedlist
    // menggunakan 2 parameter berupa tahun dengan tipe data integer dan Avenger
    // dengan tipe data Graph
    public void addLast(int tahun, Graph Avenger) {
        // jika tidak ada data pada list, maka data baru akan menjadi data pertama/head
        if (head == null) {
            head = tail = new Node(tahun, Avenger);
            head.previous = null;
            tail.next = null;
        }
        // jika sudah ada data pada list, maka data akan ditambahkan setelah data
        // sebelumnya
        else {
            Node temp = new Node(tahun, Avenger);
            tail.next = temp;
            temp.previous = tail;
            tail = temp;
            tail.next = null;
        }
    }

    // method printall berfungsi untuk menampilkan data pada list ke dalam jendela
    // tampilan
    public void printAll() {
        Node current = head;
        // melakukan perulangan agar setiap data pada list dapat ditampilkan
        while (current != null) {
            // akan menampilkan data berupa tahun yang merupakan tipe data integer
            System.out.println("Tahun " + current.tahun);
            current.Avenger.printAll();
            System.out.println();
            current = current.next;
        }
    }
    // method printDFS berfungsi untuk menampilkan data pada list dengan metode DFS
    // Depth First Search merupakan metode penelusuran graf dengan cara memprioritaskan
    // kedalaman terlebih dahulu
    public void printDFS() {
        Node current = head;
        //melakukan perulangan agar di print ke jendela tampilan mulai dari data awal sampai akhir
        while (current != null) {
            System.out.println("Tahun " + current.tahun);
            current.Avenger.printDFS();
            System.out.println();
            current = current.next;
        }
    }
    //membuat method pencarian dengan metode BFS dengan parameter berupa tipe data string
    //sesuai dengan data pada list yang sama2 string
    //Breadth First Search mencari dengan memulai dari simpul akar dan menelusuri semua
    //tetangga dari simpul tersebut
    public void BFSSearch(String item) {
        System.out.println("Cari: " + item);
        Node current = head;
        //melakukan perulangan pada list mmenggunakan variabel current
        while (current != null) {
            current.Avenger.BFSSearch(item, current);
            //jika data next tidak sama dengan null
            if (current.next != null) {
                current.next.found = current.found;
            }
            //mengganti nilai current menjadi nilai selanjutnya
            current = current.next;
        }
    }
}
