package jp.htsign.util.function;

@FunctionalInterface
public interface DoubleToByteFunction {
  public byte applyAsByte(double value);
}
