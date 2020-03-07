public class J {
    public static void main(String[] args) {
     hello();
     hello("Bob");
    }
    public static void hello() {
        System.out.println("こんにちは");
    }
    public static void hello(String name) {
        System.out.println("こんにちは" + name);
    } 
}