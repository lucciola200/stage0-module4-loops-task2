package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int number = 5;
        long fact = 1;
        int i = 0;
        while (i <= printToInclusive) {
            if (i == 0) {
                fact = 1;
            } else {
                fact = fact * i;
            }
            System.out.println(fact);
            i++;
        }
    }
}
