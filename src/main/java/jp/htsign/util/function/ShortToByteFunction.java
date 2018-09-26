package jp.htsign.util.function;

@FunctionalInterface
public interface ShortToByteFunction {
  public byte applyAsByte(short value);
}
