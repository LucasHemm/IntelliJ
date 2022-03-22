package com.company;
import java.util.Optional;

public class Field {
    private String label;
    private String fieldType; // skal fjernes senere
    private int id;
    private int cost;
    private int income;
    private int seriesID;
    private Player owner;
    private String currentOption;

    public Field(int id, String label, String fieldType, int cost, int income, int seriesID) {
        this.id = id;
        this.label = label;
        this.fieldType = fieldType;
        this.cost = cost;
        this.income = income;
        this.seriesID = seriesID;
    }

    public String onLand(Player player) {
        String message = "";

        switch (fieldType) {
            case "Plot":
                if (owner == null) {
                    currentOption = "buy";
                    message = "Vil du købe? Y for ja, N for nej";
                } else if (owner == player) {
                    currentOption = "build"; //Currentoption build
                    message = "Du ejer denne grund, vil du opgradere dit grund? Y for ja, N for nej";
                } else {
                    currentOption = "payRent"; //Currentoption payRent
                    message = "Betal husleje";
                }
                break;
            case "Chance":
                message = this.label;
                break;
            case "Start":
                message = "Tag startbeløb";
                break;
            case "Tax":
                message = "Betal skat";
                break;
            case "ShippingLine":
                message = "Shippingline";
                break;
            case "Parking":
                message = "Parker her gratis i en runde";
                break;
            case "Brewery":
                message = "Brewery";
                break;
            case "Prison":
                message = "Gå i fængsel";
                break;
        }
        return message;
    }
    
    public String onProceess(Player player, String response){
        String s = "";
        if (response.equalsIgnoreCase("Y")) {
            s = this.onAccept(player);
        } else{
              s = this.onReject(player);
        }
        return s;
    }

    private String onAccept(Player player) {
        String message = "";
        if (this.currentOption.equals("buy")) {
            message = (player.getName() + " decided to buy");
            owner = player;
            //player.buyProperty(cost);
        }
        return message;
    }


    private String onReject(Player player) {
        String msg = "";
        if (this.currentOption.equals("buy")) {
            msg = player.getName() + " decided NOT to buy";
        }
        return msg;
    }

    @Override
    public String toString() {
        return id + " " + label;
    }

}
