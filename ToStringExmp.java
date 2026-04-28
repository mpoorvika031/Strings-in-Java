public class ToStringExmp {
    public static void main(String[] args) {
        int num = 123;
        String str = Integer.toString(num);
        System.out.println("String representation of integer 123: " + str);

        double d = 3.14;
        String str2 = Double.toString(d);
        System.out.println("String representation of double 3.14: " + str2);

        boolean b = true;
        String str3 = Boolean.toString(b);
        System.out.println("String representation of boolean true: " + str3);

        char c = 'A';
        String str4 = Character.toString(c);
        System.out.println("String representation of char 'A': " + str4);

        Object obj = new Object();
        String str5 = obj.toString();
        System.out.println("String representation of an object: " + str5);
    }
    
}
