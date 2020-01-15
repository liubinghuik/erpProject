package com.accp.mapper;

import com.accp.domain.Tpurchasereceipt;
import com.accp.domain.TpurchasereceiptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TpurchasereceiptMapper {
    int countByExample(TpurchasereceiptExample example);

    int deleteByExample(TpurchasereceiptExample example);

    int insert(Tpurchasereceipt record);

    int insertSelective(Tpurchasereceipt record);

    List<Tpurchasereceipt> selectByExample(TpurchasereceiptExample example);

    int updateByExampleSelective(@Param("record") Tpurchasereceipt record, @Param("example") TpurchasereceiptExample example);

    int updateByExample(@Param("record") Tpurchasereceipt record, @Param("example") TpurchasereceiptExample example);
}