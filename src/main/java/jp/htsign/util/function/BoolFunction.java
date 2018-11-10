package jp.htsign.util.function;

@FunctionalInterface
public interface BoolFunction<T> {
  public T apply(boolean value);
}
