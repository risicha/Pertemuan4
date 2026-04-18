class orang1 {
    public String namaDepan;
    public String namaBelakang;
    private String jenisKelamin; 
    private String titel; 

    public Orang(String namaDepan, String namaBelakang, String jenisKelamin) {
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.setJenisKelamin(jenisKelamin);
    }
    
    public String namaLengkap() {
        return this.namaDepan+" "+this.namaBelakang;
    }
    
    // perubahan jenis kelamin tidak bisa langsung, harus lewat fungsi ini
    // karena perubahan jenis kelamin harus merubah juga titel
    public void setJenisKelamin(String jenisKelamin) {
        if(jenisKelamin.equals("L")) {
            this.titel = "Bapak";
        } 
        if(jenisKelamin.equals("P")) {
            this.titel = "Ibu";
        }
    }
    
    // fungsi untuk membaca jenis kelamin
    public String getJenisKelamin() {
        return this.jenisKelamin;
    }
    
    // fungsi untuk membaca titel
    public String getTitel() {
        return this.titel;
    }

}