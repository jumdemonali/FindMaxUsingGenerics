public class Maximum<E extends Comparable> {
    E[] inputarray;

    Maximum(E[] inputarray)
    {
        this.inputarray=inputarray;
    }

    public E checkMaximum()
    {
        E result= checkMaximum(inputarray);
        return result;
    }
    public static<E extends Comparable> E checkMaximum(E[] inputarray)
    {
        E max =inputarray[0];
        for(E element:inputarray) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}
