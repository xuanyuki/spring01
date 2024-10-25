package generator.mapper;

import generator.com.xianyu.pojo.TCustomer;

/**
* @author Administrator
* @description 针对表【t_customer】的数据库操作Mapper
* @createDate 2024-10-25 14:37:42
* @Entity generator.com.xianyu.pojo.TCustomer
*/
public interface TCustomerMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TCustomer record);

    int insertSelective(TCustomer record);

    TCustomer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TCustomer record);

    int updateByPrimaryKey(TCustomer record);

}
