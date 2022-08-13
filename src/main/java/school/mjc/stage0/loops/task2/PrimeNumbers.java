package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive == 0) {
            return;
        }
        int j;
        int i = 1;
        int counter;
        while (i <= Math.abs(printToInclusive)) {
            counter = 0;
            j = 1;
            while (j <= i) {
                if (i % j == 0) {
                    counter++;
                }
                j++;
            }
            if (counter == 2) {
                System.out.println(i);
            }
            i++;
        }
    }
}
