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
 *
 * @TableName kb_user
 */
@TableName(value = "kb_user")
@Data
public class KbUser implements Serializable {

	/**
	 * 用户id
	 */
	@TableId(value = "user_id", type = IdType.ASSIGN_ID)
	private Integer userId;

	/**
	 * 租户号
	 */
	@TableField(value = "tenant_id")
	private Integer tenantId;

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
	private String createdBy;

	/**
	 * 创建时间
	 */
	@TableField(value = "created_time")
	private LocalDateTime createdTime;

	/**
	 * 更新人
	 */
	@TableField(value = "updated_by")
	private String updatedBy;

	/**
	 * 更新时间
	 */
	@TableField(value = "updated_time")
	private LocalDateTime updatedTime;

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
		return (this.getUserId() == null ? other.getUserId() == null
				: this.getUserId().equals(other.getUserId()))
				&& (this.getTenantId() == null ? other.getTenantId() == null
						: this.getTenantId().equals(other.getTenantId()))
				&& (this.getRevision() == null ? other.getRevision() == null
						: this.getRevision().equals(other.getRevision()))
				&& (this.getCreatedBy() == null ? other.getCreatedBy() == null
						: this.getCreatedBy().equals(other.getCreatedBy()))
				&& (this.getCreatedTime() == null ? other.getCreatedTime() == null
						: this.getCreatedTime().equals(other.getCreatedTime()))
				&& (this.getUpdatedBy() == null ? other.getUpdatedBy() == null
						: this.getUpdatedBy().equals(other.getUpdatedBy()))
				&& (this.getUpdatedTime() == null ? other.getUpdatedTime() == null
						: this.getUpdatedTime().equals(other.getUpdatedTime()))
				&& (this.getDeleted() == null ? other.getDeleted() == null
						: this.getDeleted().equals(other.getDeleted()))
				&& (this.getUsername() == null ? other.getUsername() == null
						: this.getUsername().equals(other.getUsername()))
				&& (this.getNickname() == null ? other.getNickname() == null
						: this.getNickname().equals(other.getNickname()))
				&& (this.getSalt() == null ? other.getSalt() == null
						: this.getSalt().equals(other.getSalt()))
				&& (this.getPasswd() == null ? other.getPasswd() == null
						: this.getPasswd().equals(other.getPasswd()))
				&& (this.getSex() == null ? other.getSex() == null
						: this.getSex().equals(other.getSex()))
				&& (this.getEmail() == null ? other.getEmail() == null
						: this.getEmail().equals(other.getEmail()))
				&& (this.getRemark() == null ? other.getRemark() == null
						: this.getRemark().equals(other.getRemark()))
				&& (this.getPhone() == null ? other.getPhone() == null
						: this.getPhone().equals(other.getPhone()));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
		result = prime * result
				+ ((getTenantId() == null) ? 0 : getTenantId().hashCode());
		result = prime * result
				+ ((getRevision() == null) ? 0 : getRevision().hashCode());
		result = prime * result
				+ ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
		result = prime * result
				+ ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
		result = prime * result
				+ ((getUpdatedBy() == null) ? 0 : getUpdatedBy().hashCode());
		result = prime * result
				+ ((getUpdatedTime() == null) ? 0 : getUpdatedTime().hashCode());
		result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
		result = prime * result
				+ ((getUsername() == null) ? 0 : getUsername().hashCode());
		result = prime * result
				+ ((getNickname() == null) ? 0 : getNickname().hashCode());
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
		sb.append(", user_id=").append(userId);
		sb.append(", tenant_id=").append(tenantId);
		sb.append(", revision=").append(revision);
		sb.append(", created_by=").append(createdBy);
		sb.append(", created_time=").append(createdTime);
		sb.append(", updated_by=").append(updatedBy);
		sb.append(", updated_time=").append(updatedTime);
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