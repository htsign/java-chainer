package htsign.util.function;

@FunctionalInterface
public interface BooleanToByteFunction {
  public byte applyAsByte(boolean value);
}
