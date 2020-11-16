import ru.ifmo.se.pokemon.*;
public class Umbreon extends Eevee {
    public Umbreon(String name, int level) {
        super(name, level);
        setStats(95, 65, 110, 60, 130, 65);
        setType(Type.DARK);
        this.addMove(new SandAttack());
        this.addMove(new TailWhip());
        this.addMove(new Swagger());
        this.addMove(new FeintAttack());
    }
}