package tugas1;

public class Balok extends BangunRuang{

  public Balok(int x,int y,int z) {
    super(x,y,z);
    // x = lebar balok, y = panjang balok, z = tinggi balok
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
