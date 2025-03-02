package March.ex_02032025;

public class Lab161 {
    public static void main(String[] args) {
        String s1 = "   Poonam";
        String s2 = "Kshirsagar";

        System.out.println(s1.charAt(3));
        System.out.println(s1.length());
        System.out.println(s2.substring(3,6));
        System.out.println(s2.indexOf('i'));
        System.out.println(s1.contains("a"));
        System.out.println(s2.isEmpty());
        System.out.println(s1.isBlank());
        System.out.println(s2.compareTo(s1));
        System.out.println(s1.strip());
    }
}
