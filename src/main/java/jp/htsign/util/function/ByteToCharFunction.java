package htsign.util.function;

@FunctionalInterface
public interface ByteToCharFunction {
  public char applyAsChar(byte value);
}
