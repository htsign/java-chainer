package jp.htsign.util.function;

@FunctionalInterface
public interface ToCharFunction<T> {
  public char applyAsChar(T value);
}
