public class StringConstructors {
    public static void main(String[] args) {
        
        String s1 = new String();
        s1 = "ABC";
        System.out.println("S1:" + s1);

        char chars[] = {'a','b','c','d'};
        String s2 = new String(chars);
        System.out.println("s2:" + s2);

        String s3 = new String(chars,1,3);
        System.out.println("s3:" + s3);
        
        byte bytes[] = {65,66,67,68};
        String s4 = new String(bytes);
        System.out.println("s4:" + s4);

        String s5 = new String(bytes,1,3);
        System.out.println("s5:" + s5);

        String s6 = new String("Hello, World!");
        System.out.println("s6:" + s6);

        String s7 = new String(s6);
        System.out.println("s7:" + s7);

        String s8 = new String(s6.toCharArray());
        System.out.println("s8:" + s8);

        String s9 = new String(s6.getBytes());
        System.out.println("s9:" + s9);

        
        
    }
}
