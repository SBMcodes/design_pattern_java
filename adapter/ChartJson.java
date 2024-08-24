package main.DesignPattern.adapter;

public class ChartJson {
    JsonInterface json;

    public ChartJson(JsonInterface json){
        this.json=json;
    }

    public void chartJson(){
        json.getJson();
        // start charting json
    }
}
