
package pack1;
/**
 *
 * @author PC
 */
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class tio_rico { 

    public List tipo_propiedad(List<String> l){
        Set<String> set = new LinkedHashSet<>(l);
        l.clear();
        l.addAll(set);
        ArrayList<String> listaSinRep = new ArrayList<>(l);
        return listaSinRep;
    }
    public List propiedades_faltantes(List<Integer> posi, List<String> prop, String falta){
        ArrayList<Integer> faltantes = new ArrayList<>();
        for(Integer i : posi){
            if(prop.get(i).equals(falta)){
                faltantes.add(i);
            }
        }
        return faltantes;
    }
    public List notengopropiedad(List<String> pJuego, List<String> pTengo){
        ArrayList<String> faltan = new ArrayList<>();
        for(String i : pJuego){
            if(!pTengo.contains(i)){
                faltan.add(i);
            }
        }
        return faltan;
    }
    public Integer compra_propiedad(List<String> posB,List<String> posA){
        Integer jug1 = notengopropiedad(posB,posA).size();
        Integer jug2 = notengopropiedad(posA,posB).size();
        return Math.min(jug1,jug2);
    }
}