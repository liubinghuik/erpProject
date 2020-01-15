package com.accp.mapper;

import com.accp.domain.Tpaymentprepay;
import com.accp.domain.TpaymentprepayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TpaymentprepayMapper {
    int countByExample(TpaymentprepayExample example);

    int deleteByExample(TpaymentprepayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tpaymentprepay record);

    int insertSelective(Tpaymentprepay record);

    List<Tpaymentprepay> selectByExample(TpaymentprepayExample example);

    Tpaymentprepay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tpaymentprepay record, @Param("example") TpaymentprepayExample example);

    int updateByExample(@Param("record") Tpaymentprepay record, @Param("example") TpaymentprepayExample example);

    int updateByPrimaryKeySelective(Tpaymentprepay record);

    int updateByPrimaryKey(Tpaymentprepay record);
}