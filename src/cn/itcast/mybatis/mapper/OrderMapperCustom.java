package cn.itcast.mybatis.mapper;

import cn.itcast.mybatis.po.OrderCustom;
import cn.itcast.mybatis.po.Orders;

import java.util.List;

/**
 * @Title: mybatis1110
 * @Description:
 * @Company:www.keyonecn.com
 * @author:fzw
 * @date:2017/10/27 14:30
 * @version:1.0
 */
public interface OrderMapperCustom
{
    List<OrderCustom> findOrderUserList()throws Exception;
    List<Orders> findOrderUserListResultMap()throws Exception;
}
