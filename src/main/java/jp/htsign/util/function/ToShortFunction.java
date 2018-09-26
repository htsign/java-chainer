package jp.htsign.util.function;

@FunctionalInterface
public interface ToShortFunction<T> {
  public short applyAsShort(T value);
}
