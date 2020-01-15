package com.accp.mapper;

import com.accp.domain.Purchaserequisitions;
import com.accp.domain.PurchaserequisitionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaserequisitionsMapper {
    int countByExample(PurchaserequisitionsExample example);

    int deleteByExample(PurchaserequisitionsExample example);

    int deleteByPrimaryKey(String billno);

    int insert(Purchaserequisitions record);

    int insertSelective(Purchaserequisitions record);

    List<Purchaserequisitions> selectByExample(PurchaserequisitionsExample example);

    Purchaserequisitions selectByPrimaryKey(String billno);

    int updateByExampleSelective(@Param("record") Purchaserequisitions record, @Param("example") PurchaserequisitionsExample example);

    int updateByExample(@Param("record") Purchaserequisitions record, @Param("example") PurchaserequisitionsExample example);

    int updateByPrimaryKeySelective(Purchaserequisitions record);

    int updateByPrimaryKey(Purchaserequisitions record);
}