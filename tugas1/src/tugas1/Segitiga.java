package tugas1;

public class Segitiga extends BangunDatar {

  Segitiga(int x, int y) {
    super(x, y);
    // x = alas, y = tinggi
  }
  
  // setter
  public void setSegitiga(int x, int y){
    this.x = x;
    this.y = y;
  }

  @Override
  double luas() {
    return 1d / 2 * x * y;
  }

  @Override
  double keliling() {
    return Math.sqrt(x * x + y * y) + x + y;
  }
}