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
 * @TableName kb_tenant
 */
@TableName(value ="kb_tenant")
@Data
public class KbTenant implements Serializable {
    /**
     * 租户号
     */
    @TableId(value = "tenant_id",type = IdType.ASSIGN_ID)
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
     * 租户名
     */
    @TableField(value = "tenant_name")
    private String tenant_name;

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
        return (this.getTenant_id() == null ? other.getTenant_id() == null : this.getTenant_id().equals(other.getTenant_id()))
            && (this.getRevision() == null ? other.getRevision() == null : this.getRevision().equals(other.getRevision()))
            && (this.getCreated_by() == null ? other.getCreated_by() == null : this.getCreated_by().equals(other.getCreated_by()))
            && (this.getCreated_time() == null ? other.getCreated_time() == null : this.getCreated_time().equals(other.getCreated_time()))
            && (this.getUpdated_by() == null ? other.getUpdated_by() == null : this.getUpdated_by().equals(other.getUpdated_by()))
            && (this.getUpdated_time() == null ? other.getUpdated_time() == null : this.getUpdated_time().equals(other.getUpdated_time()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
            && (this.getTenant_name() == null ? other.getTenant_name() == null : this.getTenant_name().equals(other.getTenant_name()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTenant_id() == null) ? 0 : getTenant_id().hashCode());
        result = prime * result + ((getRevision() == null) ? 0 : getRevision().hashCode());
        result = prime * result + ((getCreated_by() == null) ? 0 : getCreated_by().hashCode());
        result = prime * result + ((getCreated_time() == null) ? 0 : getCreated_time().hashCode());
        result = prime * result + ((getUpdated_by() == null) ? 0 : getUpdated_by().hashCode());
        result = prime * result + ((getUpdated_time() == null) ? 0 : getUpdated_time().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getTenant_name() == null) ? 0 : getTenant_name().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tenant_id=").append(tenant_id);
        sb.append(", revision=").append(revision);
        sb.append(", created_by=").append(created_by);
        sb.append(", created_time=").append(created_time);
        sb.append(", updated_by=").append(updated_by);
        sb.append(", updated_time=").append(updated_time);
        sb.append(", deleted=").append(deleted);
        sb.append(", tenant_name=").append(tenant_name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}