package com.accp.mapper;

import com.accp.domain.Blitem;
import com.accp.domain.BlitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlitemMapper {
    int countByExample(BlitemExample example);

    int deleteByExample(BlitemExample example);

    int deleteByPrimaryKey(String billno);

    int insert(Blitem record);

    int insertSelective(Blitem record);

    List<Blitem> selectByExample(BlitemExample example);

    Blitem selectByPrimaryKey(String billno);

    int updateByExampleSelective(@Param("record") Blitem record, @Param("example") BlitemExample example);

    int updateByExample(@Param("record") Blitem record, @Param("example") BlitemExample example);

    int updateByPrimaryKeySelective(Blitem record);

    int updateByPrimaryKey(Blitem record);
}