package questao1;

import java.util.Arrays;
import java.util.List;

public class ApoliceAuto extends Apolice {

    public ApoliceAuto(String nomeSegurado, double valorVeiculo) {
        super(nomeSegurado, valorVeiculo);
    }

    @Override
    public String getLinhaProduto() {
        return "Auto";
    }

    @Override
    public double calcularPremioMensal() {
        return (valorBase * 0.08) / 12;
    }

    @Override
    public List<String> getDocumentosExigidos() {
        return Arrays.asList("CNH", "CRLV");
    }
}
