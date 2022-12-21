package Modul5_Graph;

public class Queue {
    // membuat class node yang nantinya digunakan dalam class queue
    public class Node {
        // mendeskripsikan variabel value dengan tipe data vertex
        Vertex value;
        // mendeskripsikan variabel next sebagai variabel yang akan menunjuk data
        // selanjutnya
        Node Next;
        // mendeskripsikan variabel previous sebagai variabel yang akan menunjuk data
        // sebelumnya
        Node Previous;
        // membuat construktor Node yang akan secara otomatis menginput nilai value
        // dengan
        // yipe data Vertex
        Node(Vertex value) {
            this.value = value;
        }
    }

    Node Head;
    Node Tail;

    // membuat method isempty yg berfungsi untuk memberikan informasi berupa
    // boolean(true or false)
    // jadi yang akan dikembalikan(return) berupa kondisi true or false
    public boolean isEmpty() {
        // kondisinya berupa tail bernilai null
        return (Tail == null);
    }

    // method enqueue merupakan metode insert pada queue, menggunakan variabel value
    // dengan tipe data Vertex sebagai parameter nya
    public void enqueue(Vertex value) {
        Node newNode = new Node(value);
        // apabila tidak ada data pada queue, maka data baru akan menjadi data pertama
        // proses input data menggunakan metode double linkedlist (next and prev)
        if (isEmpty()) {
            Head = newNode;
            Tail = newNode;
            Head.Previous = null;
            Tail.Next = null;
        }
        // jika tidak ada data yg sesuai(isavailalble berfungsi untuk mengejek apakah
        // ada data yg sama atau tidak)
        // maka data akan di input dan akan menjadi data pertama, data sebelumnya akan
        // menjadi data next data baru
        else if (!isAvailable(value)) {
            newNode.Next = Head;
            Head.Previous = newNode;
            Head = newNode;
        }
    }

    // method dequeue merupakan method untuk mend-delete atau menghapus data pada
    // queue
    // karena menggunakan tipe method Vertex, maka yang dihapus / disimpan datanya
    // adalah Vertex
    public Vertex dequeue() {
        // jika tidak ada data pada list, maka akan dikembalikan nilai berupa null
        if (isEmpty()) {
            return null;
        }
        // jika ada data pada list maka data pada tail/data akhir akan di hapus/disimpan
        else {
            Vertex temp = Tail.value;
            // memindahkan posisi tail ke data sebelum data akhir(previous nya)
            if (Tail.Previous != null) {
                Tail = Tail.Previous;
            } else {
                Tail = null;
            }
            return temp;
        }
    }

    // method peek berfungsi untuk menampilkan atau menyimpan data terakhir
    public Vertex peek() {
        // mengembalikan nilai dari data terakhir
        return Tail.value;
    }

    // membuat method printall untuk menampilkan semua data yag di input
    public void printAll() {
        Node current = Head;
        // melakukan perulangan agar data dapat ditampilkan semuanya
        while (current != null) {
            System.out.print(current.value.city + "[" + current.value.visited + "], ");
            current = current.Next;
        }
    }

    // method available berfungsi untuk mengecek apakah suatu data sudah ada di
    // dalam queue
    // fungsinya untuk mencegah agar pada list tidak ada data yang sama jika di
    // input
    // menggunakan tipe data boolean karena yang ingin diketahui yaitu true or false
    public boolean isAvailable(Vertex value) {
        Node current = Head;
        // melakukan perulangan untuk mengecek data dari data awal sampai data akhir
        while (current != null) {
            // jika ada data yang sama maka akan mengembalikan nilai berupa true
            if (current.value == value) {
                return true;
            }
            current = current.Next;
        }
        // jika tidak ada data yang sama setelah di cek dari data awal sampai akhir,
        // maka akan mengembalikan nilai berupa false
        return false;
    }
}
