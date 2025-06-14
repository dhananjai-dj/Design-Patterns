package com.designPatterns.strctural.adapter;

import com.fasterxml.jackson.databind.JsonNode;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ExternalApiService {
    private static final String ENDPOINT = "https://run.mocky.io/v3/4d10ea44-1345-4ea6-ac5e-45c0c9f9386f";

    public User adaptAsUser() throws Exception {
        URL url = new URL(ENDPOINT);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/xml");

        InputStream xmlInput = conn.getInputStream();
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(xmlInput);
        doc.getDocumentElement().normalize();
        adaptAsJsonNode(doc);
        User user = new User();
        user.setId(Integer.parseInt((String) getValue("id", doc)));
        user.setName((String) getValue("name", doc));
        user.setEmail((String) getValue("email", doc));
        user.setActive(Boolean.parseBoolean((String) getValue("active", doc)));
        user.setRoles((List<String>) getValue("role", doc));
        return user;
    }

    public JsonNode adaptAsJsonNode(Document document) throws Exception {
        Element element = document.getDocumentElement();
        System.out.println(getDeepestElementNode(element));
        return null;
    }

    private Node getDeepestElementNode(Element element) {
        if (element == null) return null;

        NodeList children = element.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node child = children.item(i);
            if (child.getNodeType() == Node.ELEMENT_NODE) {
                return getDeepestElementNode((Element) child);
            }
        }

        return element;
    }


    private Object getValue(String tag, Document doc) {
        if (doc == null) {
            return "";
        }
        NodeList nodes = doc.getElementsByTagName(tag);
        int length = nodes.getLength();
        if (length == 0) {
            return "";
        } else if (length > 1) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                list.add(nodes.item(i).getTextContent());
            }
            return list;
        }
        return nodes.item(0).getTextContent();
    }
}
