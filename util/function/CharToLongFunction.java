package htsign.util.function;

@FunctionalInterface
public interface CharToLongFunction {
  public long applyAsLong(char value);
}
