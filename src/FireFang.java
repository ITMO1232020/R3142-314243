import ru.ifmo.se.pokemon.*;
public class FireFang extends PhysicalMove {
    public FireFang() {
        super(Type.FIRE, 65, 95);
    }

    @Override
    protected String describe() {
        return "бомбит";
    }
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) {
            Effect.burn(p);
        if (Math.random() <= 0.1) {
            Effect.flinch(p);
        }
        }
    }
}