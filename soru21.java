package örneksorular;
public class soru21 {
    public static int[] uur(int [] a){
        int []b=new int[a.length];
        for(int i=0; i<a.length; i++){
            a[i]=a[i]+1;
            b[i]=a[i];
        }
        return b;
    }
    public static void main(String[] args) {
        //Kendisine parametre olarak gelen tamsayı dizisinin her elemanını bir arttırıp geri döndüren metod.
        int [] a={0,1,2,3,4,5};
        int [] b=uur(a);
        for(int i=0; i<b.length; i++){
            System.out.println(b[i]);
        }
    }
}
