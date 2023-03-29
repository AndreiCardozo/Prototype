package main.java.prototype;

public class Carro implements Cloneable {
    private String modelo;
    private Integer placa;

    public Carro(String modelo, Integer placa) {
        super();
        this.modelo = modelo;
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getPlaca() {
        return placa;
    }

    public void setPlaca(Integer placa) { this.placa = placa; }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", placa=" + placa +
                '}';
    }
}
