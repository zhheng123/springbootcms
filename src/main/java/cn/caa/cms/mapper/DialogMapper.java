package cn.caa.cms.mapper;

import cn.caa.cms.domain.Dialog;

public interface DialogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dialog record);

    int insertSelective(Dialog record);

    Dialog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dialog record);

    int updateByPrimaryKey(Dialog record);
}