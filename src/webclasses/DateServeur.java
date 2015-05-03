package webclasses;
import java.util.*;

public class DateServeur implements MiniServlet {

    @Override
    public String init(){

	return "<html>" + (new Date(System.currentTimeMillis())).toString() + "</html>";
    }
}
	
