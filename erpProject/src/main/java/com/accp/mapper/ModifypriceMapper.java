package com.accp.mapper;

import com.accp.domain.Modifyprice;
import com.accp.domain.ModifypriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModifypriceMapper {
    int countByExample(ModifypriceExample example);

    int deleteByExample(ModifypriceExample example);

    int deleteByPrimaryKey(String mpid);

    int insert(Modifyprice record);

    int insertSelective(Modifyprice record);

    List<Modifyprice> selectByExample(ModifypriceExample example);

    Modifyprice selectByPrimaryKey(String mpid);

    int updateByExampleSelective(@Param("record") Modifyprice record, @Param("example") ModifypriceExample example);

    int updateByExample(@Param("record") Modifyprice record, @Param("example") ModifypriceExample example);

    int updateByPrimaryKeySelective(Modifyprice record);

    int updateByPrimaryKey(Modifyprice record);
}