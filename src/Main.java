public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello Anton!");
        System.out.println("hjfvghil;km,");
        System.out.println("Serega fetch it!");
        int res = 0;
        int fac = 1;
        for (int i = 0; i < 11; i++) {
            res += i;
            System.out.println(res);
        }
        System.out.println(res);
        for (int i = 1; i < 11; i++) {
            fac *= i;
        }
        System.out.println(fac);
    }
}
