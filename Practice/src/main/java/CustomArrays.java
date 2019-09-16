public class CustomArrays {
    public static void main(String[] args) {
        String s = "Akkuratov";
        char[] myName = s.toCharArray();
        String s2 = new String(myName, 0, 3);
        System.out.println(s2);

    }
}
