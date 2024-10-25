package generator.mapper;

import generator.com.xianyu.pojo.TOrder;

/**
* @author Administrator
* @description 针对表【t_order】的数据库操作Mapper
* @createDate 2024-10-25 14:37:42
* @Entity generator.com.xianyu.pojo.TOrder
*/
public interface TOrderMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TOrder record);

    int insertSelective(TOrder record);

    TOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TOrder record);

    int updateByPrimaryKey(TOrder record);

}
