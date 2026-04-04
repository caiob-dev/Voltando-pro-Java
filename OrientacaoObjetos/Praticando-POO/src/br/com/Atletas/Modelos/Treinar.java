package br.com.Atletas.Modelos;

public class Treinar extends Atletas {
    public void treino(Atletas atletas) {
        if (atletas.getClassificacao() >= 9) {
            if (atletas.isPatrocionio() == true) {
                System.out.println("O atleta: " + atletas.getNome() + " é excelente atleta! Ele pratica: " + atletas.getEsportePraticado() + " e tem patrocínio.");
            } else {
                System.out.println("O atleta: " + atletas.getNome() + " está no processo. Ele pratica: " + atletas.getEsportePraticado());
            }
        }
    }
}
