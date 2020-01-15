package com.accp.mapper;

import com.accp.domain.Materialmaster;
import com.accp.domain.MaterialmasterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialmasterMapper {
    int countByExample(MaterialmasterExample example);

    int deleteByExample(MaterialmasterExample example);

    int deleteByPrimaryKey(String prodid);

    int insert(Materialmaster record);

    int insertSelective(Materialmaster record);

    List<Materialmaster> selectByExample(MaterialmasterExample example);

    Materialmaster selectByPrimaryKey(String prodid);

    int updateByExampleSelective(@Param("record") Materialmaster record, @Param("example") MaterialmasterExample example);

    int updateByExample(@Param("record") Materialmaster record, @Param("example") MaterialmasterExample example);

    int updateByPrimaryKeySelective(Materialmaster record);

    int updateByPrimaryKey(Materialmaster record);
}