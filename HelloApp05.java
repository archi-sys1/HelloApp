public class HelloApp05{

    public static void main(String[] args) {

        String result;

        // If no arguments, use default
        if (args.length == 0) {
            result = "World";
        } else {
            // Build comma-separated names using enhanced for loop
            StringBuilder sb = new StringBuilder();

            for (String name : args) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(name);
            }

            result = sb.toString();
        }

        System.out.println("Hello, " + result + "!");
    }
}