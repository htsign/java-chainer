package htsign.util.function;

@FunctionalInterface
public interface CharFunction<T> {
  public T apply(char value);
}
