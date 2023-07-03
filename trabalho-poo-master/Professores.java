public class Professores extends SQLClass{    
    @Key
    int id;
    String nome;
    String cpf;
    String materia;

    Professores(){
        this.setTableName("PROFESSORES");
    }
}
