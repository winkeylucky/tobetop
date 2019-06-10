package c2_patterns.v2_factory.d3_abstractfactory;

/**
 * @author xuxin
 * @version v1.0
 * @project to_be_top
 * @package c2_patterns.v2_factory.d3_abstractfactory
 * @date 20 14:${MIMUTE}
 * @modified
 */
public class ChairA implements Chair{
    @Override
    public void run() {
        System.out.println("坐垫能自动加热");
    }
}
