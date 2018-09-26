package htsign.util.function;

@FunctionalInterface
public interface BooleanToShortFunction {
  public short applyAsShort(boolean value);
}
