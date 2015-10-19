package com.laudandjolynn.sql.object;

import com.laudandjolynn.sql.visitor.SQLVisitor;

/**
 * @author: Laud
 * @email: htd0324@gmail.com
 * @date: 2015年10月19日 上午10:41:01
 * @copyright: www.laudandjolynn.com
 */
public interface SQLObject {
	public void output(StringBuffer sb);

	public void accept(SQLVisitor visitor);

	public SQLObject getParent();

	public void setParent(SQLObject parent);
}
