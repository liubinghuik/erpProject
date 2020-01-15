package com.accp.mapper;

import com.accp.domain.Procurementshare;
import com.accp.domain.ProcurementshareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcurementshareMapper {
    int countByExample(ProcurementshareExample example);

    int deleteByExample(ProcurementshareExample example);

    int deleteByPrimaryKey(String psid);

    int insert(Procurementshare record);

    int insertSelective(Procurementshare record);

    List<Procurementshare> selectByExample(ProcurementshareExample example);

    Procurementshare selectByPrimaryKey(String psid);

    int updateByExampleSelective(@Param("record") Procurementshare record, @Param("example") ProcurementshareExample example);

    int updateByExample(@Param("record") Procurementshare record, @Param("example") ProcurementshareExample example);

    int updateByPrimaryKeySelective(Procurementshare record);

    int updateByPrimaryKey(Procurementshare record);
}