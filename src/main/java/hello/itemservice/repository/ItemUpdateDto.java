package hello.itemservice.repository;

import lombok.Data;

//dto를 별도의 패키지에 둬도 된다.
//여기서의 ItemSearchCond 와 ItemUpdateDto는 의존관계상 service에 두지 않는다.
//service에서 사용이 끝나고 더 이상 Repository에 넘겨주지 않는 dto라면 service에 둔다.
//controller에서 사용이 끝나는 거라면 controller에 둔다.
//여러곳에서 사용한다면 별도의 패키지를 만들면 된다.
@Data
public class ItemUpdateDto {
    private String itemName;
    private Integer price;
    private Integer quantity;

    public ItemUpdateDto() {
    }

    public ItemUpdateDto(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
