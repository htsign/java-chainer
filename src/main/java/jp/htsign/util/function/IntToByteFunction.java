package jp.htsign.util.function;

@FunctionalInterface
public interface IntToByteFunction {
  public byte applyAsByte(int value);
}
