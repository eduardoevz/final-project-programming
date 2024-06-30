import java.util.Scanner;

class Gastos {
    private double bolsas;
    private double cajillas;
    private double harina;

    public double salario; 







    public void registrarGastos(Scanner scanner) {
        System.out.print("Ingrese el gasto de bolsas: ");
        bolsas = scanner.nextDouble();

        System.out.print("Ingrese el gasto de cajillas: ");
        cajillas = scanner.nextDouble();

        System.out.print("Ingrese el gasto de harina: ");
        harina = scanner.nextDouble();



        System.out.println("Ingrese los salarios totales");
        salario= scanner.nextDouble();





    }

    public void mostrarResultados() {
        System.out.println("Resultados de gastos:");
        System.out.println("Gasto 1: " + bolsas);
        System.out.println("Gasto 2: " + cajillas);
        System.out.println("Gasto 3: " + harina);

        System.out.println("Gasto 4: "+ salario);




        System.out.println("Total de gastos: " + (bolsas + cajillas + harina+ salario));
    }
}