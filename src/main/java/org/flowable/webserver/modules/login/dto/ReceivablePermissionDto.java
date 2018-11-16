package org.flowable.webserver.modules.login.dto;

import io.swagger.annotations.ApiModelProperty;
import org.flowable.webserver.modules.login.entity.BaseEntity;

import java.util.List;

/**
 * @author: create by lisl
 * @version: v1.0
 * @description:
 * @date:2018/9/26
 */
public class ReceivablePermissionDto extends BaseEntity {
    @ApiModelProperty(value = "主键", example = "10001")
    private Long id;

    @ApiModelProperty(value = "角色编码", example = "role1")
    private String roleCode;

    @ApiModelProperty(value = "资源名称", example = "权限配置菜单")
    private String resourceName;

    @ApiModelProperty(value = "资源编码", example = "rv-manually-add")
    private String resourceCode;

    @ApiModelProperty(value = "公司名称", example = "华润医药")
    private String companyName;

    @ApiModelProperty(value = "公司编码", example = "ADE01")
    private String companyCode;

    @ApiModelProperty(value = "公司编码数组", example = "ADE01")
    private List<String> companyCodes;

    @ApiModelProperty(value = "用户姓名", example = "张三")
    private String userName;

    @ApiModelProperty(value = "用户编码", example = "6472123")
    private String userCode;

    @ApiModelProperty(value = "管理级别", example = "M:管理员 U：普通用户")
    private String level;

    @ApiModelProperty(value = "选择的菜单项", example = "菜单列表")
    private List<ReceivablePermissionMenuDto> resources;


    public List<String> getCompanyCodes() {
        return companyCodes;
    }

    public void setCompanyCodes(List<String> companyCodes) {
        this.companyCodes = companyCodes;
    }


    public List<ReceivablePermissionMenuDto> getResources() {
        return resources;
    }

    public void setResources(List<ReceivablePermissionMenuDto> resources) {
        this.resources = resources;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    public String getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode == null ? null : resourceCode.trim();
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

}
