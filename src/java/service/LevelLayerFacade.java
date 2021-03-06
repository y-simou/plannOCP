/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.LevelLayer;
import bean.Parcel;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Yassine.SIMOU
 */
@Stateless
public class LevelLayerFacade extends AbstractFacade<LevelLayer> {

    @PersistenceContext(unitName = "plannOCPPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LevelLayerFacade() {
        super(LevelLayer.class);
    }

    public void delete(LevelLayer levelLayer) {
        getEntityManager().createQuery("DELETE from ChemicalComponentLayer ch where ch.layer.level.id'" + levelLayer.getId() + "'").executeUpdate();
        getEntityManager().createQuery("DELETE from Layer l where l.level.id='" + levelLayer.getId() + "'").executeUpdate();
        getEntityManager().createQuery("DELETE from Storage st where st.block.level.id='" + levelLayer.getId() + "'").executeUpdate();
        getEntityManager().createQuery("DELETE from Accessibility a where a.levelLayer.id='" + levelLayer.getId() + "'").executeUpdate();
        getEntityManager().createQuery("DELETE from StatutBlock s where s.block.level.id='" + levelLayer.getId() + "'").executeUpdate();
        getEntityManager().createQuery("DELETE from Treatment t where t.block.level.id='" + levelLayer.getId() + "'").executeUpdate();
        getEntityManager().createQuery("DELETE from Block b where b.level.id='" + levelLayer.getId() + "'").executeUpdate();
        getEntityManager().createQuery("DELETE from PossibilityStorage p where p.level.id='" + levelLayer.getId() + "'").executeUpdate();
        getEntityManager().createQuery("DELETE from CompositionLevelSequence cmp where cmp.level.id='" + levelLayer.getId() + "'").executeUpdate();
        remove(levelLayer);
    }


    public LevelLayer createNull(Parcel parcel) {
        LevelLayer level = find(parcel.getId());
        if (level == null) {
            level = new LevelLayer(parcel.getId(), parcel);
            create(level);
        }
        return level;
    }
}
