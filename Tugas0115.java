import java.util.Scanner;
public class Tugas0115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] survei = new double[6][10];
        double avgResp, avgPert, avgAll, total = 0, totalTemp = 0;
        int i = 0, j = 0;

        while (i < 6) {
            while (j < 10) {
                System.out.print("Nilai untuk pertanyaan ke-" + (i+1) + " responden ke-" + (j+1) + " : ");
                survei[i][j] = sc.nextDouble();
                totalTemp += survei[i][j];
                j++;
            }
        j = 0;
        total += totalTemp;
        avgPert = totalTemp/10;
        totalTemp = 0;
        System.out.println("Rata-rata dari pertanyaan ke-" + (i+1) + " adalah " + avgPert);
        i++;
        }
        
        i = 0;
        j = 0;
        while (j < 10) {
            while (i < 6) {
                totalTemp += survei[i][j];
                i++;
            }
        i = 0;
        avgResp = totalTemp/6;
        totalTemp = 0;
        System.out.println("Rata-rata dari responden ke-" + (j+1) + " adalah " + avgResp);
        j++;
        }       
        avgAll = total/60;
        System.out.println("Rata-rata dari seluruh nilai adalah " + avgAll);
    }
}