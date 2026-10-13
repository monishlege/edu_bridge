package mentallll;

public class sep06 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("ssshuih");

        System.out.println("Length: " + sb.length());
        System.out.println("Character at index 4: " + sb.charAt(4));

        sb.insert(3, "JAVA");
        System.out.println("After insert: " + sb);

        sb.delete(3, 7);
        System.out.println("After delete: " + sb);

        sb.deleteCharAt(0);
        System.out.println("After deleteCharAt: " + sb);

        sb.replace(1, 3, "AB");
        System.out.println("After replace: " + sb);

        String finalStr = sb.toString();
        System.out.println("Starts with 'S': " + finalStr.startsWith("S"));
        System.out.println("Ends with 'h': " + finalStr.endsWith("h"));

        String sub = finalStr.substring(1, 4);
        System.out.println("Substring: " + sub);

        String upperStr = finalStr.toUpperCase();
        System.out.println("Uppercase string: " + upperStr);

        String lowerStr = upperStr.toLowerCase();
        System.out.println("Lowercase string: " + lowerStr);

        System.out.println("Equals check: " + upperStr.equals("SABUIH"));
    }
}
