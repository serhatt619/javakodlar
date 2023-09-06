package örneksorular;
public class soru12 {
    public static String kucukbuyukbuyukkucukyap(String str){
        String sonuc="";
        for(int i=0; i<str.length();i++){
            char c=str.charAt(i);
            if(c>='a' && c<='z'){
                c=(char)(c-32);
                sonuc=sonuc+c;
            }
            else if(c>='A' && c<='Z'){
                c=(char)(c+32);
                sonuc=sonuc+c;
            }
            else{
                sonuc=sonuc+c;
            }
        }
        return sonuc;
    }
    public static void main(String[] args) {
        //Kendisine parametre olarak gelen stringteki küçük karakterleri büyük, büyükleri küçük yapıp sonucu geri döndüren metod.
        System.out.println(kucukbuyukbuyukkucukyap("Tec-9"));
    }
}
