import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pilihanSoal;

        if (args.length > 0) {
            pilihanSoal = args[0];
        } else {
            System.out.print("Pilih Soal: ");
            pilihanSoal = sc.next();
        }

        switch (pilihanSoal) {
            case "Soal1":
                int a = sc.nextInt();
                int b = sc.nextInt();
                int res = a + b;
                if (((a ^ res) & (b ^ res)) < 0) {
                    System.out.println("OVERFLOW");
                } else {
                    System.out.println(res);
                }
                break;

            case "Soal2":
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                float resFloat = (float) x + (float) y;
                double resDouble = x + y;
                double selisih = Math.abs((double) resFloat - resDouble);
                System.out.printf("%.6f\n", selisih);
                break;

            case "Soal3":
                int n = sc.nextInt();
                Integer aObj = n; 
                Integer bObj = aObj;
                aObj++; // Ini menciptakan objek baru karena Integer immutable
                System.out.println("==: " + (aObj == bObj));
                System.out.println("equals: " + aObj.equals(bObj));
                break;

            case "Soal4":
                String s = sc.next();
                String strA = s;
                String strB = new String(s);
                strA = strA + "X";
                System.out.println("==: " + (strA == strB));
                System.out.println("equals: " + strA.equals(strB));
                break;

            case "Soal5":
                int valInt = Integer.parseInt(sc.next());
                double valDouble = Double.parseDouble(sc.next());
                boolean valBool = Boolean.parseBoolean(sc.next());
                double result = valInt * valDouble;
                if (!valBool) result *= -1;
                System.out.printf("%.2f\n", result);
                break;

            default:
                System.out.println("Soal tidak ditemukan.");
                break;
        }
        
        sc.close(); 
    }
}