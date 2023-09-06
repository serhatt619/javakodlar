package örneksorular;
public class soru4 {
    public static int basamak(int a){
        int bas=0;
        while(a>0){
            a=a/10;
            bas++;
        }
        return bas;
    }
    public static void main(String[] args) {
        //Kendisine parametre olarak gelen pozitif tamsayının kaç basamaklı olduğunu geri döndüren metod
        System.out.println(basamak(19244));
    }
    
}
