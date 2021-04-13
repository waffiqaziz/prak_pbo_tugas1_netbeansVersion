package tugas1;

public abstract class BangunDatar {
  int x;
  int y;
  // x & y bisa berupa alas, panjang, tinggi maupun sisi bangun datar
  
  public BangunDatar(int x, int y) { // untuk bangun datar segitiga, persegi panjang
    this.x = x;
    this.y = y;
  }

  public BangunDatar(int x2) { // untuk bangun datar persegi, lingkaran
    this.x = x2;
  }

  abstract double luas();
  // --setiap bangun datar memiliki perhitungan luas masing-masing

  abstract double keliling();
  // --setiap bangun datar memiliki perhitungan keliling masing-masing

  void display(String namaBangunDatar) {
    System.out.println("Luas " + namaBangunDatar + "\t\t: " + luas());
    System.out.println("Keliling " + namaBangunDatar + "\t: " + keliling());
  }
}
