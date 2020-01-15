package com.accp.mapper;

import com.accp.domain.Tadvancesmenu;
import com.accp.domain.TadvancesmenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TadvancesmenuMapper {
    int countByExample(TadvancesmenuExample example);

    int deleteByExample(TadvancesmenuExample example);

    int deleteByPrimaryKey(Integer lineno);

    int insert(Tadvancesmenu record);

    int insertSelective(Tadvancesmenu record);

    List<Tadvancesmenu> selectByExample(TadvancesmenuExample example);

    Tadvancesmenu selectByPrimaryKey(Integer lineno);

    int updateByExampleSelective(@Param("record") Tadvancesmenu record, @Param("example") TadvancesmenuExample example);

    int updateByExample(@Param("record") Tadvancesmenu record, @Param("example") TadvancesmenuExample example);

    int updateByPrimaryKeySelective(Tadvancesmenu record);

    int updateByPrimaryKey(Tadvancesmenu record);
}