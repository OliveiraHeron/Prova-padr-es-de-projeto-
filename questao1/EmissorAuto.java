package questao1;

    public class EmissorAuto extends EmissorApolice {

    protected Apolice criarApolice(
        String nomeSegurado,
        double valorBase
    )
    
    {
        return new ApoliceAuto(nomeSegurado, valorBase);
    }

    public void emitir(String string, double d) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'emitir'");
    }
}


