package htsign.util.function;

@FunctionalInterface
public interface LongToFloatFunction {
  public float applyAsFloat(long value);
}
