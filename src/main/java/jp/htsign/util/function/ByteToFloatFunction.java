package jp.htsign.util.function;

@FunctionalInterface
public interface ByteToFloatFunction {
  public float applyAsFloat(byte value);
}
