package Modul1_no1_linkedList;

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
    public void addLast(String Nama, int Height, int Power){
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
    //  membuat function yang berfungsi untuk mengecek apakah suatu data tertentu terdapat dalam linked list dengan return value boolean
//  dengan paramater string nama sebagai penanda khusus dari data tersebut
    public boolean isAvailable(String ParamName){
//      membuat variabel yang berfungsi sebagai pointer yang merujuk pada data pertama atau head
        Node current = head;
//      membuat variable boolean yang akan digunakan untuk return dari fungsi tersebut
        boolean available =false;
//      melakukan pengecekan pada setiap data pada linked list dengan menggunakan perulangan for dengan batasan jumlah dari
//      linked list dengan menggunakan function getdatasize
        for (int i=0;i<getDataSize();i++){
//          untuk melakukan pengecekan, maka membuat kondisi if dimana apakah variabel current penunjuk value namanya saat ini sama dengan
//          value dari variabel parameter nama
            if (current.Nama==ParamName){
//              jika iya maka tujuan dari function ini sudah terpenuhi lalu mengakhiri function dengan nilai kembalian atau return true
                return true;
            }
//          jika kondisi tersebut tidak terpenuhi maka lanjut mengecek data selanjutnya, cara berpindah ke data selanjunta dengan
//          menginisialisasikan variabel current dengan current dengan penunjuk nextnya
            current=current.next;
        }
//      jika kondisi perulangan sudah tidak terpenuhi maka mengakhiri function dengan nilai kembalian variabel available
        return available;
    }
    //  membuat function addAfter yang digunakan untuk menambah suatu data setelah data tertentu dengan menandai date tertentu tersebut dengan valuenya
//  membuat parameter untuk menandai value dari data tertentu dengan menggunakan nama dari data tersebut yaitu String NameAfter
//  lalu parameter untuk data baru sama seperti  function sebelumnya yaitu string nama, int tinggi dan power
    public void addAfter(String NameAfter, String Nama, int Height, int Power){
//      membuat suatu kondisi yang berfungsi untuk mengecek apakah variabel acuan nama terdapat pada linked list
        if (isAvailable(NameAfter)==false){
//          jika kondisi ini terpenuhi maka membuat peringatan bahwa data yang kita jadikan sebagai acuan tidak terdapat di lisst
//          dengan mencetak menggunakan system out print line
            System.out.println("Data "+NameAfter+" tidak ditemukan");
        }else{
//          jika kondisi diatas tidak terpenuhi maka selanjutny masuk ke kondisi else yang dimana membuat kondisi baru lagi
//          untuk mengecek apakah data acuan berada di akhir data atau tidak dengan menggunakan variabel acuan sama dengan tail penunjuk nama
            if (NameAfter==tail.Nama){
//              jika kondisi tersebut terpenuhi maka data baru tersebut akan di masukkan ke parameter function addLast untuk menambah data diakhir
                addLast(Nama, Height, Power);
            }else{
//              kemudian jika kondisi tersebut tidak terpenuhi maka masuk ke body else
//              membuat variabel temp dengan tipe data node yang berfungsi untuk menyimpan data baru dengan menconstructor class node tersebut
                Node temp = new Node(Nama, Height, Power);
//              membuat variabel temp2 baru dengan tipe data node nantinya akan menyimpan data current saat ini dengan penunjuk next
                Node temp2;
//              membuat variabel yang berfungsi sebagai pointer yang merujuk pada data pertama atau head
                Node current = head;
//              melakukan perulangan menggunakan while yang kondisinya apakah current saat ini dengan penunjuk nextnya sama dengan kosong atau null
                while(current.next!=null){
//                  membuat kondisi if dimana apakah variabel current penunjuk value namanya saat ini sama dengan
//                  value dari variabel parameter nama
                    if (NameAfter== current.Nama){
//                      jika kondisi terpenuhi maka variabel temp2 akan menyimpan current saat ini penunjuk nextnya
                        temp2 = current.next;
//                      kemudian variabel temp atau databru penunjuk nextnya akan menyimpan data dari temp2
                        temp.next=temp2;
//                      karena double link list jangan lupa juga untuk variabel temp2 penunjuk previousnya menyimpan variabel temp
                        temp2.previous=temp;
//                      kemudian variabel current saat ini penunjuk nextnya menyimpan variabel temp
                        current.next=temp;
//                      kemudian variabel temp penunjuk previousnya menyimpan variabel current saat ini
                        temp.previous=current;
//                      karena telah memenuhi maksud dari function ini maka langsung saja mengakhir perulangan dengan menggunakan break
                        break;
                    }
//                  kemudian berpindah ke data selanjunta dengan
//                  menginisialisasikan variabel current dengan current dengan penunjuk nextnya
                    current=current.next;
                }
            }
        }
    }
    //  membuat fungsi yang berfungsi untuk menghapus data pertama dari linked list
    public void deleteFirst(){
//      karena data yang akan dihapus adalah data pertama maka variabel head akan menyimpan data head penunjuk nextnya
        head=head.next;
//      karena double linked list juga harus data head penunjuk previousnya sama dengan kosong atau null
        head.previous=null;
    }
    //  membuat fungsi yang berfungsi untuk menghapus data pertama dari linked list
    public void deleteLast(){
//      karena data yang akan dihapus adalah data terakhir maka variabel tail akan menyimpan data tail penunjuk previousnya
        tail=tail.previous;
//      karena double linked list juga harus data tail penunjuk nextnya sama dengan kosong atau null
        tail.next=null;
    }
    //  membuat function yang berfungsi untuk menghapus data berdasarkan value dari data tersebut
    public void deleteByValue(String Paramname){
//      membuat suatu kondisi yang berfungsi untuk mengecek apakah variabel acuan nama terdapat pada linked list
        if (isAvailable(Paramname)==false){
//          jika kondisi ini terpenuhi maka membuat peringatan bahwa data yang kita jadikan sebagai acuan tidak terdapat di lisst
            System.out.println("data tidak ditemukan");
        }else{
//          kemudian jika kondisi tersebut tidak terpenuhi maka masuk ke body else
//          kemudian membuat kondisi apakah variabel acuan nama sama dengan data head penunjuk nama
            if (Paramname == head.Nama){
//              jika kondisi tersebut terpenuhi maka akan mengeksekusi fungsi deletefirst
                deleteFirst();
//          kemudian membuat kondisi apakah variabel acuan nama sama dengan data tail penunjuk nama
            }else if(Paramname == tail.Nama){
//              jika kondisi tersebut terpenuhi maka akan mengeksekusi fungsi deletelast
                deleteLast();
//          kemudian jika kondisi tersebut tidak terpenuhi maka masuk ke body else
            }else {
//              membuat variabel yang berfungsi sebagai pointer yang merujuk pada data pertama atau head
                Node current = head;
//              membuat variabel temp dengan tipe data node yang nantinya akan menyimpan data previous
                Node temp;
//              membuat variabel temp2 dengan tipe data node yang nantinya akan menyimpan data next
                Node temp2;
//              melakukan perulangan menggunakan while yang kondisinya apakah current saat ini dengan penunjuk nextnya sama dengan kosong atau null
                while (current.next!=null) {
//                  membuat kondisi if apakah variabel acuan sama dengan data current saat ini penunjuk variabel nama;
                    if (Paramname == current.Nama){
//                      jika iya maka variabel temp akan menyimpan data current saat ini penunjuk previousnya
                        temp = current.previous;
//                      kemudian variabel temp2 akan menyimpan data current saat ini penunjuk nextnya
                        temp2 = current.next;
//                      kemudian variabel temp penunjuk nextnya akan menyimpan data temp2;
                        temp.next=temp2;
//                      kemudian variabel temp2 penunjuk previousnya akan menyimpan data temp;
                        temp2.previous=temp;
                    }
//                  kemudian berpindah ke data selanjunta dengan
//                  menginisialisasikan variabel current dengan current dengan penunjuk nextnya
                    current = current.next;
                }
            }
        }
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
