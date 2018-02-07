package fr.mc.app.models;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Vente {

	private int id_order;

	private String article;

	private String quantite;

	private String prix_vente;

	private Date date_achat;

	private Date date_maj;

	public Vente(int id_order, String article, String quantite, String prix_vente, Date date_achat, Date date_maj) {
		super();
		this.id_order = id_order;
		this.article = article;
		this.quantite = quantite;
		this.prix_vente = prix_vente;
		this.date_achat = date_achat;
		this.date_maj = date_maj;
	}

	public Vente() {
		super();
	}

	public int getId_order() {
		return id_order;
	}

	public void setId_order(int id_order) {
		this.id_order = id_order;
	}

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	public String getQuantite() {
		return quantite;
	}

	public void setQuantite(String quantite) {
		this.quantite = quantite;
	}

	public String getPrix_vente() {
		return prix_vente;
	}

	public void setPrix_vente(String prix_vente) {
		this.prix_vente = prix_vente;
	}

	public Date getDate_achat() {
		return date_achat;
	}

	public void setDate_achat(Date date_achat) {
		this.date_achat = date_achat;
	}

	public Date getDate_maj() {
		return date_maj;
	}

	public void setDate_maj(Date date_maj) {
		this.date_maj = date_maj;
	}

	@Override
	public String toString() {
		return "Vente [id_order=" + id_order + ", article=" + article + ", quantite=" + quantite + ", prix_vente="
				+ prix_vente + ", date_achat=" + date_achat + ", date_maj=" + date_maj + "]";
	}

}
