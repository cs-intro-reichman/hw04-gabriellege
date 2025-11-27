public class MyString {
    public static void main(String[] args) {
        boolean test1 = MyString.contains("baba yaga", "baba");
        boolean test2 = MyString.contains("baba yaga", "");
        boolean test3 = !MyString.contains("baba yaga", "John Wick is the baba yaga");
        boolean test4 = !MyString.contains("baba yaga", "Yaga");
        boolean test5 = !MyString.contains("baba yaga", "babayaga");

        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
        System.out.println(test5);
    }

    public static String lowerCase(String str) {
        String out = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c += 32;
            }
            out += c;
        }
        return out;
    }

    public static boolean contains(String str1, String str2) {
        str1 = lowerCase(str1);
        str2 = lowerCase(str2);

        if (str2.length() == 0) return true;
        if (str1.length() < str2.length()) return false;

        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            int hits = 0;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i + j) == str2.charAt(j)) {
                    hits++;
                } else {
                    break; // stop inner loop if mismatch
                }
            }
            if (hits == str2.length()) return true;
        }
        return false;
    }
}
