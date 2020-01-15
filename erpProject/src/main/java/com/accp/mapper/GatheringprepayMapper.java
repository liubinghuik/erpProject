package com.accp.mapper;

import com.accp.domain.Gatheringprepay;
import com.accp.domain.GatheringprepayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GatheringprepayMapper {
    int countByExample(GatheringprepayExample example);

    int deleteByExample(GatheringprepayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Gatheringprepay record);

    int insertSelective(Gatheringprepay record);

    List<Gatheringprepay> selectByExample(GatheringprepayExample example);

    Gatheringprepay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Gatheringprepay record, @Param("example") GatheringprepayExample example);

    int updateByExample(@Param("record") Gatheringprepay record, @Param("example") GatheringprepayExample example);

    int updateByPrimaryKeySelective(Gatheringprepay record);

    int updateByPrimaryKey(Gatheringprepay record);
}