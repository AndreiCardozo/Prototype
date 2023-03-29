package main.java.prototype;

public class Personagem implements Cloneable {
    private int id;
    private String nome;
    private Carro carro;
    private String emprego;

    public Personagem(int id, String nome, Carro carro, String emprego) {
        this.id = id;
        this.nome = nome;
        this.carro = carro;
        this.emprego = emprego;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public String getEmprego() {
        return emprego;
    }

    public void setEmprego(String emprego) {
        this.emprego = emprego;
    }

    @Override
    public Personagem clone() throws CloneNotSupportedException {
        Personagem personagemClone = (Personagem) super.clone();
        personagemClone.carro = (Carro) personagemClone.carro.clone();
        return personagemClone;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", carro=" + carro +
                ", emprego='" + emprego + '\'' +
                '}';
    }
}
