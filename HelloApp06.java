public class HelloApp06{

    public static void main(String[] args) {

        String greeting;

        if (args.length == 0) {
            greeting = "World";
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            // Append delimiter after every name
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove trailing ", "
            if (nameBuilder.length() > 0) {
                greeting = nameBuilder.substring(0, nameBuilder.length() - 2);
            } else {
                greeting = "World";
            }
        }

        System.out.println("Hello, " + greeting + "!");
    }
}