public class Principal {
    public static void main(String[] args) throws Exception {
        
        DiarioDeClasse diario = new DiarioDeClasse();
        Situacao situacao = new Situacao();

        Aluno aluno1 = new Aluno();

        aluno1.setSituacao(situacao);
		aluno1.setNomeCompleto("Murilo Vieira Cruz");
		aluno1.getSituacao().setPrimeiraNota(7.0);
		aluno1.getSituacao().setSegundaNota(8.0);
		aluno1.getSituacao().setTerceiraNota(7.5);
		
		diario.registrar(aluno1);
		diario.calcularMedia(aluno1);
		
		System.out.println("A média do aluno " + aluno1.getNomeCompleto() + 
        " é " + aluno1.getSituacao().getMedia());
		System.out.println("Com isso ele está: " + aluno1.getSituacao().getStatus());
    }
}
