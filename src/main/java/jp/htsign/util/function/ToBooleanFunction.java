package jp.htsign.util.function;

@FunctionalInterface
public interface ToBooleanFunction<T> {
  public boolean applyAsBoolean(T value);
}
