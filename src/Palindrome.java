public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
        }
        System.out.println(isPalindrome("madam"));
    }
    public static String reverseString(String s) {
        String s1 = ""; //объявляем переменную для обратной строки
        for (int a = s.length()-1; a >=0; a--){ //a - длина слова
            s1 = s1 + s.charAt(a); //составляем перевернутую строку
        }
        System.out.println(s1); //вывод перевёрнутой строки
        return s1;
    }
    public static boolean isPalindrome(String s) {
        String s1 = reverseString(s); //создание в функции переменной из перевёрнутой строки
        boolean b = s.equals(s1); //сравнение изначальной строки с перевёрнутой
        return b;
    }
}