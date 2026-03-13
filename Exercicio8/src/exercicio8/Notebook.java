package exercicio8;

public class Notebook extends Dispositivo {

    private String processador;

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    @Override
    public void setMarca(String dell) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}