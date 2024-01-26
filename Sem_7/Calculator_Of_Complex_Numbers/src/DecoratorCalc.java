public class DecoratorCalc implements iCalc {

    private CalcOfComplexNumbers oldCalculator;
    private LoggerCalc logger;

    public DecoratorCalc(CalcOfComplexNumbers oldCalculator, LoggerCalc logger) {
        this.oldCalculator = oldCalculator;
        this.logger = logger;
    }

    @Override
    public String sum_arg(int a, int b, int c, int d) {

        logger.log(String.format("Первый аргумент первого комплексного числа: %d", a));
        logger.log(String.format("Второй аргумент первого комплексного числа: %d", b));
        logger.log(String.format("Первый аргумент второго комплексного числа: %d", c));
        logger.log(String.format("Второй аргумент второго комплексного числа: %d", d));
        String result = oldCalculator.sum_arg(a, b, c, d);
        logger.log(String.format("______________________________________________"));
        logger.log(String.format("Вызов метода sum произошел"));
        logger.log(String.format("______________________________________________"));

        return result;
    }

    @Override
    public String multiplication_arg(int a, int b, int c, int d) {
        
        logger.log(String.format("Первый аргумент первого комплексного числа: %d", a));
        logger.log(String.format("Второй аргумент первого комплексного числа: %d", b));
        logger.log(String.format("Первый аргумент второго комплексного числа: %d", c));
        logger.log(String.format("Второй аргумент второго комплексного числа: %d", d));
        String result = oldCalculator.multiplication_arg(a, b, c, d);
        logger.log(String.format("______________________________________________"));
        logger.log(String.format("Вызов метода multi произошел"));
        logger.log(String.format("______________________________________________"));
        return result;
    }

    @Override
    public String division_arg(int a, int b, int c, int d) {
        logger.log(String.format("Первый аргумент первого комплексного числа: %d", a));
        logger.log(String.format("Второй аргумент первого комплексного числа: %d", b));
        logger.log(String.format("Первый аргумент второго комплексного числа: %d", c));
        logger.log(String.format("Второй аргумент второго комплексного числа: %d", d));
        String result = oldCalculator.division_arg(a, b, c, d);
        logger.log(String.format("______________________________________________"));
        logger.log(String.format("Вызов метода division произошел"));
        logger.log(String.format("______________________________________________"));

        return result;
    }

    
    
    
    
    

    
}
