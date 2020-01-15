package com.accp.mapper;

import com.accp.domain.Purchaserequisitionstype;
import com.accp.domain.PurchaserequisitionstypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaserequisitionstypeMapper {
    int countByExample(PurchaserequisitionstypeExample example);

    int deleteByExample(PurchaserequisitionstypeExample example);

    int deleteByPrimaryKey(String classid);

    int insert(Purchaserequisitionstype record);

    int insertSelective(Purchaserequisitionstype record);

    List<Purchaserequisitionstype> selectByExample(PurchaserequisitionstypeExample example);

    Purchaserequisitionstype selectByPrimaryKey(String classid);

    int updateByExampleSelective(@Param("record") Purchaserequisitionstype record, @Param("example") PurchaserequisitionstypeExample example);

    int updateByExample(@Param("record") Purchaserequisitionstype record, @Param("example") PurchaserequisitionstypeExample example);

    int updateByPrimaryKeySelective(Purchaserequisitionstype record);

    int updateByPrimaryKey(Purchaserequisitionstype record);
}