package com.accp.mapper;

import com.accp.domain.Purchaserequisitionsdetails;
import com.accp.domain.PurchaserequisitionsdetailsExample;
import com.accp.domain.PurchaserequisitionsdetailsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaserequisitionsdetailsMapper {
    int countByExample(PurchaserequisitionsdetailsExample example);

    int deleteByExample(PurchaserequisitionsdetailsExample example);

    int deleteByPrimaryKey(Integer serno);

    int insert(PurchaserequisitionsdetailsWithBLOBs record);

    int insertSelective(PurchaserequisitionsdetailsWithBLOBs record);

    List<PurchaserequisitionsdetailsWithBLOBs> selectByExampleWithBLOBs(PurchaserequisitionsdetailsExample example);

    List<Purchaserequisitionsdetails> selectByExample(PurchaserequisitionsdetailsExample example);

    PurchaserequisitionsdetailsWithBLOBs selectByPrimaryKey(Integer serno);

    int updateByExampleSelective(@Param("record") PurchaserequisitionsdetailsWithBLOBs record, @Param("example") PurchaserequisitionsdetailsExample example);

    int updateByExampleWithBLOBs(@Param("record") PurchaserequisitionsdetailsWithBLOBs record, @Param("example") PurchaserequisitionsdetailsExample example);

    int updateByExample(@Param("record") Purchaserequisitionsdetails record, @Param("example") PurchaserequisitionsdetailsExample example);

    int updateByPrimaryKeySelective(PurchaserequisitionsdetailsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PurchaserequisitionsdetailsWithBLOBs record);

    int updateByPrimaryKey(Purchaserequisitionsdetails record);
}