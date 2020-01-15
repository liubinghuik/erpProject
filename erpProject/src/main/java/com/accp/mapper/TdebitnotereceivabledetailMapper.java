package com.accp.mapper;

import com.accp.domain.Tdebitnotereceivabledetail;
import com.accp.domain.TdebitnotereceivabledetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TdebitnotereceivabledetailMapper {
    int countByExample(TdebitnotereceivabledetailExample example);

    int deleteByExample(TdebitnotereceivabledetailExample example);

    int deleteByPrimaryKey(Integer lineno);

    int insert(Tdebitnotereceivabledetail record);

    int insertSelective(Tdebitnotereceivabledetail record);

    List<Tdebitnotereceivabledetail> selectByExample(TdebitnotereceivabledetailExample example);

    Tdebitnotereceivabledetail selectByPrimaryKey(Integer lineno);

    int updateByExampleSelective(@Param("record") Tdebitnotereceivabledetail record, @Param("example") TdebitnotereceivabledetailExample example);

    int updateByExample(@Param("record") Tdebitnotereceivabledetail record, @Param("example") TdebitnotereceivabledetailExample example);

    int updateByPrimaryKeySelective(Tdebitnotereceivabledetail record);

    int updateByPrimaryKey(Tdebitnotereceivabledetail record);
}