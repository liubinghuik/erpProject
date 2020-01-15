package com.accp.mapper;

import com.accp.domain.Purchaseinquiry;
import com.accp.domain.PurchaseinquiryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseinquiryMapper {
    int countByExample(PurchaseinquiryExample example);

    int deleteByExample(PurchaseinquiryExample example);

    int deleteByPrimaryKey(String billno);

    int insert(Purchaseinquiry record);

    int insertSelective(Purchaseinquiry record);

    List<Purchaseinquiry> selectByExample(PurchaseinquiryExample example);

    Purchaseinquiry selectByPrimaryKey(String billno);

    int updateByExampleSelective(@Param("record") Purchaseinquiry record, @Param("example") PurchaseinquiryExample example);

    int updateByExample(@Param("record") Purchaseinquiry record, @Param("example") PurchaseinquiryExample example);

    int updateByPrimaryKeySelective(Purchaseinquiry record);

    int updateByPrimaryKey(Purchaseinquiry record);
}