public class HelloApp02{

    public static void main(String[] args) {

        String name;

        // Check if at least one argument is passed
        if (args.length > 0) {
            name = args[0];
        } else {
            name = "World";
        }

        System.out.println("Hello, " + name + "!");
    }
}