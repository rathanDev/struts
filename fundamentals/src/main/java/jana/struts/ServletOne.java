package jana.struts;

import org.apache.cxf.transport.servlet.CXFNonSpringServlet;
import javax.servlet.ServletConfig;

public class ServletOne extends CXFNonSpringServlet {

    @Override
    protected void loadBus(ServletConfig sc) {
        super.loadBus(sc);
    }

}
