package jp.htsign.util.function;

@FunctionalInterface
public interface LongToShortFunction {
  public short applyAsShort(long value);
}
