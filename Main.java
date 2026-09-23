import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Personagem> personagens = new ArrayList<>();

        personagens.add(new Mago("Frieren", 100, 5, 10));
        personagens.add(new Guerreiro("Darkin", 100, 10, 15));
        personagens.add(new Arqueiro("Legolas", 100, 8, 12));

        for (Personagem personagem : personagens) {
            personagem.ficha();
        }
    }
}