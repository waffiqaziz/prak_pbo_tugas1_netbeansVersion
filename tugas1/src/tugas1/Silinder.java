package tugas1;

public class Silinder extends BangunRuang {

  public Silinder(int x, int y) {
    super(x, y);
    // x = jari-jari alas, y = tinggi silinder
  }
  
  // setter
  public void setSilinder(int x, int y){
    this.x = x;
    this.y = y;
  }

  @Override
  double luas() {
    return 2 * Math.PI * x * y + 2 * Math.PI * x * x;
  }

  @Override
  double volume() {
    return Math.PI * x * x * y;
  }

  @Override
  void display(String nama) {
    System.out.println("Luas Atap dan Alas Silinder\t: " + 2 * Math.PI * x * x);
    System.out.println("Luas Selimut Silinder\t\t: " + 2 * Math.PI * x * y);
    System.out.println("Luas Permukaan Silinder\t\t: " + luas());
    System.out.println("Volume Silinder\t\t\t: " + volume());
  }

}
