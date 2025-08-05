import java.util.Scanner;

public class BelanjaBarangKeola {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Barang 1:");
        String Barang1 = input.nextLine();
        double Harga1 = 2.500;
        
    
        System.out.println("Barang 2 :");
        String Barang2 = input.nextLine();
        double Harga2 = 3.800;

        System.out.println("Barang 3: ");
        String Barang3 = input.nextLine();
        double Harga3 = 5.800;


        System.out.println("------------------");
       System.out.println("List belanja:" + Barang1 +" "+ Barang2+" " +  Barang3);
     System.out.println("Harga barang: " + Harga1 + " " + Harga2+ " " + Harga3);
   
     
    }
}
