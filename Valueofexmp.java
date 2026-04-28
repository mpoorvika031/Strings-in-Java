public class Valueofexmp {
    public static void main(String[] args) {
        int i = 100;
        String s1 = String.valueOf(i);
        System.out.println("String value of integer 100: " + s1);

        double d = 3.14;
        String s2 = String.valueOf(d);
        System.out.println("String value of double 3.14: " + s2);

        boolean b = true;
        String s3 = String.valueOf(b);
        System.out.println("String value of boolean true: " + s3);

        char c = 'A';
        String s4 = String.valueOf(c);
        System.out.println("String value of char 'A': " + s4);

        Object obj = new Object();
        String s5 = String.valueOf(obj);
        System.out.println("String value of an object: " + s5);

        Object nullObj = null;
        String s6 = String.valueOf(nullObj);
        System.out.println("String value of null object: " + s6);
    }
    
}
