package atividade5.Veículos;

public class Bicicleta extends Veiculos{
    
    public Bicicleta(String modelo, String marca, Integer ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }


    @Override
    public String toString() {
        return "{" +
        " modelo='" + getModelo() + "'" +
        " marca='" + getMarca() + "'" +
        " ano='" + getAno() + "'" +
            "}";
    }
    
}
