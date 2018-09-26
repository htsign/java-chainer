package jp.htsign.util.function;

@FunctionalInterface
public interface FloatToIntFunction {
  public int applyAsInt(float value);
}
