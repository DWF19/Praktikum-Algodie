package Modul5_Graph;

public class Stack {
    // membuat class node yang nantinya digunakan untuk menyimpan value dari stack
    // dengan visibility private agar class node hanya bisa digunakan di class stack
    private class Node {
        // mendeklarasikan variabel dengan nama value dengan tipe data Object
        // tipe data object memiliki fungsi yang hampir sama dengan generic namun
        // untuk menyimpan data sesuai dengan tipe data dinamis,
        Vertex value;
        // mendeklarasikan variabel dengan tipe data node untuk merujuk ke node
        // selanjutnya
        Node next;

        // membuat konstraktor dari class Node untuk otomatis menginputkan nilai dari
        // variabel value hanya dengan parameter
        Node(Vertex value) {
            this.value = value;
        }
    }

    // mendeklarasikan variabel head dengan tipe data node untuk menandakan sebagai
    // data awal
    Node head;
    // mendeklarasikan variabel head dengan tipe data node untuk menandakan sebagai
    // data akhir
    Node tail;

    // membuat function untuk menambahkan data pada stack
    // dengan parameter value dari user
    public void push(Vertex value) {
        // membuat variabel nodebaru untuk menyimpan data baru
        Node newNode = new Node(value);
        // membuat kondisi apakah data sudah ada atau belum
        // jika belum, maka membuat data baru dengan data awal dan akhir sama
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            // jika kondisi sebelumnya tidak terpenuhi
            // maka akan menempatkan data baru sebelum data pertama,
            // dengan perujuk data baru next ke head
            newNode.next = head;
            // meletakkan kembali head ke data baru
            head = newNode;
        }
    }

    // membuat fungsi untuk mengambil data sekaligus menghapus data tersebut
    public Vertex pop() {
        // membuat kondisi jika data masih belum ada, maka akan ,
        // memberikan peringatan bahawa elemen belum ada
        if (isEmpty()) {
            return null;
        } else {
            // membuat variabel sementara untuk meyimpan data paling atas
            Node popItem = head;
            // menghapus data awal
            if (head.next != null) {
                head = head.next;
            } else {
                head = null;
            }
            // mereturn value dari variabel sementara
            return popItem.value;
        }
    }

    // membuat fungsi untuk memeriksa apakah stack tersebut masih kosong atau tidak
    public boolean isEmpty() {
        return (head == null);
    }

    // membuat method printall untuk melakukan proses output terhadap data yang di
    // input
    public void printAll() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value.city + ", ");
            current = current.next;
        }
        System.out.println();
    }
}
