package com.accp.mapper;

import com.accp.domain.Purchaseorderdetails;
import com.accp.domain.PurchaseorderdetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseorderdetailsMapper {
    int countByExample(PurchaseorderdetailsExample example);

    int deleteByExample(PurchaseorderdetailsExample example);

    int deleteByPrimaryKey(Integer lineno);

    int insert(Purchaseorderdetails record);

    int insertSelective(Purchaseorderdetails record);

    List<Purchaseorderdetails> selectByExample(PurchaseorderdetailsExample example);

    Purchaseorderdetails selectByPrimaryKey(Integer lineno);

    int updateByExampleSelective(@Param("record") Purchaseorderdetails record, @Param("example") PurchaseorderdetailsExample example);

    int updateByExample(@Param("record") Purchaseorderdetails record, @Param("example") PurchaseorderdetailsExample example);

    int updateByPrimaryKeySelective(Purchaseorderdetails record);

    int updateByPrimaryKey(Purchaseorderdetails record);
}