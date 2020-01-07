package weedem.repositorio;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import weedem.model.Funcionario;
import weedem.util.RepositorioGenerico;

@Stateless
public class FuncionarioDAO extends RepositorioGenerico<Funcionario, Long>{
	
    @PersistenceContext(unitName = "weedem")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    

    public FuncionarioDAO() {
        super(Funcionario.class);
    }

    // Other methods of this service

}