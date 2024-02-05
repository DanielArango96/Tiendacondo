package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombreApellidos;
        String tipoCliente;
        int cantidadArticulos;
        double precioTotal;
        double descuento = 0.0;
        boolean opcionValida = false;

        do {
            System.out.print("Ingrese su nombre y apellidos: ");
            nombreApellidos = scanner.nextLine();
            System.out.print("Ingrese su tipo de cliente (Regular o VIP): ");
            tipoCliente = scanner.nextLine();

            if (tipoCliente.equalsIgnoreCase("Regular") || tipoCliente.equalsIgnoreCase("VIP")) {
                opcionValida = true;
            } else {
                System.out.println("Opción no válida, ingrese Regular o VIP");
            }
        } while (!opcionValida);

        System.out.print("Ingrese la cantidad de artículos comprados: ");
        cantidadArticulos = scanner.nextInt();
        System.out.print("Ingrese el precio total de la compra (sin descuento): ");
        precioTotal = scanner.nextDouble();

        if (tipoCliente.equalsIgnoreCase("Regular")) {
            if (cantidadArticulos >= 1 && cantidadArticulos <= 3) {
                descuento = precioTotal * 0.05;
            } else if (cantidadArticulos >= 4 && cantidadArticulos <= 6) {
                descuento = precioTotal * 0.1;
            } else if (cantidadArticulos > 6) {
                descuento = precioTotal * 0.15;
            }
        } else if (tipoCliente.equalsIgnoreCase("VIP")) {
            if (cantidadArticulos >= 1 && cantidadArticulos <= 3) {
                descuento = precioTotal * 0.1;
            } else if (cantidadArticulos >= 4 && cantidadArticulos <= 6) {
                descuento = precioTotal * 0.15;
            } else if (cantidadArticulos > 6) {
                descuento = precioTotal * 0.2;
            }
        }

        double total = precioTotal - descuento;
        System.out.println("--------------------------------------------------");
        System.out.println("FACTURA DE COMPRA");
        System.out.println("Nombre y apellidos: " + nombreApellidos);
        System.out.println("Tipo de cliente: " + tipoCliente);
        System.out.println("Cantidad de artículos comprados: " + cantidadArticulos);
        System.out.println("Precio total de la compra (sin descuento): $" + precioTotal);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + total);
        System.out.println("--------------------------------------------------");
    }
    }
