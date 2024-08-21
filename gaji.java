import java.util.Scanner;

public class gaji {
    public static void main(String[] args) {
        double jamKerja, tarifPerJam, gajiKotor, gajiBersih,Pajak;

        Scanner scan= new Scanner(System.in);
        System.out.println("berapa jam kerja");
        jamKerja = scan.nextDouble();

        System.out.println("berapakah tarif per jam");
        tarifPerJam = scan.nextDouble();

        gajiKotor= jamKerja * tarifPerJam;
        Pajak= gajiKotor * 0.20;
        gajiBersih= gajiKotor -  Pajak;

        System.out.println("Gaji kotor: Rp " + gajiKotor);
        System.out.println("Pajak (20%): Rp" + Pajak);
       System.out.println("gaji bersih: Rp " + gajiBersih);
}
}