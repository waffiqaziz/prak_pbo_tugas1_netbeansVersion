package tugas1;

public class PersegiPanjang extends BangunDatar {
  PersegiPanjang(int x, int y) {
    super(x, y);
    // x = lebar, y = panjang
  }
  
  // setter
  public void setPersegiPanjang(int x, int y){
    this.x = x;
    this.y = y;
  };

  @Override
  double luas() {
    return x*y;
  }

  @Override
  double keliling() {
    return 2*(x+y);
  }
}
