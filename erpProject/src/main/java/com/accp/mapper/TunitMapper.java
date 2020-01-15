package com.accp.mapper;

import com.accp.domain.Tunit;
import com.accp.domain.TunitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TunitMapper {
    int countByExample(TunitExample example);

    int deleteByExample(TunitExample example);

    int deleteByPrimaryKey(Integer unitid);

    int insert(Tunit record);

    int insertSelective(Tunit record);

    List<Tunit> selectByExample(TunitExample example);

    Tunit selectByPrimaryKey(Integer unitid);

    int updateByExampleSelective(@Param("record") Tunit record, @Param("example") TunitExample example);

    int updateByExample(@Param("record") Tunit record, @Param("example") TunitExample example);

    int updateByPrimaryKeySelective(Tunit record);

    int updateByPrimaryKey(Tunit record);
}