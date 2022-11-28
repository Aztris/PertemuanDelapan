import java.util.Scanner;

public class Perulangan003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input Nilai Awal (kecil)  : ");
        int a = in.nextInt();
        System.out.print("Input Nilai Akhir (besar) : ");
        int b = in.nextInt();
        
        int awal = a;
        for(int i = a; i <= b; i++){
            
            int cetak=a;
            
            for(int x = a; x <= awal; x++){
                
                System.out.print(cetak+" ");
                cetak++;
            }
            
            System.out.println("");
            awal++;
        }
    }
}
