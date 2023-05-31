package cart.dto;

import java.time.LocalDateTime;
import java.util.List;

public class OrderDetailResponse {

    private Long id;
    private int usedPoint;
    private int savedPoint;
    private LocalDateTime orderedAt;
    private List<OrderItemResponse> products;

    public OrderDetailResponse() {
    }

    public OrderDetailResponse(
            final Long id,
            final int usedPoint,
            final int savedPoint,
            final LocalDateTime orderedAt,
            final List<OrderItemResponse> products
    ) {
        this.id = id;
        this.usedPoint = usedPoint;
        this.savedPoint = savedPoint;
        this.orderedAt = orderedAt;
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public int getUsedPoint() {
        return usedPoint;
    }

    public int getSavedPoint() {
        return savedPoint;
    }

    public LocalDateTime getOrderedAt() {
        return orderedAt;
    }

    public List<OrderItemResponse> getProducts() {
        return products;
    }
}
