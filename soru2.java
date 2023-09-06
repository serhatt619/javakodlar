package örneksorular;
public class soru2 {
    public static int ust(int a, int b){
        int sonuc=1;
        for(int i=0; i<b; i++){
            sonuc=sonuc*a;
        }
        return sonuc;
    }
    public static void main(String[] args) {
        //Kendisine parametre olarak gelen iki tamsayının a^b sini hesaplayıp geri döndüren metod.
        System.out.println(ust(5,2));
    }
    
}
