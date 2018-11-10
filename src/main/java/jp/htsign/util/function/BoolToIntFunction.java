package jp.htsign.util.function;

@FunctionalInterface
public interface BoolToIntFunction {
  public int applyAsInt(boolean value);
}
