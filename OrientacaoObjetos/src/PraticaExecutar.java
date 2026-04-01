public class PraticaExecutar {
    public static void main() {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Caio";
        //pessoa1.retornaSaudacao();

        Calculadora calculo = new Calculadora();
        int resultado = calculo.dobroNumero(2);
        //System.out.println(resultado);

        Musica musica1 = new Musica();
        musica1.titulo = "Filho do Homem";
        musica1.artista = "Alessandro Villas Boas";
        musica1.anoLancamento = 2025;

        //musica1.exibirFichaTecnica();

        musica1.avaliar(8);
        musica1.avaliar(8);
        musica1.avaliar(8);

        double media = musica1.mediaDasNotas();
        //System.out.println(media);

        Carro carro1 = new Carro();

        carro1.modelo = "SUV";
        carro1.anoCarro = 2018;

        //carro1.exibirFichaTecnica();
        //carro1.calcularAnoCarro(2026);

        //Aluno aluno1 = new Aluno();

        //aluno1.nome = "Caio";
        //aluno1.idade = 22;

        //aluno1.exibirInformacoesAluno();

        ContaBancaria conta = new ContaBancaria();

//        conta.setNumeroConta(123);
//        conta.setSaldo(1000);
//        conta.titular = "Caio";

        //System.out.println("Número da conta: " + conta.getNumeroConta());
        //System.out.println("Saldo: " + conta.getSaldo());
        //System.out.println("Titular da conta: " + conta.titular);
//
//        conta.setSaldo(1500);
        //System.out.println("Novo saldo: " + conta.getSaldo());

        IdadePessoa idade1 = new IdadePessoa();

        idade1.setNome("Caio");
        idade1.setIdade(22);

        //System.out.println("Nome: " + idade1.getNome());
        //System.out.println("Idade: " + idade1.getIdade());

        //idade1.verificarIdade();

        Produto produto1 = new Produto();

//        produto1.setProduto("Cerca");
//        produto1.setPreco(30.50);

        //System.out.println("Nome do produto: " + produto1.getProduto());
        //System.out.println("Preço do produto: " + produto1.getPreco());

        //System.out.println("Aplicar desconto de 10%: R$" + String.format("%.2f" ,produto1.aplicarDesconto(10)));

        Aluno aluno = new Aluno("Caio", 10, 7, 9.5);

        //System.out.println("Nome do aluno: " + aluno.getNome());
        //System.out.println("Nota 1: " + aluno.getNota1());
        //System.out.println("Nota 2: " + aluno.getNota2());
        //System.out.println("Nota 3: " + aluno.getNota3());
        //System.out.println("Média do aluno: " + String.format("%.2f", aluno.calcularMedia()));

        Livro livro1 = new Livro();

        livro1.setTitulo("Cristianismo puro e simples");
        livro1.setAutor("C.S.Lewis");

        livro1.exibirDetalhes();

        ModeloCarro meuModeloCarro = new ModeloCarro();

        meuModeloCarro.definirModelo("SUV");
        meuModeloCarro.definirPrecos(20.000,25.000,27.000);
        meuModeloCarro.exibirInfo();
        meuModeloCarro.setQuantidadeDePortas(4);

        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        cachorro.emitirSom();
        cachorro.abanarRabo();

        gato.emitirSom();
        gato.arranharMoveis();

        ContaBancaria conta1 = new ContaBancaria();
        conta1.depositar(1000);
        conta1.consultarSaldo();

        conta1.sacar(200);
        conta1.consultarSaldo();

        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.depositar(500);
        contaCorrente.sacar(200);
        contaCorrente.cobrarTarifaMensal();

        VerificadorPrimo verificadorPrimo = new VerificadorPrimo();
        verificadorPrimo.verificarSeEhPrimo(17);

        GeradorPrimo geradorPrimo = new GeradorPrimo();
        int proximoPrimo = geradorPrimo.gerarProximoNumeroPrimo(17);
        System.out.println("O próximo número primo após 17 é: " + proximoPrimo);

        NumeroPrimo numeroPrimo = new NumeroPrimo();
        numeroPrimo.listarPrimos(30);

        ConversorMoeda conversor = new ConversorMoeda();
        conversor.converterDolarParaReal(5);

        CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular();
        calculadoraSalaRetangular.calcularArea(2,2);
        calculadoraSalaRetangular.calcularPerimetro(2,2);

        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(5);

        ConversorTemperaturaPadrao conversorTemperatura = new ConversorTemperaturaPadrao();
        conversorTemperatura.celsiusParaFahrenheit(30);
        conversorTemperatura.fahrenheitParaCelsius(50);
    }
}
