package com.accp.mapper;

import com.accp.domain.Gathering;
import com.accp.domain.GatheringExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GatheringMapper {
    int countByExample(GatheringExample example);

    int deleteByExample(GatheringExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Gathering record);

    int insertSelective(Gathering record);

    List<Gathering> selectByExample(GatheringExample example);

    Gathering selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Gathering record, @Param("example") GatheringExample example);

    int updateByExample(@Param("record") Gathering record, @Param("example") GatheringExample example);

    int updateByPrimaryKeySelective(Gathering record);

    int updateByPrimaryKey(Gathering record);
}