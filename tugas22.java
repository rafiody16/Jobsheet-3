import java.util.Scanner;

public class tugas22 {
    
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);

        String jabatan, nama;

        int gaji_pokok, lembur, telat, total ,bonus_lembur, potongan_telat, bonus = 23000, potongan = 10000;

            System.out.println("SLIP GAJI PT. MAJU MUNDUR");
            System.out.println("*----------------------------*");
            System.out.println("Nama: ");
            nama =  input.nextLine();
            System.out.println("Jabatan: ");
            jabatan = input.nextLine();
            System.out.println("Gaji Pokok: ");
            gaji_pokok = input.nextInt();
            System.out.println("Lembur(Jam): ");
            lembur =  input.nextInt();
            bonus_lembur = lembur * bonus;
            System.out.println("Bonus Lembur: " + bonus_lembur);
            System.out.println("Telat Masuk (Jam): ");
            telat = input.nextInt();
            potongan_telat = telat * potongan;
            System.out.println("Potongan Telat: " + potongan_telat);
            System.out.println("-------------------------------------");
            total = gaji_pokok + bonus_lembur - potongan_telat;
            System.out.println("Total: " + total);

    }

}
