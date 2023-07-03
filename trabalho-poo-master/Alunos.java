public class Alunos extends SQLClass{
    @Key
    int id;
    String nome;
    String cpf;
    String turma;
    Alunos(){
        this.setTableName("ALUNOS");
    };
}
