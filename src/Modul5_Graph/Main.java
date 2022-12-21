package Modul5_Graph;

public class Main {
    public static void main(String[] args) {
        // mendeskripsikan variabel thn1970 sebagai variabel baru untuk tipe data graph
        Graph thn1970 = new Graph();
        // memasukkan data pada graph dengan variabel thn1970
        // menggunakan method addvertex untuk menambahkan data pada list
        // data yang ditambakan berupa nama kota dan juga 2 item unik
        thn1970.addVertex("New York", "Super Serum", "Mie Ayam Ceker");
        thn1970.addVertex("Markas S.H.I.E.L.D.", "Partikel Pym", "Seblak Korea");
        thn1970.addVertex("Wakanda", "Vibranium", "Adamantium");
        thn1970.addVertex("Asgard", "Mjolnir", "Sprite");
        thn1970.addVertex("Vormir", "Soul Stone", "Ceker Mercon");
        // menggunakan method insertedge untuk menambahkan dan menghubungkan dua buah city/lokasi
        // karena ini merupakan graph berarah, maka dibutuhkan kota asal dan juga kota tujuan
        thn1970.insertEdge("New York", "Markas S.H.I.E.L.D.");
        thn1970.insertEdge("Markas S.H.I.E.L.D.", "Wakanda");
        thn1970.insertEdge("Wakanda", "New York");
        thn1970.insertEdge("New York", "Asgard");
        thn1970.insertEdge("Asgard", "Vormir");
        // mendeskripsikan variabel thn2012 sebagai variabel baru untuk tipe data graph
        Graph thn2012 = new Graph();
        // memasukkan data pada graph dengan variabel thn2012
        // menggunakan method addvertex untuk menambahkan data pada list
        // data yang ditambakan berupa nama kota dan juga 2 item unik
        thn2012.addVertex("New York", "Space Stone", "Nasi Padang");
        thn2012.addVertex("Sanctum Sanctorum", "Thai Tea", "Time Stone");
        thn2012.addVertex("Morag", "Power Stone", "Es Semangka India");
        thn2012.addVertex("Kekalik", "Suit IronMan", "Printer");
        thn2012.addVertex("Midgard", "Boba", "Sempol");
        // menggunakan method insertedge untuk menambahkan dan menghubungkan dua buah city/lokasi
        // karena ini merupakan graph berarah, maka dibutuhkan kota asal dan juga kota tujuan
        thn2012.insertEdge("New York", "Sanctum Sanctorum");
        thn2012.insertEdge("Sanctum Sanctorum", "Morag");
        thn2012.insertEdge("Sanctum Sanctorum", "Midgard");
        thn2012.insertEdge("Midgard", "Kekalik");
        thn2012.insertEdge("Morag", "Kekalik");
        // mendeskripsikan variabel thn2015 sebagai variabel baru untuk tipe data graph
        Graph thn2015 = new Graph();
        // memasukkan data pada graph dengan variabel thn2015
        // menggunakan method addvertex untuk menambahkan data pada list
        // data yang ditambakan berupa nama kota dan juga 2 item unik
        thn2015.addVertex("Hollywood", "DVD Avenger", "Microphone");
        thn2015.addVertex("Knowhere", "Mind Stone", "Batu Akik");
        thn2015.addVertex("New York", "KFC", "IPhone 13");
        thn2015.addVertex("Vormir", "Mouse Wireless", "Keyboard");
        thn2015.addVertex("Asgard", "Mjolnir", "Storm Breaker");
        thn2015.addVertex("Qatar", "Yamaha YZR-M1", "Ducati GP15");
        thn2015.addVertex("Valencia", "Kartu UNO", "Kartu Remi");
        // menggunakan method insertedge untuk menambahkan dan menghubungkan dua buah city/lokasi
        // karena ini merupakan graph berarah, maka dibutuhkan kota asal dan juga kota tujuan
        thn2015.insertEdge("Hollywood", "Knowhere");
        thn2015.insertEdge("Knowhere", "New York");
        thn2015.insertEdge("New York", "Vormir");
        thn2015.insertEdge("Vormir", "Hollywood");
        thn2015.insertEdge("New York", "Asgard");
        thn2015.insertEdge("New York", "Valencia");
        thn2015.insertEdge("Valencia", "Qatar");
        thn2015.insertEdge("Asgard", "Qatar");
        // mendeskripsikan variabel endgame sebagai variabel baru untuk tipe data dubly
        Doubly EndGame = new Doubly();
        // memasukkan data pada graph dengan variabel endgame
        // menggunakan method addlast untuk menginput data, data akan di input dari belakang
        // data yg di input berupa tahun dan juga data graph yg sudah di input sebelumnya
        EndGame.addLast(1970, thn1970);
        EndGame.addLast(2012, thn2012);
        EndGame.addLast(2015, thn2015);
        System.out.println("|xxxxxxxxxxxxxxxxxxxx| Membuat Graph |xxxxxxxxxxxxxxxxxxxx|");
        // print data graph
        EndGame.printAll();
        System.out.println("|xxxxxxxxxxxxxxxxxxxx| DFS PRINT |xxxxxxxxxxxxxxxxxxxx|");
        // print secara dfs
        EndGame.printDFS();
        System.out.println("|xxxxxxxxxxxxxxxxxxxx| BFS SEARCHING |xxxxxxxxxxxxxxxxxxxx|");
        // mencari data menggunakan BFS search
        EndGame.BFSSearch("Power Stone");
    }
}
