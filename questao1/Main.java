package questao1;

public class Main {

    public static void main(String[] args) {

        EmissorAuto emissorAuto = new EmissorAuto();
        EmissorResidencial emissorResidencial = new EmissorResidencial();
        EmissorVida emissorVida = new EmissorVida();

        emissorAuto.emitir("Heron Oliveria", 60000.00);

        emissorResidencial.emitir("Ingrid Correia", 300000.00);

        emissorVida.emitir("Adriana correia", 500000.00);
    }
}
