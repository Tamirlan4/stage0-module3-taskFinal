package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = 0;
        String c =Integer.toString(number);
        String k[] = c.split("");
        for (int i = 0; i < k.length; i++) {
            sum += Integer.parseInt(k[i]);
        }
        System.out.println(sum);
    }
}
