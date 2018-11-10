package jp.htsign.util.function;

@FunctionalInterface
public interface BoolToShortFunction {
  public short applyAsShort(boolean value);
}
