package htsign.util.function;

@FunctionalInterface
public interface ShortToLongFunction {
  public long applyAsLong(short value);
}
