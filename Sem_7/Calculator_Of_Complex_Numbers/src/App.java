public class App {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");
       iCalc calc = new CalcOfComplexNumbers();

       iCalc decor = new DecoratorCalc(new CalcOfComplexNumbers(), new LoggerCalc());

       ViewMyCalc view = new ViewMyCalc(decor);
       view.run();
    }
}
