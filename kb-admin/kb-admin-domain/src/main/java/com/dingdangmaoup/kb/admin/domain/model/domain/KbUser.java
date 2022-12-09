package com.dingdangmaoup.kb.admin.domain.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 用户表
 * @TableName kb_user
 */
@TableName(value ="kb_user")
@Data
public class KbUser implements Serializable {
    /**
     * 用户id
     */
    @TableId(value = "user_id",type = IdType.ASSIGN_ID)
    private Integer user_id;

    /**
     * 租户号
     */
    @TableField(value = "tenant_id")
    private Integer tenant_id;

    /**
     * 乐观锁
     */
    @Version
    @TableField(value = "revision")
    private String revision;

    /**
     * 创建人
     */
    @TableField(value = "created_by")
    private String created_by;

    /**
     * 创建时间
     */
    @TableField(value = "created_time")
    private LocalDateTime created_time;

    /**
     * 更新人
     */
    @TableField(value = "updated_by")
    private String updated_by;

    /**
     * 更新时间
     */
    @TableField(value = "updated_time")
    private LocalDateTime updated_time;

    /**
     * 逻辑删除
     */
    @TableField(value = "deleted")
    private String deleted;

    /**
     * 用户名
     */
    @TableField(value = "username")
    private String username;

    /**
     * 昵称
     */
    @TableField(value = "nickname")
    private String nickname;

    /**
     * 盐
     */
    @TableField(value = "salt")
    private String salt;

    /**
     * 密码
     */
    @TableField(value = "passwd")
    private String passwd;

    /**
     * 性别
     */
    @TableField(value = "sex")
    private String sex;

    /**
     * 邮箱
     */
    @TableField(value = "email")
    private String email;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 手机号
     */
    @TableField(value = "phone")
    private String phone;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        KbUser other = (KbUser) that;
        return (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getTenant_id() == null ? other.getTenant_id() == null : this.getTenant_id().equals(other.getTenant_id()))
            && (this.getRevision() == null ? other.getRevision() == null : this.getRevision().equals(other.getRevision()))
            && (this.getCreated_by() == null ? other.getCreated_by() == null : this.getCreated_by().equals(other.getCreated_by()))
            && (this.getCreated_time() == null ? other.getCreated_time() == null : this.getCreated_time().equals(other.getCreated_time()))
            && (this.getUpdated_by() == null ? other.getUpdated_by() == null : this.getUpdated_by().equals(other.getUpdated_by()))
            && (this.getUpdated_time() == null ? other.getUpdated_time() == null : this.getUpdated_time().equals(other.getUpdated_time()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
            && (this.getSalt() == null ? other.getSalt() == null : this.getSalt().equals(other.getSalt()))
            && (this.getPasswd() == null ? other.getPasswd() == null : this.getPasswd().equals(other.getPasswd()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getTenant_id() == null) ? 0 : getTenant_id().hashCode());
        result = prime * result + ((getRevision() == null) ? 0 : getRevision().hashCode());
        result = prime * result + ((getCreated_by() == null) ? 0 : getCreated_by().hashCode());
        result = prime * result + ((getCreated_time() == null) ? 0 : getCreated_time().hashCode());
        result = prime * result + ((getUpdated_by() == null) ? 0 : getUpdated_by().hashCode());
        result = prime * result + ((getUpdated_time() == null) ? 0 : getUpdated_time().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getSalt() == null) ? 0 : getSalt().hashCode());
        result = prime * result + ((getPasswd() == null) ? 0 : getPasswd().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", user_id=").append(user_id);
        sb.append(", tenant_id=").append(tenant_id);
        sb.append(", revision=").append(revision);
        sb.append(", created_by=").append(created_by);
        sb.append(", created_time=").append(created_time);
        sb.append(", updated_by=").append(updated_by);
        sb.append(", updated_time=").append(updated_time);
        sb.append(", deleted=").append(deleted);
        sb.append(", username=").append(username);
        sb.append(", nickname=").append(nickname);
        sb.append(", salt=").append(salt);
        sb.append(", passwd=").append(passwd);
        sb.append(", sex=").append(sex);
        sb.append(", email=").append(email);
        sb.append(", remark=").append(remark);
        sb.append(", phone=").append(phone);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}