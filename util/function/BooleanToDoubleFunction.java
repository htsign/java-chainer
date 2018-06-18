package htsign.util.function;

@FunctionalInterface
public interface BooleanToDoubleFunction {
  public double applyAsDouble(boolean value);
}
