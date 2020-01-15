package com.accp.mapper;

import com.accp.domain.Salesrequisitions;
import com.accp.domain.SalesrequisitionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesrequisitionsMapper {
    int countByExample(SalesrequisitionsExample example);

    int deleteByExample(SalesrequisitionsExample example);

    int insert(Salesrequisitions record);

    int insertSelective(Salesrequisitions record);

    List<Salesrequisitions> selectByExampleWithBLOBs(SalesrequisitionsExample example);

    List<Salesrequisitions> selectByExample(SalesrequisitionsExample example);

    int updateByExampleSelective(@Param("record") Salesrequisitions record, @Param("example") SalesrequisitionsExample example);

    int updateByExampleWithBLOBs(@Param("record") Salesrequisitions record, @Param("example") SalesrequisitionsExample example);

    int updateByExample(@Param("record") Salesrequisitions record, @Param("example") SalesrequisitionsExample example);
}