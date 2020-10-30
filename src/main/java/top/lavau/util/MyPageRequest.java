package top.lavau.util;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

public class MyPageRequest extends PageRequest {
    public MyPageRequest(int page, int size, Sort sort) {
        super(page, size, sort);
    }
}
