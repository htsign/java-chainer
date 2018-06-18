package htsign.util.function;

@FunctionalInterface
public interface BooleanToFloatFunction {
  public float applyAsFloat(boolean value);
}
