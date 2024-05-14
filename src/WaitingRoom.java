import java.util.Scanner;

public class WaitingRoom {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int quantityOfPassengers;
        
        do {
            System.out.print("Qual é a quantidade de passageiros que passaram pela sala de espera? - ");
            quantityOfPassengers = input.nextInt();
        } while (quantityOfPassengers <= 0);

        int[] momentsOfEntry = new int[quantityOfPassengers];
        int[] momentsOfExit = new int[quantityOfPassengers];

        for (int i = 0; i < quantityOfPassengers; i++) {

            System.out.printf("Qual é o momento de entrada do %sº passageiro? - ", i + 1);
            momentsOfEntry[i] = input.nextInt();

            System.out.print("E qual foi seu momento de saida? - ");
            momentsOfExit[i] = input.nextInt();

            while (momentsOfEntry[i] >= momentsOfExit[i]) {

                System.out.println("O momento de entrada do passairo, deve ser menor que o momento de saida do mesmo.");

                System.out.printf("Qual é o momento de entrada do %sº passageiro? - ", i + 1);
                momentsOfEntry[i] = input.nextInt();

                System.out.print("E qual foi seu momento de saida? - ");
                momentsOfExit[i] = input.nextInt();

            }

        }
        
        input.close();

        int passageirosSimultaneos = PassengerCount.passengerCount(quantityOfPassengers, momentsOfEntry, momentsOfExit);

        System.out.println("A quantidade de passageiros simultâneos na sala de espera foi de: " + passageirosSimultaneos);
    }

}