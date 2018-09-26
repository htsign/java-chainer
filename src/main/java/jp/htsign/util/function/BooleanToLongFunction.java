package jp.htsign.util.function;

@FunctionalInterface
public interface BooleanToLongFunction {
  public long applyAsLong(boolean value);
}
