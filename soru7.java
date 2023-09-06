package örneksorular;
public class soru7 {
    public static int topla(int a){
        int sonuc=0;
        for(int i=0; i<a; i++){
            sonuc=sonuc+i;
        }
        return sonuc;
    }
    public static void main(String[] args) {
        //Kendisine parametre olarak gelen pozitif tamsayıya kadarki tüm sayıları toplayıp geri döndüren metod.
        System.out.println(topla(10));
    }
    
}
