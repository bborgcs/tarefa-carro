import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Carro c = new Carro();
        Scanner scanner = new Scanner (System.in);

        double força;
        double gasolina;
        double abastecer;

        c.placa = "1234-ABC";
        c.cor = "cinza";
        c.modelo = "palio";
        c.velo = 100;
        c.veloMax = 157;
        c.combus = 35;
        c.combusMax = 47;

        c.toString(1);

        System.out.println("\n\nVocê deseja freiar[1], acelerar[2] ou abastecer[3} o carro?");
        int op = scanner.nextInt();

        if (op == 1) {
            System.out.println("Insira a força aplicada");
            força = scanner.nextInt();

            c.velocidade(força, c.velo, c.veloMax, 1);
            c.toString(1);
        }

        if (op == 2) {
            System.out.println("Insira a força aplicada");
            força = scanner.nextInt();

            c.velocidade(força, c.velo, c.veloMax, 2);
            c.toString(1);
        }

        if(op==3) {
            System.out.println("Insira a quantidade de combustível colocada");
            gasolina = scanner.nextInt();
            abastecer = c.abastecer(c.combus, gasolina, c.combusMax);
        }
            
       
        scanner.close();
    }
}