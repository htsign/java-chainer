package jp.htsign.util.function;

@FunctionalInterface
public interface IntToBoolFunction {
  public boolean applyAsBool(int value);
}
