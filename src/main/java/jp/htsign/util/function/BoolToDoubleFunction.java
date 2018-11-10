package jp.htsign.util.function;

@FunctionalInterface
public interface BoolToDoubleFunction {
  public double applyAsDouble(boolean value);
}
