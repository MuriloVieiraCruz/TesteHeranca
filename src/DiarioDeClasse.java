public class DiarioDeClasse {

    private final int QTDE_MAX = 10;

    private int codigo;

    private String nomeDaUnidadeCurricular;

    private Aluno[] turma;

    private int indiceDaTurma;

    public DiarioDeClasse() {
        this.turma = new Aluno[QTDE_MAX];
        this.indiceDaTurma = 0;
    }

    public Aluno[] getTurma() {
        return turma;
    }

    public void setTurma(Aluno[] turma) {
        this.turma = turma;
    }

    public void registrar(Aluno aluno) {
        this.turma[indiceDaTurma] = aluno;
        indiceDaTurma++;
    }

    
}
