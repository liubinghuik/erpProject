package com.accp.mapper;

import com.accp.domain.Tprepay;
import com.accp.domain.TprepayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TprepayMapper {
    int countByExample(TprepayExample example);

    int deleteByExample(TprepayExample example);

    int deleteByPrimaryKey(String id);

    int insert(Tprepay record);

    int insertSelective(Tprepay record);

    List<Tprepay> selectByExample(TprepayExample example);

    Tprepay selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Tprepay record, @Param("example") TprepayExample example);

    int updateByExample(@Param("record") Tprepay record, @Param("example") TprepayExample example);

    int updateByPrimaryKeySelective(Tprepay record);

    int updateByPrimaryKey(Tprepay record);
}