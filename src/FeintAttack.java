import ru.ifmo.se.pokemon.*;
public class FeintAttack extends PhysicalMove {
    public FeintAttack() {
        super(Type.DARK,60,100);
    }
    @Override
    protected String describe() {
        return "нооооу";
    }
    protected void applyOppEffects(Pokemon p) {
        
    }
}
