package htsign.util.function;

@FunctionalInterface
public interface FloatToBooleanFunction {
  public boolean applyAsBoolean(float value);
}
