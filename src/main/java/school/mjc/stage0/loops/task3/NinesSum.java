package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        for (int i = 0; i < lengthOfLastNumber; i++) {
            int num = 0;
            for (int j = 1; j <= i; j++) {
                num += 9 * Math.pow(10, j);
            }
            num += 9;
            sum += num;
        }
        System.out.println(sum);
    }
}
