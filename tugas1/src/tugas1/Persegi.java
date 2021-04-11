package tugas1;

public class Persegi extends BangunDatar {
  
  public Persegi(int x) {
    super(x);
    // x = sisi persegi
  }

  @Override
  double luas() {
    return x * x;
  }

  @Override
  double keliling() {
    return 4 * x;
  }
}
