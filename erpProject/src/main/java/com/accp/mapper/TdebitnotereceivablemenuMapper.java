package com.accp.mapper;

import com.accp.domain.Tdebitnotereceivablemenu;
import com.accp.domain.TdebitnotereceivablemenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TdebitnotereceivablemenuMapper {
    int countByExample(TdebitnotereceivablemenuExample example);

    int deleteByExample(TdebitnotereceivablemenuExample example);

    int deleteByPrimaryKey(Integer lineno);

    int insert(Tdebitnotereceivablemenu record);

    int insertSelective(Tdebitnotereceivablemenu record);

    List<Tdebitnotereceivablemenu> selectByExample(TdebitnotereceivablemenuExample example);

    Tdebitnotereceivablemenu selectByPrimaryKey(Integer lineno);

    int updateByExampleSelective(@Param("record") Tdebitnotereceivablemenu record, @Param("example") TdebitnotereceivablemenuExample example);

    int updateByExample(@Param("record") Tdebitnotereceivablemenu record, @Param("example") TdebitnotereceivablemenuExample example);

    int updateByPrimaryKeySelective(Tdebitnotereceivablemenu record);

    int updateByPrimaryKey(Tdebitnotereceivablemenu record);
}