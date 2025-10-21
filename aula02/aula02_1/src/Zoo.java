import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public List<Animal> animais;

    public Zoo(){
        this.animais = new ArrayList();
        animais.add(new Animal("Águia", "Pessoa profética; Dons revelatórios", "Pode ser símbolo de desastre", 2));
        animais.add(new Animal("Burro", "Intercessores; Carregadores de fardos; Paz e mansidão", "Teimosia", 3));
        animais.add(new Animal("Borboleta", "Símbolo de esperança; Transformação em liberdade", "Pessoa volúvel; Borboleta social", 4));
        animais.add(new Animal("Cachorro", "Melhor amigo do homem; Fidelidade; Proteção; Jesus ou o Espírito Santo", "Espíritos territoriais", 5));
        animais.add(new Animal("Cabra", "Abundância", "Sem discernimento = Come qualquer coisa; Maldade", 6));
        animais.add(new Animal("Cobra", "", "Mentiras, contos, fabricações; Maldições e bruxaria", 9));
        animais.add(new Animal("Coelho", "Multiplicação; Temporada de crescimento e aumento", "Luxúria; Pecado; Espírito impuro", 10));
        animais.add(new Animal("Cavalo", "Poder; Ministério poderoso; Mover de Deus; Força (cavalos de potência)", "Poder da carne", 11));
        animais.add(new Animal("Elefante", "Algo com grande impacto; Pessoa poderosa ou influente", "Elefante na sala = Grande problema", 12));
        animais.add(new Animal("Gato", "Algo precioso; Pensamento independente (bom ou ruim)", "Teimosia da alma", 14));
        animais.add(new Animal("Jacaré", "", "Fofoca e calúnia (bocão); Mal do passado (antigo); Inimigo se movendo nos bastidores", 15));
        animais.add(new Animal("Leão", "Jesus; O Leão de Judá; Ser espiritual forte; Coragem", "O inimigo", 16));
        animais.add(new Animal("Macaco", "Agilidade no Espírito", "Espírito zombeteiro; Vício", 17));
        animais.add(new Animal("Porco", "", "Pecado; Maldade; Espírito demoníaco; Algo impuro", 18));
        animais.add(new Animal("Tigre", "Ministros poderosos para o bem ou para o mal", "Teimosia (laranja); Questões da carne", 22));
        animais.add(new Animal("Urso", "Conforto (abraço); Suportar", "Destruição ou perda econômica; Julgamento", 23));
        animais.add(new Animal("Veado", "Graciosos; Rápidos; Pés firmes; Tímidos; Ente querido; Anseio pelo Senhor", "", 24));
        animais.add(new Animal("Vaca", "Provisão; Mudança lenta", "Ídolo (vaca sagrada)", 25));
    }
}
