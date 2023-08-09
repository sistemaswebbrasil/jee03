package br.com.siswbrasil.jee03;

import java.io.Serializable;
import java.util.List;

import br.com.siswbrasil.jee03.dao.ActionDao;
import br.com.siswbrasil.jee03.entity.Action;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@RequestScoped
public class HomeBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
    @Inject
    private ActionDao actionDao;
    
    private List<Action> actions;

	public List<Action> getActions() {
		actions.add(new Action("teste A"));
		actions.add(new Action("teste B"));
		return actions;
	}

	public void setActions(List<Action> actions) {
		this.actions = actions;
	}
    
    

}
