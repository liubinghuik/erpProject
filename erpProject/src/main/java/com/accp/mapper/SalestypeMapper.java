package com.accp.mapper;

import com.accp.domain.Salestype;
import com.accp.domain.SalestypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalestypeMapper {
    int countByExample(SalestypeExample example);

    int deleteByExample(SalestypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Salestype record);

    int insertSelective(Salestype record);

    List<Salestype> selectByExample(SalestypeExample example);

    Salestype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Salestype record, @Param("example") SalestypeExample example);

    int updateByExample(@Param("record") Salestype record, @Param("example") SalestypeExample example);

    int updateByPrimaryKeySelective(Salestype record);

    int updateByPrimaryKey(Salestype record);
}