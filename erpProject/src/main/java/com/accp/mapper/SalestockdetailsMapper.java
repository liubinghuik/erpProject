package com.accp.mapper;

import com.accp.domain.Salestockdetails;
import com.accp.domain.SalestockdetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalestockdetailsMapper {
    int countByExample(SalestockdetailsExample example);

    int deleteByExample(SalestockdetailsExample example);

    int deleteByPrimaryKey(Integer lineno);

    int insert(Salestockdetails record);

    int insertSelective(Salestockdetails record);

    List<Salestockdetails> selectByExample(SalestockdetailsExample example);

    Salestockdetails selectByPrimaryKey(Integer lineno);

    int updateByExampleSelective(@Param("record") Salestockdetails record, @Param("example") SalestockdetailsExample example);

    int updateByExample(@Param("record") Salestockdetails record, @Param("example") SalestockdetailsExample example);

    int updateByPrimaryKeySelective(Salestockdetails record);

    int updateByPrimaryKey(Salestockdetails record);
}