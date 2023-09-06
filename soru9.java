package örneksorular;
public class soru9 {
    public static int kucukler(String str){
        int sayac = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
            sayac++;
        }
    }
    return sayac;
    }
    public static void main(String[] args) {
        //Kendisine parametre olarak gelen stringteki küçük karakterlerin sayısnı geri döndüren metod.
        System.out.println(kucukler("Serhat"));
    }
}
