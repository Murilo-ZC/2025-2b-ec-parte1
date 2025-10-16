import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Aluno pedroCruz = new Aluno();
        Aluno cruzPedro = new Aluno();
        Professor moricola = new Professor();
        Professor matsuyashi = new Professor();
        List<IEstudar> lista = new ArrayList<>();
        lista.add(pedroCruz);
        lista.add(cruzPedro);
        lista.add(moricola);
//        pedroCruz.estudar();
//        moricola.estudar();
//        chamarEstudar(pedroCruz);
//        chamarEstudar(moricola);
//        chamarEstudar(x);
        for (int i = 0; i < lista.size(); i++) {
            chamarEstudar(lista.get(i));
        }
    }

    public static void chamarEstudar(IEstudar elemento){
        elemento.estudar();
    }
}
