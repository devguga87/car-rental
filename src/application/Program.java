package application;

import models.entities.CarRental;
import models.entities.Vehicle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Retorno (dd/MM/yyyy hh:mm");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.println("Entre com o preço por hora: ");
        Double precoHora = sc.nextDouble();
        System.out.println("Entre com o preço por dia: ");
        Double precoDia = sc.nextDouble();
        System.out.println("FATURA: ");
        System.out.print("Pagamento básico: ");
        Double pagamentoBasico = sc.nextDouble();
        System.out.print("Imposto: ");
        Double imposto = sc.nextDouble();
        System.out.print("Pagamento total: ");
        Double pagamentoTotal = sc.nextDouble();

        sc.close();
    }
}
