package form;

import java.util.Date;

import org.apache.struts.action.ActionForm;

public class EvenementForm extends ActionForm {
	 public String nomEvenement;

	   public int qteStock;

	   
	   public int prixMin;
	   
	   public String dateDebut;
	   
	   public String dateFin;
	   public int numLieu;
	   public int numTypeEv;
	   public String url;
	    public int numDate;
	
	public int getNumTypeEv() {
			return numTypeEv;
		}
		public void setNumTypeEv(int numTypeEv) {
			this.numTypeEv = numTypeEv;
		}
	public int getNumDate() {
			return numDate;
		}
		public void setNumDate(int numDate) {
			this.numDate = numDate;
		}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getNomEvenement() {
		return nomEvenement;
	}
	public void setNomEvenement(String nomEvenement) {
		this.nomEvenement = nomEvenement;
	}
	public int getQteStock() {
		return qteStock;
	}
	public void setQteStock(int qteStock) {
		this.qteStock = qteStock;
	}
	public int getPrixMin() {
		return prixMin;
	}
	public void setPrixMin(int prixMin) {
		this.prixMin = prixMin;
	}
	
	public String getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}
	public String getDateFin() {
		return dateFin;
	}
	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}
	public int getNumLieu() {
		return numLieu;
	}
	public void setNumLieu(int numLieu) {
		this.numLieu = numLieu;
	}
	
}
