package tugas1;

public class Lingkaran extends BangunDatar {

  Lingkaran(int x) {
    super(x);
    // x = jari-jari lingkaran
  }
  
  // setter
  public void setLingkaran(int x){
    this.x = x;
  }
  
  @Override
  double luas() {
    return Math.PI * (x * x) * 1d;
  }

  @Override
  double keliling() {
    return 2d * Math.PI * x;
  }
}
