package Classes;

public class Aluno extends Pessoa {

    private String cursso, periodo, turno;
    private float numMatricula;

    public String getCursso() {
        return cursso;
    }

    public void setCursso(String cursso) {
        this.cursso = cursso;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public float getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(float numMatricula) {
        this.numMatricula = numMatricula;
    }

}
