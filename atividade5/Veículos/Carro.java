package atividade5.Veículos;

public class Carro extends Veiculos{

    private Integer cavalos;

    public Carro(String modelo, String marca, Integer ano, Integer cavalos) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cavalos = cavalos;
    }

    public Integer getCavalos() {
        return this.cavalos;
    }

    public void setCavalos(Integer cavalos) {
        this.cavalos = cavalos;
    }


    @Override
    public String toString() {
        return "{" +
            " modelo='" + getModelo() + "'" +
            " marca='" + getMarca() + "'" +
            " ano='" + getAno() + "'" +
            " cavalos='" + getCavalos() + "'" +
            "}";
    }

}
