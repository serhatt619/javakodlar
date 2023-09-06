package örneksorular;
public class soru18 {
    public static int topla(int[] a){
        int toplam=0;
        for(int i=0; i<a.length;i++){
            toplam=toplam+a[i];
        }
        return toplam;
    }
    public static void main(String[] args) {
        //Kendisine parametre olarak gelen tamsayı dizisinin toplamını geri döndüren metod.
        int[] dizi={1,2,3,4,5,};
        System.out.println(topla(dizi));
    }
    
}
