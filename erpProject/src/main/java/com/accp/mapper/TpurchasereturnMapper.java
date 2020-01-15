package com.accp.mapper;

import com.accp.domain.Tpurchasereturn;
import com.accp.domain.TpurchasereturnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TpurchasereturnMapper {
    int countByExample(TpurchasereturnExample example);

    int deleteByExample(TpurchasereturnExample example);

    int insert(Tpurchasereturn record);

    int insertSelective(Tpurchasereturn record);

    List<Tpurchasereturn> selectByExample(TpurchasereturnExample example);

    int updateByExampleSelective(@Param("record") Tpurchasereturn record, @Param("example") TpurchasereturnExample example);

    int updateByExample(@Param("record") Tpurchasereturn record, @Param("example") TpurchasereturnExample example);
}