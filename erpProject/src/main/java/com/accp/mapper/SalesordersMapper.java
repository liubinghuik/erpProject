package com.accp.mapper;

import com.accp.domain.Salesorders;
import com.accp.domain.SalesordersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesordersMapper {
    int countByExample(SalesordersExample example);

    int deleteByExample(SalesordersExample example);

    int insert(Salesorders record);

    int insertSelective(Salesorders record);

    List<Salesorders> selectByExample(SalesordersExample example);

    int updateByExampleSelective(@Param("record") Salesorders record, @Param("example") SalesordersExample example);

    int updateByExample(@Param("record") Salesorders record, @Param("example") SalesordersExample example);
}