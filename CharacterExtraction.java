public class CharacterExtraction {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Extracting a character at a specific index using the charAt() method
                char charAtIndex5 = str.charAt(7);
                System.out.println("Character at index 7: " + charAtIndex5);
        
        // Extracting a substring using the substring() method
        String substring = str.substring(7, 12);
        System.out.println("Substring from index 7 to 12: " + substring);
        
        // Extracting the first character using the charAt() method
        char firstChar = str.charAt(0);
        System.out.println("First character: " + firstChar);
        
        // Extracting the last character using the charAt() method
        char lastChar = str.charAt(str.length() - 1);
        System.out.println("Last character: " + lastChar);

        // To extract more than one chaacter udsing getChars() method
        String str2 = "This is a demo of getChars method.";
        int start = 10;
        int end = 14;
        char[] charArray = new char[end - start];
        str2.getChars(start, end, charArray, 0);
        System.out.println("Characters from index " + start + " to " + end + ": " + new String(charArray));

        // getByte() method to extract bytes from a string
        String str3 = "Hello";
        byte[] byteArray = str3.getBytes();
        System.out.println("Bytes of the string 'Hello': ");
        for (byte b : byteArray) {
            System.out.print(b + " ");
        }

        // Using toCharArray() method to convert a string into a character array
        String str4 = "Character Array";
        char[] charArray2 = str4.toCharArray();
        System.out.println("\nCharacter array from the string 'Character Array': ");
        for (char c : charArray2) {
            System.out.print(c + " ");
        }
    }    
}
