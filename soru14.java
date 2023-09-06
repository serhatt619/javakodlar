package örneksorular;
public class soru14 {
    public static String buyukolan(String str1, String str2){
        if(str1.length()>str2.length()){
            return str1;
        }
        else{
            return str2;
        }
    }
    public static void main(String[] args) {
        //Kendisine parametre olarak gelen iki stringten büyük olanı geri döndüren metod.
        System.out.println(buyukolan("Denemeeeeeeeeeeeeee","Adaaaana"));
    }
}
