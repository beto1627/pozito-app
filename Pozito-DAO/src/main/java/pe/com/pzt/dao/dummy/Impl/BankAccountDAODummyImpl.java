package pe.com.pzt.dao.dummy.Impl;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import pe.com.pzt.commons.dto.AccountDTO;
import pe.com.pzt.dao.dummy.BankAccountDAODummy;
import pe.com.pzt.domain.dummy.BankAccountDummy;

@Repository
public class BankAccountDAODummyImpl implements BankAccountDAODummy {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void createBankAccount(AccountDTO accountDTO) {
		try {
			BankAccountDummy account = new BankAccountDummy();
			account.setCuenta(accountDTO.getIdAccount());
			account.setCodClie(accountDTO.getIdCustomer());
			account.setCurrency(accountDTO.getCurrency());
			entityManager.persist(account);
		} catch (RuntimeException e) {
			throw e;
		}
	}

	@Override
	public AccountDTO getBankAccount(String accountId) {
		try {
			BankAccountDummy bankAccountDummy = entityManager.find(BankAccountDummy.class, accountId);
			AccountDTO accountDTO = new AccountDTO();
			accountDTO.setAmount(bankAccountDummy.getAmount());
			accountDTO.setCurrency(bankAccountDummy.getCurrency());
			accountDTO.setIdAccount(bankAccountDummy.getCuenta());
			accountDTO.setIdCustomer(bankAccountDummy.getCodClie());
			return accountDTO;
		} catch (NoResultException e) {
			return new AccountDTO();
		} catch (RuntimeException e) {
			throw e;
		}
		
	}

}
