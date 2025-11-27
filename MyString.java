public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy"));      // true
        System.out.println(contains("happy", "unhappy"));      // false
        System.out.println(contains("historical", "story"));   // false
        System.out.println(contains("psychology", "psycho"));  // true
        System.out.println(contains("personality", "son"));    // true
        System.out.println(contains("personality", "dad"));    // false
        System.out.println(contains("resignation", "sign"));   // true
    }

    public static String lowerCase(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Character.toLowerCase(arr[i]);
        }
        return new String(arr);
    }

    public static boolean contains(String str1, String str2) {
        str1 = lowerCase(str1);
        str2 = lowerCase(str2);

        int n = str1.length();
        int m = str2.length();

        if (m == 0) return true;
        if (m > n) return false;

        for (int i = 0; i <= n - m; i++) {
            String sub = str1.substring(i, i + m);
            if (sub.equals(str2)) {
                return true;
            }
        }
        return false;
    }
}
