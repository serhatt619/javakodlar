package örneksorular;
public class soru6 {
    public static int fakt(int a){
        int sonuc=1;
        for(int i=2; i<=a; i++ ){
            sonuc=sonuc*i;
        }
        return sonuc;
    }
    public static void main(String[] args) {
        //Kendisine parametre olarak gelen pozitif tamsıyınn faktöriyelini geri döndüren metod.
        System.out.println(fakt(5));
    }
}
