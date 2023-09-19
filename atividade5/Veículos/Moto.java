package atividade5.Veículos;

public class Moto extends Veiculos{

    private Integer cilindrada;
    
    public Moto(String modelo, String marca, Integer ano, Integer cilindrada) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cilindrada = cilindrada;
    }

    public Integer getCilindrada() {
        return this.cilindrada;
    }

    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "{" +
        " modelo='" + getModelo() + "'" +
        " marca='" + getMarca() + "'" +
        " ano='" + getAno() + "'" +
        " cilidrada='" + getCilindrada() + "'" +
            "}";
    }
}
