import java.util.Scanner;

public class Carro {

    String placa;
    String cor;
    String modelo;
    double veloMax;
    double velo;
    double combus;
    double combusMax;

    double velocidade(double forca, double velo, double veloMax, int a) {
        double resul;

        resul = forca * 10/100;

            if (a==1) {//se freiar
                velo -= resul;
            }
            if (a==2) {//se acelerar
                velo += resul;
                if (velo > veloMax) {
                    toString(3);
                    velo -= resul;
                }
            }
        return velo;
    }

    double acelerar(double força) {
        double resul;

        resul = força * 5/100;
        return resul;
    }

    double abastecer(double quantCombus, double abastecimento, double QuantMaxCombus) {
        double resul;

        resul = quantCombus + abastecimento;

        if (resul > QuantMaxCombus) {
            resul = quantCombus;
            toString(2);
        }
        return resul;
    } 

    public String toString(int a){

        Scanner scanner = new Scanner (System.in);
        String texto = " ";

        if (a == 1) {
        texto = "Placa: "+placa;
        texto += "\nCor: "+cor;
        texto+= "\nModelo: "+modelo;
        texto += "\nVelocidade: "+velo;
        texto+= "\nVelocidade Maxima: "+veloMax;
        texto += "\nQuantidade de combustível: "+combus;
        texto+= "\nQuantidade maxima de combustível: "+combusMax;
        }

        if (2 == a) {
            texto = "Velocidade máxima foi atingida\nTENTE DE NOVO";
        }

        if (3 == a) {
            texto = "Quantida de combustível máxima foi atingida\nTENTE DE NOVO";
        }
        return texto;
    }
}