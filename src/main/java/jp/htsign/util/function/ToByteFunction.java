package jp.htsign.util.function;

@FunctionalInterface
public interface ToByteFunction<T> {
  public byte applyAsByte(T value);
}
