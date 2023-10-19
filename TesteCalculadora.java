public class TesteCalculadora {
    public static void main(String[] args) {
        var cal = new Calculadora();
        System.out.println(cal.somar(2, 3));
        System.out.println(cal.somar(1.2f, 3.4f));
        System.out.println(cal.somar(2, 3));
    }
}