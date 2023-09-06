package örneksorular;
public class soru3 {
    public static void ad(String isim, int a){
        for(int i=0; i<a; i++){
            System.out.println(isim);
        }
    }
    public static void main(String[] args) {
        //Kendisine parametre olarak gelen n tamsayısı kadar adınızı ekrana yazan metod.
        String isim="deneme";
        ad(isim,5);
    }
    
}
