package Modul5_Graph;

public class Graph {
    // mendeskripsikan variabel head yang bertipe data Vertex akan bernilai null
    Vertex head = null;
    // mendeskripsikan variabel tail yang bertipe data Vertex akan bernilai null
    Vertex tail = null;

    // membuat method addvertex untuk menginput data vertex
    // addvertex menggunakan metode input akhir
    // menggunakan 3 parameter berupa variabel city, item1, dan item2 dengan tipe
    // data yang sama yaitu string
    public void addVertex(String city, String item1, String item2) {
        Vertex newVertex = new Vertex(city, item1, item2);
        // jika tidak ada data pada list, maka data baru akan menjadi data pertama
        if (head == null) {
            head = newVertex;
            tail = newVertex;
        }
        // jika ada data pada list, maka data baru akan menjadi data setelah data
        // sebelumnya
        else {
            tail.next = newVertex;
            tail = newVertex;
        }
    }

    // method insertedge berfungsi untuk melakukan proses penginputan terhadap edge
    // menggunakan 2 parameter berupa kota asal dan juga kota tujuan
    public void insertEdge(String sourceCity, String destinationCity) {
        // mendeskripsikan variabel source, sebagai variabel asal
        // tetapi sebelumnya data akan dicari terlebih dahulu apakah ada di list atau
        // tidak
        Vertex source = searchVertex(sourceCity);
        // mendeskripsikan variabel source, sebagai variabel tujuan
        // tetapi sebelumnya data akan dicari terlebih dahulu apakah ada di list atau
        // tidak
        Vertex destination = searchVertex(destinationCity);
        if (source != null && destination != null) {
            // berufngsi untuk menghubungkan dua vertex (berupa source dan destination)
            source.addEdge(destination);
        }
    }

    // method searchvertex berfungsi untuk mencari suatu vertex dalam list
    // fungsinya agar dapat digunakan dalam menambahkan edge
    Vertex searchVertex(String city) {
        Vertex current = head;
        // melakukan perulangan mulai dari data awal hingga ditemukan data yg sama,
        // atau hingga perulangan mencapai data akhir
        while (current != null) {
            // menggunakan built in function equals untuk membandingkan data string
            // jika sama maka akan mengembalikan nilai berupa tipe data Vertex
            if (current.city.equals(city)) {
                return current;
            }
            current = current.next;
        }
        // jika tidak ada maka akan mengembalikan nilai null
        return null;
    }

    // printall berungsi untuk melakukan proses print atau menampilkan data pada
    // jendela tampilan
    public void printAll() {
        Vertex current = head;
        // melakukan perulangan mulai dari data awal sampai data akhir
        while (current != null) {
            // akan menampilkan data vertex
            System.out.print("Vertex: [" + current.city + "]");
            // akan menampilkan data edge
            System.out.print(" => Edge: ");
            current.edge.printEdge();
            current = current.next;
        }
    }

    // method DFS berfungsi untuk melakukan pencarian terhadap data terdalam
    // terlebih dahulu
    // menggunakan 2 parameter berupa variabel head dengan tipe data Vertex dan juga
    // stack dengan tipe data Stack, kedua tipe data tersebut merupakan tipe data
    // object
    public void DFS(Vertex head, Stack stack) {
        // jika head bernilai null maka proses aka langsung keluar dari method DFS
        if (head == null) {
            return;
        }
        // jika tidak, maka akan dilakukan proses pencarian
        else {
            // mendeskripsikan nilai head akan bernilai true
            head.visited = true;
            System.out.println(head.city + ": [" + head.item[0] + "] [" + head.item[1] + "]");
            // jika data terakhir pada egde tidak bernilai null maka akan dilakukan
            // pengecekan
            if (head.edge.tail != null) {
                EdgeList.Edge neighbor = head.edge.tail;
                // melakukan perulangan selama variabel neighbor tidak bernilai null
                while (neighbor != null) {
                    // jika tidak sesuai, maka akan di push data neighbor.destination ke dalam stack
                    if (!neighbor.destination.visited) {
                        // melakukan proses push data kedalam stack
                        stack.push(neighbor.destination);
                    }
                    neighbor = neighbor.prev;
                }
            }
            // berfungsi untuk melakukan proses pop pada stack
            DFS(stack.pop(), stack);
        }
    }

    // melakukan proses print menggunakan metode DFS
    public void printDFS() {
        if (head != null) {
            // medeskripsikan variabel stack sebagai variabel baru untuk class stack
            Stack stack = new Stack();
            // mengarahkan data ke method DFS untuk di proses
            DFS(head, stack);
        }
        // menandai apabila data belum dikunjungi
        unvisited();
    }

    // method BFS berfungsi untuk mencari data pada list dengan metode pencarian
    // luas
    // artinya akan dicari mulai dari anak2an nya dan seterusnya
    public void BFS(Vertex head, Queue queue, String item, Doubly.Node data) {
        // jika data head bernilai null maka proses akan keluar dari method BFS
        if (head == null) {
            return;
        }
        // jika head tidak bernlai null maka akan dilakukan pencarian
        else {
            // inisialisasi data variabel visited akan bernilai true
            head.visited = true;
            // akan membandingkan apakah nilai dari item akan sama dengan nilai
            // pada item dengan array 0 dan 1
            // menggunakan equals karena yg akan dibandingkan yaitu tipe data string
            if (item.equals(head.item[0]) || item.equals(head.item[1])) {
                // jika data ditemukan
                if (!data.found) {
                    System.out.println("Ketemu, " + item + " ada di");
                }
                data.found = true;
                System.out.println(data.tahun + ", " + head.city);
            }
            // jika tidak bernilai null maka akan dilakukan proses memasukkan data pada
            // queue
            if (head.edge.head != null) {
                EdgeList.Edge neighbor = head.edge.head;
                while (neighbor != null) {
                    if (!neighbor.destination.visited) {
                        // data akan dimasukkan kedalam list dari class queue dengan
                        // menggunakan method enqueue
                        queue.enqueue(neighbor.destination);
                    }
                    neighbor = neighbor.next;
                }
            }
            // melakukan proses rekursif
            BFS(queue.dequeue(), queue, item, data);
        }
    }

    // method BFSsearch berfungsi untuk mencari data dengan metode BFS atau dicari
    // secara luas
    // menggunakan 2 parameter yaitu variabel item dengan tipe data string
    // dan juga variabel data dengan tipe data doubly
    public void BFSSearch(String item, Doubly.Node data) {
        // jika data head tidak bernilai null
        if (head != null) {
            // mendeskripsikan variabel queue sebagai variabel baru untuk class queue
            Queue queue = new Queue();
            // data akan di proses dalam method BFS
            BFS(head, queue, item, data);
        }
        // akan menuju method unvisited dan menandai data belum di kunjungi
        unvisited();
    }

    // membuat method unvisited untuk menandai data apakah sudah di lalui atau tidak
    // karena pada graph data dapat dilalui berkali-kali
    public void unvisited() {
        Vertex current = head;
        // melakukan perulangan mulai dari data awal sampai akhir
        while (current != null) {
            // akan menandai semua data yg pernah dilalui
            current.visited = false;
            current = current.next;
        }
    }
}
