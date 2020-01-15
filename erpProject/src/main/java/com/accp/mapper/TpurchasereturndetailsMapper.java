package com.accp.mapper;

import com.accp.domain.Tpurchasereturndetails;
import com.accp.domain.TpurchasereturndetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TpurchasereturndetailsMapper {
    int countByExample(TpurchasereturndetailsExample example);

    int deleteByExample(TpurchasereturndetailsExample example);

    int insert(Tpurchasereturndetails record);

    int insertSelective(Tpurchasereturndetails record);

    List<Tpurchasereturndetails> selectByExample(TpurchasereturndetailsExample example);

    int updateByExampleSelective(@Param("record") Tpurchasereturndetails record, @Param("example") TpurchasereturndetailsExample example);

    int updateByExample(@Param("record") Tpurchasereturndetails record, @Param("example") TpurchasereturndetailsExample example);
}