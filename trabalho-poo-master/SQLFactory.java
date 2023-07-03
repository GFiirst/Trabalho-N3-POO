
public class SQLFactory {
    public static void main(String[] args) {

        // Registros de aluno
        Alunos aluno = new Alunos();
        Alunos aluno2 = new Alunos();

        aluno.id = 1;
        aluno.nome = "thiago";
        aluno.cpf = "000-000-000-01";
        aluno.turma = "ads";

        
        aluno2.id = 11;
        aluno2.nome = "geovane";
        aluno2.cpf = "000-000-000-11";
        aluno2.turma = "ads";

        // Registros de professor
        Professores professor = new Professores();
        Professores professor2 = new Professores();

        professor.id = 2;
        professor.nome = "leticia";
        professor.cpf = "000.000.000-02";
        professor.materia = "POO";

        professor2.id = 3;
        professor2.nome = "rafael";
        professor2.cpf = "000.000.000-03";
        professor2.materia = "redes";

        try {

            // ALUNO
            System.out.println("ALUNOS");
            // Insere os registros no SQL
            MyDatabase.insertSQL(aluno);
            MyDatabase.insertSQL(aluno2);

            // Printa todos os dados do banco referente a tabela aluno
            MyDatabase.returnSQL(aluno);
            System.out.println("Dados inseridos");
            System.out.println("**********************************");
        
            // Atualiza os dados de um aluno em especifico
            aluno2.cpf = "111.111.111-11";
            aluno2.nome = "Giorno";
            MyDatabase.updateSQL(aluno2);

            // Printa os dados novamente
            MyDatabase.returnSQL(aluno2);
            System.out.println("Dados atualizados");
            System.out.println("**********************************");

            // Deleta os dados
            MyDatabase.deleteSQL(aluno);

            // Printa novamente
            MyDatabase.returnSQL(aluno);
            System.out.println("Dados deletados");
            System.out.println("**********************************");

            // PROFESSOR
            System.out.println("");
            System.out.println("PROFESSORES");

            // Insere os registros no SQL
            MyDatabase.insertSQL(professor);
            MyDatabase.insertSQL(professor2);

            // Printa todos os dados do banco referente a tabela aluno
            MyDatabase.returnSQL(professor);
            System.out.println("Dados inseridos");
            System.out.println("**********************************");
        
            // Atualiza os dados de um aluno em especifico
            professor.materia = "redes";
            professor.nome = "Leticia";
            MyDatabase.updateSQL(professor);

            // Printa os dados novamente
            MyDatabase.returnSQL(professor);
            System.out.println("Dados atualizados");
            System.out.println("**********************************");

            // Deleta os dados
            MyDatabase.deleteSQL(professor);

            // Printa novamente
            MyDatabase.returnSQL(professor);
            System.out.println("Dados deletados");
            System.out.println("**********************************");

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
