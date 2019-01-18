package com.itheima.domain;
import java.util.List;
/**
 * @Description: java类作用描述
 * @Author: wangch
 * @CreateDate: 2019/1/1 15:10
 * @Version: 1.0
 */
public class Role {
    private Integer id;
    private String roleName;
    private String roleDesc;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }


    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", roleDesc='" + roleDesc + '\'' +
                '}';
    }
}
