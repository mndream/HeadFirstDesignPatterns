package adapter;

/**
 * @author Shumao
 * @date 2019/3/1 17:21
 */
public class TurkeyAdapter implements Duck {
    private Turkey mTurkey;

    public TurkeyAdapter(Turkey turkey) {
        mTurkey = turkey;
    }

    @Override
    public void quack() {
        mTurkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            mTurkey.fly();
        }
    }
}
