//package tictactoe;
//
//class BaseNumberGenerator {
//
//    protected int base;
//
//    public BaseNumberGenerator(int base) {
//        this.base = base;
//        System.out.println(base);
//    }
//
//    public int generate() {
//        return base + 11;
//    }
//}
//
//class NumberGenerator extends BaseNumberGenerator {
//
//
//    public NumberGenerator(int base) {
//        super(base);
//        System.out.println(base);
//    }
//
//    @Override
//    public int generate() {
//
//        return super.generate() + getNumber();
//    }
//
//
//    protected int getNumber() {
//        return this.base - 7;
//    }
//}
//
//class MagicNumberGenerator extends NumberGenerator {
//
//
//    public MagicNumberGenerator(int base) {
//        super(base);
//        System.out.println(base);
//    }
//
//    @Override
//    protected int getNumber() {
//        return this.base + 7;
//    }
//
//    public static void main(String[] args) {
//        BaseNumberGenerator generator = new MagicNumberGenerator(10);
//        System.out.println(generator.generate());
//    }
//}

abstract class A {

    public static void staticFoo() { }

    public void instanceBar() { }

    public abstract void abstractFoo();

    public abstract void abstractBar();
}

abstract class B extends A {

    public static void anotherStaticFoo() { }

    public void anotherInstanceBar() { }

    @Override
    public void abstractBar() { }

    public abstract void qq();
}

class C extends B {
    @Override
    public void abstractFoo() {

    }

    @Override
    public void qq() {

    }
}