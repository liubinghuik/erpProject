package com.accp.mapper;

import com.accp.domain.Purchaseinquirydetails;
import com.accp.domain.PurchaseinquirydetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseinquirydetailsMapper {
    int countByExample(PurchaseinquirydetailsExample example);

    int deleteByExample(PurchaseinquirydetailsExample example);

    int deleteByPrimaryKey(Integer serno);

    int insert(Purchaseinquirydetails record);

    int insertSelective(Purchaseinquirydetails record);

    List<Purchaseinquirydetails> selectByExample(PurchaseinquirydetailsExample example);

    Purchaseinquirydetails selectByPrimaryKey(Integer serno);

    int updateByExampleSelective(@Param("record") Purchaseinquirydetails record, @Param("example") PurchaseinquirydetailsExample example);

    int updateByExample(@Param("record") Purchaseinquirydetails record, @Param("example") PurchaseinquirydetailsExample example);

    int updateByPrimaryKeySelective(Purchaseinquirydetails record);

    int updateByPrimaryKey(Purchaseinquirydetails record);
}