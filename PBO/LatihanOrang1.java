public class LatihanOrang1 {
    public static void main(String[] args) {
        Orang orang1 = new Orang("Budi", "Rahman", "L");

        System.out.println(orang1.getTitel()+" "+orang1.namaLengkap());

        Orang orang2 = new Orang("Dyah", "Ayu", "P");
        System.out.println(orang2.getTitel()+" "+orang2.namaLengkap());
        
        orang2.namaDepan = "Nurani"; // contoh merubah nama secara langsung
        System.out.println(orang2.getTitel()+" "+orang2.namaLengkap());
        
        // contoh salah:
        // baris program dibawah ini akan error jika dieksekusi
        //orang2.jenisKelamin = "P";
        //System.out.println(orang2.jenisKelamin);
        
  }
}