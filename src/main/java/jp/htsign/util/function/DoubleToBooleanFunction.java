package jp.htsign.util.function;

@FunctionalInterface
public interface DoubleToBooleanFunction {
  public boolean applyAsBoolean(double value);
}
