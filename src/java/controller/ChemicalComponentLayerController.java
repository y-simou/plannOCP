package controller;

import bean.ChemicalComponentLayer;
import service.ChemicalComponentLayerFacade;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@Named("chemicalComponentLayerController")
@SessionScoped
public class ChemicalComponentLayerController implements Serializable {

    @EJB
    private service.ChemicalComponentLayerFacade ejbFacade;
    private List<ChemicalComponentLayer> items = null;
    private ChemicalComponentLayer selected;

    public ChemicalComponentLayerController() {
    }

    public ChemicalComponentLayer getSelected() {
        if (selected == null) {
            selected = new ChemicalComponentLayer();
        }
        return selected;
    }

    public void setSelected(ChemicalComponentLayer selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private ChemicalComponentLayerFacade getFacade() {
        return ejbFacade;
    }

    public ChemicalComponentLayer prepareCreate() {
        selected = new ChemicalComponentLayer();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
       ejbFacade.create(selected);
    }

    public void update() {
       ejbFacade.edit(selected);
    }

    public void delete() {
      ejbFacade.remove(selected);
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
    }

    public List<ChemicalComponentLayer> getItems() {
        if (items == null) {
            items = getFacade().findAll();
        }
        return items;
    }


    public ChemicalComponentLayer getChemicalComponentLayer(java.lang.Long id) {
        return getFacade().find(id);
    }

    public List<ChemicalComponentLayer> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<ChemicalComponentLayer> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = ChemicalComponentLayer.class)
    public static class ChemicalComponentLayerControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            ChemicalComponentLayerController controller = (ChemicalComponentLayerController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "chemicalComponentLayerController");
            return controller.getChemicalComponentLayer(getKey(value));
        }

        java.lang.Long getKey(String value) {
            java.lang.Long key;
            key = Long.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Long value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof ChemicalComponentLayer) {
                ChemicalComponentLayer o = (ChemicalComponentLayer) object;
                return getStringKey(o.getId());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), ChemicalComponentLayer.class.getName()});
                return null;
            }
        }

    }

}
