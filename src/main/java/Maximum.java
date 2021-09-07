public class Maximum {
    public static Integer max(Integer a, Integer b, Integer c) {
        Integer max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println("Maximum integer value is " + max);
        return max;
    }
    public static Float getMaximum(Float value1, Float value2, Float value3) {
        Float max = value1;
        if (value2.compareTo(value1) > 0 && value2.compareTo(value3) > 0)
            max = value2;
        else if (value3.compareTo(value2) > 0 && value3.compareTo(value1) > 0)
            max = value3;
        System.out.println("Maximum float value is " + max);
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Maximum Program Using Generics");
    }
}
