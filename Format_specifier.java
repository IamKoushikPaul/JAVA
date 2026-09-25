public class Format_specifier {
    public static void main(String[] args) {
        boolean b = true;
        char c = 'A';
        int i =12345;
        short s =32456;
        float f = 3.14f;
        double d = 3.14;

        System.out.printf("boolean b =%b\n",b);
        System.out.printf("Character c =%c\n",c);
        System.out.printf("Integer i =%d\n",i);
        System.out.printf("Short s =%d\n",s);
        System.out.printf("Float f =%.2f\n",f);
        System.out.printf("Double d =%.3f\n",d);

    }
}
