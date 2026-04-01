public class GeradorPrimo extends NumeroPrimo{

    public int gerarProximoNumeroPrimo (int ultimoPrimoConhecido) {
        int proximoNumero = ultimoPrimoConhecido + 1;
        while (!verificarPrimalidade(proximoNumero)) {
            proximoNumero++;
        }
        return proximoNumero;
    }
}
