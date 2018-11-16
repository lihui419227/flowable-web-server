package org.flowable.webserver.modules.login.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.flowable.webserver.modules.login.dto.ReceivablePermissionDto;
import org.flowable.webserver.modules.login.entity.TReceivablesPermissions;

import java.util.List;

@Mapper
public interface TReceivablesPermissionsDao {

    int deleteByPrimaryKey(Long id);

    int insert(TReceivablesPermissions record);

    int insertSelective(TReceivablesPermissions record);

    TReceivablesPermissions selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TReceivablesPermissions record);

    int updateByPrimaryKey(TReceivablesPermissions record);

    List<ReceivablePermissionDto> getPermissionPage(ReceivablePermissionDto params);

    boolean VerifyingRepeat(@Param("companyCode") String companyCode, @Param("userCode") String userCode);

    boolean VerifyingManager(@Param("userCode") String userCode);

    List<String> getAuthorizedCompanys(@Param("userCode") String userCode);
}
