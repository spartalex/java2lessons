package lesson9.lambda;

public class CheckIsJumper implements Checkable {
    @Override
    public boolean test(Animal animal) {
        return animal.isCanJump();
    }
}
