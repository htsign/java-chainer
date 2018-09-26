package jp.htsign.util.function;

@FunctionalInterface
public interface IntToBooleanFunction {
  public boolean applyAsBoolean(int value);
}
