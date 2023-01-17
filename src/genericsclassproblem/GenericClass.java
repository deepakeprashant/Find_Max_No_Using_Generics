package genericsclassproblem;

public class GenericClass<E extends Comparable> {

    E firstValue;
    E secondValue;
    E thirdValue;

    GenericClass(E firstValue, E secondValue, E thirdValue) {

        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    private static <E extends Comparable> void testMaxGeneric(E firstValue, E secondValue, E thirdValue) {

        if ((firstValue.compareTo(secondValue) > 0)) {
            if ((firstValue.compareTo(thirdValue) > 0)) {
                System.out.println("First value is maximum");
            } else
                System.out.println("Third value is maximum");
        } else if ((secondValue.compareTo(thirdValue)) > 0)
            System.out.println("Second value is maximum");
        else
            System.out.println("Third value is maximum");
    }

    void testMaximum() {

        testMaxGeneric(this.firstValue, this.secondValue, this.thirdValue);
    }
}
