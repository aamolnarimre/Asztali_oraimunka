package oraimunkaotthon;

public class OraimunkaOtthon {

    public static void main(String[] args) {

        System.out.println("Hello makk");

        int szam = 1;
        int szam2 = 10;

        float tortszam = 5.4124f;
        double tortszam2 = 5.123124;

        boolean ertek = true;
        boolean ertek2 = false;

        String szoveg = "asd";
        char k = 'a';
        //ADSDASD

        System.out.println("EZ egy karakter" + k);
        System.out.print("Sortörés nélkül ");
        System.out.println("EZ következik");

        System.out.printf("%-10s%-8d%d\n", szoveg, 10, 20);

        System.out.printf(" %s\n%s%5s\n%s%5s\n%s%5s\n%s%5s\n%s%5s\n %s\n", "-----", "|", "|", "|", "|", "|", "|", "|", "|", "|", "|", "----");

        int n = 1;
        int m = 2;
        int osszead = n + m;
        n += 1;
        double osztas = m /= 10;

        n++;
        m--;

        int maradek = n % m;

        //<= >= == !=
        System.out.println(true && false);
        System.out.println(true || false);

        System.out.println(1 & 2);
        System.out.println(1 | 2);

        if (szam > 10) {
            if (szam % 2 == 0) {
                System.out.println("A szám osztható 2-vel");
            }
            System.out.println("A szám nagyobb, mint 10");
        } else if (szam < 5) {
            System.out.println("A szám kisebb, mint 5");
        } else {
            System.out.println("A szám kisebb, mint 10 és nagyobb, mint 5");
        }

        //ALT+SHIFT+F
        switch ('a') {
            case 10:
                System.out.println("A szám 10");
                break;
            case 15:
                System.err.println("A szám 15");
                break;
            default:
                System.out.println("A szám nem 10 és nem 15");
                
        }
        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < 10; j++) {
                for (int l = 0; l < 10; l++) {
                    System.out.println("a");
                }
            }
        }
        
        szam = 1;
        while (szam != 1){
            szam++;
            System.out.println(szam);
        }
        
        do {
            szam++;
            System.out.println(szam);
        } while (szam!=2);
        
        szam++;
        System.out.println(szam);
        
        //1:27 video
        
        
        
        
    }

}
