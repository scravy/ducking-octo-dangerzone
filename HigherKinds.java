public interface HigherKinds {

    public <A, B, Fa extends Functor<A>, Fb extends Functor<B>>
        Function<Fa,Fb> fmap (Function<A,B> f);

    public <S,U,M,A, M1 extends Monad<Reply<S,U,A>>, M2 extends Monad<Consumed<M1>>>
        M1 runParsecT(ParsecT<S,U,M,A> p, State<S,U> s);
}







