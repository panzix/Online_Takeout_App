package com.itheima.reggie.dto;

import com.itheima.reggie.entity.OrderDetail;
import com.itheima.reggie.entity.Orders;
import lombok.Data;

import java.util.List;

/**
 * @ClassName OrdersDto
 * @Description TODO
 * @Author Panzi
 * @Date 2024/8/21 10:23
 * @Version 1.0
 */
@Data
public class OrdersDto extends Orders {

    private String userName;

    private String phone;

    private String address;

    private String consignee;

    private List<OrderDetail> orderDetails;

}
