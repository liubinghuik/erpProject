package com.accp.mapper;

import com.accp.domain.Storeaccount;
import com.accp.domain.StoreaccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreaccountMapper {
    int countByExample(StoreaccountExample example);

    int deleteByExample(StoreaccountExample example);

    int deleteByPrimaryKey(Integer lineno);

    int insert(Storeaccount record);

    int insertSelective(Storeaccount record);

    List<Storeaccount> selectByExample(StoreaccountExample example);

    Storeaccount selectByPrimaryKey(Integer lineno);

    int updateByExampleSelective(@Param("record") Storeaccount record, @Param("example") StoreaccountExample example);

    int updateByExample(@Param("record") Storeaccount record, @Param("example") StoreaccountExample example);

    int updateByPrimaryKeySelective(Storeaccount record);

    int updateByPrimaryKey(Storeaccount record);
}