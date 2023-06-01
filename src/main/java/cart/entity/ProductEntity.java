package cart.entity;

import cart.domain.Product;
import java.util.Objects;

public class ProductEntity {

    private final Long id;
    private final String name;
    private final int price;
    private final String imageUrl;

    public ProductEntity(final String name, final int price, final String imageUrl) {
        this(null, name, price, imageUrl);
    }

    public ProductEntity(final Long id, final String name, final int price, final String imageUrl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public static Product toDomain(final ProductEntity productEntity) {
        return new Product(productEntity.id, productEntity.name, productEntity.price, productEntity.imageUrl);
    }

    public static ProductEntity from(final Product product) {
        return new ProductEntity(product.getId(), product.getName(), product.getPrice(), product.getImageUrl());
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final ProductEntity that = (ProductEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}