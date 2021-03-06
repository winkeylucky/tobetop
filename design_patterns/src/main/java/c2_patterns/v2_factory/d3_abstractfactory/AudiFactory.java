package c2_patterns.v2_factory.d3_abstractfactory;

/**
 * @author xuxin
 * @version v1.0
 * @project to_be_top
 * @package c2_patterns.v2_factory.d3_abstractfactory
 * @date 20 14:${MIMUTE}
 * @modified
 */
public class AudiFactory implements CarFactory{
    @Override
    public Engine createEngine() {
        return new EngineA();
    }

    @Override
    public Chair createChair() {
        return new ChairA();
    }
}
