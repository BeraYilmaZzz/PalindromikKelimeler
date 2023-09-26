import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word,nWord = "";
        System.out.print("KELİME GİRİNİZ =");
        word = inp.nextLine();
        for( int i = word.length() -1 ; i >= 0 ; i--){
            nWord += word.charAt(i); // kelimenin sonundan başına saydırarak yeni dizi oluşturudm, yani kelimeyi döndürmüş oldum
        }
        // veya for döngüsü yerine aşağıdaki tek satırlık kodu kullanabilirdik.
        // StringBuilder nWord = new StringBuilder(word).reverse();
        // StringBuilder ile kullanıcının word kelimesini .reverse() ifadesi ile tersine döndürüyoruz ve nWord'e atıyoruz.
        if ( word.equals(nWord)){ // equals ile eşitliğini kontrol ettim
            System.out.println("Palindromik Kelime'dir");
        }else{
            System.out.println("Girdiğiniz kelime Palindromik Kelime değildir !!!");
        }

    }
}