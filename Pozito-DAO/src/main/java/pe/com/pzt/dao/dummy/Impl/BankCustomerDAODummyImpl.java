package pe.com.pzt.dao.dummy.Impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import pe.com.pzt.commons.dto.CustomerDTO;
import pe.com.pzt.dao.dummy.BankCustomerDAODummy;
import pe.com.pzt.domain.dummy.BankCustomerDummy;

@Repository
public class BankCustomerDAODummyImpl implements BankCustomerDAODummy {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void createCustomer(CustomerDTO customerDTO) {
		try {
			BankCustomerDummy customerD = new BankCustomerDummy();
			customerD.setAddress(customerDTO.getAddress());
			customerD.setCodClient(customerDTO.getIdCustomer());
			customerD.setName(customerDTO.getName());
			customerD.setLastNameP(customerDTO.getLastNameP());
			customerD.setLastNameM(customerDTO.getLastNameM());
			customerD.setTdoc(customerDTO.getTipDoc());
			customerD.setNdoi(customerDTO.getNroDoi());
			entityManager.persist(customerD);
		} catch (RuntimeException e) {
			throw e;
		}
	}

	@Override
	public CustomerDTO getCustomer(String tipDoc, String nroDoc) {
		try {
			Query query = entityManager.createQuery("SELECT e FROM BankCustomerDummy e where tdoc = :tipDoc and ndoi = :nroDoc");
			query.setParameter("tipDoc",tipDoc);
			query.setParameter("nroDoc",nroDoc);
			List<BankCustomerDummy> lst = (List<BankCustomerDummy>) query.getResultList();
			
			CustomerDTO customerDTO = new CustomerDTO();
			
			if(!lst.isEmpty()) {
				BankCustomerDummy bankCustomerDummy = lst.get(0);
				customerDTO.setAddress(bankCustomerDummy.getAddress());
				customerDTO.setIdCustomer(bankCustomerDummy.getCodClient());
				customerDTO.setName(bankCustomerDummy.getName());
				customerDTO.setLastNameP(bankCustomerDummy.getLastNameP());
				customerDTO.setLastNameM(bankCustomerDummy.getLastNameM());
				customerDTO.setTipDoc(bankCustomerDummy.getTdoc());
				customerDTO.setNroDoi(bankCustomerDummy.getNdoi());
			}
			return customerDTO;
			
		} catch (NoResultException e) {
			return new CustomerDTO();
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw e;
		}
		
	}
	
	@Override
	public boolean isCustomer(String tipDoc, String nroDoc) {
		try {
			Query query = entityManager.createQuery("SELECT e FROM BankCustomerDummy e where tdoc = :tipDoc and ndoi = :nroDoc and isClient = 'S'");
			query.setParameter("tipDoc",tipDoc);
			query.setParameter("nroDoc",nroDoc);
			List<BankCustomerDummy> lst = (List<BankCustomerDummy>) query.getResultList();
			
			return !lst.isEmpty();
			
		} catch (NoResultException e) {
			return false;
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw e;
		}
		
	}
	
}
