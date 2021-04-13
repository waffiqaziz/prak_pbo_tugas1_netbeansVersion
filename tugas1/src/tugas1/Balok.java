package tugas1;

public class Balok extends BangunRuang{

  public Balok(int x,int y,int z) {
    super(x,y,z);
    // x = lebar balok, y = panjang balok, z = tinggi balok
  }

  // setter
  public void setBalok(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }
  
  @Override
  double luas() {
    return 2*(x*y+x*z+y*z);
  }

  @Override
  double volume() {
    return x*y*z;
  }
  
}
