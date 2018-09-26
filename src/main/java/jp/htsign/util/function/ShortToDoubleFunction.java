package jp.htsign.util.function;

@FunctionalInterface
public interface ShortToDoubleFunction {
  public double applyAsDouble(short value);
}
