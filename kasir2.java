import java.util.Scanner;

public class kasir2 {

public static void main(String[] args) {
    double harga, diskon ;
    int hasil, kuantitas ;

    //harga barang
    Scanner scan =new Scanner (System.in);
    System.out.println("Masukkan harga barang ");
    harga = scan.nextDouble() ;

    //diskon barang
    System.out.println("Masukan diskon barang ");
    diskon = scan.nextDouble();


    //jumlah barang
    System.out.println("Masukan jumlah barang");
    kuantitas = scan.nextInt();

diskon = (diskon / 100 );
hasil = (int) ((int)harga * kuantitas * diskon);
System.out.println("Total yang harus dibyar adalah "+ hasil);


    

}
}


      