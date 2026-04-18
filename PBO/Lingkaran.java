public class Lingkaran {
    private double r;

    public Lingkaran(double r) {
        this.r = r;
    }
    public double diameter() {
        return 2 * this.r;
    }
    public double luas() {
        return Math.PI * this.r * this.r;
    }

    public double keliling() {
        return Math.PI * this.r * 2;
    }
}
