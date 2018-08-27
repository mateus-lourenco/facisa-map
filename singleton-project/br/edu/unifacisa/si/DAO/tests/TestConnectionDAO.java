package br.edu.unifacisa.si.DAO.tests;

import static org.junit.Assert.assertSame;

import org.junit.Test;

import br.edu.unifacisa.si.DAO.ConnectionDAO;

public class TestConnectionDAO {

	@Test
	public void testConnect() {

		ConnectionDAO conD1 = ConnectionDAO.getInstace();
		ConnectionDAO conD2 = ConnectionDAO.getInstace();

		assertSame(conD1, conD2);

	}

}
