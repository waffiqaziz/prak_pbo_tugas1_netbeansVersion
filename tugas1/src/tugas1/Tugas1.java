package tugas1;
// @author WAFFIQ AZIZ / 123190070

import java.util.InputMismatchException;
import java.util.Scanner;

/* GUIDE 
  PILIHAN MENU :
    segitiga siku siku
    persegi 
    persegi panjang  
    lingkaran 
    kubus 
    balok
    silinder
    keluar

  CONTOH OUTPUT
    kubus >>>
      luas persegi =
      keliling persegi =
      volume kubus = 
      luas permukaan kubus =
*/

public class Tugas1 {

  public static void main(String[] args) {
    int pilihan = 0;
    int x = 0, y = 0, z = 0;
    BangunDatar segitiga1, persegi1, persegiPanjang1, lingkaran1;
    BangunRuang kubus1, balok1, silinder1;

    // inisialisasi semua bangun datar dan bangun ruang;
    segitiga1 = new Segitiga(x, y);
    persegi1 = new Persegi(x);
    persegiPanjang1 = new PersegiPanjang(x, y);
    lingkaran1 = new Lingkaran(x);
    kubus1 = new Kubus(x);
    balok1 = new Balok(x, y, z);
    silinder1 = new Silinder(x, y);

    do {
      CLC();
      System.out.println("\nPILIH BANGUN DATAR ATAU BANGUN RUANG DIBAWAH INI");
      System.out.println("1. Segitiga siku siku\n2. Persegi\n3. Persegi panjang");
      System.out.println("4. Lingkaran\n5. Kubus\n6. Balok\n7. Silinder\n8. Keluar");

      do {
        pilihan = getUserInput("PILIHAN\t: ");
      } while (pilihan == 0);
      System.out.println(" ");

      switch (pilihan) {
      case 1: // SEGITIGA
        x = getUserInput("Alas segitiga\t: ");
        y = getUserInput("Tinggi segitiga\t: ");
        ((Segitiga) segitiga1).setSegitiga(x, y);

        hasil("SEGITIGA SIKU SIKU");
        segitiga1.display("Segitiga");
        break;
      case 2: // PERSEGI
        x = getUserInput("Sisi Persegi\t: ");
        ((Persegi) persegi1).setPersegi(x);

        hasil("PERSEGI");
        persegi1.display("Persegi");
        break;
      case 3: // PERSEGI PANJANG
        x = getUserInput("Lebar persegi panjang\t: ");
        y = getUserInput("Panjang persegi panjang\t: ");
        ((PersegiPanjang) persegiPanjang1).setPersegiPanjang(x, y);

        hasil("PERSEGI PANJANG");
        persegiPanjang1.display("Persegi Panjang");
        break;
      case 4: // LINGKARAN
        x = getUserInput("Jari-jari lingkaran\t: ");
        ((Lingkaran) lingkaran1).setLingkaran(x);

        hasil("LINGKARAN");
        lingkaran1.display("Lingkaran");
        break;
      case 5: // KUBUS
        x = getUserInput("Sisi kubus\t: ");
        ((Kubus) kubus1).setKubus(x);
        ((Persegi) persegi1).setPersegi(x);

        hasil("KUBUS");
        persegi1.display("Persegi");
        kubus1.display("Kubus");
        break;
      case 6: // BALOK
        x = getUserInput("Lebar balok\t: ");
        y = getUserInput("Panjang balok\t: ");
        z = getUserInput("Tinggi balok\t: ");
        ((Balok) balok1).setBalok(x, y, z);

        hasil("BALOK");
        ((PersegiPanjang) persegiPanjang1).setPersegiPanjang(x, y);
        persegiPanjang1.display("Persegi Panjang 1");
        ((PersegiPanjang) persegiPanjang1).setPersegiPanjang(x, z);
        persegiPanjang1.display("Persegi Panjang 2");
        ((PersegiPanjang) persegiPanjang1).setPersegiPanjang(z, y);
        persegiPanjang1.display("Persegi Panjang 3");
        balok1.display("Balok\t");
        break;
      case 7: // SILINDER
        x = getUserInput("Jari-jari silinder\t: ");
        y = getUserInput("Tinggi silinder\t\t: ");
        ((Silinder) silinder1).setSilinder(x, y);

        hasil("SILINDER");
        silinder1.display(" ");
        break;
      case 8:
        System.out.println("\nTerima kasih :D");
      }
    } while (pilihan != 8);
  }

  private static void CLC() { // clear screen, LINK : https://stackoverflow.com/a/17015039/12159309
    try {
      final String os = System.getProperty("os.name");
      if (os.contains("Windows")) {
        Runtime.getRuntime().exec("cls");
      } else {
        Runtime.getRuntime().exec("clear");
      }
    } catch (final Exception e) {
    }
  }

  private static int getUserInput(String var) { // LINK : https://codereview.stackexchange.com/a/245276
    Scanner inputUser = new Scanner(System.in);
    int pilihan;

    while (true) {
      try {
        System.out.print(var);
        pilihan = inputUser.nextInt();
        if (pilihan <= 0) {
          throw new InputMismatchException();
        }
        break;
      } catch (InputMismatchException e) {
        System.out.println("\nInput Harus Angka!!!");
        inputUser.nextLine();
      }
    }
    return pilihan;
  }

  private static void hasil(String namaBangun) {
    System.out.println("\n-----HASIL PERHITUNGAN " + namaBangun + "-----");
  }
}
