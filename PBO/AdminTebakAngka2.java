import java.util.Random;

public class AdminTebakAngka2 {
    private int jawaban;
    private int tryCount;
    private boolean sudahTerjawab;

    public AdminTebakAngka2() {
        Random random = new Random();
        this.jawaban = random.nextInt(100) + 1; // FIX
        this.tryCount = 0;
        this.sudahTerjawab = false;
    }

    public void tebak(int angka) {
        if (this.sudahTerjawab) {
            return;
        }

        if (this.jawaban > angka) {
            System.out.println("terlalu kecil");
        } else if (this.jawaban < angka) {
            System.out.println("terlalu besar");
        } else {
            System.out.println("TEBAKAN ANDA BENAR");
            this.sudahTerjawab = true;
        }

        this.tryCount++;
    }
    public Integer getTryCount(){
        return this.tryCount;
    }
    public boolean getSudahTerjawab(){
        return this
    }
}