package RestAPP;

import calcul.Prix;

import javax.ws.rs.ApplicationPath;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/API")
public class MyApplication {
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        h.add(Prix.class);
        return h;
    }
}
