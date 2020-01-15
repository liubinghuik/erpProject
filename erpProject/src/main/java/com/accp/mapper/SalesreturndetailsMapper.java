package com.accp.mapper;

import com.accp.domain.Salesreturndetails;
import com.accp.domain.SalesreturndetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesreturndetailsMapper {
    int countByExample(SalesreturndetailsExample example);

    int deleteByExample(SalesreturndetailsExample example);

    int deleteByPrimaryKey(Integer lineno);

    int insert(Salesreturndetails record);

    int insertSelective(Salesreturndetails record);

    List<Salesreturndetails> selectByExample(SalesreturndetailsExample example);

    Salesreturndetails selectByPrimaryKey(Integer lineno);

    int updateByExampleSelective(@Param("record") Salesreturndetails record, @Param("example") SalesreturndetailsExample example);

    int updateByExample(@Param("record") Salesreturndetails record, @Param("example") SalesreturndetailsExample example);

    int updateByPrimaryKeySelective(Salesreturndetails record);

    int updateByPrimaryKey(Salesreturndetails record);
}