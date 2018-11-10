package jp.htsign.util.function;

@FunctionalInterface
public interface ByteToBoolFunction {
  public boolean applyAsBool(byte value);
}
