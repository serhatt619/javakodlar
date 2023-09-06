package örneksorular;
public class soru22 {
    public static int ind(String[] a){
        int enuzunindis=0;
        for(int i=1; i<a.length; i++){
            if(a[i].length()>a[enuzunindis].length()){
                enuzunindis=i;
            }
        }
        return enuzunindis;
    }
    public static void main(String[] args) {
        //Kendisine parametre olarak gelen string dizisindeki en uzun stringin olduğu indisi geri döndüren metod.
        String[] a={"Deneme", "Mükemmel","Taner","jskgjjgjljklgslkfjgl"};
        System.out.println(ind(a));
    }
}
