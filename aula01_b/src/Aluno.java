public class Aluno extends Academico implements IEstudar{
    private String RA;
    public void Projeto(){
        System.out.println("Fazer Projeto");
    }

    @Override
    public void estudar() {
        System.out.println("Fazer auto-estudos");
    }
}
