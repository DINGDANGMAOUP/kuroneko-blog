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
 * 租户表
 *
 * @TableName kb_tenant
 */
@TableName(value = "kb_tenant")
@Data
public class KbTenant implements Serializable {

	/**
	 * 租户号
	 */
	@TableId(value = "tenant_id", type = IdType.ASSIGN_ID)
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
	 * 租户名
	 */
	@TableField(value = "tenant_name")
	private String tenantName;

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
		KbTenant other = (KbTenant) that;
		return (this.getTenantId() == null ? other.getTenantId() == null
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
				&& (this.getTenantName() == null ? other.getTenantName() == null
						: this.getTenantName().equals(other.getTenantName()));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
				+ ((getTenantName() == null) ? 0 : getTenantName().hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", tenant_id=").append(tenantId);
		sb.append(", revision=").append(revision);
		sb.append(", created_by=").append(createdBy);
		sb.append(", created_time=").append(createdTime);
		sb.append(", updated_by=").append(updatedBy);
		sb.append(", updated_time=").append(updatedTime);
		sb.append(", deleted=").append(deleted);
		sb.append(", tenant_name=").append(tenantName);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}

}