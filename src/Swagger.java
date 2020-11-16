import ru.ifmo.se.pokemon.*;
public class Swagger extends PhysicalMove {
    public Swagger() {
        super(Type.FIRE, 65, 95);
    }
    @Override
    protected String describe() {
        return "дзынь по лбу";
    }
    protected void applyOppEffects(Pokemon p) {
        Effect.confuse(p);
        p.setMod(Stat.ATTACK, 2);
    }
}