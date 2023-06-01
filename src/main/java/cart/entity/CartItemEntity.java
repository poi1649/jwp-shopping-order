package cart.entity;

import cart.domain.CartItem;
import cart.domain.Member;
import cart.domain.Product;

public class CartItemEntity {

    private final Long id;
    private final Long memberId;
    private final String memberEmail;
    private final String memberPassword;
    private final int memberPoint;
    private final Long productId;
    private final String productName;
    private final int productPrice;
    private final String productImageUrl;
    private final int quantity;

    public CartItemEntity(final Long memberId, final Long productId) {
        this(null, memberId, null, null, 0, productId, null, 0, null, 1);
    }

    public CartItemEntity(
            final Long id,
            final Long memberId,
            final String memberEmail, final String memberPassword, final int memberPoint, final Long productId,
            final String productName,
            final int productPrice,
            final String productImageUrl,
            final int quantity
    ) {
        this.id = id;
        this.memberId = memberId;
        this.memberEmail = memberEmail;
        this.memberPassword = memberPassword;
        this.memberPoint = memberPoint;
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productImageUrl = productImageUrl;
        this.quantity = quantity;
    }

    public static CartItem toDomain(final CartItemEntity cartItemEntity) {
        return new CartItem(
                cartItemEntity.id,
                cartItemEntity.quantity,
                new Product(
                        cartItemEntity.productId,
                        cartItemEntity.productName,
                        cartItemEntity.productPrice,
                        cartItemEntity.productImageUrl)
                ,
                new Member(
                        cartItemEntity.memberId,
                        cartItemEntity.memberEmail,
                        cartItemEntity.memberPassword,
                        cartItemEntity.memberPoint
                )
        );
    }

    public static CartItemEntity from(final CartItem cartItem) {
        return new CartItemEntity(
                cartItem.getId(),
                cartItem.getMember().getId(),
                cartItem.getMember().getEmail(),
                cartItem.getMember().getPassword(),
                cartItem.getMember().getPoint(),
                cartItem.getProduct().getId(),
                cartItem.getProduct().getName(),
                cartItem.getProduct().getPrice(),
                cartItem.getProduct().getImageUrl(),
                cartItem.getQuantity()
        );
    }

    public Long getId() {
        return id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public int getMemberPoint() {
        return memberPoint;
    }

    public Long getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public String getProductImageUrl() {
        return productImageUrl;
    }

    public int getQuantity() {
        return quantity;
    }
}