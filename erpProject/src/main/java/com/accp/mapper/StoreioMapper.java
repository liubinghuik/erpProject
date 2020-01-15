package com.accp.mapper;

import com.accp.domain.Storeio;
import com.accp.domain.StoreioExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreioMapper {
    int countByExample(StoreioExample example);

    int deleteByExample(StoreioExample example);

    int deleteByPrimaryKey(Integer lineno);

    int insert(Storeio record);

    int insertSelective(Storeio record);

    List<Storeio> selectByExample(StoreioExample example);

    Storeio selectByPrimaryKey(Integer lineno);

    int updateByExampleSelective(@Param("record") Storeio record, @Param("example") StoreioExample example);

    int updateByExample(@Param("record") Storeio record, @Param("example") StoreioExample example);

    int updateByPrimaryKeySelective(Storeio record);

    int updateByPrimaryKey(Storeio record);
}