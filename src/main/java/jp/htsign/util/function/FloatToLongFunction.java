package jp.htsign.util.function;

@FunctionalInterface
public interface FloatToLongFunction {
  public long applyAsLong(float value);
}
