public class HelloWorld {
    public String hello() {
            return "hello world";
    }

    public static void main(String[] args) {
        System.out.println(new HelloWorld().hello());
    }
}
