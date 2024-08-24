package main.DesignPattern.adapter;

public class Main {
    public static void main(String[] args) {
        ChartJson cj = new ChartJson(new JsonXMLAdapter(new WebXMLprovider("./history.xml")));
        cj.chartJson();
    }
}
