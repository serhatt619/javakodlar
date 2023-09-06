package örneksorular;
public class soru11 {
    public static String buyuklerikucukyap(String str){
        String sonuc="";
        for(int i=0; i<str.length();i++){
            char c=str.charAt(i);
            if(c>='a' && c<='z'){
                c=(char) (c-32);
                sonuc=sonuc+c;
            }
            else{
                sonuc=sonuc+c;
            }
        }
        return sonuc;
        
    }
    public static void main(String[] args) {
        //Kendisine parametre olarak gelen stringteki küçük karakterleri büyük yapan ve sonucu geri döndüren metod.
        System.out.println(buyuklerikucukyap("adana"));
    }
}
