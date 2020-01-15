package com.accp.mapper;

import com.accp.domain.Taccountpayable;
import com.accp.domain.TaccountpayableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaccountpayableMapper {
    int countByExample(TaccountpayableExample example);

    int deleteByExample(TaccountpayableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Taccountpayable record);

    int insertSelective(Taccountpayable record);

    List<Taccountpayable> selectByExample(TaccountpayableExample example);

    Taccountpayable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Taccountpayable record, @Param("example") TaccountpayableExample example);

    int updateByExample(@Param("record") Taccountpayable record, @Param("example") TaccountpayableExample example);

    int updateByPrimaryKeySelective(Taccountpayable record);

    int updateByPrimaryKey(Taccountpayable record);
}