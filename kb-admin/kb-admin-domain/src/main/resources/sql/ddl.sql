DROP TABLE IF EXISTS kb_user;
CREATE TABLE kb_user(
    TENANT_ID INTEGER,
    REVISION VARCHAR(32),
    CREATED_BY VARCHAR(32),
    CREATED_TIME TIMESTAMP,
    UPDATED_BY VARCHAR(32),
    UPDATED_TIME TIMESTAMP,
    deleted VARCHAR(1),
    user_id INTEGER NOT NULL,
    username VARCHAR(255),
    nickname VARCHAR(255),
    salt VARCHAR(255),
    passwd VARCHAR(255),
    sex VARCHAR(32),
    email VARCHAR(255),
    remark VARCHAR(255),
    phone VARCHAR(255),
    PRIMARY KEY (user_id)
);

COMMENT ON TABLE kb_user IS '用户表';
COMMENT ON COLUMN kb_user.TENANT_ID IS '租户号';
COMMENT ON COLUMN kb_user.REVISION IS '乐观锁';
COMMENT ON COLUMN kb_user.CREATED_BY IS '创建人';
COMMENT ON COLUMN kb_user.CREATED_TIME IS '创建时间';
COMMENT ON COLUMN kb_user.UPDATED_BY IS '更新人';
COMMENT ON COLUMN kb_user.UPDATED_TIME IS '更新时间';
COMMENT ON COLUMN kb_user.deleted IS '逻辑删除';
COMMENT ON COLUMN kb_user.user_id IS '用户id';
COMMENT ON COLUMN kb_user.username IS '用户名';
COMMENT ON COLUMN kb_user.nickname IS '昵称';
COMMENT ON COLUMN kb_user.salt IS '盐';
COMMENT ON COLUMN kb_user.passwd IS '密码';
COMMENT ON COLUMN kb_user.sex IS '性别';
COMMENT ON COLUMN kb_user.email IS '邮箱';
COMMENT ON COLUMN kb_user.remark IS '备注';
COMMENT ON COLUMN kb_user.phone IS '手机号';

DROP TABLE IF EXISTS kb_tenant;
CREATE TABLE kb_tenant(
    TENANT_ID INTEGER,
    REVISION VARCHAR(32),
    CREATED_BY VARCHAR(32),
    CREATED_TIME TIMESTAMP,
    UPDATED_BY VARCHAR(32),
    UPDATED_TIME TIMESTAMP,
    deleted VARCHAR(1),
    tenant_name VARCHAR(255)
);

COMMENT ON TABLE kb_tenant IS '租户表';
COMMENT ON COLUMN kb_tenant.TENANT_ID IS '租户号';
COMMENT ON COLUMN kb_tenant.REVISION IS '乐观锁';
COMMENT ON COLUMN kb_tenant.CREATED_BY IS '创建人';
COMMENT ON COLUMN kb_tenant.CREATED_TIME IS '创建时间';
COMMENT ON COLUMN kb_tenant.UPDATED_BY IS '更新人';
COMMENT ON COLUMN kb_tenant.UPDATED_TIME IS '更新时间';
COMMENT ON COLUMN kb_tenant.deleted IS '逻辑删除';
COMMENT ON COLUMN kb_tenant.tenant_name IS '租户名';

CREATE VIEW kb AS
SELECT
FROM kb_user;

