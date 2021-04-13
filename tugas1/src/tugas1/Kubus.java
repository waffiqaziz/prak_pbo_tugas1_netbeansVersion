package tugas1;

public class Kubus extends BangunRuang {

  public Kubus(int x) {
    super(x);
    // x = sisi
  }

  // setter
  public void setKubus(int x){
    this.x = x;
  }
  
  @Override
  double luas() {
    return 6 * x * x;
  }

  @Override
  double volume() {
    return x * x * x;
  }
}
