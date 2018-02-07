package fr.mc.app.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.stereotype.Component;

@Component
@DynamicUpdate
@Table(name="orders")
public class OrdersEntity {

	@Id
	@Column
	private int order_id;

	@Column
	private String date;

	@Column
	private String time_bill;

	@Column
	private String commande_client;

	@Column
	private String commande_pays;

	@Column
	private String commande_region;

	@Column
	private String commande_ville;

	@Column
	private String commande_adresse;

	@Column
	private String commande_code_postal;

	@Column
	private String livraison_client;

	@Column
	private String livraison_pays;

	@Column
	private String livraison_region;

	@Column
	private String livraison_ville;

	@Column
	private String livraison_adresse;

	@Column
	private String livraison_code_postal;

	@Column
	private String acheteur_telephone;

	@Column
	private String bordereau_livraison;

	@Column
	private String acheteur_email;

	@Column
	private String methode_livraison;

	@Column
	private String article;

	@Column
	private String article_detail;

	@Column
	private String sku;

	@Column
	private String quantite;

	@Column
	private String prix;

	@Column
	private String poids;

	@Column
	private String texte_perso;

	@Column
	private String coupon;

	@Column
	private String remarques;

	@Column
	private String frais_livraison;

	@Column
	private String taxes;

	@Column
	private String total;

	@Column
	private String devise;

	@Column
	private String methode_paiement;

	@Column
	private String paiement;

	@Column
	private String fulfillment;

	public OrdersEntity() {
		super();
	}

	public OrdersEntity(int order_id, String date, String time_bill, String commande_client, String commande_pays,
			String commande_region, String commande_ville, String commande_adresse, String commande_code_postal,
			String livraison_client, String livraison_pays, String livraison_region, String livraison_ville,
			String livraison_adresse, String livraison_code_postal, String acheteur_telephone,
			String bordereau_livraison, String acheteur_email, String methode_livraison, String article,
			String article_detail, String sku, String quantite, String prix, String poids, String texte_perso,
			String coupon, String remarques, String frais_livraison, String taxes, String total, String devise,
			String methode_paiement, String paiement, String fulfillment) {
		super();
		this.order_id = order_id;
		this.date = date;
		this.time_bill = time_bill;
		this.commande_client = commande_client;
		this.commande_pays = commande_pays;
		this.commande_region = commande_region;
		this.commande_ville = commande_ville;
		this.commande_adresse = commande_adresse;
		this.commande_code_postal = commande_code_postal;
		this.livraison_client = livraison_client;
		this.livraison_pays = livraison_pays;
		this.livraison_region = livraison_region;
		this.livraison_ville = livraison_ville;
		this.livraison_adresse = livraison_adresse;
		this.livraison_code_postal = livraison_code_postal;
		this.acheteur_telephone = acheteur_telephone;
		this.bordereau_livraison = bordereau_livraison;
		this.acheteur_email = acheteur_email;
		this.methode_livraison = methode_livraison;
		this.article = article;
		this.article_detail = article_detail;
		this.sku = sku;
		this.quantite = quantite;
		this.prix = prix;
		this.poids = poids;
		this.texte_perso = texte_perso;
		this.coupon = coupon;
		this.remarques = remarques;
		this.frais_livraison = frais_livraison;
		this.taxes = taxes;
		this.total = total;
		this.devise = devise;
		this.methode_paiement = methode_paiement;
		this.paiement = paiement;
		this.fulfillment = fulfillment;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime_bill() {
		return time_bill;
	}

	public void setTime_bill(String time_bill) {
		this.time_bill = time_bill;
	}

	public String getCommande_client() {
		return commande_client;
	}

	public void setCommande_client(String commande_client) {
		this.commande_client = commande_client;
	}

	public String getCommande_pays() {
		return commande_pays;
	}

	public void setCommande_pays(String commande_pays) {
		this.commande_pays = commande_pays;
	}

	public String getCommande_region() {
		return commande_region;
	}

	public void setCommande_region(String commande_region) {
		this.commande_region = commande_region;
	}

	public String getCommande_ville() {
		return commande_ville;
	}

	public void setCommande_ville(String commande_ville) {
		this.commande_ville = commande_ville;
	}

	public String getCommande_adresse() {
		return commande_adresse;
	}

	public void setCommande_adresse(String commande_adresse) {
		this.commande_adresse = commande_adresse;
	}

	public String getCommande_code_postal() {
		return commande_code_postal;
	}

	public void setCommande_code_postal(String commande_code_postal) {
		this.commande_code_postal = commande_code_postal;
	}

	public String getLivraison_client() {
		return livraison_client;
	}

	public void setLivraison_client(String livraison_client) {
		this.livraison_client = livraison_client;
	}

	public String getLivraison_pays() {
		return livraison_pays;
	}

	public void setLivraison_pays(String livraison_pays) {
		this.livraison_pays = livraison_pays;
	}

	public String getLivraison_region() {
		return livraison_region;
	}

	public void setLivraison_region(String livraison_region) {
		this.livraison_region = livraison_region;
	}

	public String getLivraison_ville() {
		return livraison_ville;
	}

	public void setLivraison_ville(String livraison_ville) {
		this.livraison_ville = livraison_ville;
	}

	public String getLivraison_adresse() {
		return livraison_adresse;
	}

	public void setLivraison_adresse(String livraison_adresse) {
		this.livraison_adresse = livraison_adresse;
	}

	public String getLivraison_code_postal() {
		return livraison_code_postal;
	}

	public void setLivraison_code_postal(String livraison_code_postal) {
		this.livraison_code_postal = livraison_code_postal;
	}

	public String getAcheteur_telephone() {
		return acheteur_telephone;
	}

	public void setAcheteur_telephone(String acheteur_telephone) {
		this.acheteur_telephone = acheteur_telephone;
	}

	public String getBordereau_livraison() {
		return bordereau_livraison;
	}

	public void setBordereau_livraison(String bordereau_livraison) {
		this.bordereau_livraison = bordereau_livraison;
	}

	public String getAcheteur_email() {
		return acheteur_email;
	}

	public void setAcheteur_email(String acheteur_email) {
		this.acheteur_email = acheteur_email;
	}

	public String getMethode_livraison() {
		return methode_livraison;
	}

	public void setMethode_livraison(String methode_livraison) {
		this.methode_livraison = methode_livraison;
	}

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	public String getArticle_detail() {
		return article_detail;
	}

	public void setArticle_detail(String article_detail) {
		this.article_detail = article_detail;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getQuantite() {
		return quantite;
	}

	public void setQuantite(String quantite) {
		this.quantite = quantite;
	}

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}

	public String getPoids() {
		return poids;
	}

	public void setPoids(String poids) {
		this.poids = poids;
	}

	public String getTexte_perso() {
		return texte_perso;
	}

	public void setTexte_perso(String texte_perso) {
		this.texte_perso = texte_perso;
	}

	public String getCoupon() {
		return coupon;
	}

	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}

	public String getRemarques() {
		return remarques;
	}

	public void setRemarques(String remarques) {
		this.remarques = remarques;
	}

	public String getFrais_livraison() {
		return frais_livraison;
	}

	public void setFrais_livraison(String frais_livraison) {
		this.frais_livraison = frais_livraison;
	}

	public String getTaxes() {
		return taxes;
	}

	public void setTaxes(String taxes) {
		this.taxes = taxes;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getDevise() {
		return devise;
	}

	public void setDevise(String devise) {
		this.devise = devise;
	}

	public String getMethode_paiement() {
		return methode_paiement;
	}

	public void setMethode_paiement(String methode_paiement) {
		this.methode_paiement = methode_paiement;
	}

	public String getPaiement() {
		return paiement;
	}

	public void setPaiement(String paiement) {
		this.paiement = paiement;
	}

	public String getFulfillment() {
		return fulfillment;
	}

	public void setFulfillment(String fulfillment) {
		this.fulfillment = fulfillment;
	}

	@Override
	public String toString() {
		return "OrdersEntity [order_id=" + order_id + ", date=" + date + ", time_bill=" + time_bill
				+ ", commande_client=" + commande_client + ", commande_pays=" + commande_pays + ", commande_region="
				+ commande_region + ", commande_ville=" + commande_ville + ", commande_adresse=" + commande_adresse
				+ ", commande_code_postal=" + commande_code_postal + ", livraison_client=" + livraison_client
				+ ", livraison_pays=" + livraison_pays + ", livraison_region=" + livraison_region + ", livraison_ville="
				+ livraison_ville + ", livraison_adresse=" + livraison_adresse + ", livraison_code_postal="
				+ livraison_code_postal + ", acheteur_telephone=" + acheteur_telephone + ", bordereau_livraison="
				+ bordereau_livraison + ", acheteur_email=" + acheteur_email + ", methode_livraison="
				+ methode_livraison + ", article=" + article + ", article_detail=" + article_detail + ", sku=" + sku
				+ ", quantite=" + quantite + ", prix=" + prix + ", poids=" + poids + ", texte_perso=" + texte_perso
				+ ", coupon=" + coupon + ", remarques=" + remarques + ", frais_livraison=" + frais_livraison
				+ ", taxes=" + taxes + ", total=" + total + ", devise=" + devise + ", methode_paiement="
				+ methode_paiement + ", paiement=" + paiement + ", fulfillment=" + fulfillment + "]";
	}

}
