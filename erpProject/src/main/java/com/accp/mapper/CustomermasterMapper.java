package com.accp.mapper;

import com.accp.domain.Customermaster;
import com.accp.domain.CustomermasterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomermasterMapper {
    int countByExample(CustomermasterExample example);

    int deleteByExample(CustomermasterExample example);

    int deleteByPrimaryKey(Integer cmid);

    int insert(Customermaster record);

    int insertSelective(Customermaster record);

    List<Customermaster> selectByExample(CustomermasterExample example);

    Customermaster selectByPrimaryKey(Integer cmid);

    int updateByExampleSelective(@Param("record") Customermaster record, @Param("example") CustomermasterExample example);

    int updateByExample(@Param("record") Customermaster record, @Param("example") CustomermasterExample example);

    int updateByPrimaryKeySelective(Customermaster record);

    int updateByPrimaryKey(Customermaster record);
}