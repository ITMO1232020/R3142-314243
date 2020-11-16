import ru.ifmo.se.pokemon.*;
public class SandAttack extends StatusMove {
    public SandAttack() {
        super(Type.GROUND,0,100);
    }
    @Override
    protected String describe() {
        return "с него уже песок сыпется";
    }
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ACCURACY, -1);
    }
}
