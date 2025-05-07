
public class MethodEx2 {
    public static void main(String[] args) {
        String message = "Hello, world!";
        sayHello(3, message);
        sayHello(5, message);
        sayHello(7, message);

    }
    public static void sayHello(int i, String message) {
        for (int j = 0; j < i; j++) {
            System.out.println(message);
        }
    }
}