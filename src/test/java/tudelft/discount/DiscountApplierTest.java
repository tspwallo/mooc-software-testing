package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class DiscountApplierTest {

    @Test
    public void testDiscountBusiness() {
        double price = 10327.0;
        ProductDao dao = Mockito.mock(ProductDao.class);
        Product product = new Product("iPhone", price, "BUSINESS");
        List<Product> results = Arrays.asList(product);
        Mockito.when(dao.all()).thenReturn(results);
        DiscountApplier discountApplier = new DiscountApplier(dao);
        discountApplier.setNewPrices();
        double newPrice = product.getPrice();
        Assertions.assertEquals(price * 1.1, newPrice, 0.05);
    }

    @Test
    public void testDiscountHome() {
        double price = 27345.0;
        ProductDao dao = Mockito.mock(ProductDao.class);
        Product product = new Product("Sony TV", price, "HOME");
        List<Product> results = Arrays.asList(product);
        Mockito.when(dao.all()).thenReturn(results);
        DiscountApplier discountApplier = new DiscountApplier(dao);
        discountApplier.setNewPrices();
        double newPrice = product.getPrice();
        Assertions.assertEquals(price * 0.9, newPrice, 0.05);
    }
}
