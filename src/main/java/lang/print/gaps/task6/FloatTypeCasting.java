package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {

        double result = Math.round(numberToBeRounded);
        int finish;
        finish = (int) result;

        System.out.println(finish);


    }
}