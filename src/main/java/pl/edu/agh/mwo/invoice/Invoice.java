package pl.edu.agh.mwo.invoice;

import java.math.BigDecimal;
import java.util.Collection;

import pl.edu.agh.mwo.invoice.product.Product;

public class Invoice {
	private Collection<Product> products;

	public void addProduct(Product product) {
		// TODO: implement
	}

	public void addProduct(Product product, Integer quantity) {
		// TODO: implement
	}

	public BigDecimal getNetPrice() {
		BigDecimal netPrice = BigDecimal.ZERO;
		return netPrice;
	}

	public BigDecimal getTax() {
		BigDecimal netPrice = BigDecimal.ZERO;
		return netPrice;
	}

	public BigDecimal getGrossPrice() {
		BigDecimal netPrice = BigDecimal.ZERO;
		return netPrice;
	}
}
