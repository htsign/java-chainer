package jp.htsign.util.function;

@FunctionalInterface
public interface ShortToBoolFunction {
  public boolean applyAsBool(short value);
}
