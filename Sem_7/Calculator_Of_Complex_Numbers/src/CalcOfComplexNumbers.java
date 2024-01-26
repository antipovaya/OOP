public final class CalcOfComplexNumbers implements iCalc{

    @Override
    public String sum_arg(int a, int b, int c, int d) {
        return (a+c) + " + " + (b+d) + "*i";
    }

    @Override
    public String multiplication_arg(int a, int b, int c, int d) {
        return (a*c - b*d) + " + " + (a*d + b*c) + "*i";
    }

    @Override
    public String division_arg(int a, int b, int c, int d) {
        return (a*c + b*d)/(c*c + d*d) + " + " + (b*c - a*d)/(c*c + d*d) + "*i";
    }



}
