public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 10);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);//Ошибка деления на ноль.
        // использовал проверку делителя равен нулю или нет
        calc.println.accept(c);
        int d = calc.abs.apply(-6);
        calc.println.accept(d);

    }
}
