public class Orang {
    // atribut/properti
    String namaDepan;
    String namaBelakang;

    // method function 
    public String namaLengkap() {
        return this.namaDepan + " " + this.namaBelakang;        
    }

    // fungsi tanpa nilai balik/procedure
    public void cetakNamaLengkap() {
        System.out.println(this.namaLengkap());
    }
}