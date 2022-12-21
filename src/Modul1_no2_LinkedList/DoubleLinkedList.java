package Modul1_no2_LinkedList;

public class DoubleLinkedList {
    //membuat class private node yang berfungsi untuk menyimpan value value
    // yang dibutuhkan seperti variabel untuk menyimpan data nama, tinggi
    // dan power sesuai dengan soal
    private class Node{
        //      berfungsi untuk menyimpan data nama dengan tipe data kalimat atau String
        String Nama;
        //      berfungsi untuk menyimpan data tinggi dengan tipe data bilangan bulat atau integer
        int Height;
        //      berfungsi untuk menyimpan data Power dengan tipe data bilangan bulat atau integer
        int Power;
        //      berfungsi untuk melakukan constructor yang digunakan untuk menginisialisasikan
//      value untuk variabel nama, tinggi dan power hanya dengan menconstruc
//      class node constructor digunakan untuk memberikan nilai awal pada
//      objek pada saat dibuat
        Node(String Nama, int Height, int Power){
//          this berfungsi untuk merujuk kepada object atau variabel yang
//          berada pada class node bukan bukan merujuk pada variabel yang
//          terdapat di parameter constructor Node untuk menghindari variabel
//          tersebut mengisi variabel itu sendiri

//          berfungsi untuk mengisi variabel nama yang ada pada class node dengan
//          menggunakan value variabel nama dari parameter
            this.Nama=Nama;
//          berfungsi untuk mengisi variabel tinggi yang ada pada class node dengan
//          menggunakan value variabel tinggi dari parameter
            this.Height=Height;
//          berfungsi untuk mengisi variabel power yang ada pada class node dengan
//          menggunakan value variabel power dari parameter
            this.Power=Power;
        }
        //      mendeklarasikan variabel next dengan tipe data atau class Node didalam class
//      itu sendiri yang berfungsi untuk mengakses atau merujuk ke data atau node selanjutnya
        Node next;
        //      mendeklarasikan variabel next previous tipe data atau class Node didalam class
//      itu sendiri yang berfungsi untuk mengakses atau merujuk ke data atau node sebelumnya
        Node previous;
    }
    //    mendeklarasikan variabel head dengan tipe data node yang berfungsi menandai
//    data sebagai data pertama menginisialisasikan variabel head dengan null untuk
//    menandakan bahwa data awal atau data dari list masih kosong
    Node head = null;
    //    mendeklarasikan variabel tail dengan tipe data node yang berfungsi menandai
//    data sebagai data terakhir menginisialisasikan variabel tail dengan null
//    untuk menandakan bahwa data akhir masih kosong
    Node tail = null;
    //    membuat function addLast yang berfungsi untuk menambahkan data diakhir dari
//    list dengan parameter string nama, integer tinggi integer power, tipe void
//    dari function dikarenakan function tersebut hanya melakukan proses menambahkan data akhir
//    tanpa perlu mengembalikan data tertentu
    public void addLast(String Nama, int Height, int Power){//Menambahkan data di akhir
//      membuat suatu kondisi if yang digunakan untuk mengecek apakah data di list sudah terdapat data atau belum
//      dengan kondisi apakah head==null
        if (head==null){
//          jika belum ada data sama sekali atau head == null maka akan membuat data pertama dengan menconsruc class Node yang berisi
//          parameter dari parameter function addlast yang dimana berarti data pertama tersebut merupakan data awal/ head dan juga
//          merupakan data akhir/tail,
            head = tail = new Node(Nama, Height, Power);
//          karena ini merupakan double linked list yang dimana tidak ada data sebelum data awal dan tidak ada data setelah data akhir
//          maka pada variabel head yang merujuk ke data sebelumnya dari si head dengan menggunakan variabel previous yang dihubungkan
//          dengan tanda titik sama dengan null atau himpunan kosong
            head.previous=null;
//          lalu pada variabel tail yang merujuk ke data setelah dari si tail dengan menggunakan variabel next yang dihubungkan
//          dengan tanda titik sama dengan null atau himpunan kosong
            tail.next=null;
//          kemudian jika kondisi pertama tidak terpenuhi maka dalam list tersebut sudah terdapat suatu data, maka program akan mengeksekusi
//          kondisi di else
        }else{
//          membuat variabel temp dengan tipe data node yang berfungsi untuk menyimpan data baru dengan menconstructor class node tersebut
            Node temp = new Node(Nama, Height, Power);
//          karena function ini berfungsi untuk menambahkan data diakhir jadi pada data akhir atau tail dari list tersebut ditambahkan data baru
//          setelah data tail dengan tail merujuk pada variabel next sama dengan data baru atau temp
            tail.next=temp;
//          setelah data setelah tail merujuk pada data baru dengan penunjuk previousnya juga harus merujuk pada tail
            temp.previous=tail;
//          setelah tail penunjuk nextnya merujuk pada data baru atau temp maka databaru tersebut menjadi data terakhir, supaya
//          tail dijadikan data terakhir kembali maka tail sama dengan data baru atau temp;
            tail=temp;
//          karena tail adalah data terakhir maka tail penunjuk next haru sama dengan kosong atau null
            tail.next=null;
        }
    }
    //  Membuat fungsi untuk menghubungkan dua buah linked list dengan parameter data dan data dari class doublelinkedlist
    public void connectNode(DoubleLinkedList data, DoubleLinkedList data2){
//      pada list data penunjuk tail yang penunjuk next menyimpan data2 penunjuk data2 yang penunjuknya head untuk menghubungkan dua buah list
        data.tail.next=data2.head;
//      kemudian dari list data2 penunjuk head penunjuknya previousnya menyimpan list data penunjuk tailnya
        data2.head.previous=data.tail;
//      karena data2 sudah disalin untuk digabung ke data maka data2 akan dihapus dengan data2 penunjuk head sama dengan null
        data2.head=null;
    }
    //  membuat fungsi yang berfungsi untuk menukar posisi dua buah data dari suatu linked list dengan parameter pembandingnya tinggi
    public void Swap(int Height1,int Height2){
//      membuat variabel sementara untuk menyimpan semua value dari data 1
        String tempname  = "";
        int tempHeight = 0;
        int tempPower = 0;
//      membuat variabel sementara untuk menyimpan semua value dari data 2
        String tempname2  = "";
        int tempHeight2 = 0;
        int tempPower2 = 0;
//      membuat variabel yang berfungsi sebagai pointer yang merujuk pada data pertama atau head
        Node current = head;
//      melakukan pengecekan apakah parameter tinggi sesuai dengan data yang ada pada list
//      pada setiap data pada linked list dengan menggunakan perulangan for dengan batasan jumlah dari
//      linked list dengan menggunakan function getdatasize
        for (int i = 0; i<getDataSize();i++){
//          untuk melakukan pengecekan, maka membuat kondisi if dimana apakah variabel current penunjuk value tingginya saat ini sama dengan
//          value dari variabel parameter tinggi
            if (Height1 == current.Height){
//              kemudian menyimpan semua value dari data yang sudah ditemukan ke variabel sementara
                tempname = current.Nama;
                tempHeight = current.Height;
                tempPower = current.Power;
            }
//          jika kondisi diatas tidak terpenuhi maka membuat kondisi if dimana apakah variabel current penunjuk value tingginya saat ini sama dengan
//          value dari variabel parameter tinggi2
            else if (Height2 == current.Height){
//              kemudian menyimpan semua value dari data yang sudah ditemukan ke variabel sementara2
                tempname2 = current.Nama;
                tempHeight2 = current.Height;
                tempPower2 = current.Power;
            }
            current = current.next;
        }
//      mengembalikan kembali variabel current ke head
        current=head;
//      kemudian melakukan perulangan kembali
        for (int i = 0; i<getDataSize();i++){
            if (Height1 == current.Height){
//              kemudian menyimpan semua value dari variabel sementara yang sudah ditemukan ke data saat ini
                current.Nama=tempname2;
                current.Height=tempHeight2;
                current.Power=tempPower2;
            }
            else if (Height2 == current.Height){
//              kemudian menyimpan semua value dari variabel sementara2 yang sudah ditemukan ke data saat ini
                current.Nama = tempname;
                current.Height = tempHeight;
                current.Power=tempPower;
            }
//          kemudian berpindah ke data selanjunta dengan menginisialisasikan variabel current dengan current dengan penunjuk nextnya
            current = current.next;
        }
    }
    //  membuat fungsi untuk mengurutkan data linked list dengan berdasarkan value tinggi setiap data
    public void Ordered(){
//      membuat variabel current yang merujuk ke head dan membuat variabel index yang menyimpan data current penunjuk nextnya
        Node current = head, index = current.next;
//      kemudian melakukan perulangan do while agar dapat melakukan eksekusi terlebih dahulu sebelum ke kondisi
//      perulangannya
        do {
//          kemudian berpindah ke data selanjunta dengan menginisialisasikan variabel index dengan index dengan penunjuk nextnya
//          operasi ini akan berdampak signifikan ketika kondisi while terpenuhi
            index = current.next;
//          membuat perulangan while dengan kondisi apakah index tidak sama dengan null
            while(index!=null){
//              jika kondisi terpenuhi selanjutnya membuat kondisi apakah current penunjuk tingginya lebih dari data index penunjuk tingginya
                if (current.Height>index.Height){
//                  jika kondisi if terpenuhi maka melakukan swap dengan parameter current penunjuk tingginya dan data index penunjuk tingginya
                    Swap(current.Height, index.Height);
                }
//              kemudian berpindah ke data selanjunta dengan menginisialisasikan variabel index dengan index dengan penunjuk nextnya
                index=index.next;
            }
//          kemudian berpindah ke data selanjunta dengan menginisialisasikan variabel current dengan current dengan penunjuk nextnya
            current = current.next;
//      masukk ke kondisi currnt penunjuk next tidak sama dengan null dari perulangan dari do sebelumnya
        }while(current.next != null);
    }
    //  membuat function yang berfungsi untuk mendapatkan banyak data dari linked list dengan tipe function integer
    public int getDataSize(){
//      membuat variabel untuk meyimpan jumlah data terkini yang nantinya akan digunakan pada return value
        int count=0;
//      membuat variabel yang berfungsi sebagai pointer yang merujuk pada data pertama atau head
        Node current = head;
//      melakukan perulangan menggunakan while yang kondisinya apakah current saat ini sama dengan kosong atau null
        while(current!=null){
//          jika kondisi tersebut terpenuhi maka variabel count di increment atau count ditambah satu
            count++;
//          kemudian berpindah ke data selanjunta dengan menginisialisasikan variabel current dengan current dengan penunjuk nextnya
            current=current.next;
        }
//      jika kondisi while sudah tidak terpenuhi maka melakukan nilai kembalian dengan variabel count,
        return count;
    }
    //  membuat fungsi yang berfungsi untuk melakukan cetak atau print semua data dari linked list
    public void printAll(){
//      membuat variabel yang berfungsi sebagai pointer yang merujuk pada data pertama atau head
        Node current = head;
//      melakukan perulangan menggunakan while yang kondisinya apakah current saat ini sama dengan kosong atau null
        while (current!=null){
//          jika kondisi while terpenuhi maka selanjutnya mencetak semua value dari data current saat ini yang terdiri dari nama , tinggi dan power
            System.out.println("Nama : "+ current.Nama+", Height : "+current.Height+", Power : "+current.Power);
//          kemudian berpindah ke data selanjunta dengan
//          menginisialisasikan variabel current dengan current dengan penunjuk nextnya
            current=current.next;
        }
        System.out.println();
    }

}
