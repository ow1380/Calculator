public class Main {
    public static void main(String[] args) {

        Calculatir calculatir = new Calculatir();
        int a = 4;
        int b = 3;
        System.out.println(a + " + " + b + " = " + calculatir.summ(a, b));
        System.out.println(a + " - " + b + " = " + calculatir.diff(a, b));
        System.out.println(a + " * " + b + " = " + calculatir.mul(a, b));
        System.out.println(a + " / " + b + " = " + calculatir.div(a, b));
        System.out.println("корень из" + a + " = " + calculatir.sqrt(a));
        System.out.println(a + " в степени " + b + " = " + calculatir.pow(a, b));
        System.out.println("факториал " + a + " = " + calculatir.factorial(a));
    }
}
