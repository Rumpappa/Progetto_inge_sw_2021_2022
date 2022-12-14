package backend;

import java.util.Set;

public class Disponibilit√† {

    private Periodo periodo;
    private Set<String> comuni;

    public Disponibilit√†(Periodo periodo, Set<String> comuni) {
        this.periodo = periodo;
        this.comuni = comuni;
    }

    public Disponibilit√†(){}

    @Override
    public String toString() {
        return "Disponibilit√†{" +
                "periodo=" + periodo +
                ", comuni=" + comuni +
                '}';
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public void setComuni(Set<String> comuni) {
        this.comuni = comuni;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public Set<String> getComuni() {
        return comuni;
    }
}
