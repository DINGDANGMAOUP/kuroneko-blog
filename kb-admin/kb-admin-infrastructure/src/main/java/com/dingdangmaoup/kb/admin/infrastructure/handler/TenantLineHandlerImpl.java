package com.dingdangmaoup.kb.admin.infrastructure.handler;

import com.baomidou.mybatisplus.extension.plugins.handler.TenantLineHandler;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.LongValue;

/**
 * @author dzhao1
 */
public class TenantLineHandlerImpl implements TenantLineHandler {

	@Override
	public Expression getTenantId() {
		return new LongValue(1);
	}

	@Override
	public String getTenantIdColumn() {
		return TenantLineHandler.super.getTenantIdColumn();
	}

	@Override
	public boolean ignoreTable(String tableName) {
		return !"user".equalsIgnoreCase(tableName);
	}

}
