package atividade5;

import atividade5.Veículos.Bicicleta;
import atividade5.Veículos.Carro;
import atividade5.Veículos.Moto;
import atividade5.Veículos.Veiculos;

public class Executavel {
    public static void main(String[] args) {
        
        Bicicleta bike1 = new Bicicleta("Com Cestinha", "Monark", 2008);
        Bicicleta bike2 = new Bicicleta("Sem Cestinha", "Caloi", 2023);
        Carro car1 = new Carro("Corsa", "Chevrolet", 1998, 140);
        Carro car2 = new Carro("Prisma", "Chevrolet", 2011, 110);
        Moto moto1 = new Moto("Ninja", "Hayabuza", 2020, 399);
        Moto moto2 = new Moto("Crosser", "Yamaha", 2023, 150);

        imprimirVeiculo(moto2);
        imprimirVeiculo(moto1);
        imprimirVeiculo(car2);
        imprimirVeiculo(car1);
        imprimirVeiculo(bike2);
        imprimirVeiculo(bike1);
    }

    public static void imprimirVeiculo(Veiculos v){
        System.out.println(v);
    }
}
