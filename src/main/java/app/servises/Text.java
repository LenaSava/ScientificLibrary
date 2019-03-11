package app.servises;

import app.model.entities.ScientificPublication;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class Text {

    public String printer (List<ScientificPublication> list){
        StringBuilder sb = new StringBuilder();
        if (list!= null& !list.isEmpty()){
            sb.append("<ui>");

            for (ScientificPublication publication:list){
                sb.append("<li>" + publication + "</li>");

            }
            sb.append("</ui>");

        }
        return sb.toString();
    }

    public static String showMessages(String language,String key){

        ResourceBundle bundle =
                ResourceBundle.getBundle("messages",new Locale(language));
        return bundle.getString(key);

    }
}
