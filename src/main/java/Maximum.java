public class Maximum {
    public static Integer max(Integer a, Integer b, Integer c) {
        Integer max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println("Maximum number is " + max);
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Maximum Program Using Generics");
        Integer a = 10, b = 15, c = 12;
        System.out.println(max(10,12,15));
    }
}
