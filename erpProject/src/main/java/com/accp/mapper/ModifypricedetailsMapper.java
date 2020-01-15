package com.accp.mapper;

import com.accp.domain.Modifypricedetails;
import com.accp.domain.ModifypricedetailsExample;
import com.accp.domain.ModifypricedetailsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModifypricedetailsMapper {
    int countByExample(ModifypricedetailsExample example);

    int deleteByExample(ModifypricedetailsExample example);

    int deleteByPrimaryKey(ModifypricedetailsKey key);

    int insert(Modifypricedetails record);

    int insertSelective(Modifypricedetails record);

    List<Modifypricedetails> selectByExample(ModifypricedetailsExample example);

    Modifypricedetails selectByPrimaryKey(ModifypricedetailsKey key);

    int updateByExampleSelective(@Param("record") Modifypricedetails record, @Param("example") ModifypricedetailsExample example);

    int updateByExample(@Param("record") Modifypricedetails record, @Param("example") ModifypricedetailsExample example);

    int updateByPrimaryKeySelective(Modifypricedetails record);

    int updateByPrimaryKey(Modifypricedetails record);
}