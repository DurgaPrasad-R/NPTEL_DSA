public class DemoClass {
    // A method that can refer to any data type is known as a generic method
    // generic method
    static <T> void genericPrint (T t){
        //The following statement print which type parameter T this method is handling
        System.out.println (t.getClass().getName() + ":"+t);
    }
    public static void main(String[] args) {
        genericPrint(100);
        genericPrint("100");
        genericPrint(100.0000);
    }
}