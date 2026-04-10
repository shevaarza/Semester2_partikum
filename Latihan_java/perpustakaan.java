public class perpustakaan {
     String judul;
     String penulis;
     String TahunTerbit;
     double harga;

    public perpustakaan(String judul , String penulis , String TahunTerbit , double harga){
        this.judul = judul;
        this.penulis = TahunTerbit;
        this.penulis = penulis;
        this.harga = harga;
    }

    public void displayAll(){
        System.out.println("----------------------------");
        System.out.println("judul  :" + judul);
        System.out.println("Tahun Terbit  :" + TahunTerbit);
        System.out.println("Penulis  :" + penulis);
        System.out.println("Harga  :" + harga);
    }
}



