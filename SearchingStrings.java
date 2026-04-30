public class SearchingStrings {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "World";
        
        // Using contains() method to check if str1 contains str2
        System.out.println("Using contains():");
        System.out.println("str1.contains(str2): " + str1.contains(str2)); // true
        
        // Using indexOf() method to find the index of str2 in str1
        System.out.println("\nUsing indexOf():");
        System.out.println("str1.indexOf(str2): " + str1.indexOf(str2)); // 7
        
        // Using lastIndexOf() method to find the last occurrence of a character
        char ch = 'o';
        System.out.println("\nUsing lastIndexOf():");
        System.out.println("str1.lastIndexOf(ch): " + str1.lastIndexOf(ch)); // 8
        
        // Using startsWith() method to check if str1 starts with a specific prefix
        String prefix = "Hello";
        System.out.println("\nUsing startsWith():");
        System.out.println("str1.startsWith(prefix): " + str1.startsWith(prefix)); // true

        // Using endsWith() method to check if str1 ends with a specific suffix
        String suffix = "!";
        System.out.println("\nUsing endsWith():");
        System.out.println("str1.endsWith(suffix): " + str1.endsWith(suffix)); // true
    }
    
}
