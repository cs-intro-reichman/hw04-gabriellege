public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy"));
        System.out.println(contains("happy", "unhappy"));
        System.out.println(contains("historical", "story"));
        System.out.println(contains("psychology", "psycho"));
        System.out.println(contains("personality", "son"));
        System.out.println(contains("personality", "dad"));
        System.out.println(contains("resignation", "sign"));
    }

    public static String lowerCase(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char)(arr[i] + 32);
            }
        }
        return new String(arr);
    }

    public static boolean contains(String str1, String str2) {
        str1 = lowerCase(str1);
        str2 = lowerCase(str2);

        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            int j = 0;
            while (j < str2.length() && str1.charAt(i + j) == str2.charAt(j)) {
                j++;
            }
            if (j == str2.length()) {
                return true;
            }
        }
        return false;
    }
}
