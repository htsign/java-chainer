package jp.htsign.util.function;

@FunctionalInterface
public interface BooleanUnaryOperator {
  public boolean applyAsBoolean(boolean value);
}
