public class SubstringExample {
    public static void main(String[] args) {
        String text = "I love java programming";
        String result = text.substring(7, 11);

        System.out.println("Original string: \"" + text + "\"");
        System.out.println("Result of substring(7, 11): \"" + result + "\"");
        System.out.println("Length of the returned string: " + result.length());
    }
}
