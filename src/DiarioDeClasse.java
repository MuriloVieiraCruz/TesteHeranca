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

    public double calcularMedia(Aluno alunos) {

        double media = 0.0;

        for (Aluno aluno : turma) {
            if(aluno != null) {
                media = (aluno.getSituacao().getPrimeiraNota() +
                        aluno.getSituacao().getSegundaNota() +
                        aluno.getSituacao().getTerceiraNota()) / 3;

                aluno.getSituacao().setMedia(media);
             
                if(media >= 7) {
                    aluno.getSituacao().setStatus('A');
                }else {
                    aluno.getSituacao().setStatus('R');
                }       
            }
        }
        return media;
    }

    public Aluno[] listarAlunos(Aluno[] turma) {
        
        Aluno[] alunosListados = new Aluno[indiceDaTurma];

        int i = 0;

        for (Aluno aluno : turma) {
            if(aluno != null){
                alunosListados[i] = aluno;
                i++;
            }
        }
        return alunosListados;
    }

}
