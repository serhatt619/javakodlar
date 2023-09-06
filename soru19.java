package örneksorular;
public class soru19 {
    public static int enkindis(int[] a){
        int indis=0;
        int enk;
        for(int i=1; i<a.length-1; i++){
            if(a[i]<a[indis]){
                indis=i;
            }
        }
        return indis;
    }
    public static void main(String[] args) {
        //Kendisine parametre olarak gelen tamsayı dizisindeki en küçük elemanın indisini geri döndüren metod.
        int[] a={7,8,1,2,3,4,5};
        System.out.println(enkindis(a));
    }
}
