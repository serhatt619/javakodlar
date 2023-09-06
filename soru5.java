package örneksorular;
public class soru5 {
    public static int fibonacci(int n) {
    if (n <= 1) {
        return 1;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
}
    public static void main(String[] args) {
        //n. fibonacci sayısını geri döndüren metod.
        System.out.println(fibonacci(0));
    }
    
}
