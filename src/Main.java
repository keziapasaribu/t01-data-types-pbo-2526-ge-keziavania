import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        int hasil = a + b;

        if (a > 0 && b > 0 && hasil < 0) {
            System.out.println("OVERFLOW");
        } else if (a < 0 && b < 0 && hasil >= 0) {
            System.out.println("OVERFLOW");
        } else {
            System.out.println(hasil);
        }

        sc.close();
     }
}

// soal 2
double x = sc.nextDouble();
        double y = sc.nextDouble();

        // 2. Jumlahkan menggunakan float
        float hasilFloat = (float) x + (float) y;

        // 3. Jumlahkan menggunakan double
        double hasilDouble = x + y;

        // 4. Hitung selisih absolut (selalu positif)
        double selisih = Math.abs(hasilFloat - hasilDouble);

        // 5. Tampilkan hasil dengan 6 digit di belakang koma
        System.out.printf("%.6f\n", selisih);

        sc.close();