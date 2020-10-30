package top.lavau.vo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class BlogQuery {
    private String title;
    private Long typeId;
    private Boolean recommend;
}
