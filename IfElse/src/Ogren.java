public class Ogren {
    public static void main(String[] args) {
        int a = 10, b = 20;
        boolean compare = a == b;
       // String str = compare? "Eşittir": "Eşit Değildir";
        // System.out.println(str);

        if (compare) {
            a = 50;
            System.out.println("A sayısı :" + a);
                    System.out.println("Eşittir");
        } else {
            System.out.println("Esit değildir");
        }
        System.out.println("Program bitti !");
    }
}
