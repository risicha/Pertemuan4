import java.util.Random;

public class AdminTebakAngka1 {
    public int jawaban;
    public int tryCount;
    public boolean sudahTerjawab;

    public AdminTebakAngka1() {
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
}