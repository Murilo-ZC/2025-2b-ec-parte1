public class Professor extends Academico implements IEstudar{
    @Override
    public void estudar() {
        System.out.println("Preparar aulas e autoestudo! Ai tem que corrigir!");
    }
}
