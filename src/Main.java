import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon Reshiram = new Reshiram("Lupa", 306);
        b.addAlly(Reshiram);
        Pokemon Eevee = new Eevee("Pupa", 65);
        b.addAlly(Eevee);
        Pokemon Umbreon = new Umbreon("Zupa", 184);
        b.addAlly(Umbreon);
        Pokemon Igglybuff = new Igglybuff("Jaba", 42);
        b.addFoe(Igglybuff);
        Pokemon Jigglypuff = new Jigglypuff("Gaba", 95);
        b.addFoe(Jigglypuff);
        Pokemon Wigglytuff = new Wigglytuff("Kaba", 196);
        b.addFoe(Wigglytuff);
        b.go();
    }
}
