package Modul5_Graph;

public class Vertex {
    // mendeklarasikan variabel city dengan tipe data string dikarenakan untuk
    // menginput data
    // berupa nama kota, yang akan membantu dalam penyelesaian persoalan
    String city;
    // mendeklarasikan variabel item sebagai tipe data array berupa string dengan
    // ukuran 2
    String item[] = new String[2];
    // mendeklarasikan variabel next sebagai tipe data vertex yang akan merujuk ke
    // vertex selanjutnya
    Vertex next;
    // mendeklarasikan variabel visited bernilai false dengan mengunakan tipe data
    // boolean
    boolean visited = false;

    // membuat constructor dari class vertex yang berfungsi untuk menginputkan data
    // berupa nilai dari variabel city, item1, dan item2
    Vertex(String city, String item1, String item2) {
        this.city = city;
        item[0] = item1;
        item[1] = item2;
    }

    // mendeklarasikan variabel edge dengan tipe data edgelist sebagai tipe data
    // baru dari class edgelist
    EdgeList edge = new EdgeList();

    // melakukan fungsi rekursif pada method addedge dengan parameter destination
    // yang bertipe data vertex
    public void addEdge(Vertex destination) {
        edge.addEdge(destination);
    }

}
