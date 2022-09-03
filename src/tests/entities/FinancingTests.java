package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;
import tests.factory.FinancingFactory;

public class FinancingTests {

	/*
	 * Constructor test
	 * 
	 */
	@Test
	void shouldCreateFinancingWhenAllDataPassedValid() {
		Financing fg = FinancingFactory.createFinancing(100000.0, 2000.0, 80);
		Assertions.assertEquals(100000.0, fg.getTotalAmount());
		Assertions.assertEquals(2000.0, fg.getIncome());
		Assertions.assertEquals(80, fg.getMonths());
	}
	
	@Test
	void shouldThrowsExceptionWhenDataPassedInvalid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			FinancingFactory.createFinancing(100000.0, 2000.0, 20);
		});
	}
	
	/*
	 * SetTotalAmount test
	 * 
	 */
	@Test
	void shouldUpdateTotalAmountWhenDataValid() {
		Financing fg = FinancingFactory.createFinancing(100000.0, 2000.0, 80);
		fg.setTotalAmount(50000.0);
		Assertions.assertEquals(50000.0, fg.getTotalAmount());
	}
	
	@Test
	void shouldThrowExceptionTotalAmountWhenDataInvalid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fg = FinancingFactory.createFinancing(100000.0, 2000.0, 80);
			fg.setTotalAmount(150000.0);
		});
	}
	
	/*
	 * SetIncome test
	 * 
	 */
	@Test
	void shouldUpdateIncomeWhenDataValid() {
		Financing fg = FinancingFactory.createFinancing(100000.0, 2000.0, 80);
		fg.setIncome(3000.0);
		Assertions.assertEquals(3000.0, fg.getIncome());
	}
	
	@Test
	void shouldThrowExceptionIncomeWhenDataInvalid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fg = FinancingFactory.createFinancing(100000.0, 2000.0, 80);
			fg.setIncome(1000.0);
		});
	}
	
	/*
	 * SetMonths test
	 * 
	 */
	@Test
	void shouldUpdateMonthsWhenDataValid() {
		Financing fg = FinancingFactory.createFinancing(100000.0, 2000.0, 80);
		fg.setMonths(81);
		Assertions.assertEquals(81, fg.getMonths());
	}
	
	@Test
	void shouldThrowExceptionMonthsWhenDataInvalid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fg = FinancingFactory.createFinancing(100000.0, 2000.0, 80);
			fg.setMonths(79);
		});
	}
	
	/*
	 * Entry test
	 * 
	 */
	@Test
	void shouldValidadeEntry() {
		Financing fg = FinancingFactory.createFinancing(100000.0, 2000.0, 80);
		Assertions.assertEquals(20000.0, fg.entry());
	}
	
	/*
	 * Quota test
	 * 
	 */
	@Test
	void shouldValidadeQuota() {
		Financing fg = FinancingFactory.createFinancing(100000.0, 2000.0, 80);
		Assertions.assertEquals(1000.0, fg.quota());
	}
}
