package jp.htsign.util.function;

@FunctionalInterface
public interface ByteToBooleanFunction {
  public boolean applyAsBoolean(byte value);
}
