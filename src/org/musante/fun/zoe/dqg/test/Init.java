package org.musante.fun.zoe.dqg.test;

import static org.junit.Assert.*;

import org.junit.Test;

import org.musante.fun.zoe.dqg.main.Main;

public class Init {

	@Test
	public void test() {
		Main m = new Main();
		assertNotNull(m);
	}

}
