import java.util.Scanner;

public class ViewMyCalc {

    private iCalc calculator;

    public ViewMyCalc(iCalc calculator) {
        this.calculator = calculator;
    }

    public void run() {
        while (true) {
            int a = promptInt("Введите 1-й аргумент 1-го комплексного числа: ");
            int b = promptInt("Введите 2-й аргумент 1-го комплексного числа: ");
            int c = promptInt("Введите 1-й аргумент 2-го комплексного числа: ");
            int d = promptInt("Введите 2-й аргумент 2-го комплексного числа: ");
            // calculator.sum(primaryArg);
            //iCalculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (* - перемножить, + - сложить , / - разделить) : ");

                if (cmd.equals("*")) {
                    
                    System.out.printf("Результат %s\n", calculator.multiplication_arg(a, b, c, d));
                    break;
                }
                if (cmd.equals("+")) {
                    System.out.printf("Результат %s\n", calculator.sum_arg(a, b, c, d));
                    break;
                }
                if (cmd.equals("/")) {
                    System.out.printf("Результат: %s\n", calculator.division_arg(a, b, c, d));
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
