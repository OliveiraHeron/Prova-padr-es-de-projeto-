package questao1;

import java.util.List;

public abstract class Apolice {

    protected String nomeSegurado;
    protected double valorBase;

    public Apolice(String nomeSegurado, double valorBase) {
        this.nomeSegurado = nomeSegurado;
        this.valorBase = valorBase;
    }

    public abstract String getLinhaProduto();

    public abstract double calcularPremioMensal();

    public abstract List<String> getDocumentosExigidos();

    public void imprimirResumo() {
        System.out.println("Linha de produto: " + getLinhaProduto());
        System.out.println("Nome do segurado: " + nomeSegurado);
        System.out.printf("Prêmio mensal: R$ %.2f%n", calcularPremioMensal());
        System.out.println("Documentos exigidos: " +
                String.join(", ", getDocumentosExigidos()));
        System.out.println();
    }
}
