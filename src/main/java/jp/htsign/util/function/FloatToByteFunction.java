package htsign.util.function;

@FunctionalInterface
public interface FloatToByteFunction {
  public byte applyAsByte(float value);
}
