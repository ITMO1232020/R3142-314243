import ru.ifmo.se.pokemon.*;
public class Slash extends PhysicalMove {
    public Slash() {
        super(Type.NORMAL,70,100);
    }
    @Override
    protected String describe() {
        return "сделал прыжок с подвыподвертом";
    }
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        if(Math.random() <= att.getStat(Stat.SPEED)*3/512) return 2;
        else return 1;
    }
}
