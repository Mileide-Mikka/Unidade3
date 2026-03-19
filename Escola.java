public class Escola {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Fernanda", 1, 8.5);
        Aluno aluno2 = new Aluno("Alan", 6, 9.0);

        aluno1.exibirInformacoes();
        aluno2.exibirInformacoes();

        aluno1.setNota(11); // Tentativa de definir uma nota inválida
        aluno1.setNota(7.5); // Definindo uma nota válida

        aluno1.exibirInformacoes();
        System.out.println("*******************************************");

        Avaliacao alunoGrad = new AlunoGraduacao("Rafaella", 5, 8.0);
        Avaliacao alunoPosGrad = new AlunoPosGraduacao("Laila", 9, 8.0);

        System.out.println("Média do aluno da graduação: " + alunoGrad.calcularMedia());
        System.out.println("Média do aluno da pós-graduação: " + alunoPosGrad.calcularMedia());
    }
}
