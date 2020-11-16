import ru.ifmo.se.pokemon.*;
public class Eevee extends Pokemon {
    public Eevee(String name, int level) {
        super(name, level);
        setStats(55, 55, 50, 45, 65, 55);
        setType(Type.NORMAL);
        this.addMove(new SandAttack());
        this.addMove(new TailWhip());
        this.addMove(new Swagger());
    }
}