package metier;

import java.util.List;
public interface ImetierCatalogue {
public List<Parfum> getParfumsParMotCle(String mc);
public void addParfum(Parfum p);
}