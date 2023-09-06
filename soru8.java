package örneksorular;
public class soru8 {
    public static int kdondur(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String[] args) {
        //Kendisine parametre olarak gelen iki tamsayıdan büyük olanı geri döndüren metod.
        System.out.println(kdondur(30,20));
    }
}
