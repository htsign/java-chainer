package jp.htsign.util.function;

@FunctionalInterface
public interface ByteToIntFunction {
  public int applyAsInt(byte value);
}
