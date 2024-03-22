package com.ict.ex01;

public class Service {
	// OracleDAO oracleDAO = new OracleDAO();
	// MariaDBDAO mariaDBDAO = new MariaDBDAO();
	
	// 인터페이스(클래스)를 자료형으로 사용
	private DAO dao ;
	
	public Service() {}
	public Service(DAO dao) {
		this.dao = dao ;
	}
	
	
	public DAO getDao() {
		return dao;
	}
	public void setDao(DAO dao) {
		this.dao = dao;
	}
	
	
	// 사용하고 싶은 메서드 
	public void biz() {
		// OracleDAO , MariaDBDAO => prn() 실행
		// oracleDAO.prn();
		
		// mariaDBDAO.prn();

		dao.prn();
	}
	
	
	
	
}













