package com.accp.mapper;

import com.accp.domain.Salestock;
import com.accp.domain.SalestockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalestockMapper {
    int countByExample(SalestockExample example);

    int deleteByExample(SalestockExample example);

    int deleteByPrimaryKey(Integer xschukuid);

    int insert(Salestock record);

    int insertSelective(Salestock record);

    List<Salestock> selectByExample(SalestockExample example);

    Salestock selectByPrimaryKey(Integer xschukuid);

    int updateByExampleSelective(@Param("record") Salestock record, @Param("example") SalestockExample example);

    int updateByExample(@Param("record") Salestock record, @Param("example") SalestockExample example);

    int updateByPrimaryKeySelective(Salestock record);

    int updateByPrimaryKey(Salestock record);
}