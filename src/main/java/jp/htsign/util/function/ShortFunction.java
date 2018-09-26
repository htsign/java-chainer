package htsign.util.function;

@FunctionalInterface
public interface ShortFunction<T> {
  public T apply(float value);
}
