package ch.heigvd.res.chill.domain.waltharnack;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Kriek implements IProduct {

  public final static String NAME = "Kriek";
  public final static BigDecimal PRICE = new BigDecimal(3.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
