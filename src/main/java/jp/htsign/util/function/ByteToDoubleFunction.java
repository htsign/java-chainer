package jp.htsign.util.function;

@FunctionalInterface
public interface ByteToDoubleFunction {
  public double applyAsDouble(byte value);
}
