package PraticandoColecoesEStream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamNomesCurtos {
    public static void main(String[] args) {
        List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda", "Alice", "Daniel", "Caroline");
        List<String> funcionariosComNomesCurtos = funcionarios.stream()
                .filter(f -> f.length() <=5)
                .toList();

        System.out.println("Funcionários com nomes curtos: " + funcionariosComNomesCurtos);
    }
}
