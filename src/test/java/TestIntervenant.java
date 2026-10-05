import model.Categorie;
import model.Intervenant;
import model.Salarie;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Test
public void testAddIntervenant() {
    Categorie cat = new Categorie(1, "Développeur");

    Intervenant intervenant = new Salarie(1, "Jean", "Dumont", LocalDate.now(),"echelon 2");

    cat.addIntervenant(intervenant);

    assertEquals(1, cat.getIntervenants().size());
    assertEquals("Dumont", cat.getIntervenants().get(0).getNom());
}


void main() {
}