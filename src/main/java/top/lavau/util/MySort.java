package top.lavau.util;

import org.springframework.data.domain.Sort;

import java.util.List;

public class MySort extends Sort {
    public MySort(List<Order> orders) {
        super(orders);
    }
}
