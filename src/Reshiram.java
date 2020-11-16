import ru.ifmo.se.pokemon.*;
public class Reshiram extends Pokemon {
    public Reshiram(String name, int level) {
        super(name, level);
        setStats(100, 120, 100, 150, 120, 90);
        setType(Type.DRAGON, Type.FIRE);
        this.addMove(new Slash());
        this.addMove(new FocusBlast());
        this.addMove(new FireFang());
        this.addMove(new Swagger());
    }


}