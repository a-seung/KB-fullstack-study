package afternoon.lang.immutable;

public class ImmutableUser{
    private final String name;
    // final이라 나중에 값을 바꾸는게 불가능함

    public ImmutableUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ImmutableUser setName(String name) {
        return new ImmutableUser(name);
    }//불변객체는 값변경이 불가능하니 새롭게 만들어서 변경하겠다.

    @Override
    public String toString() {
        return "ImmutableUser{" +
                "name='" + name + '\'' +
                '}';
    }
}

