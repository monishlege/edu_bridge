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

        String sub = sb.toString().substring(1, 4);
        System.out.println("Substring: " + sub);

        String upperStr = sb.toString().toUpperCase();
        System.out.println("Uppercase string: " + upperStr);

        System.out.println("Equals check: " + upperStr.equals("SSHUIH"));
    }
}
