package com.accp.mapper;

import com.accp.domain.Tpurchasereceiptdetails;
import com.accp.domain.TpurchasereceiptdetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TpurchasereceiptdetailsMapper {
    int countByExample(TpurchasereceiptdetailsExample example);

    int deleteByExample(TpurchasereceiptdetailsExample example);

    int insert(Tpurchasereceiptdetails record);

    int insertSelective(Tpurchasereceiptdetails record);

    List<Tpurchasereceiptdetails> selectByExample(TpurchasereceiptdetailsExample example);

    int updateByExampleSelective(@Param("record") Tpurchasereceiptdetails record, @Param("example") TpurchasereceiptdetailsExample example);

    int updateByExample(@Param("record") Tpurchasereceiptdetails record, @Param("example") TpurchasereceiptdetailsExample example);
}