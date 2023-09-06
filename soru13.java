package örneksorular;
public class soru13 {
    public static int aabul(String str){
        int sayac=0;
        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i)=='a' && str.charAt(i+1)=='a'){
                sayac=sayac+1;
            }
        }
        return sayac;
    }
    public static void main(String[] args) {
        //Kendisine parametre olarak gelen stringteki "aa" stringlerinden kaç tane olduğunu bulup geri döndüren metod.
        System.out.println(aabul("deliaadeliaaaa"));
        
    }
}
