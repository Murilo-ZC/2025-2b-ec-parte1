public class Decodificador {
    public Animal Decodificar(Sonho s, Zoo zoo){
        Animal animalEncontrado = new Animal(
                "Cavalo", "Poder; Ministério poderoso; Mover de Deus; Força (cavalos de potência)", "Poder da carne", 11
        );
        for(int i = 0; i < zoo.animais.size(); i++){
            Animal atual = zoo.animais.get(i);
            String descricao = atual.significadoBom;
            if(s.pesadelo) descricao = atual.significadoRuim;
            for(String teste : descricao.toLowerCase().split("; ")){
                if(s.descricao.toLowerCase().contains(teste)){
                    animalEncontrado = atual;
                    break;
                }
            }

        }
        return animalEncontrado;
    }
}
