public class Main {
    static boolean isPalindrom(int number){
        int temp= number, reversenumber = 0, lastNumber;

         while( temp != 0){

             System.out.println("Sayı: "+ temp);
             lastNumber = temp % 10;
             System.out.println("Son basamak: "+ lastNumber);
             reversenumber = (reversenumber*10)+lastNumber;
             System.out.println("Yeni sayı: "+ reversenumber);
             temp /= 10; // son basamağı siler.

         }
         return true;
    }


    public static void main(String[] args) {
        isPalindrom(742);

    }
}