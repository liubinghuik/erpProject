package com.accp.mapper;

import com.accp.domain.Salesrequisitionsdetails;
import com.accp.domain.SalesrequisitionsdetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesrequisitionsdetailsMapper {
    int countByExample(SalesrequisitionsdetailsExample example);

    int deleteByExample(SalesrequisitionsdetailsExample example);

    int insert(Salesrequisitionsdetails record);

    int insertSelective(Salesrequisitionsdetails record);

    List<Salesrequisitionsdetails> selectByExample(SalesrequisitionsdetailsExample example);

    int updateByExampleSelective(@Param("record") Salesrequisitionsdetails record, @Param("example") SalesrequisitionsdetailsExample example);

    int updateByExample(@Param("record") Salesrequisitionsdetails record, @Param("example") SalesrequisitionsdetailsExample example);
}