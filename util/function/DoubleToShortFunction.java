package htsign.util.function;

@FunctionalInterface
public interface DoubleToShortFunction {
  public short applyAsShort(double value);
}
