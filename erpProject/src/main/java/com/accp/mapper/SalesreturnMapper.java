package com.accp.mapper;

import com.accp.domain.Salesreturn;
import com.accp.domain.SalesreturnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesreturnMapper {
    int countByExample(SalesreturnExample example);

    int deleteByExample(SalesreturnExample example);

    int deleteByPrimaryKey(String billno);

    int insert(Salesreturn record);

    int insertSelective(Salesreturn record);

    List<Salesreturn> selectByExample(SalesreturnExample example);

    Salesreturn selectByPrimaryKey(String billno);

    int updateByExampleSelective(@Param("record") Salesreturn record, @Param("example") SalesreturnExample example);

    int updateByExample(@Param("record") Salesreturn record, @Param("example") SalesreturnExample example);

    int updateByPrimaryKeySelective(Salesreturn record);

    int updateByPrimaryKey(Salesreturn record);
}