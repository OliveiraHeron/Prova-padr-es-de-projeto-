package questao1;


import java.util.Arrays;
import java.util.List;

public class ApoliceVida extends Apolice {

    public ApoliceVida(String nomeSegurado, double capitalSegurado) {
        super(nomeSegurado, capitalSegurado);
    }

    @Override
    public String getLinhaProduto() {
        return "Vida";
    }

    @Override
    public double calcularPremioMensal() {
        return (valorBase * 0.03) / 12;
    }

    @Override
    public List<String> getDocumentosExigidos() {
        return Arrays.asList("Documento de identidade", "CPF");
    }
}
