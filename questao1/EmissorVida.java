package questao1;

public class EmissorVida extends EmissorApolice {

    @Override
    protected Apolice criarApolice(
            String nomeSegurado,
            double valorBase
    ) {
        return new ApoliceVida(nomeSegurado, valorBase);
    }

    public void emitir(String string, double d) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'emitir'");
    }
}
