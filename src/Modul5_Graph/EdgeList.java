package Modul5_Graph;

public class EdgeList {
    // membuat class edge yang nantinya akan digunakan sebagai tempat untuk
    // menyimpan nilai edge
    public class Edge {
        // mendeklarasikan variabel next dengan tipe data edge agar dapat merujuk ke
        // egde selanjutnya
        Edge next;
        // mendeklarasikan variabel prev dengan tipe data edge agar dapat merujuk ke
        // egde sebelumnya
        Edge prev;
        // mendeklarasikan variabel destination dengan tipe data vertex
        Vertex destination;

        // membuat constructor dari class edge yang berfungsi untuk secara otomatis
        // menginput data
        // dari variabel destination
        Edge(Vertex destination) {
            this.destination = destination;
        }
    }

    // mendeklarasikan variabel head dengan tipe data edge untuk menentukan data
    // pertama/depan
    Edge head;
    // mendeklarasikan variabel tail dengan tipe data edge untuk menentukan data
    // terakhir/belakang
    Edge tail;

    // membuat method untuk menginput data edge dengan menggunakan variabel
    // destination yang bertipe data
    // vertex sebagai parameternya
    public void addEdge(Vertex destination) {
        Edge newEdge = new Edge(destination);
        // jika data awal/depan tidak ada, maka data baru akan menjadi data head dan
        // tailnya
        if (head == null) {
            head = newEdge;
            tail = newEdge;
        }
        // jika data depan sudah ada, maka data baru akan menyambung ke data depan dan
        // menjadi
        // data setelahnya
        else {
            newEdge.prev = tail;
            tail.next = newEdge;
            tail = newEdge;
        }
    }

    // membuat method printegde yang berfungsi untuk menampilkan data yg di input
    // pada class edgelist
    public void printEdge() {
        if (head == null) {
            System.out.print("-\n");
        } else {
            Edge current = head;
            while (current != null) {
                System.out.print("[" + current.destination.city + "] ");
                current = current.next;
            }
            System.out.println();
        }
    }

}
