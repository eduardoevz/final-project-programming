import java.util.IllegalFormatWidthException;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    String rutaname= "C:\\Users\\ather\\OneDrive\\Desktop\\final-project-programming\\Archivos";


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

        Escribir(ventas, null);
    }



    public static void Escribir (Ventas ventas, String rutaname){


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaname+"Ventas .txt",true))){

            writer.write(rutaname, 5, 5);
            writer.newLine();

        
            
        
        } catch (IOException e) {
            e.printStackTrace();
        }


        


    }

    public static void Leer(String rutaname){

        try (BufferedReader reader= new BufferedReader(new FileReader(rutaname+"ventas.txt"))){
            
            String linea; 

            while((linea = reader.readLine()) !=null){

                System.out.println(linea);

            }



        } catch (IOException e) {
            
            e.printStackTrace();

            System.out.println("Verifique la existencia de un archivo");

        }


    }

        




    
















}