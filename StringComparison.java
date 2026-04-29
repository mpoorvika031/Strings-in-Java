public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        
        // Using equals() method to compare content
        System.out.println("Using equals():");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true
        
        // Using == operator to compare references
        System.out.println("\nUsing == operator:");
        System.out.println("str1 == str2: " + (str1 == str2)); // true (string literals are interned)
        System.out.println("str1 == str3: " + (str1 == str3)); // false (different objects in memory)
        
        // Using compareTo() method to compare lexicographically
        String str4 = "World";
        System.out.println("\nUsing compareTo():");
        System.out.println("str1.compareTo(str4): " + str1.compareTo(str4)); // negative value (Hello < World)
        System.out.println("str4.compareTo(str1): " + str4.compareTo(str1)); // positive value (World > Hello)

        // Using equalsIgnoreCase() method to compare content ignoring case
        String str5 = "hello";
        System.out.println("\nUsing equalsIgnoreCase():");
        System.out.println("str1.equalsIgnoreCase(str5): " + str1.equalsIgnoreCase(str5)); // true

        // Using regionMatches() method to compare specific regions of strings
        String str6 = "Hello, World!";
        System.out.println("\nUsing regionMatches():");
        System.out.println("str6.regionMatches(0, str1, 0, 5): " + str6.regionMatches(0, str1, 0, 5)); // true
        
    }
    
}
