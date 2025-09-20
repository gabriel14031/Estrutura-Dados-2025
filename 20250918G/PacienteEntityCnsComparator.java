import java.util.Comparator;

public class PacienteEntityCnsComparator implements Comparator<PacienteEntity> {
    @Override
    public int compare(PacienteEntity p1, PacienteEntity p2) {
        // Comparar pelo CNS
        return p1.getCns().compareTo(p2.getCns());
    }

}
