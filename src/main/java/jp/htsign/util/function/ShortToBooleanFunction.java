package jp.htsign.util.function;

@FunctionalInterface
public interface ShortToBooleanFunction {
  public boolean applyAsBoolean(short value);
}
