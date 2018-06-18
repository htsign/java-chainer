package htsign.util.function;

@FunctionalInterface
public interface ByteUnaryOperator {
  public byte applyAsByte(byte value);
}
