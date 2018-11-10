package jp.htsign.util.function;

@FunctionalInterface
public interface ToBoolFunction<T> {
  public boolean applyAsBool(T value);
}
