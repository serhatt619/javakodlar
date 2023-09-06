package örneksorular;
public class soru16 {
    public static boolean avarmi(String str){
        int sayac=0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='a'){
            sayac=sayac+1;
            }
        }
        if(sayac==0){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        //Kendisine parametre olarak gelen stringte 'a' karakterinin olup olmadığını geri döndüren metod.
        System.out.println(avarmi("elsene"));
    }
    
}
