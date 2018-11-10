package jp.htsign.util.function;

@FunctionalInterface
public interface LongToBoolFunction {
  public boolean applyAsBool(long value);
}
