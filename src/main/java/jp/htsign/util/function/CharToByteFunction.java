package jp.htsign.util.function;

@FunctionalInterface
public interface CharToByteFunction {
  public byte applyAsByte(char value);
}
