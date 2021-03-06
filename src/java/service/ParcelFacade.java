/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Parcel;
import bean.SubPanel;
import bean.Trench;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Yassine.SIMOU
 */
@Stateless
public class ParcelFacade extends AbstractFacade<Parcel> {

    @PersistenceContext(unitName = "plannOCPPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ParcelFacade() {
        super(Parcel.class);
    }

    public void delete(Parcel parcel) {
        getEntityManager().createQuery("DELETE FROM StatutBlock sb where sb.block.parcel.trench.panel.id='" + parcel.getId() + "'").executeUpdate();
        getEntityManager().createQuery("DELETE FROM Treatment tr where tr.block.parcel.trench.panel.id='" + parcel.getId() + "'").executeUpdate();
        getEntityManager().createQuery("DELETE FROM Storage st where st.block.parcel.trench.panel.id='" + parcel.getId() + "'").executeUpdate();
        getEntityManager().createQuery("DELETE FROM Block b where b.parcel.trench.panel.id='" + parcel.getId() + "'").executeUpdate();
        remove(parcel);
    }

    public Parcel findByNomAndTrench(String nom, Long trench) {
        List<Parcel> ps = getEntityManager().createQuery("SELECT p FROM Parcel p where p.nom='" + nom + "' AND p.trench.id='" + trench + "'").getResultList();
        if (ps.isEmpty()) {
            return null;
        } else {
            return ps.get(0);
        }

    }

    public Parcel createNull(String nom, Trench trench, SubPanel subpanel) {

        if (nom  != null && nom.length() > 0 && nom.charAt(nom.length() - 1) == '0' && nom.charAt(nom.length() - 2) == '.') {
            nom = nom.substring(0, nom.length() - 2);
        }
        Parcel parcel = findByNomAndTrench(nom, trench.getId());
        if (parcel == null) {
            parcel = new Parcel(generateId("Parcel", "id"), nom, trench, subpanel);
            create(parcel);
            Readxl.parcelConteur++;

        }
        return parcel;
    }

}
