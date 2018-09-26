package jp.htsign.util.function;

@FunctionalInterface
public interface LongToBooleanFunction {
  public boolean applyAsBoolean(long value);
}
