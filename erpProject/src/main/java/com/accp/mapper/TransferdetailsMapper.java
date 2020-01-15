package com.accp.mapper;

import com.accp.domain.Transferdetails;
import com.accp.domain.TransferdetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransferdetailsMapper {
    int countByExample(TransferdetailsExample example);

    int deleteByExample(TransferdetailsExample example);

    int deleteByPrimaryKey(String billno);

    int insert(Transferdetails record);

    int insertSelective(Transferdetails record);

    List<Transferdetails> selectByExample(TransferdetailsExample example);

    Transferdetails selectByPrimaryKey(String billno);

    int updateByExampleSelective(@Param("record") Transferdetails record, @Param("example") TransferdetailsExample example);

    int updateByExample(@Param("record") Transferdetails record, @Param("example") TransferdetailsExample example);

    int updateByPrimaryKeySelective(Transferdetails record);

    int updateByPrimaryKey(Transferdetails record);
}