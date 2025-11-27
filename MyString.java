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
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char)(chars[i] + 32);
            }
        }
        return new String(chars);
    }

    public static boolean contains(String str1, String str2) {
        return lowerCase(str1).indexOf(lowerCase(str2)) != -1;
    }
}
