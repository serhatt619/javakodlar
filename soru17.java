package örneksorular;
public class soru17 {
    public static boolean palindrommu(String str){
        int bas = 0;
        int son = str.length() - 1;
    while (bas < son) {
        if (str.charAt(bas) != str.charAt(son)) {
            return false;
        }
        bas++;
        son--;
    }
    return true;
    }
    public static void main(String[] args) {
        //Kendisine parametre olarak gelen stringin palindrom olup olmadığını geri döndüren metod.
        System.out.println(palindrommu("abbba"));
    }
}
