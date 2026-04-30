class StringBufferDemo
{
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer("Java");

        // append()
        sb.append(" Programming");
        System.out.println("Append: " + sb);

        // insert()
        sb.insert(4," Language");
        System.out.println("Insert: " + sb);

        // replace()
        sb.replace(0,3,"Core");
        System.out.println("Replace: " + sb);

        // delete()
        sb.delete(5,13);
        System.out.println("Delete: " + sb);

        // deleteCharAt()
        sb.deleteCharAt(4);
        System.out.println("DeleteCharAt: " + sb);

        // reverse()
        sb.reverse();
        System.out.println("Reverse: " + sb);

        // length()
        System.out.println("Length: " + sb.length());

        // capacity()
        System.out.println("Capacity: " + sb.capacity());

        // charAt()
        System.out.println("Character at index 2: " + sb.charAt(2));

        // setCharAt()
        sb.setCharAt(0,'X');
        System.out.println("SetCharAt: " + sb);
    }
}