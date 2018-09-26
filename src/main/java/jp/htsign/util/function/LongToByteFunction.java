package jp.htsign.util.function;

@FunctionalInterface
public interface LongToByteFunction {
  public byte applyAsByte(long value);
}
