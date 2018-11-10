package jp.htsign.util.function;

@FunctionalInterface
public interface BoolToLongFunction {
  public long applyAsLong(boolean value);
}
