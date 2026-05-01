package string;

//https://leetcode.com/problems/reverse-words-in-a-string/description/
public class ReverseWords {
    public static void main(String[] args) {
        System.out.println("##" + reverseWords("a good   example") + "##");
        System.out.println("##" + reverseWords("  hello world  ") + "##");
        System.out.println("##" + reverseWords("the sky is blue") + "##");
    }

    public static String reverseWords(String s) {
        String[] strArr = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = strArr.length - 1; i >= 0; i--) {
            if (!strArr[i].equals("")) {
                sb.append(strArr[i]);
                sb.append(" ");

            }
        }
        return sb.substring(0, sb.length() - 1);
    }
}