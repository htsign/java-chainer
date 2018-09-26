package jp.htsign.util.function;

@FunctionalInterface
public interface ToFloatFunction<T> {
  public float applyAsFloat(T value);
}
