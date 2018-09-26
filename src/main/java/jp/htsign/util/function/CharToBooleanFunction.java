package jp.htsign.util.function;

@FunctionalInterface
public interface CharToBooleanFunction {
  public boolean applyAsBoolean(char value);
}
