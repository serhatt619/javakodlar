package örneksorular;
public class soru20 {
    public static boolean siralimi(int[] a){
        for(int i=0; i<a.length-1; i++){
            if(a[i]>a[i+1]){
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        //Kendisine parametre olarak gelen tamsayı dizisinin sıralı olup olmadığını geri döndüren metod.
        int[] a={1,2,0,3,4,5};
        System.out.println(siralimi(a));
    }
}
