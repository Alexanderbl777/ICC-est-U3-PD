public class App {
    public static void main(String[] args) {
        System.out.println("Práctica");

        runEjerciciosPD();
    }

    public static void runEjerciciosPD() {
        EjerciciosPD ejercicioPd = new EjerciciosPD();

        System.out.println("Fibonacci recursivo ");
        long inicial = System.nanoTime();
        long resultado = ejercicioPd.getFibonacci(50);
        long end = System.nanoTime();
        long duracion = end - inicial;
        System.out.println("Resultado: " + resultado + " con tiempo: " + duracion + " ns");

        System.out.println("\nFibonacci con Programación Dinámica");
        inicial = System.nanoTime();
        resultado = ejercicioPd.getFibonacciPD(50);
        end = System.nanoTime();
        duracion = end - inicial;
        System.out.println("Resultado: " + resultado + " con tiempo: " + duracion + " ns");
    }
}
