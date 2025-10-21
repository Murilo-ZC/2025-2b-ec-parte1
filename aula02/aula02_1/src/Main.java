public class Main {
    public static void main(String[] args) {
        Sonho s1 = new Sonho("Hoje eu sonhei que o Gallo brigou com o Leão, na Floresta. Eu tentei mediar a luta. O leão me comeu.", true);
        Sonho s2 = new Sonho(" Caminhava por um campo dourado que parecia não ter fim, e o sol aquecia meu rosto de um jeito suave.\n" +
                " O vento trazia o cheiro das flores e sussurrava promessas que eu não conseguia entender.\n" +
                " Senti uma paz profunda, como se o futuro fosse simples e leve.", false);
        Sonho s3 = new Sonho("Estava no meu quarto, quando derrepente, vi o Elon Musk, dentro daquele lugar, com um morango do Amor,no formato de Labubu, de pistache, Abraçando ele, no teto, sendo observado. Havia muito sangue.", true);

        Zoo zoo = new Zoo();

        Decodificador oraculo = new Decodificador();

        ExibeAnimal(oraculo.Decodificar(s1,zoo));
        ExibeAnimal(oraculo.Decodificar(s2,zoo));
        ExibeAnimal(oraculo.Decodificar(s3,zoo));



    }

    public static void ExibeAnimal(Animal a){
        System.out.println("Animal:"+a.nome+" Número:"+a.numero);
    }
}
