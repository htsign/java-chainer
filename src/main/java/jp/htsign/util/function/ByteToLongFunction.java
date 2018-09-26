package htsign.util.function;

@FunctionalInterface
public interface ByteToLongFunction {
  public long applyAsLong(byte value);
}
