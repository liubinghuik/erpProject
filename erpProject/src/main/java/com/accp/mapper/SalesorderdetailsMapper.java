package com.accp.mapper;

import com.accp.domain.Salesorderdetails;
import com.accp.domain.SalesorderdetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesorderdetailsMapper {
    int countByExample(SalesorderdetailsExample example);

    int deleteByExample(SalesorderdetailsExample example);

    int insert(Salesorderdetails record);

    int insertSelective(Salesorderdetails record);

    List<Salesorderdetails> selectByExample(SalesorderdetailsExample example);

    int updateByExampleSelective(@Param("record") Salesorderdetails record, @Param("example") SalesorderdetailsExample example);

    int updateByExample(@Param("record") Salesorderdetails record, @Param("example") SalesorderdetailsExample example);
}