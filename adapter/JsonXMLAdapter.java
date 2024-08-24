package main.DesignPattern.adapter;

public class JsonXMLAdapter implements JsonInterface{
    private WebXMLprovider provider;
    public JsonXMLAdapter(WebXMLprovider provider){
        this.provider = provider;
    }
    public void getJson(){
        provider.getXml();
        // convert xml to json
        // return json file
    }
}