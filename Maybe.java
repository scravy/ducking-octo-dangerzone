public abstract class Maybe<A> {
    private Maybe() {}
    public static final class Nothing<A> extends Maybe<A> {
        private Nothing() {}
    }
    public static final class Just<A> extends Maybe<A> {
        private final A a1;
        private Just(A a1) {
            this.a1 = a1;
        }
    }
    public static <A> Nothing<A> Nothing() {
        return new Nothing<A>();
    }
    public static <A> Just<A> Just(A a1) {
        return new Just<A>(a1);
    }
}
