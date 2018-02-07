package fr.mc.app.services;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

@Service
public class BatchService {

	public Elements getOrdersFromDB() throws Exception {
		Document doc  = Jsoup.connect("http://localhost:8088/app/orders").get();
		return doc.select("order");
	}
	
	public Elements getVentesFromDB() throws Exception {
		Document doc = Jsoup.connect("http://localhost:8088/app/ventes").get();
		return doc.select("order");
	}
}
