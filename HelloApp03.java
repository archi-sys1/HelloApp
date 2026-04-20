public class HelloApp03{

    public static void main(String[] args) {

        // Using ternary operator to assign default value
        String name = (args.length > 0) ? args[0] : "World";

        System.out.println("Hello, " + name + "!");
    }

}