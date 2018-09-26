package htsign.util.function;

@FunctionalInterface
public interface LongToCharFunction {
  public char applyAsChar(long value);
}
