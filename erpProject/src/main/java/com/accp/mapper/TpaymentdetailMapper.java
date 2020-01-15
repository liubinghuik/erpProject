package com.accp.mapper;

import com.accp.domain.Tpaymentdetail;
import com.accp.domain.TpaymentdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TpaymentdetailMapper {
    int countByExample(TpaymentdetailExample example);

    int deleteByExample(TpaymentdetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tpaymentdetail record);

    int insertSelective(Tpaymentdetail record);

    List<Tpaymentdetail> selectByExample(TpaymentdetailExample example);

    Tpaymentdetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tpaymentdetail record, @Param("example") TpaymentdetailExample example);

    int updateByExample(@Param("record") Tpaymentdetail record, @Param("example") TpaymentdetailExample example);

    int updateByPrimaryKeySelective(Tpaymentdetail record);

    int updateByPrimaryKey(Tpaymentdetail record);
}