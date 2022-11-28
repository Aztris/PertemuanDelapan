import java.util.Scanner;

public class Perulangan001 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        String ulang="y";
        
        while(ulang.equals("y") || ulang.equals("Y")){
            
            System.out.print("Input Nilai Awal (kecil)  : ");
            int a = in.nextInt();
            System.out.print("Input Nilai Akhir (besar) : ");
            int b = in.nextInt();
            
            int awal=a;
            for(int i=a;i<=b;i++){

                for(int x=a; x<=awal; x++){
                    System.out.print(i+" ");
                }

                System.out.println("");
                awal++;
            }
            
            System.out.print("Masukkan lagi? [y/t] : ");
            ulang = in.next();
            
            System.out.println("");
            System.out.println("");
        }        
    }
}
