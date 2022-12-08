import java.util.Scanner;

public class pernyataanif {

    public static void mai(String [] args){
        //membuat variabel belanja dan scanner
        int belanja = 0;
        Scanner scan = new Scanner(System.in);

        //mengambil input
        System.out.println("Total Belanjaan Rp ");
        belanja = scan.nextInt();

        //cek apakah dia belanja di atas 100000
        if (belanja > 100000) {
            System.out.println("Selamat, anda mendapatkan hadiah!");            
        }
        System.out.println("Terimkasih.....");
    }
}