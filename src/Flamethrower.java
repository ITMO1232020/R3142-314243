import ru.ifmo.se.pokemon.*;
public class Flamethrower extends SpecialMove {
    public Flamethrower() {
        super(Type.FIRE,90,100);
    }
    @Override
    protected String describe() {
        return "бум";
    }
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1)
            Effect.burn(p);
    }
}