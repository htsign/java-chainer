package htsign.util.function;

@FunctionalInterface
public interface ByteToShortFunction {
  public short applyAsShort(byte value);
}
