public class HelloApp04{

    public static void main(String[] args) {

        String names;

        if (args.length > 0) {
            // Join all names with comma and space
            names = String.join(", ", args);
        } else {
            // Default value
            names = "World";
        }

        System.out.println("Hello, " + names + "!");
    }

}