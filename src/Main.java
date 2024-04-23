public class Main {

    public static void main(String[] args) {
	// write your code here
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);//здесь аргументы складываются (плюсуются)
        int b = calc.minus.apply(1,1);//одни аргумент вычитается из другого. В итоге: 0
        try{
            int c = calc.devide.apply(a, b);//a делится на b, которое равно 0, исходя из её реализации по условию, что должно привести к ошибке
            /*
            Способы решения: предусмотреть обработку входящих данных в блоке, реализующем алгоритм devide
             */
            calc.println.accept(c);// этот код выполнятся исходя их реализации задействованных переменных по условию
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException!");//реализация обработки ошибки, как требует задание
        }

    }
}
