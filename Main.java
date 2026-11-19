package latihan2;

public class Main {

    public static void main(String[] args) {

        StudentGrader grader = new StudentGrader();
        GradeReport report = new GradeReport();
        GradeRepository repository = new GradeRepository();

        String nama = "Andi";

        double nilai = grader.hitungNilaiAkhir(80, 85, 90);

        report.cetakLaporan(nama, nilai);

        repository.simpanDatabase(nama, nilai);
    }
}