package jp.htsign.util.function;

@FunctionalInterface
public interface BoolToByteFunction {
  public byte applyAsByte(boolean value);
}
