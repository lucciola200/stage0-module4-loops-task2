package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
            return;
        }
        int i = 0;
        int result = 1;
        while (i <= power) {
            if (i == 0) {
                System.out.println(1);
            } else {
                System.out.println(result *= 2);
            }
            i++;
        }
    }
}
