package org.flowable.webserver.modules.login.dto;

/**
 * @author: create by lisl
 * @version: v1.0
 * @description:
 * @date:2018/9/27
 */
public class ReceivablePermissionMenuDto {
    private String actionUrl;//路由地址
    private String menuCode;//编码-弃用
    private String menuId;//菜单id
    private String menuName; //菜单名称

    public String getActionUrl() {
        return actionUrl;
    }

    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
}
