package Modul4_Tree;

public class Tree {
    // menginisialisasi variabel root dan current dengan tipe data node
    // dimana root berfungi sebagai penampung data pertama yang dimasukkan dalam tree
    // dan current berfungsi sebagai yang berjalan mengunjungi setiap left
    Node root = null;
    Node current;

    //sebuah method yang berfungsi unuk mengembalikkan variabel current
    // agar dapat menunjuk predeccesor dari node yang ditunjuk oleh current
    public void backToParent(){
        current =  current.parent;
    }

    //sebuah method yang berfungsi unuk mengembalikkan variabel current
    // agar dapat menunjuk succesor sebelah kanan dari node yang ditunjuk oleh current
    public void nextToRight(){
        current = current.right;
    }

    //sebuah method yang berfungsi unuk mengembalikkan variabel current
    // agar dapat menunjuk succesor sebelah kanan dari node yang ditunjuk oleh current
    public void nextToLeft(){
        current = current.left;
    }


    // Sebuah method dengan parameter data dimana parameter ini nantinya
    // akan mengisi data dari node root sebagai data pertama serta menunjuk root sbgai current dengan kondisi
    // jika root masih kosong maka data dapat terisi dan jika root telah terisi data
    // maka akan muncul pesan error "Tree Sudah Dibuat"
    public void makeTree(String data){
        if (isEmpty()){
            root = current = new Node(data);
            System.out.println(root.data + " Dibuat sebagai root");
        } else {
            System.out.println("Error: Tree Sudah Dibuat");
        }
    }

    // Sebuah method dengan parameter data dimana parameter ini nantinya akan mengisi data"
    // dari child sebelah kiri dengan kondisi dimana jika root kosong maka data yang data yang baru
    // ditambahkan akan otomatis menjadi root dan jika root telah terisi maka data yang baru di tambahakan
    // akan mengisi node yang ada di sebelah kiri current dan akan level-nya akan bertambah 1 dari parentnya
    //lalu menetapkan node yang ditunjuk oleh current sebagai parent dari node sebelah kiri
    //setelah itu current langsung di pindahkan ke data sebelah kiri
    public void setLeft(String data){
        if (isEmpty()){
            makeTree(data);
        } else {
            current.left = new Node(data, (current.level+1));
            current.left.parent = current;
            current = current.left;
            System.out.println(current.data + " Ditambahkan Sebagai Left Dari " + current.parent.data );
        }
    }

    // Sebuah method dengan parameter data dimana parameter ini nantinya akan mengisi data"
    // dari child sebelah kanan dengan kondisi dimana jika root kosong maka data yang data yang baru
    // ditambahkan akan otomatis menjadi root dan jika root telah terisi maka data yang baru di tambahakan
    // akan mengisi node yang ada di sebelah kanan current dan akan level-nya akan bertambah 1 dari parentnya
    //lalu menetapkan node yang ditunjuk oleh current sebagai parent dari node sebelah kanan
    //setelah itu current langsung di pindahkan ke data sebelah kanan
    public void setRight(String data){
        if (isEmpty()){
            makeTree(data);
        } else {
            current.right = new Node(data, (current.level+1));
            current.right.parent = current;
            current = current.right;
            System.out.println(current.data + " Ditambahkan Sebagai Right Dari " + current.parent.data );
        }
    }

    //adalah sebuah method dengan tipe data boolean yang dimana method ini
    //berfungsi untuk menetapkan root sebagai null
    public boolean isEmpty(){
        return root == null;
    }

    //adaah methode dengan tipe data string dengan parameter node yang berfungsi
    //untuk mendapatkan data dari child masing-masing leaf yang dimana dalam method ini
    //terdapat variabel res yang berfungsi untuk menampung nilai dari data child sebelah kanan dan kiri
    //dan akan me return nilai dari res tersebut
    String getChildren(Node node){
        String res = "";
        res += node.getLeftData()  + node.getRightData();
        return  res;
    }

    //sebuah method dengan parameter node yang dimana methhod ini berfungsi untuk
    //mencetak tree secara pre-order yang dimana ini dibuat secara rekursif yang dimana
    //dalam method ini akan mengecek isi dari node yang ditetapkan dalam parameter
    // yang jika node-nya tidak null maka akan mencetak parent serta child dari node yang di tunjuk
    public void printPreorder(Node node){
        if (node != null) {
            System.out.println(node.data + " : " + getChildren(node));
            printPreorder(node.left);
            printPreorder(node.right);
        }
    }

    //Sebuah method dengaan tipe data node yang berfungsi untuk memanggil method
    //findNode() yang dimana method ini berfsifat rekursif
    public  Node doFindNode(String key){
        Node pivot = root;
        Node res = findNode(pivot, key);
        return  res;
    }

    //Sebuah method dengan tipe data node yang berfungsi untuk mencari node berdasarkan string
    // dari key yang dimasukkan yang dimana jika nodenya null maka nilai yang di return juga null,
    //jika data dari none yang di tunjuk dalam parameter sama dengan data dari key maka yang direturn
    //adalah node itu sendiri
    private Node findNode(Node node, String key) {
        if (node == null) return null;
        if (node.data == key) return node;
        Node res1 = findNode(node.left, key);
        if (res1 != null && res1.data.equals(key)) return res1;
        return findNode(node.right, key);
    }
    //sebuah method bertipe data boolean dengan 2 parameter yang berfungsi untuk menentukan hubungan
    //sebagai anak yang di mana dalam method tersebut akan di panggil kembali method doFindNode()
    //yang akan mencari node dari target1 dan target2 yang dimana jika parent dari data pada target1 adalah
    //targe2 maka target1 akan ditetapkan sebagai anak dari target2 dan jika data parent dari data pada target1 bukan
    //targe2 maka akan ditapkan bahwa data pada target1 bukan anak dari target2 dan jika data
    boolean isAnak(String target1, String target2){
        Node node1 = doFindNode(target1);
        Node node2 = doFindNode(target2);
        if (node1.parent.data == node2.data) {
            System.out.println(target1 + " Merupakan Anak Dari " + target2);
            return true;
        }
        else {
            System.out.println(target1 + " Bukan Merupakan Anak Dari " + target2);
            return false;
        }
    }

    //sebuah method bertipe data boolean dengan 2 parameter yang berfungsi untuk menentukan hubungan
    //sebagai Cucu yang di mana dalam method tersebut akan di panggil kembali method doFindNode()
    //yang akan mencari node dari target1 dan target2 yang dimana jika parent dari parent data pada target1 adalah
    //targe2 maka target1 akan ditetapkan sebagai Cucu dari target2 dan jika data parent dari parent data pada target1 bukan
    //targe2 maka akan ditapkan bahwa data pada target1 bukan Cucu dari target2 dan jika data
    boolean isCucu(String target1, String target2){
        Node node1 = doFindNode(target1);
        Node node2 = doFindNode(target2);
        if (node1.parent.parent.data == node2.data) {
            System.out.println(target1 + " Merupakan Cucu Dari " + target2);
            return true;
        }
        else {
            System.out.println(target1 + " Bukan Merupakan Cucu Dari " + target2);
            return false;
        }
    }

    //sebuah method bertipe data boolean dengan 2 parameter yang berfungsi untuk menentukan hubungan
    //sebagai cucu jauh yang di mana dalam method tersebut akan di panggil kembali method doFindNode()
    //yang akan mencari node dari target1 dan target2 yang dimana jika level dari terget 1 dikurangi
    //dengan level dari target2 adalah 2 serta parent dari parent  data pada target1 bukan
    //target2 maka target1 akan ditetapkan sebagai cucu jauh dari target2 dan jika
    //level dari terget 1 dikurangi dengan level dari target2 adalah 2 dan data parent dari parent data pada target1 adalah
    //targe2 maka akan ditapkan bahwa data pada target1 bukan cucu jauh dari target2 dan jika data
    boolean isCucuJauh(String target1, String target2){
        Node node1 = doFindNode(target1);
        Node node2 = doFindNode(target2);
        if (((node1.level - node2.level) == 2) &&(node1.parent.parent.data != node2.data)) {
            System.out.println(target1 + " Merupakan Cucu Jauh Dari " + target2);
            return true;
        }
        else {
            System.out.println(target1 + " Merupakan Cucu Jauh Dari " + target2);
            return false;
        }
    }

    //sebuah method bertipe data boolean dengan 2 parameter yang berfungsi untuk menentukan hubungan
    //sebagai cicit yang di mana dalam method tersebut akan di panggil kembali method doFindNode()
    //yang akan mencari node dari target1 dan target2 yang dimana jika parent dari parent dari parentnya data pada target1 adalah
    //targe2 maka target1 akan ditetapkan sebagai cicit dari target2 dan jika data parent dari parent dari parentnya data pada target1 bukan
    //targe2 maka akan ditapkan bahwa data pada target1 bukan cicit dari target2 dan jika data
    boolean isCicit(String target1, String target2){
        Node node1 = doFindNode(target1);
        Node node2 = doFindNode(target2);
        if (node1.parent.parent.parent.data == node2.data) {
            System.out.println(target1 + " Merupakan Cicit Dari " + target2);
            return true;
        }
        else {
            System.out.println(target1 + " Bukan Merupakan Cicit Dari " + target2);
            return false;
        }
    }
    //sebuah method bertipe data boolean dengan 2 parameter yang berfungsi untuk menentukan hubungan
    //sebagai keponakan yang di mana dalam method tersebut akan di panggil kembali method doFindNode()
    //yang akan mencari node dari target1 dan target2 yang dimana jika parent dari parent data pada target1 adalah
    //parent dari data target2 maka target1 akan ditetapkan sebagai keponakan dari target2 dan jika data parent dari parent data pada target1 bukan
    //parent dari data target2 maka akan ditapkan bahwa data pada target1 bukan keponakan dari target2 dan jika data
    boolean isKeponakan(String target1, String target2){
        Node node1 = doFindNode(target1);
        Node node2 = doFindNode(target2);
        if (node1.parent.parent.data == node2.parent.data) {
            System.out.println(target1 + " Merupakan Keponakan Dari " + target2);
            return true;
        }
        else {
            System.out.println(target1 + " Merupakan Keponakan Dari " + target2);
            return false;
        }
    }
    //sebuah method bertipe data boolean dengan 2 parameter yang berfungsi untuk menentukan hubungan
    //sebagai keponakan jauh yang di mana dalam method tersebut akan di panggil kembali method doFindNode()
    //yang akan mencari node dari target1 dan target2 yang dimana jika level dari terget 1 dikurangi
    //dengan level dari target2 adalah 1 serta parent data pada target1 bukan
    //target2 maka target1 akan ditetapkan sebagai keponakan jauh dari target2 dan jika
    //level dari terget 1 dikurangi dengan level dari target2 adalah1 dan data parent dari data target1 adalah
    //target2 maka akan ditapkan bahwa data pada target1 bukan keponakan jauh dari
    boolean isKeponakanJauh(String target1, String target2){
        Node node1 = doFindNode(target1);
        Node node2 = doFindNode(target2);
        if (((node1.level - node2.level) == 1) && (node1.parent.data != node2.data)) {
            System.out.println(target1 + " Merupakan Keponakan Jauh Dari " + target2);
            return true;
        }
        else {
            System.out.println(target1 + " Bukan Merupakan Keponakan Jauh Dari " + target2);
            return false;
        }
    }

    //sebuah method bertipe data boolean dengan 2 parameter yang berfungsi untuk menentukan hubungan
    //sebagai saudara yang di mana dalam method tersebut akan di panggil kembali method doFindNode()
    //yang akan mencari node dari target1 dan target2 yang dimana jika level dari terget 1 sama
    //dengan level dari target2 serta parent data pada target1 sama dengan parent data dari
    //target2 maka target1 akan ditetapkan sebagai saudara dari target2 dan jika
    //level dari terget 1 sama dengan level dari target2  dan data parent dari data target1 adalah
    //target2 maka akan ditapkan bahwa data pada target1 bukan saudara dari target2
    boolean isSaudara(String target1, String target2){
        Node node1 = doFindNode(target1);
        Node node2 = doFindNode(target2);
        if ((node2.level == node1.level) && (node1.parent.data == node2.parent.data)) {
            System.out.println(target1 + " Merupakan Saudara Dari " + target2);
            return true;
        }
        else {
            System.out.println(target1 + " Bukan Merupakan Saudara Jauh Dari " + target2);
            return false;
        }
    }
    //sebuah method bertipe data boolean dengan 2 parameter yang berfungsi untuk menentukan hubungan
    //sebagai saudara jauh yang di mana dalam method tersebut akan di panggil kembali method doFindNode()
    //yang akan mencari node dari target1 dan target2 yang dimana jika level dari terget 1 sama
    //dengan level dari target2 serta parent data pada target1 bukan  dengan parent data dari
    //target2 maka target1 akan ditetapkan sebagai saudara jauh dari target2 dan jika
    //level dari terget 1  sama dengan level dari target2  dan data parent dari data target1 adalah
    //target2 maka akan ditapkan bahwa data pada target1 bukan saudara jauh dari target2
    boolean isSaudaraJauh(String target1, String target2){
        Node node1 = doFindNode(target1);
        Node node2 = doFindNode(target2);
        if ((node2.level == node1.level) && (node1.parent.data != node2.parent.data)) {
            System.out.println(target1 + " Merupakan Saudara Jauh Dari " + target2);
            return true;
        }
        else {
            System.out.println(target1 + " Bukan Merupakan Saudara Jauh Dari " + target2);
            return false;
        }
    }
}
