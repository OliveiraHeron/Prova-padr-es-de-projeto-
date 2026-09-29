package questao1;

import java.util.Arrays;
import java.util.List;

public class ApoliceResidencial extends Apolice {

    public ApoliceResidencial(String nomeSegurado, double valorImovel) {
        super(nomeSegurado, valorImovel);
    }

    @Override
    public String getLinhaProduto() {
        return "Residencial";
    }

    @Override
    public double calcularPremioMensal() {
        return (valorBase * 0.015) / 12;
    }

    @Override
    public List<String> getDocumentosExigidos() {
        return Arrays.asList("Escritura ou contrato de locação");
    }
}
