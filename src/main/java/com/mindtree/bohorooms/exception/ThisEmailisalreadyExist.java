package com.mindtree.bohorooms.exception;

import java.sql.SQLException;

public class ThisEmailisalreadyExist extends SQLException {

	public ThisEmailisalreadyExist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ThisEmailisalreadyExist(String reason, String sqlState, int vendorCode, Throwable cause) {
		super(reason, sqlState, vendorCode, cause);
		// TODO Auto-generated constructor stub
	}

	public ThisEmailisalreadyExist(String reason, String SQLState, int vendorCode) {
		super(reason, SQLState, vendorCode);
		// TODO Auto-generated constructor stub
	}

	public ThisEmailisalreadyExist(String reason, String sqlState, Throwable cause) {
		super(reason, sqlState, cause);
		// TODO Auto-generated constructor stub
	}

	public ThisEmailisalreadyExist(String reason, String SQLState) {
		super(reason, SQLState);
		// TODO Auto-generated constructor stub
	}

	public ThisEmailisalreadyExist(String reason, Throwable cause) {
		super(reason, cause);
		// TODO Auto-generated constructor stub
	}

	public ThisEmailisalreadyExist(String reason) {
		super(reason);
		// TODO Auto-generated constructor stub
	}

	public ThisEmailisalreadyExist(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
