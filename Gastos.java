import java.util.Scanner;

class Gastos {
    private double bolsas;
    private double cajillas;
    private double harina;


    






    public void registrarGastos(Scanner scanner) {
        System.out.print("Ingrese el gasto de bolsas: ");
        bolsas = scanner.nextDouble();

        System.out.print("Ingrese el gasto de cajillas: ");
        cajillas = scanner.nextDouble();

        System.out.print("Ingrese el gasto de harina: ");
        harina = scanner.nextDouble();
    }

    public void mostrarResultados() {
        System.out.println("Resultados de gastos:");
        System.out.println("Gasto 1: " + bolsas);
        System.out.println("Gasto 2: " + cajillas);
        System.out.println("Gasto 3: " + harina);
        System.out.println("Total de gastos: " + (bolsas + cajillas + harina));
    }
}