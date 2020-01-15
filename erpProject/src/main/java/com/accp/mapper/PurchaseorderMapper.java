package com.accp.mapper;

import com.accp.domain.Purchaseorder;
import com.accp.domain.PurchaseorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseorderMapper {
    int countByExample(PurchaseorderExample example);

    int deleteByExample(PurchaseorderExample example);

    int deleteByPrimaryKey(String billno);

    int insert(Purchaseorder record);

    int insertSelective(Purchaseorder record);

    List<Purchaseorder> selectByExample(PurchaseorderExample example);

    Purchaseorder selectByPrimaryKey(String billno);

    int updateByExampleSelective(@Param("record") Purchaseorder record, @Param("example") PurchaseorderExample example);

    int updateByExample(@Param("record") Purchaseorder record, @Param("example") PurchaseorderExample example);

    int updateByPrimaryKeySelective(Purchaseorder record);

    int updateByPrimaryKey(Purchaseorder record);
}