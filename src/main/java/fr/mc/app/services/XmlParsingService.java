package fr.mc.app.services;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.mc.app.HomeController;
import fr.mc.app.hibernate.entities.OrdersEntity;
import fr.mc.app.models.Vente;

@Service
public class XmlParsingService {

	private static final Logger masDatabaseLogger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private BatchService batchService;

	public ArrayList<Vente> getVentesFromXML() throws Exception {
		Elements orders = batchService.getVentesFromDB();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		ArrayList<Vente> ordersList = new ArrayList<>();
		
		for (Element orderElement : orders) {
			Vente vente = new Vente();
			
			vente.setId_order(Integer.parseInt(orderElement.getElementsByTag("order_id").text()));
			vente.setArticle(orderElement.getElementsByTag("article").text());
			vente.setPrix_vente(orderElement.getElementsByTag("prix").text());
			vente.setQuantite(orderElement.getElementsByTag("quantite").text());
			vente.setDate_achat(sdf.parse(orderElement.getElementsByTag("date").text()));
			vente.setDate_maj(sdf.parse(orderElement.getElementsByTag("date_maj").text()));
			
			ordersList.add(vente);
		}
		
		return ordersList;
	}
	
	public ArrayList<OrdersEntity> getOrdersFromXML() throws Exception {
		Elements orders = batchService.getOrdersFromDB();

		ArrayList<OrdersEntity> ordersList = new ArrayList<>();
		
		for (Element orderElement : orders) {
			
			OrdersEntity order = new OrdersEntity();
			
			order.setOrder_id(Integer.parseInt(orderElement.getElementsByTag("order_id").text()));
			order.setDate(orderElement.getElementsByTag("date").text());
			order.setTime_bill(orderElement.getElementsByTag("time_bill").text());
			order.setCommande_client(orderElement.getElementsByTag("commande_client").text());
			order.setCommande_pays(orderElement.getElementsByTag("commande_pays").text());
			order.setCommande_ville(orderElement.getElementsByTag("commande_ville").text());
			order.setCommande_adresse(orderElement.getElementsByTag("commande_adresse").text());
			order.setCommande_code_postal(orderElement.getElementsByTag("commande_code_postal").text());
			order.setLivraison_client(orderElement.getElementsByTag("livraison_client").text());
			order.setLivraison_pays(orderElement.getElementsByTag("livraison_pays").text());
			order.setLivraison_region(orderElement.getElementsByTag("livraison_region").text());
			order.setLivraison_ville(orderElement.getElementsByTag("livraison_ville").text());
			order.setLivraison_adresse(orderElement.getElementsByTag("livraison_adresse").text());
			order.setLivraison_code_postal(orderElement.getElementsByTag("livraison_code_postal").text());
			order.setAcheteur_telephone(orderElement.getElementsByTag("acheteur_telephone").text());
			order.setMethode_livraison(orderElement.getElementsByTag("methode_livraison").text());
			order.setArticle(orderElement.getElementsByTag("article").text());
			order.setArticle_detail(orderElement.getElementsByTag("article_detail").text());
			order.setSku(orderElement.getElementsByTag("sku").text());
			order.setQuantite(orderElement.getElementsByTag("quantite").text());
			order.setPrix(orderElement.getElementsByTag("prix").text());
			order.setPoids(orderElement.getElementsByTag("poids").text());
			order.setTexte_perso(orderElement.getElementsByTag("texte_perso").text());
			order.setCoupon(orderElement.getElementsByTag("coupon").text());
			order.setRemarques(orderElement.getElementsByTag("remarques").text());
			order.setFrais_livraison(orderElement.getElementsByTag("frais_livraison").text());
			order.setTaxes(orderElement.getElementsByTag("taxes").text());
			order.setTotal(orderElement.getElementsByTag("total").text());
			order.setDevise(orderElement.getElementsByTag("devise").text());
			order.setMethode_paiement(orderElement.getElementsByTag("methode_paiement").text());
			order.setPaiement(orderElement.getElementsByTag("paiement").text());
			order.setFulfillment(orderElement.getElementsByTag("fulfillment").text());
			order.setBordereau_livraison(orderElement.getElementsByTag("bordereau_livraison").text());
			order.setAcheteur_email(orderElement.getElementsByTag("acheteur_email").text());
			order.setCommande_region(orderElement.getElementsByTag("commande_region").text());
			
			ordersList.add(order);
		}
		
		masDatabaseLogger.info("Taille de la liste des commandes : {}",ordersList.size());
		return ordersList;
	}
}
