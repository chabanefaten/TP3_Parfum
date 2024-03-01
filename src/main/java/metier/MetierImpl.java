package metier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class MetierImpl implements ImetierCatalogue {
@Override
public List<Parfum> getParfumsParMotCle(String mc) {
List<Parfum> pars= new ArrayList<Parfum>();
Connection conn=SingletonConnection.getConnection();
try {

PreparedStatement ps= conn.prepareStatement("select * from Parfums where NOM_PARFUM LIKE ?");

ps.setString(1, "%"+mc+"%");
ResultSet rs = ps.executeQuery();
while (rs.next()) {
Parfum p = new Parfum();
p.setIdParfum(rs.getLong("ID_PARFUM"));
p.setNomParfum(rs.getString("NOM_PARFUM"));
p.setPrix(rs.getDouble("PRIX"));
pars.add(p);
}
} catch (SQLException e) {
e.printStackTrace();
}
return pars;
}
@Override
public void addParfum(Parfum p) {
// TODO Auto-generated method stub
}
}