package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int c = number % 10;
        String r = ""+c;
        c = number %100 /10;
        r+=c;
        c = number / 100;
        r+=c;
        c = Integer.parseInt(r);
        System.out.println(c);
    }
}
