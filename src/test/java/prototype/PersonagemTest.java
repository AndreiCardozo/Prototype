package test.java.prototype;

import main.java.prototype.Carro;
import main.java.prototype.Personagem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonagemTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Personagem personagem = new Personagem(123, "Personagem Primario", new Carro("gtr", 123), "Mecanico");

        Personagem personagemClone = personagem.clone();
        personagemClone.setId(456);
        personagemClone.setNome("Personagem Clonado");
        personagemClone.getCarro().setPlaca(456);
        personagemClone.setEmprego("Policial");

        assertEquals("Personagem{id=123, nome='Personagem Primario', carro=Carro{modelo='gtr', placa=123}, emprego='Mecanico'}", personagem.toString());
        assertEquals("Personagem{id=456, nome='Personagem Clonado', carro=Carro{modelo='gtr', placa=456}, emprego='Policial'}", personagemClone.toString());
    }
}