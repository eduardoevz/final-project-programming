import java.util.Scanner;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        

        Gastos gastos = new Gastos();
        gastos.registrarGastos(scanner);
        gastos.mostrarResultados();

        System.out.println("Ingrese los nombres y precios de 5 productos lacteos:");
        ProductoLacteo[] productos = new ProductoLacteo[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Producto " + (i + 1) + ": ");
            String nombre = scanner.next();
            System.out.print("Precio de " + nombre + ": ");
            double precio = scanner.nextDouble();
            productos[i] = new ProductoLacteo(nombre, precio);
        }

        Ventas ventas = new Ventas(productos);
        ventas.registrarVentas(scanner);
        ventas.mostrarResultados();
    }




    
















}