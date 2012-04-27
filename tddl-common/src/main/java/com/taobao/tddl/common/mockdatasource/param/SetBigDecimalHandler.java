/*(C) 2007-2012 Alibaba Group Holding Limited.	

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SetBigDecimalHandler implements ParameterHandler {
	public void setParameter(PreparedStatement stmt, Object[] args)
			throws SQLException {
		stmt.setBigDecimal((Integer) args[0], (BigDecimal) args[1]);
	}
}